package Triangle;


import java.util.*;
class Triangle {
    private double side1, side2, side3;
    Triangle(double side1, double side2, double side3) throws TriangleException {
        if (!isTriangle(side1, side2, side3)) throw new TriangleException();
        this.side1= side1;
        this.side2= side2;
        this.side3= side3;
    }

    boolean isEquilateral() {
        return this.side1 == this.side2 && this.side2 == this.side3;
    }

    boolean isIsosceles() {
        return this.side1 == this.side2 || this.side2 == this.side3 || this.side1 == this.side3;
    }

    boolean isScalene() {
        return !(isEquilateral() || isIsosceles());
    }
    boolean isTriangle(double side1, double side2, double side3){
        List<Double> dimensions = new ArrayList();
        boolean triangle=false;
        if (side1 >0 && side2 >0 && side3>0){
            dimensions.add(side1);
            dimensions.add(side2);
            dimensions.add(side3);
            Collections.sort(dimensions);
            if(dimensions.get(0)+dimensions.get(1) >= dimensions.get(2))triangle = true;
        }
        return triangle;
    }
}

