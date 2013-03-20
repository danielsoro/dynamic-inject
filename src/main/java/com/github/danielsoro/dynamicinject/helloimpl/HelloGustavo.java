package com.github.danielsoro.dynamicinject.helloimpl;

import javax.ejb.Stateless;

import com.github.danielsoro.dynamicinject.hello.Hello;
import com.github.danielsoro.dynamicinject.qualifier.Gustavo;

/**
 * @author Daniel Cunha (danielsoro@gmail.com)
 */
@Stateless
@Gustavo
public class HelloGustavo implements Hello {

	@Override
	public String hello() {
		return "Olá Gustavo";
	}

}
