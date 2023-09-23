package com.batchprocessor.filelines.repositories;

import com.batchprocessor.filelines.entities.LinesFile;
import org.springframework.data.jpa.repository.JpaRepository;



public interface LinesFilesRepository extends JpaRepository<LinesFile, Long> {

}