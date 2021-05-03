package com.company.companycheck.web.screens.generalmanager;

import com.haulmont.cuba.gui.screen.*;
import com.company.companycheck.entity.GeneralManager;

@UiController("companycheck_GeneralManager.edit")
@UiDescriptor("general-manager-edit.xml")
@EditedEntityContainer("generalManagerDc")
@LoadDataBeforeShow
public class GeneralManagerEdit extends StandardEditor<GeneralManager> {
}