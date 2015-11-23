package com.no1.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.no1.biz.GoodsBIZ;

public class GoodsTest {
	public static void main(String[] args) {
		ApplicationContext context=new FileSystemXmlApplicationContext("src/applicationContext.xml");
		GoodsBIZ goodsBIZ=(GoodsBIZ) context.getBean("GoodsBIZ");
		goodsBIZ.save();
	}
}
