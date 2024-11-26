package com.tcs.in.Spring_boot_1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class Service {
	
	@Autowired
	private PasswordService pwd;
	
	
	public Service(PasswordService pwd)
	{
		this.pwd = pwd;
		
		System.out.println("Setter :: DI");
	}
	
	public void get_password()
	{
		pwd.generate_password();
	}
}
