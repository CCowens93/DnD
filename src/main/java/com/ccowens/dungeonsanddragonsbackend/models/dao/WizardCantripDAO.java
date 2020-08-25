package com.ccowens.dungeonsanddragonsbackend.models.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.UUID;

@Component
public class WizardCantripDAO {

    JdbcTemplate jdbcTemplate;

    public WizardCantripDAO(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public WizardCantrip getWizardCantripById(UUID id) {
        return jdbcTemplate.queryForObject("select * from wizard_cantrip where id = ?", new Object[] { id }, new WizardCantripMapper());
    }
}

