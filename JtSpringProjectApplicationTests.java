package com.jtspringproject.JtSpringProject;
import com.jtspringproject.JtSpringProject.controller.AdminController;
import com.jtspringproject.JtSpringProject.controller.UserController;
import com.jtspringproject.JtSpringProject.dao.userDao;
import com.jtspringproject.JtSpringProject.models.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.ui.ConcurrentModel;
import org.springframework.web.servlet.ModelAndView;
import static org.junit.jupiter.api.Assertions.assertEquals;
@SpringBootTest
class JtSpringProjectApplicationTests {
	@Test
	public void testLogout() {
		AdminController adminController = new AdminController();
		String loginPage = adminController.returnIndex();

		assertEquals("adminlogin", loginPage);
	}
	@Test
	public void testAdminHome() {
		AdminController adminController = new AdminController();
		String result = adminController.adminHome(new ConcurrentModel());

		assertEquals("redirect:/admin/login", result);
	}

	@Test
	public void TestUserLogout() {
		UserController userController = new UserController();
		String logoutPage = userController.userlogout(new ConcurrentModel());
		assertEquals("redirect:/userLogin", logoutPage);
	}
	@Test
	public void testProfileDisplay() {
		UserController userController = new UserController();

		String profileDisplay = userController.updateProfile(new ConcurrentModel());

		assertEquals("displayProfile", profileDisplay);
	}
	@Test
	public void testProfileupdate(){

		UserController userController = new UserController();

		String profileDisplay = userController.updateUser("123","hehe","no@","632");

		assertEquals("displayProfile", profileDisplay);
	}


}
