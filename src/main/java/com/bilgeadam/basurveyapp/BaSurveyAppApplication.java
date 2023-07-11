package com.bilgeadam.basurveyapp;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableAsync
@OpenAPIDefinition(info = @Info(title = "BASurveyApp API"))

public class BaSurveyAppApplication {
        public static final String SET_BOLD_TEXT = "\033[0;1m";
    public static void main(String[] args) {
        SpringApplication.run(BaSurveyAppApplication.class, args);
        System.out.println("{\n       Authenticate Mail  \n" +
                "  \"email\": admin@bilgeadam.com\n" +
                "  \"password\": adminadmin \n" +
                "}");
        System.out.println("{\n       gmail  \n" +
                "  \"username\": javaboost\n" +
                "  \"email\": bilgeadamjavaboost@gmail.com\n" +
                "  \"password\": asd123asd...\n " +
                "}");

    }
}
