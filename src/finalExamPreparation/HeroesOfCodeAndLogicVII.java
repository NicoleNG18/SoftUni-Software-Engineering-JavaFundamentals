package finalExamPreparation;

import java.util.*;

public class HeroesOfCodeAndLogicVII {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        Map<String, List<Integer>> heroes = new LinkedHashMap<>();

        for (int i = 0; i < num; i++) {

            String[] help = scanner.nextLine().split(" ");
            int hp = Integer.parseInt(help[1]);
            int mp = Integer.parseInt(help[2]);

            if (hp <= 100 && mp <= 200) {

                List<Integer> helpList = new ArrayList<>();

                helpList.add(hp);
                helpList.add(mp);

                heroes.putIfAbsent(help[0], helpList);
            }
        }

        String command = scanner.nextLine();

        while (!command.equals("End")) {

            String[] commandArray = command.split(" - ");
            String action = commandArray[0];
            String heroName = commandArray[1];

            switch (action) {

                case "CastSpell": {

                    int mpNeeded = Integer.parseInt(commandArray[2]);
                    String spellName = commandArray[3];
                    int newMp = heroes.get(heroName).get(1) - mpNeeded;

                    /*error*/
                    if (newMp >= 0) {
                        heroes.get(heroName).set(1, newMp);
                        System.out.printf("%s has successfully cast %s and now has %d MP!%n", heroName, spellName, newMp);

                    } else {
                        System.out.printf("%s does not have enough MP to cast %s!%n", heroName, spellName);
                    }

                    break;
                }

                case "TakeDamage": {

                    int damage = Integer.parseInt(commandArray[2]);
                    String attacker = commandArray[3];
                    int newHP = heroes.get(heroName).get(0) - damage;

                    if (newHP > 0) {
                        heroes.get(heroName).set(0, newHP);
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", heroName, damage, attacker, newHP);

                    } else {
                        System.out.printf("%s has been killed by %s!%n", heroName, attacker);
                        heroes.remove(heroName);
                    }

                    break;
                }

                case "Recharge": {

                    int amount = Integer.parseInt(commandArray[2]);
                    int newMp = heroes.get(heroName).get(1) + amount;

                    if (newMp > 200) {
                        int h = newMp - 200;
                        newMp = 200;
                        amount -= h;
                    }

                    heroes.get(heroName).set(1, newMp);
                    System.out.printf("%s recharged for %d MP!%n", heroName, amount);

                    break;
                }

                case "Heal": {

                    int amount = Integer.parseInt(commandArray[2]);
                    int newHp = heroes.get(heroName).get(0) + amount;

                    if (newHp > 100) {
                        int h = newHp - 100;
                        newHp = 100;
                        amount -= h;
                    }

                    heroes.get(heroName).set(0, newHp);
                    System.out.printf("%s healed for %d HP!%n", heroName, amount);

                    break;
                }

            }
            command = scanner.nextLine();
        }

        for (Map.Entry<String, List<Integer>> entry : heroes.entrySet()) {
            System.out.println(entry.getKey());

            System.out.printf("  HP: %d%n", entry.getValue().get(0));
            System.out.printf("  MP: %d%n", entry.getValue().get(1));
        }

    }


}

