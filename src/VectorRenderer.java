public class VectorRenderer implements Renderer {

    @Override
    public void renderCircle(double radius) {
        System.out.println("Vector circle, radius: " + radius);
    }

    @Override
    public void renderSquare(double side) {
        System.out.println("Vector square, side: " + side);
    }
}
