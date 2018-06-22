package pe.edu.sistemas.sisasistlab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.sistemas.sisasistlab.domain.Periodo;

@Repository
public interface PeriodoRepository extends JpaRepository<Periodo, Integer>{
	
	public abstract Periodo findFirstByOrderByIdperiodoDesc();

}
