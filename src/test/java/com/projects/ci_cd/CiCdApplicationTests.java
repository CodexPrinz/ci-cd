package com.projects.ci_cd;

import com.projects.ci_cd.controller.ProductController;
import com.projects.ci_cd.model.Product;
import org.junit.jupiter.api.AutoClose;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CiCdApplicationTests {

	private static final Logger log = LoggerFactory.getLogger(CiCdApplicationTests.class);
	@Autowired
	private ProductController productController;

	@Test
	void contextLoads() {
	}

	@Test
	void testProductController() {
//		 Test the ProductController methods here
//		 You can use MockMvc to test the endpoints
//		 Example: mockMvc.perform(get("/api/products")).andExpect(status().isOk());
	}

	@Test
	void testGetAllProducts() {
		ResponseEntity<Iterable<Product>> response = productController.getAllProducts();
		log.info("Response body: {}, status: {}", response.getBody(), response.getStatusCode());
		assertEquals(200, response.getStatusCodeValue());
	}

}
