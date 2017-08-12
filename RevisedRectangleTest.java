class Rectangle {
    private int x, y;
    private int width, height;
        
    public Rectangle() {
        this(0, 0, 1, 1);
    }
    public Rectangle(int width, int height) {
        this(0, 0, width, height);
    }
    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    
    public void showRectangleInfo() {
        System.out.printf("Rectangle: origin = (%d, %d), width = %d, height = %d\n",
                          this.x, this.y, this.width, this.height); 
    }    
}

public class RevisedRectangleTest {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle(10, 20);
        Rectangle rect3 = new Rectangle(5, 4, 30, 40);
        
        System.out.print("rect1 ");
        rect1.showRectangleInfo();
        
        System.out.print("rect2 ");
        rect2.showRectangleInfo();
        
        System.out.print("rect3 ");
        rect3.showRectangleInfo();
    }
}
