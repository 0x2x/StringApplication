package org.pluralsight;

public class operatorExercise {
    static void main() {

        // 1 Counting Coins
        int player_1_coins = 137;
        int max_bag = 20;
        int remainder = player_1_coins % max_bag;
        int left_over_bags = player_1_coins / max_bag;
        System.out.println(remainder); // remainder
        System.out.println(left_over_bags); // goes in 6 times
        // 2
        int play_has_red_herbs = 17, play_has_blue_herbs = 11;
        int potion_requires_three_red_herbs = 3;
        int potion_requires_two_blue_herbs = 2;

        int result = (play_has_red_herbs / potion_requires_three_red_herbs);
        int result_1 = (play_has_blue_herbs / potion_requires_two_blue_herbs);
        System.out.println(result);
        System.out.println(result_1);
        System.out.println(result + result_1);
        // 3



        // 6



        // 5
        int HeroHealth = 100;
        int MonsterDamage = 12;
        System.out.println("Health after hit: " + (HeroHealth - MonsterDamage));
        // 6
        int bullets = 53;
        int magazineHolds = 7;
        int FullMags = bullets / magazineHolds ;
        int bulletsLeft = bullets % magazineHolds;
        System.out.println("Full magazines: " + FullMags);
        System.out.println("bulletsLeft: " + bulletsLeft);

        // 7
        int player_xp = 1180;
        int levels_require = 500;
        int level = player_xp / levels_require;
        int leftOver = player_xp % levels_require;
        System.out.println("Current level: " + level);
        System.out.println("Left over: " + leftOver);

        // 8
        int critCount = 0;
        System.out.println(++critCount);
        System.out.println("HIT!");
        System.out.println(++critCount);
        System.out.println("HIT!");
        System.out.println(++critCount);
        System.out.println("HIT!");

        // 9
        int carSpeed = 150;
        System.out.println("CarSpeed:" + carSpeed );
        System.out.println("CarSpeed + +20 :" + carSpeed + 20);
        System.out.println("CarSpeed + +30 :" + carSpeed + 30);
        System.out.println("CarSpeed Boost ran out -50" + (carSpeed - 50));



        // 10
        int base_attack = 40;
        int fire_attack = (int) (base_attack * 1.5);
        System.out.printf("Fire Attack Result: " + fire_attack + "\n");
        // 11
        int quest_win = 1350;
        int players = 4;
        int leftOver_1 = (int) (quest_win % players);
        System.out.printf("result " + (quest_win / players) + "\n" + "Left Over " + leftOver_1);
        // 12
        int racetrack = 5;
        int player_drives = 47;


        // using
        // 1) Coin Pouch
        int a = 4, b = 6;
        System.out.println(a++ + ++b); //  4 and 7

        // 2) Combo Attack
        int x = 5, y = 3, z = 2;
        System.out.println(x++ + ++y * z++); // ??
        // 3) Loot Bags
        int eggs = 150, perBox = 12;
        System.out.println(eggs / perBox + " " + eggs % perBox); // 12.5 and 6
        // 4) Mana Surge
        int n = 10;     // post-increment
        n += n++ + ++n; // 10 + 11 = 11+ 11
        System.out.println(n); // 32
        // 5) Triple Buff
        int p = 7;
        System.out.println(p++ + p++ + ++p); // 25
        // 6) Bow Shot
        int u = 2, v = 5;
        System.out.println(++u * v-- - u++); // 12
        // 7) Average Loot (gotcha: integer division stored in double)
        int gold = 10, players_1 = 3;
        double avg = (double) gold / players_1;
        System.out.println(avg); // 3.0 because it uses double
        // 8) Arena Math
        int m = 5, d = 3;
        System.out.println(m / d * d + m % d); // 5
        // 9) Level Trick
        int lvl = 1;
        lvl = lvl++ + ++lvl + lvl;
        System.out.println(lvl); // 7
        // 10) Final Boss Formula
        int A = 5, B = 3, C = 2;
        System.out.println(A++ * --B + C++ / B); // 11

    }
}
