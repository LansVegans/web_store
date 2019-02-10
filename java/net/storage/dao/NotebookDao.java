package net.storage.dao;

import net.storage.entities.Notebook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface NotebookDao extends JpaRepository<Notebook, Integer> {
    @Query("select a from Notebook a")
    List<Notebook> findAll();

    @Query("select a from Notebook a where id=:id")
    Notebook getOne(@Param("id") Integer id);
}
