package com.company;

public class pokemon {
    protected int number;
    protected String name;;
    protected int health;
    protected int level;
    protected String type;

    public pokemon(int number, String name, int health, int level, String type) {
        this.number = number;
        this.name = name;
        this.health = health;
        this.level = level;
        this.type = type;
    }

    @Override
    public String toString() {
        return "pokemon{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", health=" + health +
                ", level=" + level +
                ", type='" + type + '\'' +
                '}';
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}



