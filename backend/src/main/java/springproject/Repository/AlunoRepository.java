package springproject.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import springproject.Entity.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
    
    Optional <Aluno> findByCpf(String cpf);
    Optional <Aluno> findByUsername(String username);
    

}
