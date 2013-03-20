package com.github.danielsoro.dynamicinject.helloimpl;

import javax.ejb.Stateless;

import com.github.danielsoro.dynamicinject.hello.Hello;
import com.github.danielsoro.dynamicinject.qualifier.LuizVictor;

/**
 * @author Daniel Cunha (danielsoro@gmail.com)
 */
@Stateless
@LuizVictor
public class HelloLuizVictor implements Hello {

	@Override
	public String hello() {
		return "Olá Luiz Victor";
	}

}
