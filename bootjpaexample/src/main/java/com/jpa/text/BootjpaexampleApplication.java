package com.jpa.text;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.context.ApplicationContext;

import com.test.daooo.UserRepository;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
	ApplicationContext context=	SpringApplication.run(BootjpaexampleApplication.class, args);
		UserRepository userRepository=context.getBean(UserRepository.class);
		
		//
	//	User user=new User();
		
		//user.setName("Shashank Shankar");
	//	user.setCity("delhi");
		//user.setstatus("i am java programmer");
	
//User user1=userRepository.save(user);
// System.out.println(user1);
		
		
		User user1=new User();
		user1.setName("satyam");
		user1.setcity("city");
		user1.setStatus("python programmer");
		

		User user2=new User();
		user2.setName("satyam");
		user2.setcity("city");
		user2.setStatus("python programmer");
		
		
		//List<User>users=List.of(user1,user2);
		//save multiple objects
		//Iterable<User>result=userRepository.saveAll(users);
		//result.forEach(user->{
			//System.out.println(user);
		//});
	//User result=	userRepository.save(user2);
		//System.out.println("saved user" + result);
		//System.out.println("done");
		//update  the user id l1
		userRepository.findById(l1);
		
		
		
}
}