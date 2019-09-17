package com.codeclan.folder_tracker_hw.FolderTrackerHw.projections;

import com.codeclan.folder_tracker_hw.FolderTrackerHw.models.File;
import com.codeclan.folder_tracker_hw.FolderTrackerHw.models.Folder;
import com.codeclan.folder_tracker_hw.FolderTrackerHw.models.User;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedUser", types = Folder.class)
public interface EmbedUser {
    String getTitle();
    User getUser();
    List<File> getFiles();

}
