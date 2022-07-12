package repo;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Client;


public interface ClientRepository extends JpaRepository<Client, Integer> {

}
