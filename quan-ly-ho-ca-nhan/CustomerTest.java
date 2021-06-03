package com.electricitymanagement;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.electricitymanagement.controller.CustomerController;
import com.electricitymanagement.model.Customer;
import com.electricitymanagement.repository.CustomerRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerTest extends ElectricityBillManagementApplicationTests {
	CustomerController customerController;
	@Autowired
	CustomerRepository CustomerRepository;

	@Test
	public void getAllCustomerTest_hasNothing() {
		customerController = new CustomerController(CustomerRepository);
		List<Customer> customers = customerController.getAllCustomer();
		
		assertNull(customers);
	}	
	
	@Test
	public void getAllCustomerTest_hasSomething() {
		customerController = new CustomerController(CustomerRepository);
		List<Customer> customers = customerController.getAllCustomer();
		
		assertNotNull(customers);
	}

	@Test
	public void getCustomerByIdTest_exist() {
		customerController = new CustomerController(CustomerRepository);
		Long id = 50L;
		Customer customer = customerController.getCustomerById(id);
		
		assertNotNull(customer);
	}
	
	@Test
	public void getCustomerByIdTest_nonExist() {
		customerController = new CustomerController(CustomerRepository);
		Long id = 1000L;
		Customer customer = customerController.getCustomerById(id);
		
		assertNull(customer);
	}

	@Test
	public void postCustomerTest_valid() {
		customerController = new CustomerController(CustomerRepository);
		
		int first = customerController.getAllCustomer().size();
		
		Customer customer = new Customer();
		customer.setName("Thần Thiên");
		customer.setAddress("Hà Nam");
		customer.setPhone("0973711898");
		customer.setEmail("thanthien@gmail.com");
		customer.setIdNumber("123456789990");
		customer.setUsername("ThanThien");
		customer.setPassword("thanthien");
		customerController.postCustomer(customer);
		
		int last = customerController.getAllCustomer().size();
		
		assertEquals(first, last-1);
	}
	
	@Test
	public void postCustomerTest_nothing() {
		customerController = new CustomerController(CustomerRepository);
		
		int first = customerController.getAllCustomer().size();
		
		Customer customer = new Customer();
		customerController.postCustomer(customer);
		
		int last = customerController.getAllCustomer().size();
		
		assertEquals(first, last);
	}
	
	
	@Test
	public void postCustomerTest_unfill() {
		customerController = new CustomerController(CustomerRepository);
		
		int first = customerController.getAllCustomer().size();
		
		Customer customer = new Customer();
		customer.setName("Thần Thần");
		customer.setAddress("Hà Nam");
		customer.setPhone("0973711787");
		customerController.postCustomer(customer);
		
		int last = customerController.getAllCustomer().size();
		
		assertEquals(first, last);
	}
	
	@Test
	public void postCustomerTest_null() {
		customerController = new CustomerController(CustomerRepository);
		
		int first = customerController.getAllCustomer().size();
		
		Customer customer = null;
		customerController.postCustomer(customer);
		
		int last = customerController.getAllCustomer().size();
		
		assertEquals(first, last);
	}

	@Test
	public void searchCustomer_byExistID() {
		customerController = new CustomerController(CustomerRepository);
		List<Customer> customers = customerController.searchCustomer("3");
		
		assertTrue(customers.size() > 0);
	}
	
	@Test
	public void searchCustomer_byExistName() {
		customerController = new CustomerController(CustomerRepository);
		List<Customer> customers = customerController.searchCustomer("Yami");
		
		assertTrue(customers.size() > 0);
	}
	
	@Test
	public void searchCustomer_nonExistCust() {
		customerController = new CustomerController(CustomerRepository);
		List<Customer> customers = customerController.searchCustomer("***********");
		
		assertTrue(customers.size() == 0);
	}	

	@Test
	public void deleteCustomer_exist() {
		customerController = new CustomerController(CustomerRepository);
		Long id = 9L;
		int expected = customerController.getAllCustomer().size() - 1;
		Customer customer = customerController.getCustomerById(id);
		customerController.deleteCustomer(id);
		int actual = customerController.getAllCustomer().size();
				
		assertEquals(expected, actual);		
		
		customerController.postCustomer(customer);
	}
	
	@Test
	public void deleteCustomer_nonExist() {
		customerController = new CustomerController(CustomerRepository);
		Long id = 100L;
		int expected = customerController.getAllCustomer().size();
		Customer customer = customerController.getCustomerById(id);
		customerController.deleteCustomer(id);
		int actual = customerController.getAllCustomer().size();
				
		assertEquals(expected, actual);		
		
		customerController.postCustomer(customer);
	}

}
