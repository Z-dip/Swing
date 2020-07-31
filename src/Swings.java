import javax.swing.*;
import java.awt.*;



class gui extends JFrame {
    public gui() {
        super("gui testing");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 300);
        setLocationRelativeTo(null);

        initComponents();

        setLayout(null);
        setVisible(true);

    }

    private void initComponents() {
        JLabel jLabel1 = new JLabel("Put your name");
        jLabel1.setBounds(40, 20, 100, 30);
        add(jLabel1);

        JTextField jTextField1 = new JTextField();
        jTextField1.setBounds(140, 20, 120, 30);
        add(jTextField1);

        JPanel redPanel = new JPanel();
        redPanel.setBounds(40, 150, 220, 70);
        redPanel.setLayout(new BorderLayout());
        redPanel.setBackground(Color.RED);
        add(redPanel);

        JButton acceptButton1 = new JButton("Accept");
        acceptButton1.setBounds(100, 70, 100, 30);
        add(acceptButton1);

        JLabel jLabel2 = new JLabel("Hello,");
        jLabel2.setBounds(30, 0, 100, 30);
        jLabel2.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel2.setHorizontalAlignment(SwingConstants.CENTER);
        add(jLabel2);

        Font font = new Font("Courier", Font.BOLD, 12);
        jLabel2.setFont(font);
        jLabel2.setFont(jLabel2.getFont().deriveFont(16f));

        redPanel.add(jLabel2);

        acceptButton1.addActionListener(e -> {
            String helloText = "Hello";
            String name = jTextField1.getText();
            if (name != null && name.trim().length() > 0) {
                helloText += String.format(", %s", name);
            }
            jLabel2.setText(helloText);
        });
    }
}

class Main {

    public static void main(String[] args) {
        new gui();
    }
}




