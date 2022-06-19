package oop.stepik_01;

public class Bird extends Animal{
    String area;
    boolean winterFly;
    {setFly(true);}

    @Override
    public void display(){
        System.out.printf("I am Bird. Место обитания: %s, Умеет ли летать: %s, Тип: %s,Имя: %s,Возраст: %s, Вес: %s, Умеет летать: %b, Умеет ходить: %b, Умеет плавать:%b.",this.area,this.type,this.name,this.age,this.weight,this.isFly,this.isWalk,this.isSwim);
    }
    public String getArea(){
        return this.area;
    }
    public boolean isWinterFly(){
        return this.winterFly;
    }
    public void setArea(String area){
        this.area = area;
    }
    public void setWinterFly(boolean winterFly){
        this.winterFly = winterFly;
    }
    public void chirick_chirick(){
        System.out.println("Chirik-Chirik");
    }
    
}
