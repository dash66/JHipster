package com.lesson.tasks.service;

import javafx.concurrent.Task;

import javax.persistence.Entity;

public interface TaskService {

    Iterable<Task> list();

    Task save(Task task);
}
