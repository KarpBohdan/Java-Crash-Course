public class Kata {
    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        String winner = "";
        boolean is_first = false;
        if (firstAttacker == fighter1.name)
            is_first = true;

        while (winner == "") {
            if (is_first) {
                if (fighter1.health > 0) {
                    fighter2.health = fighter2.health - fighter1.damagePerAttack;
                    is_first=!is_first;
                } else {
                    winner = fighter2.name;
                }
            } else {
                if (fighter2.health > 0) {
                    fighter1.health = fighter1.health - fighter2.damagePerAttack;
                    is_first=!is_first;
                } else {
                    winner = fighter1.name;
                }
            }
        }


        return winner;
    }
}