package org.generation.blogWhale.repository;

import java.util.List;

import org.generation.blogWhale.model.Tema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TemaRepository extends JpaRepository<Tema, Long>{

	public List<Tema> findAllByDescricaoContainingIgnoreCase(String descricao);
	
	
}
