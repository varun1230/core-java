package com.example.core.java.testjava8.repeatableAnnotation;

import java.lang.annotation.Repeatable;

/**
 * 
 * @author  varun
 *
 * Usage : As the name suggest you can use the schedule call annatation multiple times to a declaration 
 */

@Repeatable(Schedules.class)
public @interface Schedule {
	String dayOfMonth() default "first";
	  String dayOfWeek() default "Mon";
	  int hour() default 12;
}
