package com.codeclan.FilesAndFolders.FilesAndFolders.repositories;

import com.codeclan.FilesAndFolders.FilesAndFolders.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
