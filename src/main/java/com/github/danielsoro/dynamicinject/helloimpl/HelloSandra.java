package com.github.danielsoro.dynamicinject.helloimpl;

import javax.ejb.Stateless;

import com.github.danielsoro.dynamicinject.hello.Hello;
import com.github.danielsoro.dynamicinject.qualifier.Sandra;

/**
 * @author Daniel Cunha (danielsoro@gmail.com)
 */
@Stateless
@Sandra
public class HelloSandra implements Hello {

	@Override
	public String hello() {
		return "Olá Sandra";
	}

}
