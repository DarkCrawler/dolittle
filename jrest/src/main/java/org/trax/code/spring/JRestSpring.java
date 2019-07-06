package org.trax.code.spring;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = {"org.trax.code"})
@Configuration
@EnableAutoConfiguration
public class JRestSpring {

}
