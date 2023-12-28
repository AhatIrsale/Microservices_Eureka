package com.example.eurekaclient;

import com.example.eurekaclient.Model.Client;
import com.example.eurekaclient.Repository.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@EnableDiscoveryClient
@SpringBootApplication
@Configuration
public class EurekaClientApplication {

	public static void main(String[] args) {

		SpringApplication.run(EurekaClientApplication.class, args);


	}
	@Bean
	CommandLineRunner initialiserBaseH2(ClientRepository cr){
		return args ->{
			cr.save(new Client(Long.parseLong("1"),"Taha Elasri",Float.parseFloat("23")));
			cr.save(new Client(Long.parseLong("2"),"Mohamed Lachgar",Float.parseFloat("22")));
			cr.save(new Client(Long.parseLong("3"),"Najahi saad",Float.parseFloat("21")));
		};
	}

}
