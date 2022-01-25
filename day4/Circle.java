public class Circle {

    double PI = 3.14;

    public void areaOfCircle(long radius){

        double A= PI* radius * radius;
        System.out.println("Area Of Circle with long= "+ A);
    }

    public void areaOfCircle(double radius){

        double B= PI* radius * radius;
        System.out.println("Area Of Circle with double= "+ B);
    }

    public static void main(String[] args){

        Circle circle=new Circle();
        circle.areaOfCircle(3);
        circle.areaOfCircle(5.6);
    }
}
