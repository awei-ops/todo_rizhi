package com.example.tododemo.service;

import com.example.tododemo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodosService {
    @Autowired
    private TodoRepository todoRepository;
}
