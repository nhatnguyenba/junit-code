package com.electricitymanagement;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.electricitymanagement.controller.CustomerListController;
import com.electricitymanagement.model.Customer;

@SpringBootTest
public class CustomerListControllerTests extends ElectricityBillManagementClientApplicationTests {
	
	@Autowired
	private ApplicationContext context;

	@Test
	void contextLoads() {
	}
	
	@Test
	public void getCustomerIsDebtorTest_has0() {
		CustomerListController custListController = new CustomerListController();
		List<Customer> list = custListController.getCustomerIsDebtor();
		Assertions.assertEquals(0, list.size());
	}
	
	@Test
	public void getCustomerIsDebtorTest_has1() {
		CustomerListController custListController = new CustomerListController();
		List<Customer> list = custListController.getCustomerIsDebtor();
		Assertions.assertEquals(1, list.size());
	}
	
	@Test
	public void getCustomerIsDebtorTest_has3() {
		CustomerListController custListController = new CustomerListController();
		List<Customer> list = custListController.getCustomerIsDebtor();
		Assertions.assertEquals(3, list.size());
	}
	
	@Test
	public void getCustomerIsNotDebtorTest_has0() {
		CustomerListController custListController = new CustomerListController();
		List<Customer> list = custListController.getCustomerIsNotDebtor();
		Assertions.assertEquals(0, list.size());
	}
	
	@Test
	public void getCustomerIsNotDebtorTest_has1() {
		CustomerListController custListController = new CustomerListController();
		List<Customer> list = custListController.getCustomerIsNotDebtor();
		Assertions.assertEquals(1, list.size());
	}
	
	@Test
	public void getCustomerIsNotDebtorTest_has2() {
		CustomerListController custListController = new CustomerListController();
		List<Customer> list = custListController.getCustomerIsNotDebtor();
		Assertions.assertEquals(2, list.size());
	}
	
	@Test
	public void getTop100MostConsumerTest_has0() {
		CustomerListController custListController = new CustomerListController();
		List<Customer> list = custListController.getTop100LeastConsumer();
		Assertions.assertEquals(0, list.size());
	}
	
	@Test
	public void getTop100MostConsumerTest_has1() {
		CustomerListController custListController = new CustomerListController();
		List<Customer> list = custListController.getTop100MostConsumer();
		Assertions.assertEquals(1, list.size());
	}
	
	@Test
	public void getTop100MostConsumerTest_has3() {
		CustomerListController custListController = new CustomerListController();
		List<Customer> list = custListController.getTop100MostConsumer();
		Assertions.assertEquals(3, list.size());
	}
	
	@Test
	public void getTop100MostConsumerTest_has100() {
		CustomerListController custListController = new CustomerListController();
		List<Customer> list = custListController.getTop100MostConsumer();
		Assertions.assertEquals(100, list.size());
	}
	
	@Test
	public void getTop100MostConsumerTest_has101() {
		CustomerListController custListController = new CustomerListController();
		List<Customer> list = custListController.getTop100MostConsumer();
		Assertions.assertEquals(100, list.size());
	}
	
	@Test
	public void getTop100LeastConsumerTest_has0() {
		CustomerListController custListController = new CustomerListController();
		List<Customer> list = custListController.getTop100LeastConsumer();
		Assertions.assertEquals(0, list.size());
	}
	
	@Test
	public void getTop100LeastConsumerTest_has1() {
		CustomerListController custListController = new CustomerListController();
		List<Customer> list = custListController.getTop100LeastConsumer();
		Assertions.assertEquals(1, list.size());
	}
	
	@Test
	public void getTop100LeastConsumerTest_has3() {
		CustomerListController custListController = new CustomerListController();
		List<Customer> list = custListController.getTop100LeastConsumer();
		Assertions.assertEquals(3, list.size());
	}
	
	@Test
	public void getTop100LeastConsumerTest_has100() {
		CustomerListController custListController = new CustomerListController();
		List<Customer> list = custListController.getTop100LeastConsumer();
		Assertions.assertEquals(100, list.size());
	}
	
	@Test
	public void getTop100LeastConsumerTest_has101() {
		CustomerListController custListController = new CustomerListController();
		List<Customer> list = custListController.getTop100LeastConsumer();
		Assertions.assertEquals(100, list.size());
	}
}
