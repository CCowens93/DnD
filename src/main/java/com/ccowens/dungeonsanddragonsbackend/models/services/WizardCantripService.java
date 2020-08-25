package com.ccowens.dungeonsanddragonsbackend.models.services;

import com.ccowens.dungeonsanddragonsbackend.models.dao.WizardCantrip;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class WizardCantripService {
    public WizardCantrip getWizardCantripByIdD(UUID id) {
        WizardCantrip c = new WizardCantrip();
        c.setId(id);
        c.setCantrip("Acid Splash");
        c.setType("Conjuration");
        c.setCasting_time("1 action");
        c.setRange("60 feet");
        c.setComponents("V, S");
        c.setDuration("Instantaneous");
        c.setEffect("You hurl a bubble of acid. Choose one creature within range, or choose two creatures within range that are within 5 feet of each other. A target must succeed on a Dexterity saving throw or take 1d6 damage.");
        c.setDamage("This spell's damage increases by 1d6 when you reach 5th level (2d6), 11th level (3d6), and 17th level(4d6).");
        return c;
    }
}
