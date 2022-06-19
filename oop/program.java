package oop;

public class program {
public static void main(String[] args) {
    Worker manager = new Worker(Worker.Status.Manager, "worker1");
    Worker head = new Worker(Worker.Status.Head, "worker2");
    Worker general  = new Worker(Worker.Status.General, "worker2");
    Client client1 = new Client("first1","last1","01.01","34564","675654654");


    client1.getInfoBy(manager);
}

}