package com.codeclan.folder_tracker_hw.FolderTrackerHw.repositories;

import com.codeclan.folder_tracker_hw.FolderTrackerHw.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
