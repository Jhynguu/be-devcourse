package com.example.jpa;

import com.example.jpa.domain.Member;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Jpa2Application implements CommandLineRunner {

	@Autowired
	private EntityManagerFactory emf;
	@Autowired
	private EntityManager em;

	public static void main(String[] args) {
		SpringApplication.run(Jpa2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("emf : " + emf);
		System.out.println("em : " + em);
		insert1();
	}

	/*public void insert1() {
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		try {
			Member member = new Member(1000, "member1", "20");
			em.persist(member);

			tx.commit();
			System.out.println("입력 완료");
		} catch (Exception e) {
			System.out.println("[에러] : " + e.getMessage());
			tx.rollback();
		} finally {
			em.close();
		}
	}*/

	// 이런 사용은 배제
	/*public void insert1() {
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		try {
			Member member = new Member(1001, "member1", "20");
			em.persist(member);

			tx.commit();
			System.out.println("입력 완료");
		} catch (Exception e) {
			System.out.println("[에러] : " + e.getMessage());
			tx.rollback();
		}
	}*/

	// web에서 되는 방식
	@Transactional
	public void insert1() {
		Member member = new Member(1002, "member1", "20");
		em.persist(member);
	}
}
