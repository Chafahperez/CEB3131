
public static void main(String[] args) {
    Rectangle rectangle = new Rectangle(5.0,2.0);
    System.out.println("Length: "+ rectangle.getLength());
    System.out.println("Width: "+ rectangle.getWidth());
    System.out.println("Perimeter: "+ rectangle.Perimeter());
    System.out.println("Area: "+ rectangle.Area());

    //Test error handling in the set width and length methods
    try {
        rectangle.setLength(21.5);
    } catch (IllegalArgumentException e){
        System.out.println("Error: "+ e.getMessage());
    }
    try {
        rectangle.setWidth(-2.4);
    } catch (IllegalArgumentException e){
        System.out.println("Error: "+ e.getMessage());
    }

}