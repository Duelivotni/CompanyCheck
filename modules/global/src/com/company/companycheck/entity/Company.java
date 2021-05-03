package com.company.companycheck.entity;

import com.haulmont.chile.core.annotations.MetaProperty;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Table(name = "COMPANYCHECK_COMPANY")
@Entity(name = "companycheck_Company")
public class Company extends StandardEntity {
    private static final long serialVersionUID = 5596775931130453351L;

    @Column
    public String shortName;

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    @Column
    public String fullName;

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    @Column
    public Integer taxNumber;

    public Integer getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(Integer taxNumber) {
        this.taxNumber = taxNumber;
    }

    @Column
    public Integer kpp;

    public Integer getKpp() {
        return kpp;
    }

    public void setKpp(Integer kpp) {
        this.kpp = kpp;
    }

    @Column
    public LocalDate registationDate;

    public LocalDate getRegistationDate() {
        return registationDate;
    }

    public void setRegistationDate(LocalDate registationDate) {
        this.registationDate = registationDate;
    }

    @OneToMany(mappedBy = "company")
    private List<Branch> branches;

    public List<Branch> getBranches() {
        return branches;
    }

    public void setBranches(List<Branch> branches) {
        this.branches = branches;
    }

    // List of branches
    @MetaProperty(related = "branches")
    public String getBranchName() {

        // avoid NullPointerException creating a Company object..
        try {

            ArrayList branchList = new ArrayList();
            for (Branch branch : branches) {
                branchList.add(branch.branchName);
            }
            return branchList.toString();
        } catch (NullPointerException e) {
            return "no branches yet";
        }
    }

    @OneToMany(mappedBy = "managedCompany")
    private List<GeneralManager> generalManager;
    public List<GeneralManager> getGeneralManager() {
        return generalManager;
    }
    public void setGeneralManager(List<GeneralManager> generalManager) {
        this.generalManager = generalManager;
    }

    // List of Managers
    @MetaProperty(related = "generalManager")
    public String getGeneralManagersList() {

        // preventing NullPointer..
        try {
            ArrayList managersList = new ArrayList();
            for (GeneralManager manager : generalManager) {
                managersList.add(manager.fullName);
            }
            return managersList.toString();
        }
        catch (NullPointerException e) {
            return "does not have a General Manager yet";
        }
    }
}



