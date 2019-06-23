package com.example.demo.catalog;

import de.olivergierke.moduliths.test.ModuleTest;
import org.junit.jupiter.api.Test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

//@SpringBootTest
@ModuleTest(mode = ModuleTest.BootstrapMode.ALL_DEPENDENCIES)
//@AutoConfigureMockMvc
class CatalogTests {

//	@MockBean
//	private StockRepository orderRepository;

	@Test
	void test() throws Exception {
	}

}
