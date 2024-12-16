package com.example.jpa;

import com.example.jpa.domain.User;
import jakarta.persistence.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Jpa01Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Jpa01Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpabegin");

		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		try {

			tx.begin();

			User user = new User(1001L, "user1", "30");
			em.persist(user);

			tx.commit();

			System.out.println("입력 완료");
		} catch (Exception e) {
			System.out.println("[에러] : " + e.getMessage());
			tx.rollback();
		}
		emf.close();

	}
}
