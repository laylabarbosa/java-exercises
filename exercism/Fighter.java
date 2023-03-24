abstract class Fighter {
    boolean isVulnerable() {
        return false;
    }
    abstract int damagePoints(Fighter fighter);
}

class Warrior extends Fighter {
    @Override
    public String toString() {
        return "Fighter is a " + getClass().getSimpleName();
    }
    @Override
    int damagePoints(Fighter wizard) {
       return wizard.isVulnerable()? 10 : 6;
    }
}

class Wizard extends Fighter {
    boolean spell=false;

    @Override
    boolean isVulnerable() {
        return !spell;
    }

    @Override
    int damagePoints(Fighter warrior) {
       return isVulnerable() ? 3 : 12;
    }
     @Override
    public String toString() {
        return "Fighter is a " + getClass().getSimpleName();
    }
    void prepareSpell() {
        this.spell = true;
    }
}
