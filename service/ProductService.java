package com.service;

import com.userdao.UserDao;
import com.util.HibernateUtil;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.product.Product;

public class ProductService implements UserDao{

	@Override
	public void Product(Product product) {
		try {
			Session session = HibernateUtil.getSession();
			Transaction tx = session.beginTransaction();
			session.save(product);
			tx.commit();
			System.out.println("Product is added");
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
