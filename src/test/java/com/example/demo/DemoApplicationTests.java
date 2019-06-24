package com.example.demo;

import de.olivergierke.modulith.docs.Documenter;
import de.olivergierke.moduliths.model.Modules;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class DemoApplicationTests {

	@Test
	void verifyModularity() throws IOException {

		// Verify module structure
		Modules modules = Modules.of(DemoApplication.class);
		modules.verify();

		// Generate documentation
		Documenter documenter = new Documenter(modules);

		Documenter.Options options = Documenter.Options.defaults() //
				.withExclusions(module -> module.getName().matches(".*core|.*support"));

		// Write overall diagram
		documenter.writeModulesAsPlantUml(options);

		// Write diagrams for each module
		modules.stream().forEach(it -> documenter.writeModuleAsPlantUml(it, options));
	}

}
