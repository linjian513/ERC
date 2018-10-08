package com.erc.manager.service;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.fastjson.JSON;
import com.erc.manager.entities.Book;

public class BookServiceTest {
	private static Logger log = LogManager.getLogger(BookServiceTest.class.getName());
	static BookService bookservice;
	static ApplicationContext ctx;
	
	@BeforeClass
    public static void before(){
        ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        bookservice = ctx.getBean(BookService.class);
    }
	
	@Test
    public void testGetAllBooks() {
		System.out.println("HHHHahahaha");
        List<Book> books=bookservice.getAllBooks();
        System.out.println(JSON.toJSONString(books));
        log.info("info print books={}", JSON.toJSONString(books));
        log.error("error print books={}", JSON.toJSONString(books));
        
        assertNotNull(books);
    }
	
	
	@AfterClass
	public static void after() {
	}

}
