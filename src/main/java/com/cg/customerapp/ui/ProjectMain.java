package com.cg.customerapp.ui;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cg.customerapp.JavaConfiguration;


public class ProjectMain {
	
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(JavaConfiguration.class);
		context.refresh();
		ProjectUi projectUi = context.getBean(ProjectUi.class);
		projectUi.run();
		//context.close();
	}
	
}
