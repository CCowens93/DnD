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

    public void setCantrip(String cantrip){
        this.cantrip = cantrip;
    }

    public String getType(){
        return type;
    }

    public void setType(String type){
        this.type = type;
    }

    public String getCasting_time(){
        return casting_time;
    }

    public void setCasting_time(String casting_time){
        this.casting_time = casting_time;
    }

    public String getRange(){
        return range;
    }

    public void setRange(String range){
        this.range = range;
    }

    public String getComponents(){
        return components;
    }

    public void setComponents(String components){
        this.components = components;
    }

    public String getDuration(){
        return duration;
    }

    public void setDuration(String duration){
        this.duration = duration;
    }

    public String getEffect(){
        return effect;
    }

    public void setEffect(String effect){
        this.effect = effect;
    }

    public String getDamage(){
        return damage;
    }

    public void setDamage(String damage){
        this.damage = damage;
    }
}
