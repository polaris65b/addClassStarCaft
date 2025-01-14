import java.util.Random;

public class Main{
    public static void main(String[] args) {
        Unit marine = new Unit("Marine",5, 20 ,
                6, 0, "Terran Unit");
        Unit zealot = new Unit("Zealot",5, 30 ,
                8, 0, "Protoss Unit");
        Unit zergling = new Unit("Zergling",5, 15 ,
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
            marine.move(randomDirection);
        }
        marine.attack(zergling);
    }
}