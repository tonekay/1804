package cn.jt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {

	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/hello/{name}")
	public String hello(@PathVariable("name") String name) {
		String url = "http://provider-user/hello/"+name;
		return this.restTemplate.getForObject(url, String.class);
	}
	
	@RequestMapping("/sidecar")
	public String home() {
		String url = "http://sidecar/";
		return this.restTemplate.getForObject(url, String.class);
	}
}
