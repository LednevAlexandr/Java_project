public class Main
{
	public static void main(String[] args) {
		Animal duck = new Animal("Утка", "Утя", 3, 5.8, true, true, true);
        duck.display();

        Bird b = new Bird();
        b.setName("Bob");
        b.display();
        b.setArea("На югах");
        b.setWinterFly(false);
        System.out.println(b.getArea());
        System.out.println(b.isWinterFly());
        b.chirick_chirick();

        Fish f = new Fish();
        f.setName("Сельд");
        f.display();
        f.setSquama("Крупная");
        f.setUpStreamSwim(true);
        System.out.println(f.getSquama());
        System.out.println(f.isUpStreamSwim());
        f.bul_bul();

        Insect i = new Insect();
        i.setName("Жук Жукыч");
        i.display();
        i.setWingCount(4);
        i.setLikeJesus(true);
        System.out.println(i.getWingCount());
        System.out.println(i.isLikeJesus());
        i.ggggg();
    }
}
class Animal{
    String type;
    String name;
    int age;
    double weight;
    boolean isFly;
    boolean isWalk;
    boolean isSwim;
    
    public Animal(String type,String name,int age,double weight,boolean isFly,boolean isWalk,boolean isSwim){
        this.type = type;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.isFly = isFly;
        this.isWalk = isWalk;
        this.isSwim = isSwim;
    }
    public Animal(String type,String name){
        this.type = type;
        this.name = name;
    }
    public Animal(String type,int age){
        this.type = type;
        this.age = age;
    }
    
    
    public void display(){
        System.out.printf("Тип: %s,Имя: %s,Возраст: %s, Вес: %s, Умеет летать: %b, Умеет ходить: %b, Умеет плавать:%b.",this.type,this.name,this.age,this.weight,this.isFly,this.isWalk,this.isSwim);
    }
    public void rename(String name){
        this.name = name;
    }
    public void holiday(int days){
        this.weight = this.weight + 0.1 * days;
    }
    public void holiday(){
        this.weight = this.weight + 0.1;
    }
    public void holiday(double m){
        this.weight = this.weight + m;
    }
    public void holiday(double m, int n){
        this.weight = this.weight + m*n;
    }
}
class Bird extends Animal{
    String area;
    boolean winterFly;
    
    public Bird(){
        this.isFly = true;
    }
    
    public void chirik_chirik(){
        System.out.println("Chirik-Chirik");
    }
    
}

class Fish extends Animal{
    
    String squama;
    boolean upStreamSwim;
    
    public Fish(){
        this.isSwim = true;
    }
    public void bul_bul(){
        System.out.println("Bul_Bul");
    }
}

class Insect extends Animal{
    int wingCount ;
    boolean likeJesus;
    
    public Insect(){
        this.isWalk = true;
    }
    
    public void ggggg(){
        System.out.println("Ggggg");
    }
    
}
