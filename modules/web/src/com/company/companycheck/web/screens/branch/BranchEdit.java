package com.company.companycheck.web.screens.branch;

import com.haulmont.cuba.gui.screen.*;
import com.company.companycheck.entity.Branch;

@UiController("companycheck_Branch.edit")
@UiDescriptor("branch-edit.xml")
@EditedEntityContainer("branchDc")
@LoadDataBeforeShow
public class BranchEdit extends StandardEditor<Branch> {
}