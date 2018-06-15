package pe.edu.sistemas.sisasistlab.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pe.edu.sistemas.sisasistlab.domain.LaboratorioDisp;

public interface LaboratorioDispRepository extends JpaRepository<LaboratorioDisp, Integer>{
	
	@Query(value = "SELECT ld FROM LaboratorioDisp ld WHERE ld.laboratorioDispEstado = 0 ")
	List<LaboratorioDisp> obtenerLaboratoriosDisponibles();

}
