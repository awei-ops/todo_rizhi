package com.example.tododemo.repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.tododemo.entity.Todos;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends BaseMapper<Todos> {

}
