package com.no1.biz;

import com.no1.dao.GoodsDAO;

public class GoodsBIZ {
	private GoodsDAO goodsDAO;

	public void show() {
		System.out.println("hello");
	}

	public GoodsDAO getGoodsDAO() {
		return goodsDAO;
	}

	public void setGoodsDAO(GoodsDAO goodsDAO) {
		this.goodsDAO = goodsDAO;
	}

	public void save() {
		System.out.println("GoodsBIZ.save");
		this.goodsDAO.save();
	}
}
