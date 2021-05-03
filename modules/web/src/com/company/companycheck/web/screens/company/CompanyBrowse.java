package com.company.companycheck.web.screens.company;

import com.haulmont.cuba.gui.screen.*;
import com.company.companycheck.entity.Company;

@UiController("companycheck_Company.browse")
@UiDescriptor("company-browse.xml")
@LookupComponent("companiesTable")
@LoadDataBeforeShow
public class CompanyBrowse extends StandardLookup<Company> {
}