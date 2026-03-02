package backend_consultas.api.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "pacientes")

public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nome;
    private String email;
    @Column(nullable = false, unique = true)
    private String cpf;
    @Column(nullable = false)
    private String telefone;
    private LocalDate dataNascimento;
    private Boolean ativo;

    public Paciente() {}
    public Paciente(String nome,
                    String cpf,
                    String email,
                    String telefone,
                    LocalDate dataNascmento,
                    Boolean ativo) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.dataNascimento = dataNascmento;
        this.ativo = ativo;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public LocalDate getDataNascimento() { return dataNascimento; }
    public void setDataNascimento(LocalDate dataNascimento) { this.dataNascimento = dataNascimento; }

    public Boolean getAtivo() { return ativo; }
    public void setAtivo(Boolean ativo) { this.ativo = ativo; }
}
