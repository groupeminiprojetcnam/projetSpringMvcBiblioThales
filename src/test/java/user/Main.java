package user;

import java.util.List;
import java.util.Optional;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import model.Client;
import repo.ClientRepository;


public class Main {

	public static void main(String[] args) {
		
		testFindAll();

	}	
	
	static void testFindAll()
	{
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("./applicationContext.xml");
		ClientRepository clientRepository = ctx.getBean(ClientRepository.class);
		
		List<Client> liste = clientRepository.findAll();
		
		for (Client client : liste) {
			System.out.println(client);
		}
		
		ctx.close();
	}
	
	static void testFindById()
	{
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("./applicationContext.xml");
		ClientRepository clientRepository = ctx.getBean(ClientRepository.class);
		int id = 1 ;
		//Méthode qui retourne un "optional"
		Optional<Client> op = clientRepository.findById(id);
		
		//Permet de récupérer l'objet voulu à partir de l'optional
		Client c = op.get();
		System.out.println(c);
		
		ctx.close();
	}
	
	static void testInsert()
	{
		Client c = new Client();
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("./applicationContext.xml");
		ClientRepository clientRepository = ctx.getBean(ClientRepository.class);
		
		clientRepository.save(c);
		
		ctx.close();
	}
	
	static void testUpdate()
	{
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("./applicationContext.xml");
		ClientRepository personneRepository = ctx.getBean(ClientRepository.class);
		int id = 1 ;
		Client c = personneRepository.findById(id).get();
		c.setNom("");
		personneRepository.save(c);
		ctx.close();
	}
	
	static void testDelete()
	{
		int id = 2;
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("./applicationContext.xml");
		ClientRepository clientRepository = ctx.getBean(ClientRepository.class);
	
		Client c = clientRepository.findById(id).get();

		clientRepository.delete(c);
		ctx.close();
	}
	
	

}
