package eu.nullstack.kidlike.kyu7;

public class TwoFighters {
    public static class Fighter {
        public String name;
        public int health;
        public int damagePerAttack;

        public Fighter(String name, int health, int damagePerAttack) {
            this.name = name;
            this.health = health;
            this.damagePerAttack = damagePerAttack;
        }
    }

    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        double f1WinRounds = Math.ceil(1.0 * fighter2.health / fighter1.damagePerAttack);
        double f2WinRounds = Math.ceil(1.0 * fighter1.health / fighter2.damagePerAttack);

        double diff = Math.abs(f1WinRounds - f2WinRounds);

        if (diff == 0) {
            return firstAttacker;
        } else {
            if (f1WinRounds - f2WinRounds == diff * -1) {
                return fighter1.name;
            } else {
                return fighter2.name;
            }
        }
    }
}
