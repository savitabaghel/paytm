package com.example.crudproject;

import com.example.crudproject.model.user;
import com.example.crudproject.repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudprojectApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CrudprojectApplication.class, args);
	}

	@Autowired
	private userRepository userRepository;

	@Override
	public void run(String... args) throws Exception {

		user users=new user();
		users.setFirstname("Savita");
		users.setLastname("BAghel");
		users.setEmailid("savitabaghel@gamil.com");
		users.setMobileno(9867435);
		users.setAddress1("bhind");
		users.setAddress2("mp");
		user user2= userRepository.save(users);

	}
}
