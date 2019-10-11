package com.nisarg;

import java.io.File;

public class Test {

  public static void main(String[] args) {
    File file = new File("c:/nisarg/test_properties");
    System.out.println(file.exists());
  }
}
