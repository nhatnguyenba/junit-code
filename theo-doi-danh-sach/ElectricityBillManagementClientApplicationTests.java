package com.electricitymanagement;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.electricitymanagement.controller.CustomerListController;
import com.electricitymanagement.model.Customer;

@SpringBootTest
class ElectricityBillManagementClientApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
	public void getCustomerIsDebtor_has0() {
		CustomerListController custListController = new CustomerListController();
		List<Customer> list = custListController.getCustomerIsDebtor();
		Assertions.assertEquals(0, list.size());
	}
	
	@Test
	public void getCustomerIsDebtor_has1() {
		CustomerListController custListController = new CustomerListController();
		List<Customer> list = custListController.getCustomerIsDebtor();
		Assertions.assertEquals(1, list.size());
	}
	
	@Test
	public void getCustomerIsDebtor_has3() {
		CustomerListController custListController = new CustomerListController();
		List<Customer> list = custListController.getCustomerIsDebtor();
		Assertions.assertEquals(3, list.size());
	}
	
	@Test
	public void getCustomerIsNotDebtor_has0() {
		CustomerListController custListController = new CustomerListController();
		List<Customer> list = custListController.getCustomerIsNotDebtor();
		Assertions.assertEquals(0, list.size());
	}
	
	@Test
	public void getCustomerIsNotDebtor_has1() {
		CustomerListController custListController = new CustomerListController();
		List<Customer> list = custListController.getCustomerIsNotDebtor();
		Assertions.assertEquals(1, list.size());
	}
	
	@Test
	public void getCustomerIsNotDebtor_has2() {
		CustomerListController custListController = new CustomerListController();
		List<Customer> list = custListController.getCustomerIsNotDebtor();
		Assertions.assertEquals(2, list.size());
	}
	
	@Test
	public void getTop100MostConsumer_has0() {
		CustomerListController custListController = new CustomerListController();
		List<Customer> list = custListController.getTop100LeastConsumer();
		Assertions.assertEquals(0, list.size());
	}
	
	@Test
	public void getTop100MostConsumer_has1() {
		CustomerListController custListController = new CustomerListController();
		List<Customer> list = custListController.getTop100MostConsumer();
		Assertions.assertEquals(1, list.size());
	}
	
	@Test
	public void getTop100MostConsumer_has3() {
		CustomerListController custListController = new CustomerListController();
		List<Customer> list = custListController.getTop100MostConsumer();
		Assertions.assertEquals(3, list.size());
	}
	
	@Test
	public void getTop100MostConsumer_has100() {
		CustomerListController custListController = new CustomerListController();
		List<Customer> list = custListController.getTop100MostConsumer();
		Assertions.assertEquals(100, list.size());
	}
	
	@Test
	public void getTop100MostConsumer_has101() {
		CustomerListController custListController = new CustomerListController();
		List<Customer> list = custListController.getTop100MostConsumer();
		Assertions.assertEquals(100, list.size());
	}
	
	@Test
	public void getTop100LeastConsumer_has0() {
		CustomerListController custListController = new CustomerListController();
		List<Customer> list = custListController.getTop100LeastConsumer();
		Assertions.assertEquals(0, list.size());
	}
	
	@Test
	public void getTop100LeastConsumer_has1() {
		CustomerListController custListController = new CustomerListController();
		List<Customer> list = custListController.getTop100LeastConsumer();
		Assertions.assertEquals(1, list.size());
	}
	
	@Test
	public void getTop100LeastConsumer_has3() {
		CustomerListController custListController = new CustomerListController();
		List<Customer> list = custListController.getTop100LeastConsumer();
		Assertions.assertEquals(3, list.size());
	}
	
	@Test
	public void getTop100LeastConsumer_has100() {
		CustomerListController custListController = new CustomerListController();
		List<Customer> list = custListController.getTop100LeastConsumer();
		Assertions.assertEquals(100, list.size());
	}
	
	@Test
	public void getTop100LeastConsumer_has101() {
		CustomerListController custListController = new CustomerListController();
		List<Customer> list = custListController.getTop100LeastConsumer();
		Assertions.assertEquals(100, list.size());
	}

}
