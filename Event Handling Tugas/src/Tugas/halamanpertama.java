package Tugas;

import javax.swing.*;
import java.awt.event.*;

class form extends JFrame implements ActionListener {
    String nama, almt, kelamin, hby;
    final JTextField fnama = new JTextField(10);
    JLabel lnama = new JLabel(" Nama Lengkap");
    JLabel lkelamin = new JLabel(" Kelamin");
    JRadioButton laki = new JRadioButton(" Laki-Laki");
    JRadioButton perempuan = new JRadioButton(" Perempuan");
    JLabel hobby = new JLabel(" Hobby");
    JCheckBox hob1 = new JCheckBox(" Main Game PC");
    JCheckBox hob2 = new JCheckBox(" Main Game HP");
    JLabel alamat = new JLabel("Alamat");
    JTextArea alamatt = new JTextArea();
    JScrollPane scroll;
    JButton save = new JButton("Simpan & Tampil");



    public form() {
        setTitle("Beta Test");
        setDefaultCloseOperation(3);
        setSize(400, 300);

        ButtonGroup group = new ButtonGroup();
        group.add(laki);
        group.add(perempuan);

        setLayout(null);
        add(lnama);
        add(fnama);
        add(lkelamin);
        add(laki);
        add(perempuan);
        add(hobby);
        add(hob1);
        add(hob2);
        add(alamat);
        add(alamatt);
        add(save);

        // setBounds(m,n,o,p)
        // m = posisi x; n = posisi n
        // o = panjang komponen; p = tinggi komponen123
        lnama.setBounds(10, 10, 120, 20);
        fnama.setBounds(130, 10, 180, 20);
        lkelamin.setBounds(10, 35, 120, 20);
        laki.setBounds(130, 35, 100, 20);
        perempuan.setBounds(230, 35, 100, 20);
        hobby.setBounds(10, 60, 120, 20);
        hob1.setBounds(130, 60, 100, 20);
        hob2.setBounds(230, 60, 150, 20);
        alamat.setBounds(14, 85, 120, 20);
        alamatt.setBounds(130, 85, 180, 30);
        scroll = new JScrollPane(alamatt);
        add(scroll);
        scroll.setBounds(130, 85, 180, 50);
        save.setBounds(137, 150, 120, 20);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Simpan & Tampil")) {
            nama = fnama.getText();
            almt = alamatt.getText();
            if (laki.isSelected()) {
                kelamin = "Pria";
            } else {
                kelamin = "Wanita";
            }
            if (hob1.isSelected()) {
                hby = "Main Game PC";
            } else if (hob2.isSelected()) {
                hby = "Main Game HP";
            } else if (hob1.isSelected() && hob2.isSelected()) {
                hby = "Main Game PC & HP";
            }

            new output(nama, almt, kelamin, hby).setVisible(true);
        }
        else {
            dispose();
        }
    }
}


public class halamanpertama {
    public static void main(String[] args) {
        form form = new form();
        }
    }
