package org.example;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class BusinessService
{
	public String greet()
	{
		return "hello";
	}

}
