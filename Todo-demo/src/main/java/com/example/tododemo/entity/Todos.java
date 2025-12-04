package com.example.tododemo.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

/**
 * todos
 */
@Data
@TableName("todos")
public class Todos implements Serializable {
    @TableId(type = IdType.AUTO)
    private Long id;
    private String content;
    @TableField(value = "create_time",fill = FieldFill.INSERT)
    private LocalDateTime createTime;
    private static final long serialVersionUID = 1L;
}