package pe.edu.sistemas.sisasistlab.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import pe.edu.sistemas.sisasistlab.domain.CursoPeriodo;

@Repository
public interface CursoPeriodoRepository extends JpaRepository<CursoPeriodo, Integer> {
	
	
	@Query(value = "SELECT DISTINCT grupo.cursoPeriodo FROM HorarioClase hc "
			+ "	WHERE hc.horarioClasePeriodo = :periodoActual AND hc.docente.iddocente = :idDocente")
	List<CursoPeriodo> obtenerCursosPeriodoxDocente(@Param("periodoActual") String PeriodoActual, @Param("idDocente") Integer idDocente);
}
