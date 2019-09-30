/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import principal.arraylistcomidacolecciones;
import principal.interfazclasecomidacolecciones;

public class listarComidaColecciones extends JFrame implements ActionListener{
    
JTextArea respuesta;    
JLabel lbltitulo;
JScrollPane scroll;
JButton btnlistar, btnatras;
Panel36 panel;
arraylistcomidacolecciones ac=new arraylistcomidacolecciones();

    public listarComidaColecciones(){
        this.setTitle("LISTA COMIDA.EXE");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setBounds(400,150,300,400);
        componentes();
    }
    
    void componentes(){
        panel();
        label();
        textarea();
        boton();
    }
    
    void panel(){
        panel=new Panel36();
        panel.setLayout(null);
        setContentPane(panel);
    }
    
    void textarea(){
        respuesta=new JTextArea("");
        respuesta.setEditable(false);
        scroll=new JScrollPane(respuesta);
        scroll.setBounds(15, 100, 265, 250);
        panel.add(scroll);
    }
    
    void label(){
        lbltitulo=new JLabel("LISTA COMIDA");
        lbltitulo.setBounds(65, 30, 200, 20);
        lbltitulo.setFont(new Font("Arial Black",1,18));
        lbltitulo.setForeground(Color.yellow);
        panel.add(lbltitulo);
    }
    
    void boton(){
        btnlistar=new JButton("Listar");
        btnlistar.setBounds(45, 60, 100, 20);
        panel.add(btnlistar);
        btnlistar.addActionListener(this);
        
        btnatras=new JButton("Atras");
        btnatras.setBounds(155, 60, 100, 20);
        panel.add(btnatras);
        btnatras.addActionListener(this);
    }
    
    public static void main(String[] args) {
        listarComidaColecciones li=new listarComidaColecciones();
        li.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
        if(e.getSource() == btnlistar){
            String cad="Codigo\tComida\tPrecio\n\n";
            respuesta.setText(cad+ac.listar());
        }
        
        if(e.getSource() == btnatras){
            interfazclasecomidacolecciones in=new interfazclasecomidacolecciones();
            in.setVisible(true);
            this.dispose();
        }
        
    }
    
}

class Panel36 extends JPanel{
   private Image fondo; 
   public Panel36(){
       preInit();
       
   }

   private void preInit(){
       fondo=new ImageIcon("src/imagenes/logo-belladurmiente.png").getImage();
   }
   
   @Override
   public void paint(Graphics g){
      
         g.drawImage(fondo,0,0,getWidth(),getHeight(),this);
          setOpaque(false);    
      super.paint(g);  //hace que tu fondo no perjudique tus otras funciones
   }
}