package com.codeclan.FilesAndFolders.FilesAndFolders.repositories;

import com.codeclan.FilesAndFolders.FilesAndFolders.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
