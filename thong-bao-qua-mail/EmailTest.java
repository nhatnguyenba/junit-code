package JunitTest;

import com.electricitymanagement.controller.NotificationController;
import com.electricitymanagement.model.Customer;

import java.util.Arrays;
import java.util.List;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.ui.Model;
import org.springframework.util.Assert;


public class EmailTest {
	
	@Test
	public void TestEmail1() {
		NotificationController nc = new NotificationController();
		String result = nc.sendEmail("electricityvn.company@gmail.com", "minhphucpham1999@gmail.com", "Thong bao dong tien dien", null);
		assertFalse(result);

	}
	@Test
	public void TestEmail2() {
		NotificationController nc = new NotificationController();
		String result = nc.sendEmail("electricityvn.company@gmail.com", null, "Thong bao dong tien dien", null);
		assertFalse(result);

	}
	@Test
	public void TestEmail3() {
		NotificationController nc = new NotificationController();
		String result = nc.sendEmail("electricityvn.company@gmail.com", "minhphucpham1999@gmail.com", null, null);
		assertFalse(result);

	}
	@Test
	public void TestEmail4() {
		NotificationController nc = new NotificationController();
		String result = nc.sendEmail("electricityvn.company@gmail.com", "122", "Thong bao dong tien dien", "customers");
		assertFalse(result);

	}
	@Test
	public void TestEmail5() {
		NotificationController nc = new NotificationController();
		String result = nc.sendEmail("electricityvn.company@gmail.com", "a@yahoo.net", "Thong bao dong tien dien", "customers");
		assertFalse(result);

	}
	@Test
	public void TestEmail6() {
		NotificationController nc = new NotificationController();
		String result = nc.sendEmail("electricityvn.company@gmail.com", "minhphucpham1999@gmail.com",  "Thong bao dong tien dien", "customers");
		assertTrue(result);
	}


}
