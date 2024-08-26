package ec.edu.uce.examenDLL.demo.repository;

import ec.edu.uce.examenDLL.demo.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ITasks extends JpaRepository<Task ,Long> {

    List<Task> findByEstado(String estado);

}
