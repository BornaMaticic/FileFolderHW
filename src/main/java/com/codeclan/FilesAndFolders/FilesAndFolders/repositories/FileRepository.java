package com.codeclan.FilesAndFolders.FilesAndFolders.repositories;

import com.codeclan.FilesAndFolders.FilesAndFolders.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
