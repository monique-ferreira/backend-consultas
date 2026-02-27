package backend_consultas.api.model;

import jakarta.persistence.*;
@Entity
@Table(name = "pacientes")

public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nome;
    public Paciente() {}
    public Paciente(String nome) {
        this.nome = nome;
    }

    public Long getId() { return id; }
    public void setId() { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
}
