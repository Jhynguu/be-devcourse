package com.example.jpa.controller;

import com.example.jpa.domain.Locker;
import com.example.jpa.domain.Member;
import com.example.jpa.domain.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JpaController {

    @Autowired
    private EntityManagerFactory emf;

    @RequestMapping("/insert")
    public String insert() {

        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        try {
            User user1 = new User(1001, "회원 1", 21);
            User user2 = new User(1002, "회원 2", 22);
            User user3 = new User(1003, "회원 3", 23);

            em.persist(user1);
            em.persist(user2);
            em.persist(user3);

            tx.commit();
        } catch (Exception e) {
            System.out.println("[에러] : " + e.getMessage());
            tx.rollback();
        } finally {
            em.close();
        }
        return "<h3>insert</h3>";
    }

    @RequestMapping("/select")
    public String select() {
        EntityManager em = emf.createEntityManager();

        List<User> users = em.createQuery("select m from User m", User.class).getResultList();

        for (User user : users) {
            System.out.println(user);
        }

        em.close();

        return "<h3>select</h3>";
    }
}
