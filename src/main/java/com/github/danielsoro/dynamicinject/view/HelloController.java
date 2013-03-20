package com.github.danielsoro.dynamicinject.view;

import java.util.Arrays;
import java.util.List;

import javax.enterprise.inject.Any;
import javax.enterprise.inject.Instance;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

import com.github.danielsoro.dynamicinject.enums.Pessoas;
import com.github.danielsoro.dynamicinject.hello.Hello;

@ManagedBean
@ViewScoped
public class HelloController {

	private List<Pessoas> pessoas = Arrays.asList(Pessoas.values());
	private Pessoas pessoa;
	
	@Inject @Any
	private Instance<Hello> helloSource;
	private Hello hello;
	
	public void addHello() {
		this.hello = this.helloSource.select(pessoa.getAnnotation()).get();
	}
	
	public String showHello() {
		if (hello != null)
			return this.hello.hello();
		return "";
	}

	public List<Pessoas> getPessoas() {
		return pessoas;
	}

	public void setPessoas(List<Pessoas> pessoas) {
		this.pessoas = pessoas;
	}

	public Pessoas getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoas pessoa) {
		this.pessoa = pessoa;
	}
}
