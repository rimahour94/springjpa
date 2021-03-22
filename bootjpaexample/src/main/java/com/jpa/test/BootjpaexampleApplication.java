package com.jpa.test;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

//import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
	ApplicationContext context=	SpringApplication.run(BootjpaexampleApplication.class, args);
    UserRepository userRepository=context.getBean(UserRepository.class);
    
    
    
//    List<User> users=userRepository.findByName("ppp");
//    
//    users.forEach(e->{System.out.println(e);});
    
  
   List<User> users= userRepository.findByNameAndCity("Aba","Delhi");
    
     users.forEach(e->{System.out.println(e);});
   
//    Save Single User

    //   User user=new User();
//    user.setName("Ritesh");
//    user.setCity("Noida");
//    user.setStatus("I am java Developer");
//    
//    User user1=userRepository.save(user);
    
////    User user1=new User();
////    user1.setName("aaaa");
////    user1.setCity("GZB");
////    user1.setStatus("I am Developer");
////   
//    User user2=new User();
//    user2.setName("aaaa");
//    user2.setCity("GZB");
//    user2.setStatus("I am Developer");
////    
////    User resultUser=userRepository.save(user2);
////    System.out.println(" saved user "+resultUser);
////    System.out.println("done");

//   Save Multiple User
    
    //     List<User> users= List.of(user,user2);
//      Iterable<User> saveAll= userRepository.saveAll(users);
//      
//      saveAll.forEach(userr->{
//    	  System.out.println(userr);
//      });

//  Get user detail by id and update
    
//       Optional<User> optional=  userRepository.findById(1);
//           User user= optional.get();
//           user.setName("Sonu");
//           User userResult=userRepository.save(user);
//	   System.out.println(userResult);

//    Find All the details of User
    
    //          Iterable<User>itr= userRepository.findAll();
//	      Iterator<User> iterator=itr.iterator();
//	   
//	      itr.forEach(userr->{System.out.println(userr);});
	      
//	      while(iterator.hasNext()) {
//	    	  User user=iterator.next();
//	      System.out.println(user);
//	      }
	
    
//    Delete user  by id
    
//      userRepository.deleteById(11);
//    System.out.println("Deleted");
    
//	delete All user
    
//   Iterable<User>itr= userRepository.findAll();
//	  itr.forEach(userr->System.out.println(userr));
//	  userRepository.deleteAll();
	}
	
}
