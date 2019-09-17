package com.codeclan.folder_tracker_hw.FolderTrackerHw.repositories;

import com.codeclan.folder_tracker_hw.FolderTrackerHw.models.Folder;
import com.codeclan.folder_tracker_hw.FolderTrackerHw.projections.EmbedUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedUser.class)
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
