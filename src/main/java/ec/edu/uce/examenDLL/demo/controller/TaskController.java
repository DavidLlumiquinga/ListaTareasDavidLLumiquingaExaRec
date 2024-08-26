package ec.edu.uce.examenDLL.demo.controller;

import ec.edu.uce.examenDLL.demo.model.Task;
import ec.edu.uce.examenDLL.demo.service.TasksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/tareas")
public class TaskController {

    private final TasksService tareaService;

    @Autowired
    public TaskController(TasksService tareaService) {
        this.tareaService = tareaService;
    }

    @PostMapping
    public Task crearTarea(@RequestBody Task tarea) {
        return tareaService.crearTarea(tarea);
    }

    @GetMapping
    public List<Task> listarTareas() {
        return tareaService.listarTareas();
    }

    @GetMapping("/estado")
    public List<Task> listarTareasPorEstado(@RequestParam String estado) {
        return tareaService.listarTareas().stream()
                .filter(tarea -> tarea.getEstado().equalsIgnoreCase(estado))
                .collect(Collectors.toList());
    }

    @PutMapping("/{id}")
    public Task actualizarTarea(@PathVariable Long id, @RequestBody Task tarea) {
        return tareaService.actualizarTarea(id, tarea);
    }

    @DeleteMapping("/{id}")
    public void eliminarTarea(@PathVariable Long id) {
        tareaService.eliminarTarea(id);
    }
}
