package net.storage.service;

import net.storage.dao.NotebookDao;
import net.storage.entities.Notebook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class NotebookServiceImpl implements NotebookService {
    @Autowired
    private NotebookDao notebookDao;

    @Override
    public List<Notebook> getAll() {
        return notebookDao.findAll();
    }

    @Override
    public Notebook getById(Integer id) {
        return notebookDao.getOne(id);
    }
}
