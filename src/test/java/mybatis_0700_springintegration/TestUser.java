package mybatis_0700_springintegration;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ymd.learn.config.AppConfig;
import com.ymd.learn.service.UserService;

public class TestUser {
	
	@Test
	public void testUser() {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		UserService userService = ctx.getBean(UserService.class);
		System.out.println(userService.getUserById(1));
	}
	
}
