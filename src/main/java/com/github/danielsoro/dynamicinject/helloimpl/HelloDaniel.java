package com.github.danielsoro.dynamicinject.helloimpl;

import javax.ejb.Stateless;

import com.github.danielsoro.dynamicinject.hello.Hello;
import com.github.danielsoro.dynamicinject.qualifier.Daniel;

/**
 * @author Daniel Cunha (danielsoro@gmail.com)
 */
@Stateless
@Daniel
public class HelloDaniel implements Hello {

	@Override
	public String hello() {
		return "Olá Daniel";
	}

}
