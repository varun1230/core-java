package com.example.core.java.testjava8.repeatableAnnotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;



@Retention(RetentionPolicy.RUNTIME)
 @interface Schedules {
	Schedule[] value();
}


@Schedule(dayOfMonth="MON", dayOfWeek="1", hour=12)
@Schedule(dayOfMonth="TUE", dayOfWeek="2", hour=10)
@Schedule(dayOfMonth="WED", dayOfWeek="3", hour=11)
@Schedule(dayOfMonth="THU", dayOfWeek="4", hour=10)
public class Repeatable {

}
