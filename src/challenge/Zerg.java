package challenge;

public class Zerg extends Unit {
    public Zerg(String name, int speed, int hp, int damage, int position, String description) {
        super(name, speed, hp, damage, position, description);
    }

    @Override
    public void move(String direction) {
        if (direction.equals("left")) {
            this.setHp(this.getHp() - 2);
        } else if (direction.equals("right")) {
            this.setHp(this.getHp() + 2);
        }
        System.out.println(this.getName() + " 유닛이 " + direction + "쪽으로 이동했습니다. 현재 위치: " + this.getHp());
    }
}
