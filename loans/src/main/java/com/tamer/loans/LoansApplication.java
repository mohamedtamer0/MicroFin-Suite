package com.tamer.loans;

import com.tamer.loans.dto.LoansContactInfoDto;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@EnableConfigurationProperties(value = {LoansContactInfoDto.class})
@OpenAPIDefinition(
		info = @Info(
				title = "MicroFin-Suite (Loans) microservice REST API Documentation",
				description = "MicroFin-Suite Loans microservice REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Mohamed Tamer",
						email = "mohamedtamerdev@gmail.com",
						url = "https://www.linkedin.com/in/mohamedtamer0"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://www.linkedin.com/in/mohamedtamer0"
				)
		),
		externalDocs = @ExternalDocumentation(
				description =  "MicroFin-Suite Accounts microservice REST API Documentation",
				url = "http://localhost:8081/swagger-ui.html"
		)
)
public class LoansApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoansApplication.class, args);
	}

}
