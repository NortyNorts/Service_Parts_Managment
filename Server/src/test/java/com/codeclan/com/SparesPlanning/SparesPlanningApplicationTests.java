package com.codeclan.com.SparesPlanning;

import com.codeclan.com.SparesPlanning.models.Customer;
import com.codeclan.com.SparesPlanning.models.Unit;
import com.codeclan.com.SparesPlanning.repositories.CustomerRepo;
import com.codeclan.com.SparesPlanning.repositories.PartRepo;
import com.codeclan.com.SparesPlanning.repositories.UnitRepo;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;

@RunWith(SpringRunner.class)
@SpringBootTest
class SparesPlanningApplicationTests {

	@Autowired
	private PartRepo partRepo;

	@Autowired
	private CustomerRepo customerRepo;

	@Autowired
	private UnitRepo unitRepo;

	@Test
	void contextLoads() {
	}

	@Test
	public void canFindCustomer(){
		Optional<Customer> foundCustomer = customerRepo.findById(1L);
		assertEquals(true, foundCustomer.isPresent());
	}

}
