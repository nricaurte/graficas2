package Menu;
import Figuras.Figura2;
import Figuras.*;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.JColorChooser;
public class MenuFiguras extends javax.swing.JFrame {
    public MenuFiguras() {
        initComponents();     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Grup = new javax.swing.ButtonGroup();
        Clear = new javax.swing.JButton();
        ColFond = new javax.swing.JButton();
        ColLin = new javax.swing.JButton();
        Btnfig1 = new javax.swing.JButton();
        Btnfig2 = new javax.swing.JButton();
        Btnfig3 = new javax.swing.JButton();
        Btnfig4 = new javax.swing.JButton();
        Circulo = new javax.swing.JRadioButton();
        Elipce = new javax.swing.JRadioButton();
        Txt_Puntas = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        Clear.setText("Limpiar");
        Clear.setBorderPainted(false);
        Clear.setContentAreaFilled(false);
        Clear.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Clear.setIconTextGap(-3);
        Clear.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Clear.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        ColFond.setText("Fondo_Pantalla");
        ColFond.setBorderPainted(false);
        ColFond.setContentAreaFilled(false);
        ColFond.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ColFond.setIconTextGap(-3);
        ColFond.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        ColFond.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ColFond.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColFondActionPerformed(evt);
            }
        });

        ColLin.setText("Colo de LIneas");
        ColLin.setBorderPainted(false);
        ColLin.setContentAreaFilled(false);
        ColLin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ColLin.setIconTextGap(-3);
        ColLin.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        ColLin.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ColLin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColLinActionPerformed(evt);
            }
        });

        Btnfig1.setBackground(new java.awt.Color(51, 0, 153));
        Btnfig1.setText("Figura1");
        Btnfig1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 0, 153), new java.awt.Color(0, 51, 51)));
        Btnfig1.setBorderPainted(false);
        Btnfig1.setContentAreaFilled(false);
        Btnfig1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Btnfig1.setIconTextGap(-3);
        Btnfig1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Btnfig1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Btnfig1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btnfig1ActionPerformed(evt);
            }
        });

        Btnfig2.setText("Figura2");
        Btnfig2.setBorderPainted(false);
        Btnfig2.setContentAreaFilled(false);
        Btnfig2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Btnfig2.setIconTextGap(-3);
        Btnfig2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Btnfig2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Btnfig2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btnfig2ActionPerformed(evt);
            }
        });

        Btnfig3.setText("Figura3");
        Btnfig3.setBorderPainted(false);
        Btnfig3.setContentAreaFilled(false);
        Btnfig3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Btnfig3.setIconTextGap(-3);
        Btnfig3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Btnfig3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Btnfig3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btnfig3ActionPerformed(evt);
            }
        });

        Btnfig4.setText("Figura4");
        Btnfig4.setBorderPainted(false);
        Btnfig4.setContentAreaFilled(false);
        Btnfig4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Btnfig4.setIconTextGap(-3);
        Btnfig4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Btnfig4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Btnfig4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btnfig4ActionPerformed(evt);
            }
        });

        Grup.add(Circulo);
        Circulo.setText("Circulo");

        Grup.add(Elipce);
        Elipce.setText("Elipce");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Btnfig2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Btnfig1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(Circulo)
                                .addGap(18, 18, 18)
                                .addComponent(Elipce)
                                .addGap(26, 26, 26)
                                .addComponent(Txt_Puntas, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Btnfig3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Btnfig4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(8, 8, 8)
                                    .addComponent(ColFond)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(Clear))
                                .addComponent(ColLin)))
                        .addGap(596, 1393, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(Btnfig1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Circulo)
                            .addComponent(Elipce)
                            .addComponent(Txt_Puntas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Btnfig2)
                .addGap(29, 29, 29)
                .addComponent(Btnfig3)
                .addGap(18, 18, 18)
                .addComponent(Btnfig4)
                .addGap(30, 30, 30)
                .addComponent(ColFond)
                .addGap(18, 18, 18)
                .addComponent(ColLin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Clear)
                .addContainerGap(333, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 ArrayList <Point> Graficar =new ArrayList <> ();
 int Opcion_Figura;
 int Numero_de_Puntas; 
 int Elipce_o_Circulo;
 Color Color_fundo,Color_Linea;
    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
           if(Circulo.isSelected()){Elipce_o_Circulo=1;
           }else if(Elipce.isSelected()){ Elipce_o_Circulo=2;} 
        
        Graphics g=this.getGraphics();
        Graficar.add(new Point (evt.getX(),evt.getY()));
        
        Figura4 f4=new Figura4();         Figura2 f2=new Figura2();
        Figura1 f1=new Figura1();         Figura3 f3=new Figura3();
        
        if(Graficar.size()>1){
        switch(Opcion_Figura){
        case 1:
        Numero_de_Puntas=Integer.parseInt(Txt_Puntas.getText());
        f1.Figura1(g,Graficar.get(Graficar.size()-2).x,Graficar.get(Graficar.size()-2).y,
        Graficar.get(Graficar.size()-1).x,Graficar.get(Graficar.size()-1).y,Numero_de_Puntas,Color_Linea,Elipce_o_Circulo);
        Graficar.clear();break;
        case 2:
        Numero_de_Puntas=Integer.parseInt(Txt_Puntas.getText());    
        f2.Figura2(g,Graficar.get(Graficar.size()-2).x,Graficar.get(Graficar.size()-2).y,
        Graficar.get(Graficar.size()-1).x,Graficar.get(Graficar.size()-1).y,Numero_de_Puntas,Color_Linea,Elipce_o_Circulo);
        Graficar.clear();break; 
        case 3:
        Numero_de_Puntas=Integer.parseInt(Txt_Puntas.getText());                
        f3.Figura3(g,Graficar.get(Graficar.size()-2).x,Graficar.get(Graficar.size()-2).y, 
        Graficar.get(Graficar.size()-1).x,Graficar.get(Graficar.size()-1).y,Numero_de_Puntas,Color_Linea,Elipce_o_Circulo);
        Graficar.clear();break;    
        case 4:
        Numero_de_Puntas=Integer.parseInt(Txt_Puntas.getText());
        f4.Figura4(g,Graficar.get(Graficar.size()-2).x,Graficar.get(Graficar.size()-2).y,
        Graficar.get(Graficar.size()-1).x,Graficar.get(Graficar.size()-1).y,Numero_de_Puntas,Color_Linea,Elipce_o_Circulo);
        Graficar.clear();break;             
        }
        }
    }//GEN-LAST:event_formMousePressed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        repaint();
        Graficar.clear();
    }//GEN-LAST:event_ClearActionPerformed

    private void ColFondActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColFondActionPerformed
      Color_fundo=JColorChooser.showDialog(null,"Selecione  Color de Fondo",null);
     getContentPane().setBackground( Color_fundo);
    }//GEN-LAST:event_ColFondActionPerformed

    private void Btnfig4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btnfig4ActionPerformed
        Opcion_Figura=4;
    }//GEN-LAST:event_Btnfig4ActionPerformed

    private void Btnfig3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btnfig3ActionPerformed
         Opcion_Figura=3;
    }//GEN-LAST:event_Btnfig3ActionPerformed

    private void Btnfig1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btnfig1ActionPerformed
         Opcion_Figura=1;
    }//GEN-LAST:event_Btnfig1ActionPerformed

    private void Btnfig2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btnfig2ActionPerformed
         Opcion_Figura=2;
    }//GEN-LAST:event_Btnfig2ActionPerformed

    private void ColLinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColLinActionPerformed
         Color_Linea=JColorChooser.showDialog(null,"Selecione  Color de Linea",null);
    }//GEN-LAST:event_ColLinActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuFiguras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btnfig1;
    private javax.swing.JButton Btnfig2;
    private javax.swing.JButton Btnfig3;
    private javax.swing.JButton Btnfig4;
    private javax.swing.JRadioButton Circulo;
    private javax.swing.JButton Clear;
    private javax.swing.JButton ColFond;
    private javax.swing.JButton ColLin;
    private javax.swing.JRadioButton Elipce;
    private javax.swing.ButtonGroup Grup;
    private javax.swing.JTextField Txt_Puntas;
    // End of variables declaration//GEN-END:variables
}
