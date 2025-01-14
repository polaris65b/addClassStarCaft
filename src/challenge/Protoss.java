package challenge;

public class Protoss extends Unit {
    public Protoss(String name, int speed, int hp, int damage, int position, String description) {
        super(name, speed, hp, damage, position, description);
    }

    @Override
    public void attack(Unit target) {
        // Protoss는 Zerg 객체를 공격할 때 damage가 2배가 됨
        if (target instanceof Zerg) {
            System.out.println(this.getName() + " 유닛이 " + target.getName() + "을(를) 에너지 공격으로 공격했습니다.");
            target.setHp(target.getHp() - this.getHp() * 2);
        } else {
            super.attack(target); // 다른 경우에는 부모 클래스의 attack 메서드를 호출
        }
    }
}
