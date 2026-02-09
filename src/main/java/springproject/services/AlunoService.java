package springproject.services;

import org.springframework.stereotype.Service;

@Service
public class AlunoService {
    public String mensagemBoasVindas(String nome) {
        return "Bem-vindo ao Spring Boot!, " + nome;
    }
}
