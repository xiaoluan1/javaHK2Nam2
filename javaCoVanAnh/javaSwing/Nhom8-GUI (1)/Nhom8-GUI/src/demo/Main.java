
package demo;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
    private JButton b1,b2;
    private JComboBox cb;
    
    public Main(){
        initGUI();
    }
    private void initGUI(){
        setTitle("Chuong trinh dau tien");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(200,300);
        setLayout(new BorderLayout());
        p1=new JPanel();
        p2=new JPanel();
        p3=new JPanel();
        add(p1,BorderLayout.NORTH);
        add(p2,BorderLayout.CENTER);
        add(p3,BorderLayout.SOUTH);
        l1=new JLabel("Phep toan so hoc");
        l1.setFont(new Font("arial",Font.BOLD,36));
        l1.setForeground(Color.BLUE);
        p1.add(l1);
        l2=new JLabel("So thu 1:");
        l3=new JLabel("So thu 2:");
        l4=new JLabel("Ket qua:");
        t1=new JTextField();
        t2=new JTextField();
        Font f=new Font("Times new roman",Font.PLAIN,26);
        l2.setFont(f);
        l3.setFont(f);
        l4.setFont(f);
        t1.setFont(f);
        t2.setFont(f);
        t1.setColumns(15);
        p2.setLayout(new GridLayout(3,2));
        p2.add(l2);
        p2.add(t1);
        p2.add(l3);
        p2.add(t2);
        p2.add(l4);
        b1=new JButton("Lam lai");
        b2=new JButton("Thoat");
        cb=new JComboBox();
        cb.addItem("+");//0
        cb.addItem("-");//1
        cb.addItem("x");//2
        cb.addItem(":");//3
        b1.setPreferredSize(new Dimension(150,30));
        b2.setPreferredSize(new Dimension(150,30));
        cb.setPreferredSize(new Dimension(150,30));
        b1.setFont(f);
        b2.setFont(f);
        cb.setFont(f);
        p3.add(b1);
        p3.add(cb);
        p3.add(b2);
        
        pack();
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int c=JOptionPane.showConfirmDialog(null,
                        "Co thoat hay khong?","thoat",
                        JOptionPane.YES_NO_OPTION);
                if(c==JOptionPane.YES_OPTION)
                    System.exit(0);
            }
        });
        b1.addActionListener(this);
        cb.addActionListener(this);
        b1.setEnabled(false);
        cb.setEnabled(false);
        t1.getDocument().addDocumentListener(this);
        t2.getDocument().addDocumentListener(this);
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
            t1.requestFocus();
        }
        if(e.getSource()==cb){
            int n1=Integer.parseInt(t1.getText());
            int n2=Integer.parseInt(t2.getText());
            int c=cb.getSelectedIndex();
            String rs="";
            switch(c){
                case 0:rs="SUM:"+(n1+n2);
                    break;
                case 1:rs="Sub:"+(n1-n2);
                    break;
                case 2:rs="Product:"+(n1*n2);
                    break;
                case 3:if(n2==0){
                    rs="not divide by zero";
                }else
                    rs="Divide:"+(n1/n2);
                    break;    
            }
            l4.setText(rs);
        }
        if(e.getSource()==b2){
            int c=JOptionPane.showConfirmDialog(null,
                        "Co thoat hay khong?","thoat",
                        JOptionPane.YES_NO_OPTION);
                if(c==JOptionPane.YES_OPTION)
                    System.exit(0);
        }
    }

    @Override
    public void insertUpdate(DocumentEvent e) {
        check();
    }
    private void check(){
        String s1=t1.getText();
        String s2=t2.getText();
        if(!s1.isEmpty() || !s2.isEmpty()){
            b1.setEnabled(true);
        }else
            b1.setEnabled(false);
        if(!s1.isEmpty() && !s2.isEmpty() && 
                s1.matches("\\d+") && s2.matches("\\d+"))
            cb.setEnabled(true);
        else
            cb.setEnabled(false);
    }
    @Override
    public void removeUpdate(DocumentEvent e) {
        check();
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
