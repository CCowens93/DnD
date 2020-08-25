package com.ccowens.dungeonsanddragonsbackend.controllers;

import com.ccowens.dungeonsanddragonsbackend.models.dao.WizardCantrip;
import com.ccowens.dungeonsanddragonsbackend.models.services.WizardCantripService;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;
@RestController
@RequestMapping("/wizard")

public class WizardCantripController {

    private final WizardCantripService wizardCantripService;

    public WizardCantripController(WizardCantripService wizardCantripService){
        this.wizardCantripService = wizardCantripService;
    }

    @RequestMapping(value="/{wizardCantripID}", method = RequestMethod.GET)
    public WizardCantrip getWizardCantrip (@PathVariable("wizardCantripID") UUID wizardCantripID){

        return wizardCantripService.getWizardCantripByID(wizardCantripID);
    }
}
