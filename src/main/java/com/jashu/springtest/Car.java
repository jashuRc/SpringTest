package com.jashu.springtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle
{
    @Autowired
    private Tyre tyre;

    public void drive()
    {
	System.out.println("Chal rhi hai ...");
	System.out.println("car" + tyre);
    }

    public Tyre getTyre()
    {
	return tyre;
    }

    public void setTyre(Tyre tyre)
    {
	this.tyre = tyre;
    }
}
