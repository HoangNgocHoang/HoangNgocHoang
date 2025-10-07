package CyberHubManagementSystem;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

public class NetCafeUI {

    private JFrame frame;
    private JTable table;
    private DefaultTableModel model;

    // 🔹 RoundedButton custom
    static class RoundedButton extends JButton {

        public RoundedButton(String text) {
            super(text);
            setFocusPainted(false);
            setContentAreaFilled(false);
        }

        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(getModel().isArmed() ? Color.DARK_GRAY : getBackground());
            g2.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);
            super.paintComponent(g2);
            g2.dispose();
        }
    }

    public NetCafeUI() {
        try {
            // 🔹 Dark mode LookAndFeel (Nimbus)
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        frame = new JFrame("Net Cafe Management");
        frame.setSize(950, 550);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 🔹 Table
        String[] cols = {"ID", "Name", "Phone", "Start", "End", "Type", "Extra", "Fee"};
        model = new DefaultTableModel(cols, 0);
        table = new JTable(model);
        table.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        table.setRowHeight(28);
        table.setSelectionBackground(new Color(100, 150, 255));
        table.setGridColor(Color.GRAY);
        JScrollPane scrollPane = new JScrollPane(table);

        // 🔹 Buttons
        JPanel buttonPanel = new JPanel();
        String[] btnLabels = {"Add", "Remove", "Display", "Calculate Fee", "Find", "Statistics"};
        Color[] btnColors = {Color.GREEN, Color.RED, Color.CYAN, Color.ORANGE, Color.MAGENTA, Color.LIGHT_GRAY};

        for (int i = 0; i < btnLabels.length; i++) {
            RoundedButton btn = new RoundedButton(btnLabels[i]);
            Color btnColor = btnColors[i]; // ✅ dùng biến riêng
            btn.setBackground(btnColor);
            btn.setForeground(Color.BLACK);

            // Hover effect
            btn.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent evt) {
                    btn.setBackground(btn.getBackground().darker());
                }

                @Override
                public void mouseExited(MouseEvent evt) {
                    btn.setBackground(btnColor);
                }
            });

            buttonPanel.add(btn);
        }

        // 🔹 Input Panel
        JPanel inputPanel = new JPanel(new GridLayout(7, 2, 5, 5));
        inputPanel.setBorder(BorderFactory.createTitledBorder("Customer Info"));
        JTextField txtId = new JTextField();
        JTextField txtName = new JTextField();
        JTextField txtPhone = new JTextField();
        JTextField txtEnd = new JTextField(); // HH:mm
        JComboBox<String> cboType = new JComboBox<>(new String[]{"Gaming", "Normal"});
        JTextField txtExtra = new JTextField();

        inputPanel.add(new JLabel("Computer ID:"));
        inputPanel.add(txtId);
        inputPanel.add(new JLabel("Customer Name:"));
        inputPanel.add(txtName);
        inputPanel.add(new JLabel("Phone:"));
        inputPanel.add(txtPhone);
        inputPanel.add(new JLabel("End Time (HH:mm):"));
        inputPanel.add(txtEnd);
        inputPanel.add(new JLabel("Type:"));
        inputPanel.add(cboType);
        inputPanel.add(new JLabel("GPU/RAM:"));
        inputPanel.add(txtExtra);

        // 🔹 Layout
        frame.setLayout(new BorderLayout(10, 10));
        frame.add(buttonPanel, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(inputPanel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(NetCafeUI::new);
    }
}
