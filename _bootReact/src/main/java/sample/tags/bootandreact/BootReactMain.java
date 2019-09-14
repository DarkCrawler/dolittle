package sample.tags.bootandreact;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sample.tags.bootandreact.spring.BootReactSpring;

@SpringBootApplication
public class BootReactMain {
   public static void main(String[] args) {
      SpringApplication.run(BootReactSpring.class, args);
   }
}
