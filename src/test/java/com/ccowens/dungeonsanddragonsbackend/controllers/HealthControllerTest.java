package com.ccowens.dungeonsanddragonsbackend.controllers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.net.URI;


@WebMvcTest(HealthController.class)

public class HealthControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testHealthController() {

        try {
            final String baseUrl = "http://localhost:8080/health";
            URI uri = new URI(baseUrl);

            // Execute the call.
            MvcResult results = mockMvc.perform(MockMvcRequestBuilders.get(uri)).andReturn();

            // Validate the call was successful and the data that came back was as expected.
            Assertions.assertNotNull(results);
            Assertions.assertEquals(200, results.getResponse().getStatus());
            Assertions.assertEquals(2, results.getResponse().getContentLength());
            Assertions.assertEquals("ok", results.getResponse().getContentAsString());

        } catch (Exception ex) {
            // if any errors are thrown, then fail.
            Assertions.fail();

        }
    }
}
