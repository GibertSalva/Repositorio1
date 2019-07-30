/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafico;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import main.ClienteChat;

/**
 *
 * @author salvagibert
 */
public class partefuncional extends JFrame {
    
    public partefuncional (){
        Iniciar();
        IniciarComponentes();
        setVisible(true);
        
    }
    
    private void Iniciar(){
        this.setTitle("Mi ventana");
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame. EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setResizable(false);
        
    }
    
    private void IniciarComponentes( ){
        JTextArea area =new JTextArea();
        area.setBounds(20, 20, 460, 320);
        area.setEditable(false);
        this.add(area);
        
        JCheckBox box = new JCheckBox();
        box.setText("Agregar al final");
        box.setBounds (20, 345, 500, 30);
        this.add(box);
        
        JButton boton = new JButton();
        boton.setText ("Enviar");
        boton.setBounds (189, 420, 120, 30);
        this.add(boton);
        
        JButton boton1 = new JButton();
        boton1.setText ("Borrar");
        boton1.setBounds (359, 420, 120, 30);
        this.add(boton1);
        
        JButton boton2 = new JButton();
        boton2.setText ("Salir");
        boton2.setBounds (20, 420, 120, 30);
        this.add(boton2);
        
        JTextField field = new JTextField();
        field.setBounds (20, 380, 460, 30);
        field.setEditable(true);
        this.add(field);
        ClienteChat chat = new ClienteChat("192.168.61.11","2000", area);
        chat.conectar();

        
        
        
        this.setVisible(true);
                   
                
                
    
        
        boton1.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent ea) {
                int optionpane = JOptionPane
                        .showConfirmDialog(rootPane, "Estas Seguro?", "Cuidado", JOptionPane.YES_NO_OPTION);
                if (optionpane == JOptionPane.YES_OPTION){
             
                area.setText("");
                field.setText("");}
            }
        });
        
        boton2.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent eas) {
            partefuncional.super.dispose();
            login parte2 = new login();
            
                        
                }
                    
        });
                
            boton.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent eas) {
             
                chat.EnviarMensaje("SalvaG: ", field.getText());
                field.setText("");}
                
                    
                

        }); 
        
               
                
                
            }
    }

