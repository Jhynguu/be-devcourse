package com.example.jpaweb02.controller;

import com.example.jpaweb02.domain.Member;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.task.TaskExecutionAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JpaController {

    @Autowired
    private EntityManagerFactory emf;
    @Autowired
    private TaskExecutionAutoConfiguration taskExecutionAutoConfiguration;

    @RequestMapping("/create")
    public String create() {
        return "<h3>create</h3>";
    }

    @RequestMapping("/insert")
    public String insert() {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        try {

            // 비영속 상태로 객체 생성
            Member member1 = new Member("회원1", "20");
            Member member2 = new Member();
            member2.setName("회원2");
            member2.setAge("30");

            // 영속 => insert => DB
            // 1차 캐시
            // 쓰기 저장소에 sql이 저장됨
            em.persist(member1);
            em.persist(member2);

            System.out.println("member1 : " + em.contains(member1));
            System.out.println("member2 : " + em.contains(member2));

            Member member3 = new Member("회원3", "20");

            // 1차 캐시 사용
            // 쓰기 지연 SQL 저장소 사용
            em.persist(member3);
            System.out.println("member3 : " + em.contains(member3));

            // 쓰기 지연
            tx.commit();
        } catch (Exception e) {
            System.out.println("에러 : " + e.getMessage());
            tx.rollback();
        } finally {
            em.close();
        }
        return "<h3>insert</h3>";
    }

    @RequestMapping("/select")
    public String select() {
        EntityManager em = emf.createEntityManager();

        // find
        // 1차 캐시
        Member member1 = em.find(Member.class, 1);
        System.out.println("member1 : " + member1);

        Member member2 = em.find(Member.class, 1);
        System.out.println("member2 : " + member2);

        // 내용값 x 참조값 비교
        // 동일성 비교
        System.out.println(member1 == member2);

        Member member3 = em.find(Member.class, 2);
        System.out.println(member1 == member3);

        em.close();
        return "<h3>select</h3>";
    }

    @RequestMapping("/update")
    public String update() {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
            Member member = em.find(Member.class, 1);
            member.setName("새 회원");
            member.setAge("25");

            // update 구문이 없음
            // 영속 컨텍스트에 포함 객체의 내용 변경

            em.detach(member);

            tx.commit();
        } catch (Exception e) {
            System.out.println("에러" + e.getMessage());
            tx.rollback();
        } finally {
            em.close();
        }

        return "<h3>update</h3>";
    }

    @RequestMapping("/delete")
    public String delete() {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
            Member member = em.find(Member.class, 1);

            // delete와 관련된 SQP문 X -> persistencecontext 변경(1차 캐시를 변경)
            em.remove(member);

            System.out.println("member : " + em.contains(member));

            tx.commit();
        } catch (Exception e) {
            System.out.println("에러 : " + e.getMessage());
        } finally {
            em.close();
        }

        return "<h3>delete</h3>";
    }

    @RequestMapping("/flush")
    public String flush() {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        try {

            Member member1 = new Member("회원1", "20");

            em.persist(member1);

            em.flush();

            tx.commit();
        } catch (Exception e) {
            System.out.println("에러 : " + e.getMessage());
            tx.rollback();
        } finally {
            em.close();
        }
        return "<h3>flush</h3>";
    }
}
