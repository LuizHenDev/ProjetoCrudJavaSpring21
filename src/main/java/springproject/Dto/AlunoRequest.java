package springproject.Dto;

import java.time.LocalDate;

import io.micrometer.common.lang.NonNull;
import lombok.Data;

@Data

public class AlunoRequest {
    @NonNull
    private String nome;
    @NonNull
    private String email;
    @NonNull
    private String cpf;
    @NonNull
    private LocalDate dataNascimento;
    @NonNull
    private String username;
    @NonNull
    private String password;
}

