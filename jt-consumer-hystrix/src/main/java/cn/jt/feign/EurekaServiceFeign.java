package cn.jt.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value="provider-user")
public interface EurekaServiceFeign {

	/**
	 * Feign中没有原生的@GetMapping/@PostMapping/@DeleteMapping/@PutMapping，要指定需要用method进行
	 * @param name
	 * @return
	 */
	@RequestMapping(value="/hello/{name}",method=RequestMethod.GET)
	String hello(@PathVariable("name") String name);

}
