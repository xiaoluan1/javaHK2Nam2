/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Ex;
import controller.IOFile;
import controller.exception.StringNull;
import controller.exception.ValidateException;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Phong;

/**
 *
 * @author TGDD
 */
public class ViewP extends javax.swing.JPanel {

    /**
     * Creates new form ViewP
     */
    private DefaultTableModel tm;
    private Boolean them, sua;
    private String file;
    public ViewP() {
        initComponents();
        setSize(900, 700);
        String col[] = {"Mã phòng", "Tên phòng", "Số máy tính", "Kiểu phòng"};
        tm = new DefaultTableModel(col, 0);
        file = IOFile.fileP();
        jTable1.setModel(tm);
        them = false;
        sua = false;
        buttonTrue();
    }
    
    private void buttonTrue(){
        btThem.setEnabled(true);
        btSua.setEnabled(true);
        btBoQua.setEnabled(false);
        btCapNhat.setEnabled(false);
    }
    private void buttonFalse(){
        btThem.setEnabled(false);
        btSua.setEnabled(false);
        btBoQua.setEnabled(true);
        btCapNhat.setEnabled(true);
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btThem = new javax.swing.JButton();
        btCapNhat = new javax.swing.JButton();
        btBoQua = new javax.swing.JButton();
        btSua = new javax.swing.JButton();
        btLuu = new javax.swing.JButton();
        btHien = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtMa = new javax.swing.JTextField();
        jtTen = new javax.swing.JTextField();
        jtSoM = new javax.swing.JTextField();
        jbKieu = new javax.swing.JComboBox();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btThem.setText("Thêm");
        btThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemActionPerformed(evt);
            }
        });

        btCapNhat.setText("Cập nhật");
        btCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCapNhatActionPerformed(evt);
            }
        });

        btBoQua.setText("Bỏ qua");
        btBoQua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBoQuaActionPerformed(evt);
            }
        });

        btSua.setText("Sửa");
        btSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSuaActionPerformed(evt);
            }
        });

        btLuu.setText("Lưu vào file");
        btLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLuuActionPerformed(evt);
            }
        });

        btHien.setText("Hiển thị danh sách");
        btHien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHienActionPerformed(evt);
            }
        });

        jLabel1.setText("Mã phòng");

        jLabel2.setText("Tên phòng");

        jLabel3.setText("Số máy tính");

        jLabel4.setText("Kiểu phòng");

        jtMa.setEditable(false);

        jbKieu.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Phòng thực hành mạng", "Phòng thực hành vi xử lý", "Phòng thực hành lập trình" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtMa)
                    .addComponent(jtTen)
                    .addComponent(jtSoM)
                    .addComponent(jbKieu, 0, 178, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btThem)
                    .addComponent(btSua))
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btCapNhat)
                    .addComponent(btLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btBoQua)
                    .addComponent(btHien, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jtSoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jbKieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btThem)
                    .addComponent(btCapNhat)
                    .addComponent(btBoQua))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSua)
                    .addComponent(btLuu)
                    .addComponent(btHien))
                .addGap(0, 109, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemActionPerformed
        them = true;
        File f = new File(file);
        if(f.exists()){
            List<Phong> list = IOFile.doc(file);
            if(list.size() > 0){
                Phong.setSma(list.get(list.size()-1).getMa()+1);
            }
        }
        jtMa.setText(Phong.getSma()+"");
        jtTen.requestFocus();
        buttonFalse();
    }//GEN-LAST:event_btThemActionPerformed

    private void btBoQuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBoQuaActionPerformed
        buttonTrue();
    }//GEN-LAST:event_btBoQuaActionPerformed

    private void btHienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHienActionPerformed
        List<Phong> list = IOFile.doc(file);
        tm.setRowCount(0);
        for(Phong i : list){
            tm.addRow(i.toObjects());
        }
    }//GEN-LAST:event_btHienActionPerformed

    private void btLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLuuActionPerformed
        List<Phong> list = new ArrayList<>();
        for(int i = 0;i < tm.getRowCount(); i++){
            int ma = Integer.parseInt(tm.getValueAt(i, 0).toString());
            String ten = tm.getValueAt(i, 1).toString();
            int soM = Integer.parseInt(tm.getValueAt(i, 2).toString());
            String kieu = tm.getValueAt(i, 3).toString();
            Phong p = new Phong(ma, ten, soM, kieu);
            list.add(p);
        }
        IOFile.viet(file, list);
    }//GEN-LAST:event_btLuuActionPerformed

    private void btSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuaActionPerformed
        int r = jTable1.getSelectedRow();
        if(r < 0 || r >= tm.getRowCount()){
            JOptionPane.showMessageDialog(this, "Chọn dòng để sửa!");
        }
        else{
            sua = true;
            buttonFalse();
            jtMa.setText(tm.getValueAt(r, 0).toString());
            jtTen.setText(tm.getValueAt(r, 1).toString());
            jtSoM.setText(tm.getValueAt(r, 2).toString());
            jbKieu.setSelectedItem(tm.getValueAt(r, 3).toString());
        }
    }//GEN-LAST:event_btSuaActionPerformed

    private void btCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCapNhatActionPerformed
        if(them){
            try{   
                Ex.checkString(jtTen.getText());
                Ex.checkString(jtSoM.getText());
                Ex.validateName(jtTen.getText());
                Ex.validateNum(jtSoM.getText());
                Phong p = new Phong();
                int ma = Integer.parseInt(jtMa.getText());
                String ten = jtTen.getText();
                String kieu = jbKieu.getSelectedItem().toString();
                int soM = Integer.parseInt(jtSoM.getText());
                p.setMa(ma);
                p.setTen(ten);
                p.setSoM(soM);
                p.setKieu(kieu);
                tm.addRow(p.toObjects());
                them = false;
                buttonTrue();
            } catch(StringNull ex){
                JOptionPane.showMessageDialog(this, "Không được để trống thông tin22!");
            } catch(ValidateException ex){
                JOptionPane.showMessageDialog(this, "Sai định dạng dữ liệu!");
            } catch(NumberFormatException ex){
                System.out.println(ex);
            } 
        }
        if(sua){
            try{
                Ex.checkString(jtTen.getText());
                Ex.validateName(jtTen.getText());
                Ex.validateNum(jtSoM.getText());
                String ten = jtTen.getText();  
                String kieu = jbKieu.getSelectedItem().toString();
                int r = jTable1.getSelectedRow();
                int soM = Integer.parseInt(jtSoM.getText());
                tm.setValueAt(ten, r, 1);
                tm.setValueAt(soM+"", r, 2);
                tm.setValueAt(kieu, r, 3);
                sua = false;
                buttonTrue();
            }catch(StringNull ex){
                JOptionPane.showMessageDialog(this, "Không được để trống thông tin22!");
                System.out.println(ex);
            } catch(ValidateException ex){
                JOptionPane.showMessageDialog(this, "Sai định dạng dữ liệu!");
                System.out.println(ex);
            } catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(this, "Xin nhập lại!");
                System.out.println(ex);
            } 
        }
    }//GEN-LAST:event_btCapNhatActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBoQua;
    private javax.swing.JButton btCapNhat;
    private javax.swing.JButton btHien;
    private javax.swing.JButton btLuu;
    private javax.swing.JButton btSua;
    private javax.swing.JButton btThem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox jbKieu;
    private javax.swing.JTextField jtMa;
    private javax.swing.JTextField jtSoM;
    private javax.swing.JTextField jtTen;
    // End of variables declaration//GEN-END:variables
    
}

