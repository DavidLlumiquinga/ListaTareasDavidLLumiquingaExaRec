package controller;

import model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import service.TasksService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TaskController {

    private  TasksService tareaService;

    @Autowired
    public void TareaController(TasksService tareaService) {
        this.tareaService = tareaService;
    }

   
    public ArrayList<Task> crearTarea(Task tarea) {
        Task nuevaTarea = tareaService.crearTarea(tarea);
        return nuevaTarea;
    }


    public ArrayList<List<Task>> listarTareas() {
        List<Task> tareas = tareaService.listarTareas();
        return new (tareas);
    }


    public ArrayList<List<Task>> listarTareasPorEstado(String estado) {
        List<Task> tareas = tareaService.listarTareasPorEstado(estado);
        return new (tareas);
    }


    public ArrayList<Task> actualizarTarea( Long id, Task tarea) {
        Task tareaActualizada = tareaService.actualizarTarea(id, tarea);
        return new (tareaActualizada);
    }


    public void eliminarTarea(Long id) {
        tareaService.eliminarTarea(id);

    }
}


