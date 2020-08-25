package com.ccowens.dungeonsanddragonsbackend.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ccowens.dungeonsanddragonsbackend.models.dao.WizardCantrip;
import com.ccowens.dungeonsanddragonsbackend.models.services.WizardCantripService;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;


import java.net.URI;
import java.net.URISyntaxException;
import java.util.UUID;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.when;

@WebMvcTest(WizardCantripController.class)

public class WizardCantripControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    WizardCantripService wizardCantripService;

    @Test
    public void testGetWizardCantripSuccess() throws URISyntaxException {

        try {

            // Pre-Test Setup
            UUID wizardCantripID = UUID.randomUUID();
            WizardCantrip returnedWizardCantrip = new WizardCantrip();
            returnedWizardCantrip.setId(wizardCantripID);
            returnedWizardCantrip.setCantrip("Acid Splash");
            returnedWizardCantrip.setType("Conjuration");
            returnedWizardCantrip.setCasting_time("1 action");
            returnedWizardCantrip.setRange("60 feet");
            returnedWizardCantrip.setComponents("V, S");
            returnedWizardCantrip.setDuration("Instantaneous");
            returnedWizardCantrip.setEffect("You hurl a bubble of acid. Choose one creature within range, or choose two creatures within range that are within 5 feet of each other. A target must succeed on a Dexterity saving throw or take 1d6 damage.");
            returnedWizardCantrip.setDamage("This spell's damage increases by 1d6 when you reach 5th level (2d6), 11th level (3d6), and 17th level(4d6).");

            when(wizardCantripService.getWizardCantripByID(any(UUID.class))).thenReturn(returnedWizardCantrip);

            final String baseUrl = "http://localhost:8080/wizard/" + wizardCantripID.toString();
            URI uri = new URI(baseUrl);


            // Execute the call.
            MvcResult results = mockMvc.perform(MockMvcRequestBuilders.get(uri)).andReturn();


            // Validate the call was successful and the data that came back was as expected.
            Assertions.assertNotNull(results);
            Assertions.assertEquals(200, results.getResponse().getStatus());
            ObjectMapper mapper = new ObjectMapper();

            // Take the returned json, and turn it back into a Product object, then validate its content.
            WizardCantrip finalWizardCantrip = mapper.readValue(results.getResponse().getContentAsByteArray(),WizardCantrip.class);
            Assertions.assertEquals(finalWizardCantrip.getId(), returnedWizardCantrip.getId());
            Assertions.assertEquals(finalWizardCantrip.getCantrip(), returnedWizardCantrip.getCantrip());
            Assertions.assertEquals(finalWizardCantrip.getType(), returnedWizardCantrip.getType());
            Assertions.assertEquals(finalWizardCantrip.getCasting_time(), returnedWizardCantrip.getCasting_time());
            Assertions.assertEquals(finalWizardCantrip.getRange(), returnedWizardCantrip.getRange());
            Assertions.assertEquals(finalWizardCantrip.getComponents(), returnedWizardCantrip.getComponents());
            Assertions.assertEquals(finalWizardCantrip.getDuration(), returnedWizardCantrip.getDuration());
            Assertions.assertEquals(finalWizardCantrip.getEffect(), returnedWizardCantrip.getEffect());
            Assertions.assertEquals(finalWizardCantrip.getDamage(), returnedWizardCantrip.getDamage());


        } catch (Exception ex) {
            // if any errors are thrown, then fail.
            Assertions.fail();

        }
    }
}

