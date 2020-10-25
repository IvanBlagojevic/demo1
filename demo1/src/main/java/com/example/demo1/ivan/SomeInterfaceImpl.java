package com.example.demo1.ivan;

import org.springframework.stereotype.Service;

@Service
public class SomeInterfaceImpl implements SomeInterface {

    @Override
    public void doSomething() {
        System.out.println("**********************Hello baby*****************");
    }
}
