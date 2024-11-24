package com.example.simplifiedlicenseapi.repository;

import com.example.simplifiedlicenseapi.entity.LicenseType;
import com.example.simplifiedlicenseapi.entity.SimplifiedLicense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SimplifiedLicenseRepository extends JpaRepository<SimplifiedLicense, String> {
    }
