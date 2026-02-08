package springproject.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
    
@RestController
@RequestMapping("/")
public class AlunoController {
    
    @GetMapping("mensagemboasvindas")
    public String mensagemBoasVindas() {
        return "Bem-vindo ao Spring Bot!";
    }

    
}
