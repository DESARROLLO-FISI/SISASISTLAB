package pe.edu.sistemas.sisasistlab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.sistemas.sisasistlab.domain.LaboratorioAsist;

@Repository
public interface LaboratorioAsistRepository extends JpaRepository<LaboratorioAsist, Integer> {
	

}
