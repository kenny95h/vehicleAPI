package com.udacity.pricing;

import com.udacity.pricing.api.PricingController;
import com.udacity.pricing.service.PricingService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(PricingController.class)
public class PricingServiceApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@MockitoBean
	PricingService pricingService;

	@Test
	public void getPrice() throws Exception {
		// simulates the HTTP request to a REST controller
		mockMvc.perform(get("/services/price?vehicleId=1"))
				// Set expectations of the request
				.andExpect(status().isOk());

	}

}
