package zhubao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import zhubao.controller1.Config;
import zhubao.controller1.User;

@SpringBootApplication
public class SpringMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMvcApplication.class, args);
		User user = (User) FactoryBean.getBean("user");
		System.out.print(user.getName());
	}

}
