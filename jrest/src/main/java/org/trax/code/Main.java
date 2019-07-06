package org.trax.code;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.trax.code.spring.JRestSpring;

@SpringBootApplication
public class Main {
   public static void main(String[] args) {
      SpringApplication.run(JRestSpring.class, args);
   }
}