package springproject.services;

import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import springproject.Dto.AlunoRequest;
import springproject.Dto.AlunoResponse;
import springproject.Entity.Aluno;
import springproject.Mapstruct.AlunoMapper;
import springproject.Repository.AlunoRepository;

@Service
public class AlunoService {

    
    private final AlunoRepository alunoRepository;


    public AlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }    

    public void criarAluno(AlunoRequest aluno) {
        Aluno alunoEntity = AlunoMapper.toEntity(aluno);
        alunoRepository.save(alunoEntity);
    }

    public AlunoResponse buscarAlunoPorCpf(String cpf){
        Aluno aluno = alunoRepository.findByCpf(cpf).orElseThrow(
            () -> new RuntimeException("Aluno não encontrado")
        );
        return AlunoMapper.toResponse(aluno);
      
    }
    @Transactional
    public AlunoResponse atualizarParcialAlunoPorCpf(String cpf, AlunoRequest dto) {
        Aluno aluno = buscarAlunoEntityPorCpf(cpf);

        if (dto.getNome() != null)
            aluno.setNome(dto.getNome());

        if (dto.getEmail() != null)
            aluno.setEmail(dto.getEmail());

        if (dto.getUsername() != null)
            aluno.setUsername(dto.getUsername());

        if (dto.getPassword() != null)
            aluno.setPassword(dto.getPassword());

        if (dto.getDataNascimento() != null)
            aluno.setDataNascimento(dto.getDataNascimento());

        return AlunoMapper.toResponse(aluno);
}

    @Transactional
    public void deletarAlunoPorCpf(String cpf){
        Aluno aluno = buscarAlunoEntityPorCpf(cpf);
        alunoRepository.delete(aluno);
    }

    @Transactional
    public void deletarPorId(Long id){
        Aluno aluno = buscarAlunoEntityPorId(id);
        alunoRepository.delete(aluno);
    }
    
 



    private Aluno buscarAlunoEntityPorCpf(String cpf) {
        return alunoRepository.findByCpf(cpf)
            .orElseThrow(() -> new RuntimeException("Aluno não encontrado"));
    }
    private Aluno buscarAlunoEntityPorId(Long id){
        return alunoRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Aluno não encontrado"));
    }


}

