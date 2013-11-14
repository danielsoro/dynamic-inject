package com.github.danielsoro.dynamicinject.annotationLiteral;

import javax.enterprise.util.AnnotationLiteral;

import com.github.danielsoro.dynamicinject.qualifier.Sandra;
import java.lang.annotation.Annotation;

/**
 * @author Daniel Cunha (danielsoro@gmail.com)
 */
public class SandraQualifier extends AnnotationLiteral<Sandra> implements Annotation {}
