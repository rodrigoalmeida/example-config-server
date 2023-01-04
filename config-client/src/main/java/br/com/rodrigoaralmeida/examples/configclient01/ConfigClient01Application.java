package br.com.rodrigoaralmeida.examples.configclient01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(AppProperties.class)
@SpringBootApplication
public class ConfigClient01Application {

	public static void main(String[] args) {
		SpringApplication.run(ConfigClient01Application.class, args);
	}
}
