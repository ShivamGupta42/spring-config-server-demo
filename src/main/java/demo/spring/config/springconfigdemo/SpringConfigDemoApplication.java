package demo.spring.config.springconfigdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.core.env.Environment;

@SpringBootApplication
@EnableConfigServer
public class SpringConfigDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringConfigDemoApplication.class, args);
	}

}
