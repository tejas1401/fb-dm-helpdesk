package com.richpanel.fbhelpdesk.repository.impl;

import com.richpanel.fbhelpdesk.dto.UserDTO;
import com.richpanel.fbhelpdesk.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Query;
@org.springframework.stereotype.Repository
public class RepositoryIMPL implements Repository {
    @Autowired
    EntityManagerFactory entityManagerFactory;
    @Override
    public void registerUser(UserDTO dto) {
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        try{
            entityManager.getTransaction().begin();
            entityManager.persist(dto);
            entityManager.getTransaction().commit();
        }
        catch (Exception e){
        }
    }

    @Override
    public UserDTO loginUser(String email,String password) {
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        Query query= entityManager.createNamedQuery("login");
        query.setParameter("e",email);
        query.setParameter("p",password);
        try{
            System.out.println("Trying to find user");
            UserDTO dto=(UserDTO)query.getSingleResult();
            System.out.println("User found");
            return dto;
        }
        catch (NoResultException e){
            e.printStackTrace();
            System.out.println("Login fail, user not found");
            return null;
        }
    }
}
