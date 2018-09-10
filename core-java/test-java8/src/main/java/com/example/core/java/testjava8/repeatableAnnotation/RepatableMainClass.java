package com.example.core.java.testjava8.repeatableAnnotation;

import com.sun.prism.paint.Color;

public class RepatableMainClass {

	public static void main(String[] args) {
	Schedule[] schedules =	Repeatable.class.getAnnotationsByType(Schedule.class);
	for (Schedule schedule : schedules) {
		System.out.println(" SChedule info Day of month "+schedule.dayOfMonth()+
		 	"Day of week "+schedule.dayOfWeek()+
		 	" Day of hour"+schedule.hour());
	}
		
	}

}
