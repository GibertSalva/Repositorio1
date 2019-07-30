/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package grafico;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author salvagibert
 */
public class login{
    
    
    JTextField username = new JTextField();
    JTextField password = new JPasswordField();
    Object[] message = {
    "Username:", username,
    "Password:", password
};
    
    public login(){
        Iniciar();
    }
    
    private void Iniciar() {
    
    

            
int option = JOptionPane.showConfirmDialog(null, message, "Login", JOptionPane.OK_CANCEL_OPTION);
if (option == JOptionPane.OK_OPTION) {
    if (username.getText().equals("hola") && password.getText().equals("hola")) {
        partefuncional p1 = new partefuncional();
        System.out.println("Login successful");
    } else {
        System.out.println("login failed"); 
    }
} else {
    System.out.println("Login canceled");
}
    }
    
}    

