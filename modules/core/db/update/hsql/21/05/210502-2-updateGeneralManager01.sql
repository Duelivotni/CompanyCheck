alter table COMPANYCHECK_GENERAL_MANAGER add constraint FK_COMPANYCHECK_GENERAL_MANAGER_ON_COMPANY foreign key (COMPANY_ID) references COMPANYCHECK_COMPANY(ID);
create index IDX_COMPANYCHECK_GENERAL_MANAGER_ON_COMPANY on COMPANYCHECK_GENERAL_MANAGER (COMPANY_ID);