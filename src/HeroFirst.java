public class HeroFirst extends Hero{
    private Weapon weapon;
    public HeroFirst(String name, int health, SuperSkill skill, Weapon weapon) {
        super(name, health, skill);
        this.weapon = weapon;

    }

    public Weapon getWeapon() {
        return weapon;
    }

    @Override
    public void info() {
        super.info();
        System.out.println(weapon.getName());
    }

    @Override
    public void fight() {
        super.fight();
        System.out.println(getSkill());
    }
}
