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
);