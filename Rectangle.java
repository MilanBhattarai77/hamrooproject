// Application of Class object

 

class Rectangle
{
    int length, width; //Declaration of variables
    void getData (int x,int y)
    {
        length = x;
        width = y;
    }
    int rectArea() //Another method
    {
        int area = length*width;
        return (area);
    }
}

 

class RectArea
{
    public static void main (String args[])
    {
        int area1,area2;
        Rectangle rect1 = new Rectangle();         // Creating objects
        Rectangle rect2 = new Rectangle();
        rect1.length = 10;                         // Accessing variables
        rect1.width = 15;
        area1 = rect1.length * rect1.width;
        rect2.getData(20,12);                     // Accessing Methods
        area2 = rect2.rectArea();
        System.out.println("Area1=" + area1);
        System.out.println("Area2=" + area2);
    }
}