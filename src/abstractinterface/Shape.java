package abstractinterface;

public abstract class Shape
{

    public final Color color;

    public Shape (Color color){
        this.color=color;

    }
    public Color getColor(){
        return color;
    }
    public abstract double getArea();




}
