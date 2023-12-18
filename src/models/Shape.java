package models;

import java.util.ArrayList;
public class Shape {

    double[][] points = new double[10][2];
    public void addPoint(double x, double y){
        points[points.length-1][0] = x;
        points[points.length-1][1] = y;
    };

    public double calculateParametr(double x, double y){
        return (x+y);
    };
}
