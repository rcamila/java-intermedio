package edu.curso.java.spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import edu.curso.java.spring.service.Exportador;

@Configuration
@ComponentScan("edu.curso.java.spring")
public class SpringConfiguration {

	@Bean
	 public Persona getPersona() {
        return new Persona("Victoria", 37, "Lugones 4402");
    }
	@Bean("generadorDeDocumento")
    public GeneradorDeDocumento getGeneradorDeDocumento(@Qualifier("exportadorCSV") Exportador exportador) {
        return new GeneradorDeDocumento(exportador);
    }
}
