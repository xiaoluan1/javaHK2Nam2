
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
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(200,200);
        setTitle("Demo for GUI");
        setLayout(new BorderLayout());
        p1=new JPanel();
        p2=new JPanel();
        p3=new JPanel();
        add(p1,BorderLayout.NORTH);
        add(p2,BorderLayout.CENTER);
        add(p3,BorderLayout.SOUTH);
        l1=new JLabel("Phep tinh so hoc");
        l1.setFont(new Font("arial",Font.BOLD,36));
        l1.setForeground(Color.BLUE);
        p1.add(l1);
        p2.setLayout(new GridLayout(3,2));
        l2=new JLabel("So thu 1:");
        l3=new JLabel("So thu 2:");
        l4=new JLabel("Ket qua:");
        t1=new JTextField();
        t2=new JTextField();
        t1.setColumns(15);
        p2.add(l2);
        p2.add(t1);
        p2.add(l3);
        p2.add(t2);
        p2.add(l4);
        b1=new JButton("Lam lai");
        b2=new JButton("thoat");
        cb=new JComboBox();
        cb.addItem("+");
        cb.addItem("-");
        cb.addItem("x");
        cb.addItem(":");
        b1.setPreferredSize(new Dimension(150,30));
        b2.setPreferredSize(new Dimension(150,30));
        cb.setPreferredSize(new Dimension(150,30));
        
        p3.add(b1);
        p3.add(cb);
        p3.add(b2);
        Font f=new Font("Times new roman",Font.PLAIN,26);
        l2.setFont(f);
        l3.setFont(f);
        l4.setFont(f);
        t1.setFont(f);
        t2.setFont(f);
        b1.setFont(f);
        b2.setFont(f);
        cb.setFont(f);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t1.setText("");
                t2.setText("");
                t1.requestFocus();
            }
        });
        b2.addActionListener(this);
        cb.addActionListener(this);
        b1.setEnabled(false);
        cb.setEnabled(false);
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
            t1.requestFocus();
        }
        if(e.getSource()==b2){
            int c=JOptionPane.showConfirmDialog(null,
                    "Co thoat khong?","thoat",JOptionPane.YES_NO_OPTION);
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
                case 3:if(n2==0){
                         st="Khong chia cho 0";
                       }else
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
        if(!tt1.isEmpty()||!tt2.isEmpty())
            b1.setEnabled(true);
        else
            b1.setEnabled(false);
        if(!tt1.isEmpty() && !tt2.isEmpty() &&
                 tt1.matches("\\d+")&&tt2.matches("\\d+"))
            cb.setEnabled(true);
        else
            cb.setEnabled(false);
    }
    @Override
    public void changedUpdate(DocumentEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
