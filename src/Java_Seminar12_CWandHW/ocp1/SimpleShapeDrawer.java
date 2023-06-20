package Java_Seminar12_CWandHW.ocp1;

public class SimpleShapeDrawer {

    public void draw(Shape shape){
        switch (shape.getType()){
            case Circle -> drawCircle();
            case Square -> drawSquare();
            case Triangle -> drawTriangle();
            default -> throw new IllegalArgumentException();
        }
    }

    private void drawSquare(){
        //...
    }

    private void drawCircle(){
        //...
    }

    private void drawTriangle(){
        //...
    }

}
