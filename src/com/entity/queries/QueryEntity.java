package com.entity.queries;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import model.BookAuthor;

public class QueryEntity {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PUExample");
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction emtr = em.getTransaction();
		emtr.begin();
/*		BookAuthor ba = new BookAuthor();
		ba.setId(new BigDecimal(2));
		ba.setLast("palanati");
		ba.setFirst("keerthana");
		ba.setEmail("keerthana.palanati@gmail.com");
		ba.setPassword("password");
		ba.setDescription("This is keerthana.I am statying in germany");
		ba.setOccupation("Home Maker");
		ba.setReceivenotifications("N");
		ba.setGender("F");
		
		em.persist(ba);
		emtr.commit();*/
	/*
		Article article = em.createNamedQuery("Article.findAll", Article.class).getSingleResult();
		
		System.out.println(article.getTitle());*/
		
		BookAuthor ba= em.createNamedQuery("BookAuthor.findAll", BookAuthor.class).getSingleResult();
		
		System.out.println(ba.getEmail());

	}

}
