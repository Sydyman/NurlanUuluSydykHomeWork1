public class Main {
    public static void main(String[] args) {
    Weapon weapon = new Weapon("Frostmorn");
    HeroFirst hero1 = new HeroFirst("Arthas", 700, SuperSkill.POWER, weapon);
    hero1.info();
    hero1.fight();

    Weapon weapon2 = new Weapon("Stick");
    HeroTwo hero2 = new HeroTwo("Invoker", 300,SuperSkill.INTELECT, weapon2,
            "Magic");
    hero2.info();
    hero2.fight();


    Weapon weapon3 = new Weapon("Necronomikon");
    HeroTwo hero3 = new HeroTwo("Necrophos", 190,SuperSkill.MAGIC, weapon3,
            "Curse");
        hero3.info();
        hero3.fight();

    }
}