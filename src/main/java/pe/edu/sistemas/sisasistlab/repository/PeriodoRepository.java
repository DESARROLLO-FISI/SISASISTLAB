package pe.edu.sistemas.sisasistlab.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.edu.sistemas.sisasistlab.domain.Periodo;


public interface PeriodoRepository extends JpaRepository<Periodo, Integer>{
	
	public abstract Periodo findFirstByOrderByIdperiodoDesc();

}
