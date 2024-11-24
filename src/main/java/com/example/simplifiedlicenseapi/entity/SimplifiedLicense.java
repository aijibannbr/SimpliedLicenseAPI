package com.example.simplifiedlicenseapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class SimplifiedLicense {
@Id
private String licenseCode;
private String name;
private String binNumber;
private int packagesAllowed;
private LocalDate expirationDate;
private int remainingPackages;
private boolean active;

    public String getLicenseCode() {
        return licenseCode;
    }

    public void setLicenseCode(String licenseCode) {
        this.licenseCode = licenseCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBinNumber() {
        return binNumber;
    }

    public void setBinNumber(String binNumber) {
        this.binNumber = binNumber;
    }

    public int getPackagesAllowed() {
        return packagesAllowed;
    }

    public void setPackagesAllowed(int packagesAllowed) {
        this.packagesAllowed = packagesAllowed;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public int getRemainingPackages() {
        return remainingPackages;
    }

    public void setRemainingPackages(int remainingPackages) {
        this.remainingPackages = remainingPackages;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}