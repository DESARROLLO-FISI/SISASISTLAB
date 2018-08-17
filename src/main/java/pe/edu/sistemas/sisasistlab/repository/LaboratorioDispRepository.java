package pe.edu.sistemas.sisasistlab.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import pe.edu.sistemas.sisasistlab.domain.Aula;
import pe.edu.sistemas.sisasistlab.domain.LaboratorioDisp;

@Repository
public interface LaboratorioDispRepository extends JpaRepository<LaboratorioDisp, Integer>{
	
	@Query(value = "SELECT ld FROM LaboratorioDisp ld WHERE ld.laboratorioDispEstado = 0 ")
	List<LaboratorioDisp> obtenerLaboratoriosDisponibles();
	
	
	@Query(value = "SELECT DISTINCT aula FROM HorarioClase hc "
			+ "	WHERE hc.grupo.idgrupo = :idGrupo AND hc.docente.iddocente = :idDocente AND hc.horarioClaseTipo = 'LABORATORIO'")
	Aula obtenerLaboratorioxGrupoyDocente(@Param("idGrupo") Integer idgrupo, @Param("idDocente") Integer idDocente);
	
	
	
	LaboratorioDisp findByAula(Aula aula);
}
