package com.company.companycheck.web.screens.generalmanager;

import com.haulmont.cuba.gui.screen.*;
import com.company.companycheck.entity.GeneralManager;

@UiController("companycheck_GeneralManager.browse")
@UiDescriptor("general-manager-browse.xml")
@LookupComponent("generalManagersTable")
@LoadDataBeforeShow
public class GeneralManagerBrowse extends StandardLookup<GeneralManager> {
}