package com.github.danielsoro.dynamicinject.helloimpl;

import javax.ejb.Stateless;

import com.github.danielsoro.dynamicinject.hello.Hello;
import com.github.danielsoro.dynamicinject.qualifier.Isabela;

/**
 * @author Daniel Cunha (danielsoro@gmail.com)
 */
@Stateless
@Isabela
public class HelloIsabela implements Hello {
	
	@Override
	public String hello() {
		return "Olá Isabela";
	}

}
