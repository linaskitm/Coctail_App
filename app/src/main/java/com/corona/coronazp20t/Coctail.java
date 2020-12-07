package com.corona.coronazp20t;

public class Coctail {
    private String drinkId;
    private String drinkName;
    private String drinkTags;
    private String drinkCategory;
    private String drinkGlass;

    public Coctail(String drinkId, String drinkName, String drinkTags, String drinkCategory, String drinkGlass) {
        this.drinkId = drinkId;
        this.drinkName = drinkName;
        this.drinkTags = drinkTags;
        this.drinkCategory = drinkCategory;
        this.drinkGlass = drinkGlass;
    }

    public String getDrinkId() {
        return drinkId;
    }

    public void setDrinkId(String drinkId) {
        this.drinkId = drinkId;
    }

    public String getDrinkName() {
        return drinkName;
    }

    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }

    public String getDrinkTags() {
        return drinkTags;
    }

    public void setDrinkTags(String drinkTags) {
        this.drinkTags = drinkTags;
    }

    public String getDrinkCategory() {
        return drinkCategory;
    }

    public void setDrinkCategory(String drinkCategory) {
        this.drinkCategory = drinkCategory;
    }

    public String getDrinkGlass() {
        return drinkGlass;
    }

    public void setDrinkGlass(String drinkGlass) {
        this.drinkGlass = drinkGlass;
    }
}

