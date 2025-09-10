package com.taskapp.tasks.domain.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "task_lists")
public class TaskList {


    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id" ,updatable = false, nullable = false)
    private UUID id;

    @Column(name = "title",nullable = false)
    private String title;

    @Column(name = "descrption")
    private String description;

    @Column(name = "created",nullable = false)
    private LocalDateTime created;

    @Column(name = "updated",nullable = false)
    private LocalDateTime updated;


}
