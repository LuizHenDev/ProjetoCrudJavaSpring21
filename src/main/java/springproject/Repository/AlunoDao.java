package springproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springproject.Entity.Aluno;
public interface AlunoDao extends JpaRepository<Aluno, Long> {
    
}
