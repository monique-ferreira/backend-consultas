package backend_consultas.api.service;
import backend_consultas.api.model.Especialidade;
import backend_consultas.api.repository.EspecialidadeRepository;
import org.springframework.stereotype.Service;
import java.util.List;
@Service

public class EspecialidadeService {
    private final EspecialidadeRepository repository;
    public EspecialidadeService(EspecialidadeRepository repository) {
        this.repository = repository;
    }
    public Especialidade salvar(Especialidade especialidade) {
        return repository.save(especialidade);
    }
    public List<Especialidade> listar() {
        return repository.findAll();
    }
}
