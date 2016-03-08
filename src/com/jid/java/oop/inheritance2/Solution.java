package com.jid.java.oop.inheritance2;

/**
 * Created by Jorge on 2015-09-25.
 */
class Solution{

    public static void main(String []argh){
        Adder X=new Adder();
        System.out.println("My superclass is: "+X.getClass().getSuperclass().getName());
        System.out.print(X.add(10,32)+" "+X.add(10,3)+" "+X.add(10,10)+"\n");
    }
}

class Arithmetic {

}

class Adder extends Arithmetic {

    public int add(int x, int y) {
        return x + y;
    }

}
