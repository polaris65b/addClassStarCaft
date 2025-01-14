package challenge;

import java.util.Random;

public class Main{
    public static void main(String[] args) {
        Unit marine = new Terran("Marine",5, 20 ,
                6, 0, "Terran Unit");
        Unit zealot = new Protoss("Zealot",5, 30 ,
                8, 0, "Protoss Unit");
        Unit zergling = new Zerg("Zergling",5, 15 ,
                5, 0, "Zerg Unit");

        marine.printUnitInfo();
        zealot.printUnitInfo();
        zergling.printUnitInfo();

        // 랜덤 값 발생
        Random random = new Random();
        int randomNum = random.nextInt(20) + 1;
        // 이동 실행
        for(int i = 0; i < randomNum; i++){
            String randomDirection = random.nextBoolean() ? "left" : "right";
            zergling.move(randomDirection);
        }
        System.out.println("===marine 공격===");
        marine.attack(zergling);
        marine.attack(zealot);
        
        System.out.println("===zergling 공격===");
        zergling.attack(marine);
        zergling.attack(zealot);

        System.out.println("===zealot 공격===");
        zealot.attack(marine);
        zealot.attack(zergling);
    }
}