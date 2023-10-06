package aplicacao;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Compra;
import model.Pessoa;



public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	      // Criando uma pessoa
        Pessoa pessoa = new Pessoa(1, "usuario123", "senha123", "usuario123@email.com", "João da Silva");

        // Criando compras para a pessoa
        Compra compra1 = new Compra(1, 100.0, new Date(), pessoa);
        Compra compra2 = new Compra(2, 50.0, new Date(), pessoa);
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("unilins-jpa");
		EntityManager em = emf.createEntityManager();

        EntityTransaction transaction = et.getTransaction();
        transaction.begin();

        // Persistindo a pessoa e suas compras
        em.persist(pessoa);
        em.persist(compra1);
        em.persist(compra2);

        transaction.commit();

        // Buscando uma pessoa por ID
        Pessoa pessoaRecuperada = em.find(Pessoa.class, 1);
        System.out.println("Nome da pessoa recuperada: " + pessoaRecuperada.getNome());

        // Imprimindo informações das compras
        System.out.println("Compras da pessoa:");
        for (Compra compra : pessoaRecuperada.getCompras()) {
            System.out.println("ID da compra: " + compra.getId_compra());
            System.out.println("Valor da compra: R$" + compra.getValor());
            System.out.println("Data da compra: " + compra.getData());
            System.out.println();
        }
    
        em.close();
        emf.close();
    

	}

}
