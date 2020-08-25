package com.ccowens.dungeonsanddragonsbackend.models.dao;

import java.util.UUID;

public class WizardCantrip {
    private UUID id;
    private String cantrip;
    private String type;
    private String casting_time;
    private String range;
    private String components;
    private String duration;
    private String effect;
    private String damage;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getCantrip(){
        return cantrip;
    }

    public String getType(){
        return type;
    }

    public String getCasting_time(){
        return casting_time;
    }

    public String getRange(){
        return range;
    }

    public String getComponents(){
        return components;
    }

    public String getDuration(){
        return duration;
    }

    public String getEffect(){
        return effect;
    }

    public String getDamage(){
        return damage;
    }
}
