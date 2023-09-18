package com.TimerApplication.services;

import com.TimerApplication.entity.Task;
import com.TimerApplication.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface TaskServices {
    List<Task> getAllTask();

    void save(Task name);

    Task getTaskByName(String name);
}
