package sample.tags.restclient;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
public class RestClientMain {
    public static void main(String[] args) {
        SpringApplication.run(RestClientMain.class, args);
    }

    @Bean
    public CommandLineRunner run() throws Exception {
        return args -> {
            System.out.println("I am up ....");
        };
    }

}
