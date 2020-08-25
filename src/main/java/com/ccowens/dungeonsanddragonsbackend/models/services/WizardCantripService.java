package com.ccowens.dungeonsanddragonsbackend.models.services;

import com.ccowens.dungeonsanddragonsbackend.models.dao.WizardCantrip;
import com.ccowens.dungeonsanddragonsbackend.models.dao.WizardCantripDAO;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class WizardCantripService {

    WizardCantripDAO wizardCantripDAO;

    public WizardCantripService(WizardCantripDAO wizardCantripDAO){
        this.wizardCantripDAO = wizardCantripDAO;
    }

    public WizardCantrip getWizardCantripByID(UUID id){
        WizardCantrip wizardCantrip = wizardCantripDAO.getWizardCantripById(id);

        return wizardCantrip;
    }
}

