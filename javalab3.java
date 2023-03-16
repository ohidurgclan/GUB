package com.mycompany.javalandtransport;

/**
 * @author MD OHIDUR RAHMAN
 * @ID 221002406
 */
class car {
   String engineNo, bodyColor;
   int x, y, iv, mf = 100, cf;
   car(String en, String bc, int iv, int mf, int cf){

   
   }
}
class cycle{
    String modelNo;
    int x, y, iv;
    cycle(String modelNo, int iv){
        this.modelNo = modelNo;
        this.iv = iv;
    }
    void up(){
        y += iv;
    }
    void up(int a){
        y += a;
    }
    void down(){
        y -= iv;
    }
    void down(int a){
        y -= a;
    }
}
public class JavalandTransport {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
