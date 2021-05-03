-- begin COMPANYCHECK_GENERAL_MANAGER
create table COMPANYCHECK_GENERAL_MANAGER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    FULLNAME varchar(255),
    MANAGEDCOMPANY_ID varchar(36),
    --
    primary key (ID)
)^
-- end COMPANYCHECK_GENERAL_MANAGER
-- begin COMPANYCHECK_COMPANY
create table COMPANYCHECK_COMPANY (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    SHORTNAME varchar(255),
    FULLNAME varchar(255),
    TAXNUMBER integer,
    KPP integer,
    REGISTATIONDATE date,
    --
    primary key (ID)
)^
-- end COMPANYCHECK_COMPANY
-- begin COMPANYCHECK_BRANCH
create table COMPANYCHECK_BRANCH (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    BRANCHNAME varchar(255),
    COMPANY_ID varchar(36),
    --
    primary key (ID)
)^
-- end COMPANYCHECK_BRANCH
