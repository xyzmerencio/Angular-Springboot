package br.com.projeto.api.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity // Define que a classe é uma entidade JPA
@Table(name = "clientes") // Especifica o nome da tabela no banco de dados
@Getter
@Setter
public class Cliente {
    @Id // Indica que é chave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto incremento
    private long codigo;
    private String nome;
    private int idade;
    private String cidade;
}
