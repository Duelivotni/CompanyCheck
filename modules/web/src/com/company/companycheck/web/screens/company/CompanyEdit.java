package com.company.companycheck.web.screens.company;

import com.haulmont.cuba.gui.screen.*;
import com.company.companycheck.entity.Company;

@UiController("companycheck_Company.edit")
@UiDescriptor("company-edit.xml")
@EditedEntityContainer("companyDc")
@LoadDataBeforeShow
public class CompanyEdit extends StandardEditor<Company> {
}