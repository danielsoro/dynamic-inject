package com.github.danielsoro.dynamicinject.annotationLiteral;

import javax.enterprise.util.AnnotationLiteral;

import com.github.danielsoro.dynamicinject.qualifier.Gustavo;
import java.lang.annotation.Annotation;

/**
 * @author Daniel Cunha (danielsoro@gmail.com)
 */
public class GustavoQualifier extends AnnotationLiteral<Gustavo> implements Annotation {}
