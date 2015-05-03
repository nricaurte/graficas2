package Figuras;
import Ecuaciones.Ecuaciones;
import java.awt.Color;
import java.awt.Graphics;
import static java.lang.Math.*;
public class Figura3 extends Ecuaciones {
    float r,r2,r3,diviciones;  
    int elipce=0;
    public void Figura3(Graphics g, float x1, float y1, float x2, float y2,float v,Color cl,int Elipce_o_Circulo) {
             if(Elipce_o_Circulo==2){
            elipce=70;
        }     
         r=(int)Radio(x1, y1, x2, y2);
         diviciones=360/(v*2);
         r2=(r/3);  r3=(r2/2);   
       g.setColor(cl);               
 for(float i=0;i<360;i+=diviciones+diviciones){
           Combinada(g, x1,y1,(r3)+elipce, (r3),0,360);
          g.drawLine((int)(x1+(r3+elipce)*cos(toRadians(i+(diviciones/2+diviciones)))), (int)(y1+((r3))*sin(toRadians(i+(diviciones/2+diviciones)))),
          (int)(x1+(r2+elipce)*cos(toRadians(i+(diviciones/2+diviciones)))), (int)(y1+((r2))*sin(toRadians(i+(diviciones/2+diviciones)))));
          g.drawLine((int)(x1+(r2+elipce)*cos(toRadians(i+(diviciones/2+diviciones)))), (int)(y1+((r2))*sin(toRadians(i+(diviciones/2+diviciones)))),
          (int)(x1+(r2*2+elipce)*cos(toRadians(i+(diviciones*2)))), (int)(y1+((r2*2))*sin(toRadians(i+(diviciones*2)))));
            g.drawLine((int)(x1+(r2*2+elipce)*cos(toRadians(i+(diviciones*2)))), (int)(y1+((r2*2))*sin(toRadians(i+(diviciones*2)))),
          (int)(x1+(r+elipce)*cos(toRadians(i+(diviciones/2+diviciones)))), (int)(y1+((r))*sin(toRadians(i+(diviciones/2+diviciones)))));
         }
    }  
}
