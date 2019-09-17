package com.codeclan.folder_tracker_hw.FolderTrackerHw.projections;

import com.codeclan.folder_tracker_hw.FolderTrackerHw.models.File;
import com.codeclan.folder_tracker_hw.FolderTrackerHw.models.Folder;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedFolder", types = File.class)
public interface EmbedFolder {
    String getName();
    String getExtension();
    int getSize();
    Folder getFolder();
}
