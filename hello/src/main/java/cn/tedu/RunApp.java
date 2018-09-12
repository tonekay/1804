package cn.tedu;//包的路径必须在所有类的父级目录中,且必须有包路径

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//启动类,执行这个类的main方法
@SpringBootApplication//标识这个启动类是SpringBoot启动程序
public class RunApp {

	public static void main(String[] args) {
		//需要spring环境servlet运行环境
		SpringApplication.run(RunApp.class, args);
	}
}
