package pe.edu.sistemas.sisasistlab.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import pe.edu.sistemas.sisasistlab.domain.Docente;

@Repository
public interface DocenteRepository extends JpaRepository<Docente, Integer>{
	
	public abstract Docente findByIddocente(Integer idDocente);
	
	@Query(value = "SELECT DISTINCT docente FROM HorarioClase hc "
			+ "WHERE hc.horarioClasePeriodo = :periodoActual ")
	List<Docente>  obtenerDocentesxPeriodoActual(@Param("periodoActual") String periodoActual);
	
}
