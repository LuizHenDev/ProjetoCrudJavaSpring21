package springproject.Mapstruct;

import springproject.Dto.AlunoRequest;
import springproject.Dto.AlunoResponse;
import springproject.Entity.Aluno;

public interface AlunoMapper {

    public static Aluno toEntity(AlunoRequest dto){
        Aluno aluno = new Aluno();
        aluno.setNome(dto.getNome());
        aluno.setEmail(dto.getEmail());
        aluno.setCpf(dto.getCpf());
        aluno.setDataNascimento(dto.getDataNascimento());
        aluno.setUsername(dto.getUsername());
        aluno.setPassword(dto.getPassword());
        return aluno;
    }

    public static AlunoResponse toResponse(Aluno aluno){
        AlunoResponse response = new AlunoResponse();
        response.setId(aluno.getId());
        response.setNome(aluno.getNome());
        response.setEmail(aluno.getEmail());
        response.setDataNascimento(aluno.getDataNascimento());
        response.setUsername(aluno.getUsername());
        return response;
    }
}
