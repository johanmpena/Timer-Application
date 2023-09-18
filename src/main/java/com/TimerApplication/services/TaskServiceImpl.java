package com.TimerApplication.services;

import com.TimerApplication.entity.Task;
import com.TimerApplication.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

@Service
public class TaskServiceImpl implements TaskServices{

    @Autowired
    private TaskRepository taskRepo;

    @Override
    public void save(Task task) {
        taskRepo.save(task);
    }

    @Override
    public List<Task> getAllTask() {
        return taskRepo.findAll();
    }

    @Override
    public Task getTaskByName(String name){
        return taskRepo.findTaskByName(name);
    }
}
