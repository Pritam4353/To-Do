package com.example.ToDo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ToDoModel.ToDo;

@Repository
public interface IToDoRepo extends JpaRepository<ToDo, Long> {

}
