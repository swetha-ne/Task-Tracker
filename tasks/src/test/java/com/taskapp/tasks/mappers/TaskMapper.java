package com.taskapp.tasks.mappers;

import com.taskapp.tasks.domain.dto.TaskDto;
import com.taskapp.tasks.domain.entities.Task;

public interface TaskMapper {
    Task fromDto(TaskDto taskDto);

    TaskDto toDto(Task task);


}
