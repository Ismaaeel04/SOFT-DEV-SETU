public class Rectangle
{
    private int length;
    private int width;
    private String data;

    public Rectangle()
    {
        length = 1;
        width = 1;
        
    }

    public int setLength(int l)
    {
        if(l>0 && l<40)
        {
            length = l;
           
        }
    
        return length;
    }

    public int setWidth(int w)
    {
        if(w>0 && w<40)
        {
            width = w;
           
        }
    
        return width;
    }

    public String toString(String d)
    {
        d = "Length = " + length + ", " + " Width = " + width;
        data=d;
        return data;
    
    }

    public double getPerimeter()
    {
        double p = 2*(length + width);
        return p;
    }

    public double getArea()
    {
        double a = length * width;
        return a;
    }
   
       public void printRectangle()
    {
        // Print first row
        for(int j = 1; j <= length; j++) {
            System.out.print("*");
        }
        System.out.println();

        // Print middle rows
        for(int i = 2; i < width; i++) {
            System.out.print("*"); 
            for(int j = 2; j < length; j++) {
                System.out.print(" "); 
            }
            System.out.print("*"); 
            System.out.println();
        }

        if(width > 1) {
            for(int j = 1; j <= length; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}