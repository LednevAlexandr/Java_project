package oop.stepik_01;

public class Animal{
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
    public Animal(){}
    public Animal(String type,String name){
        this.type = type;
        this.name = name;
    }
    public Animal(String type,int age){
        this.type = type;
        this.age = age;
    }
    
    public String getName(){
        return this.name;
    }
     public String getType(){
        return this.type;
    }
    public int getAge(){
        return this.age;
    }
    public double getWeight(){
        return this.weight;
    }
    public boolean isFly(){
        return this.isFly;
    }
    public boolean isWalk(){
        return this.isWalk;
    }
     public boolean isSwim(){
        return this.isSwim;
    }
    public void setType(String type){
        this.type = type;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
     public void setFly(boolean Fly){
        this.isFly = Fly;
    }
    public void setWalk(boolean Walk){
        this.isWalk = Walk;
    }
    public void setSwim(boolean Swim){
        this.isSwim = Swim;
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