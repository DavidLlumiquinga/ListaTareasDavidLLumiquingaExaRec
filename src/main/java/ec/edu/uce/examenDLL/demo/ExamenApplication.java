package ec.edu.uce.examenDLL.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import ec.edu.uce.examenDLL.demo.service.TasksService;
import ec.edu.uce.examenDLL.demo.model.Task;

import java.time.LocalDateTime;


/**Autor
 * David Llumiquinga
 */
@SpringBootApplication
public class ExamenApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExamenApplication.class, args);
	}
/*

INGRESO MANUAL DE TAREAS
	@Bean
	CommandLineRunner initData(ApplicationContext context) {
		return args -> {
			TasksService tareaService = context.getBean(TasksService.class);

			// Crear algunas tareas iniciales
			tareaService.crearTarea(new Task("Tarea 1", "Descripción 1", "pendiente", LocalDateTime.now()));
			tareaService.crearTarea(new Task("Tarea 2", "Descripción 2", "en progreso", LocalDateTime.now()));
			tareaService.crearTarea(new Task("Tarea 3", "Descripción 3", "completado", LocalDateTime.now()));

			System.out.println("Tareas iniciales creadas.");
		};
	}*/
}
