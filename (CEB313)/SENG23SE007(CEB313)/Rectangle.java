public class Rectangle {
    private double length;
    private double width;

    //Constructor
     public Rectangle(double length,double width){
         setLength(length);
         setWidth(width);
     }
     //no argument constructor to initializes default values to 1.0
     public Rectangle(){
         this(1.0,1.0);
     }
    //set length method
    public void setLength(double length) {
        if(length <= 0.0 || length >=20.0){
            throw new IllegalArgumentException("Length shouldn't be less than 0.0 or greater than 20.0");
        }
        this.length = length;
    }
    //set width method
    public void setWidth(double width){
        if(width <= 0.0 || width >=20.0){
            throw new IllegalArgumentException("Width shouldn't be less than 0.0 or greater than 20.0");
        }
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }
    //calculates perimeter
    public double Perimeter(){
        return (length + width) * 2;
    }
    public double Area(){
        double area = length * width;
        return area ;
    }
}
