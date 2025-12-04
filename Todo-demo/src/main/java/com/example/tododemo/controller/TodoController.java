package com.example.tododemo.controller;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.tododemo.entity.Todos;
import com.example.tododemo.repository.TodoRepository;
import com.example.tododemo.service.TodosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
public class TodoController {
    @Autowired
    private TodoRepository todoRepository;
    @GetMapping("/todos")
    public List<Todos> getAllTodos() {
        return todoRepository.selectList(null);
    }
    @PostMapping("/todos")
    public int addTodo(@RequestBody Todos todos) {
        todos.setId(null);
        todos.setCreateTime(null);
        int insert = todoRepository.insert(todos);
        return insert;
    }
    @DeleteMapping("/todos/{id}")
    public int deleteTodo(@PathVariable Integer id) {
        int delete = todoRepository.deleteById(id);
        return delete;
    }
}
