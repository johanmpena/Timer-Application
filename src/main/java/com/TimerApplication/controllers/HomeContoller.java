package com.TimerApplication.controllers;

import com.TimerApplication.entity.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.TimerApplication.services.TaskServiceImpl;

@Controller
public class HomeContoller {

    @Autowired
    private TaskServiceImpl taskServiceImpl;

    @GetMapping("/")
    public String getHome(Model model){
        model.addAttribute("getTaskList", taskServiceImpl.getAllTask());
        return "index";
    }

    @GetMapping("/addNew")
    public String addNewTask(Model model) {
        Task task = new Task();
        model.addAttribute("task", task);
        return "newTask";
    }

    @PostMapping("/addNew")
    public String getName(@ModelAttribute Task task, Model model){
        taskServiceImpl.save(task);
        return "redirect:/";
    }
}
