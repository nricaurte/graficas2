package Ecuaciones;
import java.awt.Graphics;
import static java.lang.Math.*;
public class Ecuaciones {
  
public void Ecuacion_Circulo(Graphics g,double x1,double y1,double x2,double y2,float g1,float g2,int d){
        double r=Radio(x1, y1, x2, y2);
        for (double i =toRadians(g1); i <= toRadians(g2); i = (float) (i + 0.001)) {
        float c = (float) (x1 + (r+d) * (float) cos(i));
        float s = (float) (y1 + (r) * (float) sin(i));
        g.drawOval((int) c, (int) s, 1, 1);
    }    
   }
 public void Combinada( Graphics g,float x1, float y1, float rx, float ry,float g1, float g2) {
           for (float i=g1;i<=g2;i=(float) (i+ 0.01)) {
           float c = (int)(x1 + rx * (Math.cos(toRadians(i))));
           float  s = (int)(y1 + ry * (Math.sin(toRadians(i))));
           g.drawOval((int)c,(int) s, 1, 1);       
        }
    }
  double r;
   public double Radio(double x1, double y1, double x2, double y2){
         r=(double) Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
         return r;
   }
}