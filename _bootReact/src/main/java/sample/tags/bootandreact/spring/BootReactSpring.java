package sample.tags.bootandreact.spring;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import sample.tags.bootandreact.repo.EmployeeRepo;

@ComponentScan(basePackages = {"sample.tags.bootandreact"})
@Configuration
@EnableAutoConfiguration
public class BootReactSpring {

   @Bean(name = "empRepo")
   public EmployeeRepo employeeRepoBean() {
      EmployeeRepo employeeRepo = new EmployeeRepo();
      employeeRepo._init();
      return employeeRepo;
   }
}
