public class Unit {
    // 필드 : 각 유닛의 이름, 뉴잇의 속도, 체력, 공격력, 유닛에 대한 설명
    private String name;        //  이름
    private int speed;          //  속도
    private int hp;             //  체력
    private int damage;         //  공격력
    private int position;       //  위치
    private String description; //  유닛에 대한 설명

    // 생성자 => 생성자를 명시하지 않으면 빈 생성자
    public Unit(String name, int speed, int hp, int damage, int position, String description){
        this.name = name;
        this.speed = speed;
        this.hp = hp;
        this.damage = damage;
        this.position = position;
        this.description = description;
    }

    // 이동
    public void move(String direction){
        if(direction.equals("left")){
            this.position -= 1;
        } else if (direction.equals("right")) {
            this.position += 1;
        }
        System.out.println(this.name + " 유닛이 " + direction + "쪽으로 이동했습니다.");
    }
    // 공격
    public void attack(Unit target){
        if (target.getHp() <= 0){
            System.out.println("공격 불가능한 대상입니다.");
        } else if (target.getHp() > 0) {
            System.out.println(this.name + "이가 "+target.name+"을 공격했습니다.");
            // 타겟의 hp를 감소시킴
            int attackedHp = target.getHp() - this.getDamage();
            target.setHp(attackedHp);
            if (target.getHp() <= 0){
                // 타겟의 hp가 0이면 사망했다는 문구가 나옴
                System.out.println(target.name+"이(가) 사망했습니다.");
            } else {
                System.out.println(target.name+"의 남은 체력 "+ target.getHp());
            }
        }
    }
    // 유닛의 정보 출력
    public void printUnitInfo(){
        System.out.print(this.name);
        System.out.print(" | 체력 : " + this.hp);
        System.out.print(" | 공격력 : " + this.damage);
        System.out.print(" | 설명 : " + this.description);
        System.out.println();
    }

    //getter
    public String getName(){
        return name;
    }
    public int getSpeed(){
        return speed;
    }
    public int getHp(){
        return hp;
    }
    public int getDamage(){
        return damage;
    }
    public int getPosition(){
        return position;
    }
    public String getDescription(){
        return description;
    }
    //setter
    public void setName(String name){
        this.name = name;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public void setHp(int hp){
        this.hp = hp;
    }
    public void setDamage(int damage){
        this.damage = damage;
    }
    public void setPosition(int position){
        this.position = position;
    }
    public void setDescription(String description){
        this.description = description;
    }
}