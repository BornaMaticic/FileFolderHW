package com.codeclan.FilesAndFolders.FilesAndFolders.components;


import com.codeclan.FilesAndFolders.FilesAndFolders.models.File;
import com.codeclan.FilesAndFolders.FilesAndFolders.models.Folder;
import com.codeclan.FilesAndFolders.FilesAndFolders.models.User;
import com.codeclan.FilesAndFolders.FilesAndFolders.repositories.FileRepository;
import com.codeclan.FilesAndFolders.FilesAndFolders.repositories.FolderRepository;
import com.codeclan.FilesAndFolders.FilesAndFolders.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;


    public DataLoader() {

    }

    public void run(ApplicationArguments args) {
        User user1 = new User("Borna");
        userRepository.save(user1);

        User user2 = new User("Ernest");
        userRepository.save(user2);

        Folder folder1 = new Folder("gills", user1);
        folderRepository.save(folder1);

        Folder folder2 = new Folder("hills", user2);
        folderRepository.save(folder2);

        File file1 = new File("Confidential", ".txt", 12, folder1);
        fileRepository.save(file1);

        File file2 = new File("Banned", ".jpg", 10, folder2 );
        fileRepository.save(file2);



    }
}
