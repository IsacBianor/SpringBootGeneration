package org.Generation.farmacia.Repository;

import java.util.List;

import org.Generation.farmacia.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

	public List<Categoria> findByCosmeticosTrue();
	//findByActiveTrue
	public List<Categoria> findByMedicacaoTrue();
	
	public List<Categoria> findByProntossocorrosTrue();
	
}
