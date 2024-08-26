package ec.edu.uce.examenDLL.demo.service;

import ec.edu.uce.examenDLL.demo.model.Task;
import ec.edu.uce.examenDLL.demo.repository.ITasks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TasksService {


    private final ITasks tareaRepository;

    @Autowired
    public TasksService(ITasks tareaRepository) {
        this.tareaRepository = tareaRepository;
    }

    public Task crearTarea(Task tarea) {
        return tareaRepository.save(tarea);
    }


    public List<Task> listarTareas() {
        return tareaRepository.findAll();
    }

    public void eliminarTarea(Long id) {
        tareaRepository.deleteById(id);
    }

    public Task actualizarTarea(Long id, Task nuevaTarea) {
        return tareaRepository.findById(id)
                .map(tarea -> {
                    tarea.setTitle(nuevaTarea.getTitle());
                    tarea.setDescription(nuevaTarea.getDescription());
                    tarea.setEstado(nuevaTarea.getEstado());
                    return tareaRepository.save(tarea);
                }).orElseThrow(() -> new RuntimeException("Tarea no encontrada"));
    }

    public List<Task> listarTareasPorEstado(String estado) {
        return tareaRepository.findByEstado(estado);
    }
}
