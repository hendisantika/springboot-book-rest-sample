package com.hendisantika.springbootbookrestsample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringbootBookRestSampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootBookRestSampleApplication.class, args);
    }

}

