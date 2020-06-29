package zhubao;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import zhubao.controller1.User;

@SpringBootTest
class SpringMvcApplicationTests {

	@Test
	void contextLoads() {
		User user = (User) FactoryBean.getBean("user");
		System.out.print(user.getName());
	}

}
