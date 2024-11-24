package com.example.simplifiedlicenseapi.service;

import com.example.simplifiedlicenseapi.entity.SimplifiedLicense;
import com.example.simplifiedlicenseapi.repository.SimplifiedLicenseRepository;
import org.springframework.stereotype.Service;

@Service
public class SimplifiedLicenseService {
private final SimplifiedLicenseRepository repository;

    public SimplifiedLicenseService(SimplifiedLicenseRepository repository) {
        this.repository = repository;
    }

    public SimplifiedLicense create(SimplifiedLicense license) {
license.setActive(true);
license.setRemainingPackages(license.getPackagesAllowed());
return repository.save(license);
}
public void useLicense(String licenseCode, int packages) {
SimplifiedLicense license = repository.findById(licenseCode).orElseThrow(() -> new
IllegalArgumentException("License not found."));
if (!license.isActive() || packages >
license.getPackagesAllowed()) throw new IllegalStateException("Invalid license usage.");
license.setRemainingPackages(license.getRemainingPackages() - packages);
repository.save(license);
}
}
