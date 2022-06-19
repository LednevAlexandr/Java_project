package oop;

public class Worker {
    enum Status{
        Head,
        Manager,
        General
    }

    private String name;
    private String status;

    Worker(Status status, String name){
        this.status = status;
        this.name = name;
    }
    public Status getStatus(){
        return this.status;
    }
}
