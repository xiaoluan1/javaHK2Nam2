/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class Main extends JFrame 
     implements ActionListener,DocumentListener{
    private JPanel p1,p2,p3;
    private JLabel l1,l2,l3,l4;
    private JTextField t1,t2;
    private JButton b1,b3;
    private JComboBox cb;
    
    public Main(){
        initGUI();
    }
    private void initGUI(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Chuong trinh dau tien");
        setLocation(200,200);
        p1=new JPanel();
        p2=new JPanel();
        p3=new JPanel();
        setLayout(new BorderLayout());
        add(p1,BorderLayout.NORTH);
        add(p2,BorderLayout.CENTER);
        add(p3,BorderLayout.SOUTH);
        l1=new JLabel("Phep tinh so hoc");
        l1.setFont(new Font("Calibri",Font.BOLD,34));
        l1.setForeground(Color.BLUE);
        p1.add(l1);
        p2.setLayout(new GridLayout(3,2));
        l2=new JLabel("So 1:");
        l3=new JLabel("so 2:");
        t1=new JTextField();
        t1.setColumns(20);
        t2=new JTextField();
        l4=new JLabel("Ket qua:");
        p2.add(l2);
        p2.add(t1);
        p2.add(l3);
        p2.add(t2);
        p2.add(l4);
        b1=new JButton("Lam lai");
        cb=new JComboBox();
        cb.addItem("+");
        cb.addItem("-");
        cb.addItem("x");
        cb.addItem(":");
        b3=new JButton("Thoat");
        b1.setPreferredSize(new Dimension(150,30));
        b3.setPreferredSize(new Dimension(150,30));
        cb.setPreferredSize(new Dimension(150,30));
        p3.add(b1);
        p3.add(cb);
        p3.add(b3);
        Font f=new Font("Times new roman",Font.PLAIN,22);
        l2.setFont(f);
        l3.setFont(f);
        l4.setFont(f);
        t1.setFont(f);
        t2.setFont(f);
        b1.setFont(f);
        b3.setFont(f);
        cb.setFont(f);
        b1.setEnabled(false);
        cb.setEnabled(false);
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int c=JOptionPane.showConfirmDialog(null,
                        "co thoat khong?","Thoat",
                        JOptionPane.YES_NO_OPTION);
                if(c==JOptionPane.YES_OPTION)
                    System.exit(0);
                
            }
        });
        b1.addActionListener(this);
        cb.addActionListener(this);
        t1.getDocument().addDocumentListener(this);
        t2.getDocument().addDocumentListener(this);
        pack();
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            t1.setText("");
            t2.setText("");
            t1.requestFocus();//dua con tro ve t1
        }
        if(e.getSource()==b3){
            int c=JOptionPane.showConfirmDialog(null,
                        "co thoat khong?","Thoat",
                        JOptionPane.YES_NO_OPTION);
                if(c==JOptionPane.YES_OPTION)
                    System.exit(0);
        }
        if(e.getSource()==cb){
            int n1=Integer.parseInt(t1.getText());
            int n2=Integer.parseInt(t2.getText());
            int op=cb.getSelectedIndex();
            String st="";
            switch(op){
                case 0:st="Tong:"+(n1+n2);
                    break;
                case 1:st="Hieu:"+(n1-n2);
                    break;
                case 2:st="Tich:"+(n1*n2);
                    break;
                case 3:if(n2==0)
                         st="khong chia cho 0";
                       else
                         st="Thuong:"+(n1/n2);
                    break;    
            }
            l4.setText(st);
            
        }
    }

    @Override
    public void insertUpdate(DocumentEvent e) {
        check();
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        check();
    }
    private void check(){
        String tt1=t1.getText();
        String tt2=t2.getText();
        if(!tt1.isEmpty() || !tt2.isEmpty()){
            b1.setEnabled(true);
        }else
            b1.setEnabled(false);
        if(!tt1.isEmpty()&&!tt2.isEmpty()&&tt1.matches("\\d+")&&tt2.matches("\\d+")){
            cb.setEnabled(true);
        }else
            cb.setEnabled(false);
    }
    @Override
    public void changedUpdate(DocumentEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
