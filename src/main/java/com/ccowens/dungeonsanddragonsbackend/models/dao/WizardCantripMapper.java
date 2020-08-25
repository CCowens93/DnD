package com.ccowens.dungeonsanddragonsbackend.models.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;

import org.springframework.jdbc.core.RowMapper;

public class WizardCantripMapper implements RowMapper <WizardCantrip> {

    public WizardCantrip mapRow(ResultSet resultSet, int i) throws SQLException {

        WizardCantrip wizardCantrip = new WizardCantrip();
        wizardCantrip.setId(resultSet.getObject("id", UUID.class));
        wizardCantrip.setCantrip(resultSet.getString("cantrip"));
        wizardCantrip.setType(resultSet.getString("type"));
        wizardCantrip.setCasting_time(resultSet.getString("casting_time"));
        wizardCantrip.setRange(resultSet.getString("range"));
        wizardCantrip.setComponents(resultSet.getString("components"));
        wizardCantrip.setDuration(resultSet.getString("duration"));
        wizardCantrip.setEffect(resultSet.getString("effect"));
        wizardCantrip.setDamage(resultSet.getString("damage"));
        return wizardCantrip;

    }
}
