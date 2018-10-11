package com.lesson.tasks.repository;

import javafx.concurrent.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, Long> {

    

}
