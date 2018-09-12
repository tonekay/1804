package cn.tedu.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//标识
@RestController  //只能ResponseBody
public class HelloController {
	//打印hello 返回json格式
	@RequestMapping("/hello/{name}")
	public String hello(@PathVariable String name) {
		return "hello: "+name;
	}
}
