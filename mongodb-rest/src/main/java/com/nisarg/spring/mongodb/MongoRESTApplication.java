package com.nisarg.spring.mongodb;

import com.nisarg.spring.mongodb.respositories.PersonRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackageClasses = PersonRepository.class)
public class MongoRESTApplication {

  public static void main(String[] args) {
    SpringApplication.run(MongoRESTApplication.class, args);
  }
}
