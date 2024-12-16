package com.example.jpa.controller;

import com.example.jpa.domain.Member;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JpaController {

    @Autowired
    private EntityManagerFactory emf;

    @RequestMapping("/create")
    public String create() {
        System.out.println("emf : " + emf);
        return "<h3>create</h3>";
    }

    @RequestMapping("/insert")
    public String insert() {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        try {
            Member member = new Member("member1", "30");
            em.persist(member);

            tx.commit();
        } catch (Exception e) {
            System.out.println("[에러] " + e.getMessage());
            tx.rollback();
        } finally {
            em.close();
        }
        return "<h3>insert</h3>";
    }
}
