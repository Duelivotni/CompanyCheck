package com.company.companycheck.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;

@Table(name = "COMPANYCHECK_BRANCH")
@Entity(name = "companycheck_Branch")
public class Branch extends StandardEntity {
    private static final long serialVersionUID = 5933986771570523985L;

    @Column
    public String branchName;
    public String getBranchName() { return branchName; }
    public void setBranchName(String branchName) { this.branchName = branchName; }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COMPANY_ID")
    private Company company;
    public Company getCompany() {
        return company;
    }
    public void setCompany(Company company) {
        this.company = company;
    }
}