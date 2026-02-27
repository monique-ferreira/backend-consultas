package backend_consultas.api.controller;
import backend_consultas.api.model.Especialidade;
import backend_consultas.api.repository.EspecialidadeRepository;
import backend_consultas.api.service.EspecialidadeService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/especialidades")
@CrossOrigin

public class EspecialidadeController {
    private final EspecialidadeService service;
    public EspecialidadeController(EspecialidadeService service) {
        this.service = service;
    }
    @PostMapping
    public Especialidade criar(@RequestBody Especialidade especialidade) {
        return service.salvar(especialidade);
    }
    @GetMapping
    public List<Especialidade> listar() {
        return service.listar();
    }
}
