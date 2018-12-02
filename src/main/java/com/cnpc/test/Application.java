package com.cnpc.test;

import com.cnpc.test.annotation.EnableMinaHessian;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableMinaHessian
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
