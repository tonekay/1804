package cn.jt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient   //zuul服务要注册到rureka上
public class ZuulAppRun {

	public static void main(String[] args) {
		SpringApplication.run(ZuulAppRun.class,	args);
	}
}
