package com.example.first;

import org.springframework.stereotype.Component;

import lombok.extern.java.Log;

@Component
public class Fibonacci {
    public int fibonacci(int n) {
        if (n <= 0) {
            return 0;
        } else if(n == 1) {
            return 1;
        } else {
            return fibonacci(n - 2) + fibonacci(n - 1);
        }
    }
}
