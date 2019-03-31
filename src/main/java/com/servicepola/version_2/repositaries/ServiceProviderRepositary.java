package com.servicepola.version_2.repositaries;

import com.servicepola.version_2.models.ServiceProvider;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceProviderRepositary extends JpaRepository<ServiceProvider,Long> {
    ServiceProvider findByEmail(String email);
}
