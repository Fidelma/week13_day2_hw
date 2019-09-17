package com.codeclan.folder_tracker_hw.FolderTrackerHw.components;


import com.codeclan.folder_tracker_hw.FolderTrackerHw.models.File;
import com.codeclan.folder_tracker_hw.FolderTrackerHw.models.Folder;
import com.codeclan.folder_tracker_hw.FolderTrackerHw.models.User;
import com.codeclan.folder_tracker_hw.FolderTrackerHw.repositories.FileRepository;
import com.codeclan.folder_tracker_hw.FolderTrackerHw.repositories.FolderRepository;
import com.codeclan.folder_tracker_hw.FolderTrackerHw.repositories.UserRepository;
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

    public void run(ApplicationArguments args){

        User fidelma = new User("Fidelma");
        userRepository.save(fidelma);

        User bob = new User("Bob");
        userRepository.save(bob);

        Folder codeclan = new Folder("codeclan", fidelma);
        folderRepository.save(codeclan);

        Folder personal = new Folder("personal", fidelma);
        folderRepository.save(personal);

        File pirates = new File("pirates", "java", 5, codeclan);
        fileRepository.save(pirates);

        File employees = new File("employees", "java", 50, codeclan);
        fileRepository.save(employees);

        File recipes = new File("recipes", "txt", 3, personal);
        fileRepository.save(recipes);

        File cv = new File("cv in progress", "doc", 4, personal);
        fileRepository.save(cv);

    }
}
