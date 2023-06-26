package one.terenin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
public class MusOrderServiceApplication {

	@Bean
	public RestTemplate template(){
		return new RestTemplateBuilder().build();
	}

	public static void main(String[] args) {
		SpringApplication.run(MusOrderServiceApplication.class, args);
	}

}
