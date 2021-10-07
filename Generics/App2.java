package main;

public class App2 {

    public static void main(String[] args) {
        Box ib = new  Box(100);
        Box db = new  Box(100.09);
        Box sb = new  Box("abc");
        ib.printString();
        db.printString();
        sb.printString();
    }
}

// Inheritance/Polymorphism
class Box {

    Object value;

    Box(Object value){
        this.value = value;
    }
    public void printString(){
        System.out.println(this.value);
    }
}
