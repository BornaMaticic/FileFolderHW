package com.codeclan.FilesAndFolders.FilesAndFolders;



import com.codeclan.FilesAndFolders.FilesAndFolders.models.File;
import com.codeclan.FilesAndFolders.FilesAndFolders.models.Folder;
import com.codeclan.FilesAndFolders.FilesAndFolders.models.User;
import com.codeclan.FilesAndFolders.FilesAndFolders.repositories.FileRepository;
import com.codeclan.FilesAndFolders.FilesAndFolders.repositories.FolderRepository;
import com.codeclan.FilesAndFolders.FilesAndFolders.repositories.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FilesAndFoldersApplicationTests {

	@Autowired
	FileRepository fileRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	UserRepository userRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canSaveUserAndFolder(){

		User user1 = new User("Borna");
		userRepository.save(user1);
		Folder folder1 = new Folder("Secret Files", user1);
		folderRepository.save(folder1);
	}

	@Test
	public void createFolderAndFileAndThenSave(){
		User user1 = new User("Aiste");
		userRepository.save(user1);
		Folder folder1 = new Folder("Filer", user1);
		folderRepository.save(folder1);

		File file1 = new File("Photo", ".jpg", 5, folder1);
		folderRepository.save(folder1);

		user1.addFolder(folder1);
		folder1.addFile(file1);
		folderRepository.save(folder1);

	}


}

