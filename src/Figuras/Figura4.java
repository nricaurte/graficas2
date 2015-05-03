package Figuras;
import Ecuaciones.Ecuaciones;
import java.awt.*;
import static java.lang.Math.*;

public class Figura4  extends Ecuaciones{
float r,r1,r2,r3; 
int elipce=0;
public void Figura4(Graphics g,int x1, int y1, int x2, int y2,int v,Color cl,int Elipce_o_Circulo) {
        if(Elipce_o_Circulo==2){
            elipce=70;
        }     
         r=(int) Radio(x1, y1, x2, y2);
         r2=(r/3); 
         g.setColor(cl);
         float diviciones=360/(v*2); 
           Combinada(g, x1,y1,(r2)+elipce, (r2),0,360);
           Combinada(g, x1,y1,(r2*2)+elipce, (r2*2),0,360);
           Ecuacion_Circulo(g,x1,y1,x2,y2,0,360,elipce);
   for(float i=0;i<360;i+=diviciones+diviciones){
            g.drawLine((int)(x1+(r2+elipce)*cos(toRadians(i))), (int)(y1+((r2))*sin(toRadians(i))),
          (int)(x1+(r2*2+elipce)*cos(toRadians(i+(-diviciones)))), (int)(y1+((r2*2))*sin(toRadians(i+(-diviciones)))));
                g.drawLine((int)(x1+(r2*2+elipce)*cos(toRadians(i))), (int)(y1+((r2*2))*sin(toRadians(i))),
          (int)(x1+(r+elipce)*cos(toRadians(i+(diviciones)))), (int)(y1+((r))*sin(toRadians(i+(diviciones)))));  
    }   
    }  
}