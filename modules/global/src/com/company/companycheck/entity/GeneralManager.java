package com.company.companycheck.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;

@Table(name = "COMPANYCHECK_GENERAL_MANAGER")
@Entity(name = "companycheck_GeneralManager")
public class GeneralManager extends StandardEntity {
    private static final long serialVersionUID = -6740233318550689286L;

    @Column
    public String fullName;
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MANAGEDCOMPANY_ID")
    public Company managedCompany;
    public Company getManagedCompany() {
        return managedCompany;
    }
    public void setManagedCompany(Company managedCompany) {
        this.managedCompany = managedCompany;
    }

    public String gitCheck;

}