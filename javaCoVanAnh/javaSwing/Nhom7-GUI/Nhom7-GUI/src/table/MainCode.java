/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package table;


import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class MainCode extends JFrame{
    private JScrollPane p1;
    private JPanel p2;
    private JTable tb;
    private DefaultTableModel tm;
    private JButton b1,b2,b3;
    public MainCode(){
        initGUI();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    private void initGUI(){
        setLayout(new BorderLayout());
        p1=new JScrollPane();
        p2=new JPanel();
        add(p1,BorderLayout.NORTH);
        add(p2,BorderLayout.SOUTH);
        String[] cols={"Ma","Ho ten","Gioi tinh","Tuoi"};
        tm=new DefaultTableModel(cols,0);
        tb=new JTable(tm);
        p1.getViewport().add(tb);
        b1=new JButton("Them moi");
        b2=new JButton("Cap nhat");
        b3=new JButton("Bo qua");
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        pack();
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainCode().setVisible(true);
            }
        });
    }
}
