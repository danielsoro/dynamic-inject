package com.github.danielsoro.dynamicinject.enums;

import java.lang.annotation.Annotation;

import com.github.danielsoro.dynamicinject.annotationLiteral.DanielQualifier;
import com.github.danielsoro.dynamicinject.annotationLiteral.GustavoQualifier;
import com.github.danielsoro.dynamicinject.annotationLiteral.IsabelaQualifier;
import com.github.danielsoro.dynamicinject.annotationLiteral.LuizVictorQualifier;
import com.github.danielsoro.dynamicinject.annotationLiteral.SandraQualifier;

public enum Pessoas {
	DANIEL(new DanielQualifier()), 
	GUSTAVO(new GustavoQualifier()), 
	ISABELA(new IsabelaQualifier()), 
	SANDRA(new SandraQualifier()), 
	LUIZ_VICTOR(new LuizVictorQualifier());

	private Annotation annotation;

	private Pessoas(Annotation annotation) {
		this.annotation = annotation;
	}

	public Annotation getAnnotation() {
		return annotation;
	}

	public void setAnnotation(Annotation annotation) {
		this.annotation = annotation;
	}
}
