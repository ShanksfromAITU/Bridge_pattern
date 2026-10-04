public class Main {

    public static void main(String[] args) {
        Renderer vector = new VectorRenderer();
        Renderer raster = new RasterRenderer();

        Shape circle = new Circle(5, vector);
        Shape square = new Square(4, vector);

        System.out.println("Before switching:");
        circle.draw();
        square.draw();

        circle.setRenderer(raster);
        square.setRenderer(raster);

        System.out.println("After switching:");
        circle.draw();
        square.draw();
    }
}