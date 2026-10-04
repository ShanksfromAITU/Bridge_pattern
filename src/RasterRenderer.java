public class RasterRenderer implements Renderer {

    @Override
    public void renderCircle(double radius) {
        System.out.println("Raster circle, radius: " + radius);
    }

    @Override
    public void renderSquare(double side) {
        System.out.println("Raster square, side: " + side);
    }
}