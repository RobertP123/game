package com.company;

public class pokemon {
    protected int health;
    protected int level;
    protected String name;
    protected String position;
    protected String type;

    public pokemon(int health, int level, String name, String position, String type) {
        this.health = health;
        this.level = level;
        this.name = name;
        this.position = position;
        this.type = type;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}


