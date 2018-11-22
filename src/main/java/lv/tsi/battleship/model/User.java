package lv.tsi.battleship.model;

import java.util.Map;

public class User {
    private String name;
    private Field myField = new Field();
    private Field enemyField = new Field();
    private Field getMyField {
        return myField;
    }

    public Field getEnemyField() {
        return enemyField;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
