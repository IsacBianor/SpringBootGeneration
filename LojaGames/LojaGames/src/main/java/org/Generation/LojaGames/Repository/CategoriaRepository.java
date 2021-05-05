package org.Generation.LojaGames.Repository;

import java.util.List;

import org.Generation.LojaGames.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
	
	public List<Categoria> findByGameTrue();
	public List<Categoria> findByFigureactionTrue();
	public List<Categoria> findByConsoleTrue();
	public List<Categoria> findByDispositivosTrue();

}
