package pe.edu.sistemas.sisasistlab.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import pe.edu.sistemas.sisasistlab.domain.Grupo;
import pe.edu.sistemas.sisasistlab.domain.LaboratorioAsist;

@Repository
public interface LaboratorioAsistRepository extends JpaRepository<LaboratorioAsist, Integer> {
	
	//insertarentablaLaboratorio_asist
	/*@Query(value = "INSERT DISTINCT grupo FROM HorarioClase hc "
			+ "	WHERE hc.horarioClasePeriodo = :periodoActual AND hc.docente.iddocente = :idDocente")
	List<Grupo> obtenerGruposxDocente(@Param("periodoActual") String PeriodoActual, @Param("idDocente") Integer idDocente);*/
}
