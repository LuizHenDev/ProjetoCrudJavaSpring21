package springproject.Dto;

import java.time.LocalDate;

import io.micrometer.common.lang.NonNull;
import lombok.Data;

@Data

public class AlunoResponse {
    @NonNull
    private Long id;
    @NonNull
    private String nome;
    @NonNull
    private String email;
    @NonNull
    private LocalDate dataNascimento;
    @NonNull
    private String username;

}
