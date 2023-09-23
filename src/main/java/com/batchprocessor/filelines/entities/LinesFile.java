package com.batchprocessor.filelines.entities;

import javax.persistence.*;

@Entity
@Table(name = "tb_lines")
public class LinesFile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String line;

    public LinesFile() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }
}