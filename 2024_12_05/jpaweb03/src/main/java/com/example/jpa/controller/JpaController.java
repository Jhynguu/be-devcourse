package com.example.jpa.controller;

import com.example.jpa.domain.Member;
import com.example.jpa.domain.Team;
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
            Team team = new Team();
            team.setId(10);
            team.setName("team 1");

            em.persist(team);

            Member member1 = new Member();
            member1.setId(1001);
            member1.setName("member1");
            member1.setTeam(team);
            member1.setAge(10);

            Member member2 = new Member();
            member2.setId(1002);
            member2.setName("member2");
            member2.setTeam(team);
            member2.setAge(20);

            em.persist(member1);
            em.persist(member2);

            tx.commit();
        } catch (Exception e) {
            System.out.println("[에러] : " + e.getMessage());
            tx.rollback();
        } finally {
            em.close();
        }

        return "<h3>insert</h3>";
    }

    @RequestMapping("/add")
    public String add() {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
            Team team = new Team();
            team.setId(20);
            team.setName("team 2");

            em.persist(team);

            Member member = new Member();
            member.setId(1003);
            member.setName("member3");
            member.setTeam(team);
            member.setAge(30);

            em.persist(member);

            tx.commit();
        } catch (Exception e) {
            System.out.println("[에러] : " + e.getMessage());
            tx.rollback();
        } finally {
            em.close();
        }

        return "<h3>add</h3>";
    }

    @RequestMapping("/select")
    public String select() {
        EntityManager em = emf.createEntityManager();

        Member member = em.find(Member.class, 1001);
        System.out.println("member : " + member);

        Team team = member.getTeam();
        System.out.println("team : " + team);

        em.close();

        return "<h3>select</h3>";
    }

    @RequestMapping("/select2")
    public String select2() {
        EntityManager em = emf.createEntityManager();

        Team team = em.find(Team.class, 10);
        List<Member> members = team.getMembers();
        for (Member member : members) {
            //System.out.println("member : " + member);
            System.out.println("name : " + member.getName());
        }

        em.close();

        return "<h3>select2</h3>";
    }
}
