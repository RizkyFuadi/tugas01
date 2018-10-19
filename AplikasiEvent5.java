
package Tugas01;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class AplikasiEvent5 extends JFrame{
JLabel lblnickname=new JLabel("Nickname");    
JTextField txnickname=new JTextField(20);   
JLabel lblPassword=new JLabel("Password"); 
//
    JTextField txPassword=new JTextField(7);    
JLabel lblGender=new JLabel("Gender");  
  JRadioButton Man=new JRadioButton("Man");  
  //
  JRadioButton Woman=new JRadioButton("Woman");   
 ButtonGroup kelompok=new ButtonGroup(); 
   JLabel lblGameCharacter=new JLabel("GameCharacter");  
   //
JCheckBox DVa=new JCheckBox("DVa Overwacth");    
JCheckBox Mercy=new JCheckBox("Mercy Overwacth");    
JCheckBox Tracer=new JCheckBox("Tracer Overwacth");    
JButton cetak=new JButton("Cetak");    
JTextArea hasil=new JTextArea(); 

AplikasiEvent5()  
{       
setTitle("Event Sederhana");       
setLocation(300,100);       
setSize(300,320);       
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    }

void KomponenVisual()   
{ 
  getContentPane().setLayout(null);      
 getContentPane().add(lblnickname);     
  lblnickname.setBounds(10,10,80,20);      
 getContentPane().add(txnickname);     
txnickname.setBounds(105,10,175,20);       
getContentPane().add(lblPassword);      
lblPassword.setBounds(10,33,80,20);       
getContentPane().add(txPassword);      
 txPassword.setBounds(105,33,70,20);       
getContentPane().add(lblGender);       
lblGender.setBounds(10,56,80,20);       
kelompok.add(Man);       
kelompok.add(Woman);       
getContentPane().add(Man);       
Man.setBounds(105,56,50,20);   
getContentPane().add(Woman);  
      Woman.setBounds(160,56,70,20);       
getContentPane().add(lblGameCharacter);       
lblGameCharacter.setBounds(10,80,100,20);       
getContentPane().add(DVa);      
DVa .setBounds(105,80,150,20);       
getContentPane().add(Mercy);       
Mercy.setBounds(105,103,150,20);      
getContentPane().add(Tracer);       
Tracer.setBounds(105,126,150,20);       
getContentPane().add(cetak);       
cetak.setBounds(10,150,270,20);       
getContentPane().add(hasil);       
hasil.setBounds(10,180,270,100);       
setVisible(true); 
}
void AksiReaksi()    
{       
 cetak.addActionListener(new ActionListener()       
{          
public void actionPerformed(ActionEvent e)          
{             
hasil.append(txnickname.getText()+"\n");             
hasil.append(txPassword.getText()+"\n");             
if(Man.isSelected()==true)             
{                
hasil.append(Man.getText()+"\n");             
}             
else             
{                
hasil.append(Woman.getText()+"\n");             
} 
 
if(DVa.isSelected()==true)             
{                
hasil.append(DVa.getText()+"\n");             
}             
if(Mercy.isSelected()==true)             
{                
hasil.append(Mercy.getText()+"\n");             
}             
if(Tracer.isSelected()==true)             
{                
hasil.append(Tracer.getText()+"\n");             
} 

         }
       });    
} 
 
   public static void main(String args[])    
{       
AplikasiEvent5 e5=new AplikasiEvent5();       
e5.KomponenVisual();       
e5.AksiReaksi();      
}
}


