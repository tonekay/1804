package cn.jt.fallback;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.springframework.cloud.netflix.zuul.filters.route.ZuulFallbackProvider;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;

  //zuul实现熔断机制    底层利用包扫描创建实例@Component
public class HelloFallback implements ZuulFallbackProvider {

	@Override
	public String getRoute() {
		return "provider-user";
	}

	@Override   //提供者application.name
	public ClientHttpResponse fallbackResponse() {
		return new ClientHttpResponse() {

			@Override  //设置头信息
			public HttpHeaders getHeaders() {
				HttpHeaders headers = new HttpHeaders();
				headers.setContentType(MediaType.APPLICATION_JSON_UTF8);
				return headers;
			}
			
			@Override 	//设置返回内容
			public InputStream getBody() throws IOException {
				
				return new ByteArrayInputStream(("fallback:--"+HelloFallback.this.getRoute()).getBytes());
			}

			@Override	
			public HttpStatus getStatusCode() throws IOException {
				
				return HttpStatus.BAD_REQUEST;
			}

			@Override	
			public int getRawStatusCode() throws IOException {
				return HttpStatus.BAD_REQUEST.value();
			}

			@Override	
			public String getStatusText() throws IOException {
				return HttpStatus.BAD_REQUEST.getReasonPhrase();
			}

			@Override
			public void close() {
				
				
			}
			
		};
	}

	
}
