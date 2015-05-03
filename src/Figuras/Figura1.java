
package Figuras;
import Ecuaciones.Ecuaciones;
import java.awt.Color;
import java.awt.Graphics;
import static java.lang.Math.*;

public class Figura1 extends Ecuaciones {
float diviciones;   
float r,r2,r3;   
int elipce=0;
public void Figura1(Graphics g, int x1, int y1, int x2, int y2, float v, Color cl, int Elipce_o_Circulo) {
    if(Elipce_o_Circulo==2){
            elipce=70;
        }     
                 g.setColor(cl);
         r=(int)Radio(x1, y1, x2, y2);
         diviciones=360/(v*2);
             r2=(r/3);  r3=(r2/2);   
      Combinada(g, x1,y1,(r3)+elipce, (r3),0,360);
         for(float i=0;i<360;i+=diviciones){
      Ecuacion_Circulo(g, x1, y1, x2, y2,((i*2)+diviciones),(i*2)+(diviciones*2),elipce);
      Combinada(g, x1, y1, (r-r3)+elipce, (r-r3),((i*2)+diviciones),((i*2)+(diviciones*2)));
      g.drawLine((int)(x1+(r-r3+elipce)*cos(toRadians(i))), (int)(y1+((r-r3))*sin(toRadians(i))), (int)(x1+(r+elipce)*cos(toRadians(i))), (int)(y1+((r))*sin(toRadians(i))));
        }
      for(float i=0;i<360;i+=diviciones+diviciones){
          g.drawLine((int)(x1+(r3+elipce)*cos(toRadians(i+(diviciones/2+diviciones)))), (int)(y1+((r3))*sin(toRadians(i+(diviciones/2+diviciones)))), (int)(x1+(r-r3+elipce)*cos(toRadians(i+(diviciones/2+diviciones)))), (int)(y1+((r-r3))*sin(toRadians(i+(diviciones/2+diviciones)))));
         }
    }           
}
