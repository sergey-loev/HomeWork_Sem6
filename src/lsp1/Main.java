package lsp1;

import lsp1.shape.Quadrilateral;
import lsp1.shape.Rectangle;
import lsp1.shape.Square;
import lsp1.view.ShapeView;

public class Main {
    public static void main(String[] args) {
        Quadrilateral quadrilateral = new Rectangle(5, 4);
        Rectangle rectangle = (Rectangle) quadrilateral;
        System.out.printf("In a rectangle side A = %d, side B = %d\n", rectangle.getSideA(), rectangle.getSideB());
        ShapeView view = new ShapeView(quadrilateral);
        view.showArea();
    }
}
