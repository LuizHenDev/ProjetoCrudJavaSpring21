package springproject.Controller;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springproject.Dto.AlunoRequest;
import springproject.Dto.AlunoResponse;
import springproject.services.AlunoService;
    

    
@RestController
@RequestMapping("/alunos")
public class AlunoController {

    private final AlunoService alunoService;
    
    public AlunoController(AlunoService alunoservice) {
        this.alunoService = alunoservice;
    }   

    @PostMapping
    public void criarAluno(@RequestBody AlunoRequest aluno) {
       alunoService.criarAluno(aluno);
    }

    @GetMapping("/cpf/{cpf}")
    public AlunoResponse buscarAlunoPorCpf(@PathVariable String cpf) {
         return alunoService.buscarAlunoPorCpf(cpf);
    }

    @PutMapping("/cpf/{cpf}")
    public AlunoResponse atualizarParcialAlunoPorCpf(@PathVariable String cpf, @RequestBody AlunoRequest dto) {
         return alunoService.atualizarParcialAlunoPorCpf(cpf, dto);
    }

    @DeleteMapping("/cpf/{cpf}")
    public void deletarAlunoPorCpf(@PathVariable String cpf) {
        alunoService.deletarAlunoPorCpf(cpf);
    }
    
}
