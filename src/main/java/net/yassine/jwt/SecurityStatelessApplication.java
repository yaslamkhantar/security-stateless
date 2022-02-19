package net.yassine.jwt;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.yassine.jwt.entity.User;
import net.yassine.jwt.repository.UserRepository;

@SpringBootApplication
public class SecurityStatelessApplication {

	private UserRepository userrepository;
	
	public SecurityStatelessApplication(UserRepository userrepository) {
		this.userrepository=userrepository;
	}
	
	
	@PostConstruct
	public void initusers() {
		List<User> users=Stream.of(
				new User("3","yassine","lamkhantar","yassine@123"),
				new User("5","Hajar","Hachim","hachim@123")
				).collect(Collectors.toList());
		userrepository.saveAll(users); 
	}
	public static void main(String[] args) {
		SpringApplication.run(SecurityStatelessApplication.class, args);
	}

}
