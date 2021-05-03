-- begin COMPANYCHECK_BRANCH
alter table COMPANYCHECK_BRANCH add constraint FK_COMPANYCHECK_BRANCH_ON_COMPANY foreign key (COMPANY_ID) references COMPANYCHECK_COMPANY(ID)^
create index IDX_COMPANYCHECK_BRANCH_ON_COMPANY on COMPANYCHECK_BRANCH (COMPANY_ID)^
-- end COMPANYCHECK_BRANCH
-- begin COMPANYCHECK_GENERAL_MANAGER
alter table COMPANYCHECK_GENERAL_MANAGER add constraint FK_COMPANYCHECK_GENERAL_MANAGER_ON_MANAGEDCOMPANY foreign key (MANAGEDCOMPANY_ID) references COMPANYCHECK_COMPANY(ID)^
create index IDX_COMPANYCHECK_GENERAL_MANAGER_ON_MANAGEDCOMPANY on COMPANYCHECK_GENERAL_MANAGER (MANAGEDCOMPANY_ID)^
-- end COMPANYCHECK_GENERAL_MANAGER