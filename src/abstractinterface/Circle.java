package abstractinterface;

import java.io.IOException;
import java.io.Serializable;

interface Foo{
    int x = 10;
}



public class Circle extends Shape {
    //private final Color color;


  int array;
    private Point point;
    private double radius;
    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] a3=new int[a1.length+a2.length];
        int i=0, j=0;
        for (int k=0; k<a3.length; k++) {

            if (i > a1.length-1) {
                int a = a2[j];
                a3[k] = a;
                j++;
            }
            else if (j > a2.length-1) {
                int a = a1[i];
                a3[k] = a;
                i++;
            }
            else if (a1[i] < a2[j]) {
                int a = a1[i];
                a3[k] = a;
                i++;
            }
            else {
                int b = a2[j];
                a3[k] = b;
                j++;
            }
        }


        return a3 ;
    }




    public Circle(Color color,Point point,double radius){
        super(color);
        this.point=point;
        this.radius=radius;

    }

    public Point getCenter(){
        return point;
    }
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return 3.14*radius*radius;
    }


    public static void main(String[] args,double kek){

    }

public static void main(String[] args){

        String kek="sdsds";
        String j=new String(kek);
       // String e=kek;
        double a=1000;
        int b=100;
   //     int c=(int)a+b;
    String x = "abc";
    String y = "abc";
    String e = x.concat(y);
    System.out.print(e);
  //  System.out.println(kek==e);
    System.out.println(kek==j);

    char c = 65;
    System.out.println("c = "+c);
}

}
 enum Kek implements Serializable {

 }