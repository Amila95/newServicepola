package com.servicepola.version_2.repositaries;

import com.servicepola.version_2.models.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification,Long> {
}
