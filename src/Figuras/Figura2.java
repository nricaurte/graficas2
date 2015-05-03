/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Figuras;

import Ecuaciones.Ecuaciones;
import java.awt.Color;
import java.awt.Graphics;
import static java.lang.Math.*;


public class Figura2 extends Ecuaciones{
int r,r1;
int elipce=0;
    public void Figura2(Graphics g, int x1, int y1,int x2, int y2, int v, Color cl, int Elipce_o_Circulo) {
           if(Elipce_o_Circulo==2){
            elipce=70;
        }     
         r=(int) Radio(x1, y1, x2, y2);
         r1=r/4;
         g.setColor(cl); 
         float b=360/(v);
         for (float i=0;i<360;i+=b){
         g.drawLine((int)(x1+(r1+elipce)*cos(toRadians(i))), (int)(y1+(r1)*sin(toRadians(i))),(int)x1,(int)y1);
  Ecuacion_Circulo(g,(x1+((r1/2)+r1+elipce)*cos(toRadians(i))),
         (y1+(((r1/2)+r1))*sin(toRadians(i))),       
         (x1+((r1*2+elipce))*cos(toRadians(i))),
         (y1+(((r1*2)))*sin(toRadians(i))),i+180, i+360, 0);
 
    g.drawLine((int)(x1+(r1*2+elipce)*cos(toRadians(i))), (int)(y1+(r1*2)*sin(toRadians(i))),
          (int)(x1+(r1*3+elipce)*cos(toRadians(i))), (int)(y1+(r1*3)*sin(toRadians(i))));
  Ecuacion_Circulo(g,(x1+((r/2)+r1+r1/2+elipce)*cos(toRadians(i))),
         (y1+(((r/2)+r1+r1/2))*sin(toRadians(i))),       
         (x1+((r+elipce))*cos(toRadians(i))),
         (y1+(((r)))*sin(toRadians(i))),i+360, i+540, 0);
         } 
    }                 
}
