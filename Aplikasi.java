import javax.swing.*;
import java.awt.*;

public class Aplikasi {

    public static void main(String[] args){
        JFrame frame = new JFrame("halo");
        frame.setSize(300, 200);

        JLabel lblNama = new JLabel();
        lblNama.setText("Yogi Irwan Rizky Saputra");
        frame.add(lblNama, BorderLayout.WEST);

        JLabel lblNim = new JLabel();
        lblNim.setText("17090007");

        JLabel lblKelas = new JLabel();
        lblKelas.setText("4D");

        JButton btnSimpan = new JButton("Simpan");
        frame.add(btnSimpan, BorderLayout.EAST);

        JPanel westPanel = new JPanel();
        westPanel.setLayout(new GridLayout(3,1));
        frame.add(westPanel, BorderLayout.WEST);
        westPanel.add(lblNama);
        westPanel.add(lblNim);

        frame.setVisible(true);


    }
}
