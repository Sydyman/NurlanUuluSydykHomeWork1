public class Hero {
    private String name;
    private int health;
    private SuperSkill skill;

    public Hero(String name, int health, SuperSkill skill) {
        this.name = name;
        this.health = health;
        this.skill = skill;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public SuperSkill getSkill() {
        return skill;
    }
    public void info(){
        System.out.println("Имя героя: " + name + " Здоровье: " + health + " Способность: "
        + skill + " \nОружие ");
    }
    public void fight(){
        System.out.println("герой дереться используя");
    }
}
