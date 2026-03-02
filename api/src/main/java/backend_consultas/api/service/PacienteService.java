package backend_consultas.api.service;
import backend_consultas.api.model.Paciente;
import backend_consultas.api.repository.PacienteRepository;
import org.springframework.stereotype.Service;
import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Service

public class PacienteService {
    private final PacienteRepository repository;
    public PacienteService(PacienteRepository repository) {
        this.repository = repository;
    }
    public Paciente salvar(Paciente paciente) {
        return repository.save(paciente);
    }
    public List<Paciente> listar() {
        return repository.findAll();
    }
    public Paciente getById(Paciente paciente) {
        return repository.getById(paciente.getId());
    }
}
