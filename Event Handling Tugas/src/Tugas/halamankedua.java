package Tugas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class output extends JFrame {
    public output(String nama, String almt, String kelamin, String hby) {
        form form = new form();
        JLabel nama1 = new JLabel(" Nama:");
        JLabel namaa = new JLabel(form.nama);
        JLabel kelamin1 = new JLabel(" Kelamin :");
        JLabel kelaminn = new JLabel(form.kelamin);
        JLabel hobby1 = new JLabel(" Hobby:");
        JLabel hobbyy = new JLabel(form.hby);
        JLabel alamat1 = new JLabel(" Alamat:");
        JLabel alamatt1 = new JLabel(form.almt);
        JScrollPane sekrol;
        JButton exit = new JButton();

        setTitle("Output");
        setSize(400, 300);

        add(nama1);
        add(namaa);
        add(kelamin1);
        add(kelaminn);
        add(hobby1);
        add(hobbyy);
        add(alamat1);
        add(alamatt1);

        nama1.setBounds(10, 10, 120, 20);
        namaa.setBounds(130, 10, 180, 20);
        kelamin1.setBounds(10, 35, 120, 20);
        kelaminn.setBounds(130, 35, 100, 20);
        hobby1.setBounds(10, 60, 120, 20);
        hobbyy.setBounds(130, 60, 100, 20);
        alamat1.setBounds(14, 85, 120, 20);
        alamatt1.setBounds(130, 85, 180, 30);
        sekrol = new JScrollPane(alamatt1);
        add(sekrol);
        sekrol.setBounds(130, 85, 180, 50);
        exit.setBounds(137, 200, 120, 20);
        setVisible(true);
    }
}


