public final class HeroTwo extends HeroFirst{
    private String battleStyle;


    public HeroTwo(String name, int health, SuperSkill skill, Weapon weapon, String battleStyle) {
        super(name, health, skill, weapon);
        this.battleStyle = battleStyle;
    }

    public String getBattleStyle() {
        return battleStyle;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Боевой стиль " + battleStyle);
    }
}
