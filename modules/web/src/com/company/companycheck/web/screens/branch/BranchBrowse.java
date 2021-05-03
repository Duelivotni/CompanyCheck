package com.company.companycheck.web.screens.branch;

import com.haulmont.cuba.gui.screen.*;
import com.company.companycheck.entity.Branch;

@UiController("companycheck_Branch.browse")
@UiDescriptor("branch-browse.xml")
@LookupComponent("branchesTable")
@LoadDataBeforeShow
public class BranchBrowse extends StandardLookup<Branch> {
}