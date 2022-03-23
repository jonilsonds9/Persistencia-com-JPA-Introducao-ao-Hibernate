package br.com.alura.loja.util;

import javax.persistence.*;

public class JPAUtil {

    public static EntityManager getEntityManager() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("primary");
        return factory.createEntityManager();
    }

    public static EntityManager getEntityManagerTest() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("secondary");
        return factory.createEntityManager();
    }

}
