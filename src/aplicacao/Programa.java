package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();


//		Pessoa p = new Pessoa(2, null, null);
		em.getTransaction().begin();
		Pessoa p = em.find(Pessoa.class, 2);

		System.out.println(p);
		
		em.remove(p);
		em.getTransaction().commit();

		System.out.println("Pronto!");
		em.close();
		emf.close();

		/*
		 * System.out.println(p1); System.out.println(p2); System.out.println(p3);
		 */

	}

}
