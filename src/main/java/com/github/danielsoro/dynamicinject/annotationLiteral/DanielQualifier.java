package com.github.danielsoro.dynamicinject.annotationLiteral;

import javax.enterprise.util.AnnotationLiteral;

import com.github.danielsoro.dynamicinject.qualifier.Daniel;
import java.lang.annotation.Annotation;

/**
 * @author Daniel Cunha (danielsoro@gmail.com)
 */
public class DanielQualifier extends AnnotationLiteral<Daniel> implements Annotation { }
