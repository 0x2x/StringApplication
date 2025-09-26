package org.pluralsight.weekone.Methods;

public class MethodExcercises1 {
    static void main() {
        printWeclome();
        displayPlayerName("hi");
        showLevel(18);
        foundItem("awesome_dude2", "sword");
        CastSpell("vice", "learning", 15);
        gameOver("dude");
        enterDungeon("dude", "the basement");
        victoryDance("dude");
    }

    public static void printWeclome() {
        System.out.println("Welcome to Code Quest!");
    }

    public static void displayPlayerName(String playerName) {
        String data = "Player joined: " + playerName;
        System.out.print(data);
//        System.out.println(String.format("Player "));
//        System.out.printf("");
    }

    public static void showLevel(int level) {
        String level_str = "Level: " + level;
        String level_str1 = String.format("Level: %d", level);
        System.out.println(level_str);
    }

    public static void foundItem(String player, String item) {
        System.out.printf("%s found a item %s\n", player, item);
    }

    public static void CastSpell(String wizard, String spellName, int manaCost) {
        String easyformat = String.format("%s casts %s costing %d mana!", wizard, spellName, manaCost);
        System.out.println(easyformat);
    }

    public static void gameOver(String player) {
        System.out.printf("Game OVER for %s\n", player);
    }

    public static void enterDungeon(String player, String dungeonName) {
        System.out.printf("%s bravely enters the %s\n", player, dungeonName);
    }

    public static void victoryDance(String player) {
        System.out.printf("%s does a little victory dance\n", player);
    }



/*
    public static void printWelcome() {
        System.out.println("Welcome to Code Quest!");
    }

    static void displayPlayerName(String playerName) {
        System.out.println(String.format("Player name: [%s]", playerName));
    }

    public static void showLevel(int Level) {
        System.out.println(String.format("Level: [%d]", Level));
    }

    public static void attack(String attacker, String target) {
        System.out.println(String.format(""));
    }
    */
}
