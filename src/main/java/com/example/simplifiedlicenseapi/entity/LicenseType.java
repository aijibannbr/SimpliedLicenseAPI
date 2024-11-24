package com.example.simplifiedlicenseapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class LicenseType {
    @Id
    private String licenseTypeCode;
    private String ministryCode;
    private boolean canBeUsedPartially;


    public String getLicenseTypeCode() {
        return licenseTypeCode;
    }

    public void setLicenseTypeCode(String licenseTypeCode) {
        this.licenseTypeCode = licenseTypeCode;
    }



    public String getMinistryCode() {
        return ministryCode;
    }

    public void setMinistryCode(String ministryCode) {
        this.ministryCode = ministryCode;
    }


    public boolean isCanBeUsedPartially() {
        return canBeUsedPartially;
    }

    public void setCanBeUsedPartially(boolean canBeUsedPartially) {
        this.canBeUsedPartially = canBeUsedPartially;
    }

}