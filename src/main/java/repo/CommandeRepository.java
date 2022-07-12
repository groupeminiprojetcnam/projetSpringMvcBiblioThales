package repo;

import org.springframework.data.jpa.repository.JpaRepository;


import model.Commandes;




public interface CommandeRepository extends JpaRepository<Commandes, Integer> {

}
