package com.collections.di.books;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Service;


public class App {

	private static final Logger logger = LoggerFactory.getLogger(App.class);
	
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:spring/app-context-xml.xml");
        ctx.refresh();  

        Category categoryOne = (Category) ctx.getBean("CategoryOne");
        categoryOne.displayInfo("set");
        Category categoryTwo = (Category) ctx.getBean("CategoryTwo");
        categoryTwo.displayInfo("list");
        Category categoryThree = (Category) ctx.getBean("CategoryThree");
        categoryThree.displayInfo("map");
	}

}
