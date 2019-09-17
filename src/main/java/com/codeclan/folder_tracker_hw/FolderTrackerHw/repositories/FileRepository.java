package com.codeclan.folder_tracker_hw.FolderTrackerHw.repositories;

import com.codeclan.folder_tracker_hw.FolderTrackerHw.models.File;
import com.codeclan.folder_tracker_hw.FolderTrackerHw.projections.EmbedFolder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedFolder.class)
public interface FileRepository extends JpaRepository<File, Long> {
}
