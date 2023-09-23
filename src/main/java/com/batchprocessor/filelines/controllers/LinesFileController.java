package com.batchprocessor.filelines.controllers;

import com.batchprocessor.filelines.entities.LinesFile;
import com.batchprocessor.filelines.repositories.LinesFilesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/lines")
public class LinesFileController {

    @Autowired
    public LinesFilesRepository repository;

    @GetMapping
    public List<LinesFile> findAll() {
        return repository.findAll();
    }
    @GetMapping(value = "/{id}")
    public LinesFile findAll(@PathVariable Long id) {
        return repository.findById(id).get();
    }

    @PostMapping
    public LinesFile insert(@RequestBody LinesFile line) {
        return repository.save(line);
    }
}