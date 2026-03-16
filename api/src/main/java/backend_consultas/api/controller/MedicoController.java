package backend_consultas.api.controller;
import backend_consultas.api.model.Medico;
import backend_consultas.api.service.MedicoService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/medicos")

public class MedicoController {
    private final MedicoService service;
    public MedicoController(MedicoService service) {
        this.service = service;
    }
    @GetMapping
    public List<Medico> listar() {
        return service.listar();
    }
    @GetMapping("/{id}")
    public Medico buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }
    @PostMapping
    public Medico salvar(@RequestBody Medico medico) {
        return service.salvar(medico);
    }
    @PutMapping("/{id}")
    public Medico atualizar(@PathVariable Long id, @RequestBody Medico medico) {
        return service.atualizar(id, medico);
    }
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}
