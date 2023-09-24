import java.util.ArrayList;
import java.awt.Rectangle;

public class BigRectLister {
    public static void main(String[] args) {
        ArrayList<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle(3, 3));
        rectangles.add(new Rectangle(5, 2));
        rectangles.add(new Rectangle(3, 4));
        rectangles.add(new Rectangle(2, 5));
        rectangles.add(new Rectangle(2, 2));
        rectangles.add(new Rectangle(3, 1));
        rectangles.add(new Rectangle(4, 5));
        rectangles.add(new Rectangle(1, 6));
        rectangles.add(new Rectangle(5, 8));
        rectangles.add(new Rectangle(8, 6));

        // Display all rectangles
        System.out.println("All Rectangles:");
        for (Rectangle rect : rectangles) {
            System.out.println("Width: " + rect.getWidth() + ", Height: " + rect.getHeight());
        }
    }
}