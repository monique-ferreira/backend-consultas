package backend_consultas.api.service;
import backend_consultas.api.model.Paciente;
import backend_consultas.api.repository.PacienteRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;
import java.util.List;

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
    public Paciente buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Paciente não encontrado"));
    }
    public Paciente atualizar(Long id, Paciente pacienteAtualizado) {
        Paciente pacienteExistente = buscarPorId(id);
        pacienteExistente.setNome(pacienteAtualizado.getNome());
        pacienteExistente.setCpf(pacienteAtualizado.getCpf());
        pacienteExistente.setEmail(pacienteAtualizado.getEmail());
        pacienteExistente.setTelefone(pacienteAtualizado.getTelefone());
        pacienteExistente.setDataNascimento(pacienteAtualizado.getDataNascimento());
        pacienteExistente.setAtivo(pacienteAtualizado.getAtivo());
        return repository.save(pacienteExistente);
    }
    public void deletar(Long id) {
        Paciente paciente = buscarPorId(id);
        repository.delete(paciente);
    }
}