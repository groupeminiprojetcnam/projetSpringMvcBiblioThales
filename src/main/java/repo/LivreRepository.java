package repo;

import org.springframework.data.jpa.repository.JpaRepository;


import model.Livres;



public interface LivreRepository extends JpaRepository<Livres, Integer> {

}
