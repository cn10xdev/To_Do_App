package com.mydaytodo.template.springbootreact.dao;

import com.mydaytodo.template.springbootreact.model.TaskStatus;

import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TodoDto {

    @Size(min = 3)
    private String task;
    private TaskStatus status;
}
