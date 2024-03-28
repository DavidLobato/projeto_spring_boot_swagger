package br.com.projeto;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
        info = @Info(
                title = "Tutorial documentando APIs",
                version = "1.0",
                description = "Documentando uma API básica de gerenciamento de pessoas",
                contact = @Contact(name = "David", email = "david.lobato@gmail.com", url = "https://www.davidlobato.com.br")
        )
)
public class ProjetoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjetoApplication.class, args);
    }

}
