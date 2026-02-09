package springproject.Controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springproject.Entity.Aluno;
import springproject.Repository.AlunoDao;
    
@RestController
@RequestMapping("/")
public class AlunoController {

     private AlunoDao alunoDao;

     public AlunoController(AlunoDao alunoDao){
        this.alunoDao = alunoDao;
     }

    @PostMapping("/aluno")
    public Aluno criarAluno(@RequestBody Aluno aluno){
        return alunoDao.save(aluno);
    }
    @GetMapping("/aluno")
    public Aluno listarAlunos(){
        return alunoDao.findAll().get(0);
    }
    @DeleteMapping("/aluno")
    public void deletarAluno(@RequestBody Aluno aluno){
        alunoDao.delete(aluno);
    }

    
}
