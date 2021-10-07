package main;

public class App2 {

    public static void main(String[] args) {
        IntegerBox ib = new  IntegerBox(100);
        DoubleBox db = new  DoubleBox(100.09);
        StringBox sb = new  StringBox("abc");
        ib.printString();
        db.printString();
        sb.printString();
    }
}

// Overload
class IntegerBox {

    Integer value;

    IntegerBox(Integer value){
        this.value = value;
    }
    public void printString(){
        System.out.println(this.value);
    }
}

class DoubleBox {

    Double value;

    DoubleBox(Double value){
        this.value = value;
    }
    public void printString(){
        System.out.println(this.value);
    }
}

class StringBox {

    String value;

    StringBox(String value){
        this.value = value;
    }
    public void printString(){
        System.out.println(this.value);
    }
}
