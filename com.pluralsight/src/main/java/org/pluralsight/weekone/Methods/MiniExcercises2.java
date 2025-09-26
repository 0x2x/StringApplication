package org.pluralsight.weekone.Methods;

public class MiniExcercises2
{
    static void main() {
        String whoIstheLord = getPlayerTitle("nigel");
        System.out.println(whoIstheLord);

        boolean type = hasLeveledUp(500, 10);
        if (type == true) {
            System.out.println("You leveled up!");
        } else {
            System.out.println("Keep grinding...");
        }


        int roll = rollDice();
        int roll2 = rollDice();
        int roll3= rollDice();
        System.out.println(roll);
        System.out.println(roll2);
        System.out.println(roll3);

        int damageCalc = calculateDamage(500, 15);
        System.out.println(damageCalc);

        String playerClass = getPlayerClass(1);
        System.out.println(playerClass);

        int goldResult = addgold(55, 500);
        System.out.println(goldResult);

        boolean QuestComplete = isQuestComplete(15, 15);
        System.out.println(QuestComplete);

        boolean bossDefeated = isBossDefeated(100, 200, true);
        System.out.println(bossDefeated);
    }

    private static String getPlayerTitle(String title) {
        return "Lord " + title;
    }

    public static int doubleXP(int xp) {
        int newResult = xp * 2;
        System.out.printf("Original: %d\n", xp);
        System.out.printf("New: %d", xp);
        return newResult;
    }

    public static boolean hasLeveledUp(int currentXp, int threshold) {
        return currentXp >= threshold;
    }

    public static int rollDice() {
        int random = (int) Math.round(Math.random() * 100);
        return random;
    }

    public static int calculateDamage(int strength, int enemyDefense) {
        int returnValue = (strength * 2) - enemyDefense;
        if (returnValue < 0 ){
            return 0;
        }
        System.out.println(String.format("%d damage delt", returnValue));
        return returnValue;
    }

    public static String getPlayerClass(int choice) {
        if (choice == 1) {
            return "Warrior";
        } else if (choice == 2) {
            return "Mage";
        } else if(choice == 3) {
            return "Rogue";
        } else {
            return "Peasant";
        }
    }

    public static int addgold(int currentGold, int goldFound) {
        double tax = 0;
        if (goldFound > 100) {
            tax = 0.10;
            goldFound = (int) (goldFound - tax * 100);
        }
        currentGold += goldFound;
        System.out.println(String.format("final gold amount is %d", currentGold));
        return currentGold;
    }

    public static boolean isQuestComplete(int tasksDone, int totalTasks) {
        if (tasksDone == totalTasks) {
            return true;
        }
        return false;
    }

    public static boolean isBossDefeated(int playerHP, int bossHP, boolean usedPotion) {
        if (bossHP <= 0){
            return true;
        } else if (playerHP <= 0 && usedPotion == false) {
            return false;
        } else if (usedPotion == true) {
            return playerHP + 50 > bossHP;
        }
        return  false;
    }
}