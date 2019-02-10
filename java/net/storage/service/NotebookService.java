package net.storage.service;

import net.storage.entities.Notebook;

import java.util.List;


public interface NotebookService {
    List<Notebook> getAll();

    Notebook getById(Integer id);
}
