package CyberHubManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.*;

public class LoginUI {
    private JFrame frame;
    private JTextField txtUser;
    private JPasswordField txtPass;
    private File userFile = new File("users.txt"); // file lưu tài khoản

    public LoginUI() {
        frame = new JFrame("Login - CyberHub Management System");
        frame.setSize(400, 220);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout(10, 10));

        // Input
        JPanel inputPanel = new JPanel(new GridLayout(2, 2, 10, 10));
        inputPanel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        inputPanel.add(new JLabel("Username:"));
        txtUser = new JTextField();
        inputPanel.add(txtUser);
        inputPanel.add(new JLabel("Password:"));
        txtPass = new JPasswordField();
        inputPanel.add(txtPass);

        // Buttons
        JPanel buttonPanel = new JPanel();
        JButton btnLogin = new JButton("Login");
        JButton btnRegister = new JButton("Register");
        buttonPanel.add(btnLogin);
        buttonPanel.add(btnRegister);

        // Action: Login
        btnLogin.addActionListener(e -> {
            String user = txtUser.getText();
            String pass = new String(txtPass.getPassword());
            if (checkLogin(user, pass)) {
                JOptionPane.showMessageDialog(frame, "Login successful!");
                frame.dispose(); // đóng login
                new NetCafeUI(); // mở giao diện chính
            } else {
                JOptionPane.showMessageDialog(frame, "Invalid username or password!");
            }
        });

        // Action: Register
        btnRegister.addActionListener(e -> {
            String user = txtUser.getText();
            String pass = new String(txtPass.getPassword());
            if (user.isEmpty() || pass.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Please enter username and password!");
                return;
            }
            if (addUser(user, pass)) {
                JOptionPane.showMessageDialog(frame, "Register successful!");
            } else {
                JOptionPane.showMessageDialog(frame, "User already exists!");
            }
        });

        frame.add(inputPanel, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    // Kiểm tra đăng nhập
    private boolean checkLogin(String user, String pass) {
        if (!userFile.exists()) return false;
        try (Scanner sc = new Scanner(userFile)) {
            while (sc.hasNextLine()) {
                String[] parts = sc.nextLine().split(",");
                if (parts.length == 2 && parts[0].equals(user) && parts[1].equals(pass)) {
                    return true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    // Đăng ký user mới
    private boolean addUser(String user, String pass) {
        if (userFile.exists() && checkLogin(user, pass)) return false;
        try (FileWriter fw = new FileWriter(userFile, true)) {
            fw.write(user + "," + pass + "\n");
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(LoginUI::new);
    }
}
