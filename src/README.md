# Assignment 3 — Bridge Pattern

A Java console application demonstrating the Bridge design pattern.

## How it works

The project separates shapes from rendering implementations.

- Shapes: Circle and Square.
- Renderers: VectorRenderer and RasterRenderer.
- Shape stores a reference to the Renderer interface.
- The renderer can be changed using setRenderer().

Rendering is simulated through console messages.

## Pattern roles

| Role | Class or interface |
|---|---|
| Abstraction | Shape |
| Refined Abstractions | Circle, Square |
| Implementor | Renderer |
| Concrete Implementors | VectorRenderer, RasterRenderer |
| Client | Main |

## How to run

1. Open the project in IntelliJ IDEA.
2. Configure JDK 17.
3. Run Main.java.

## Expected output

    Before switching:
    Vector circle, radius: 5.0
    Vector square, side: 4.0
    After switching:
    Raster circle, radius: 5.0
    Raster square, side: 4.0

The same Circle and Square objects are used before and after switching.
Only their renderer changes.