package com.jashu.springtest;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle
{
    public void drive()
    {
	System.out.println("Bhaag rha hai..");
    }
}
