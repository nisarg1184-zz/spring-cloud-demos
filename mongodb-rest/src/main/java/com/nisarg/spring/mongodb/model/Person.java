package com.nisarg.spring.mongodb.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@Getter
@Setter
@Document(collection = "people")
public class Person {

  @Id
  private String id;

  private String firstName;
  private String lastName;
}
