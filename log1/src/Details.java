import javax.swing.*;
import java.awt.*;

public class Details extends JFrame{
    private JLabel lblFirstName,lblSecondName,lblEmail,lblPassword,lblConfirmPassword;
    private JTextField txtFirstname,txtSecondName,txtEmail;
    private JPasswordField pwdPassword, pwdConfirmPassword;
    private String firstName,secondName,email,password,confirmPassword;
    private JButton btnSave;
    public Details(){
        this.firstName=firstName;
        this.secondName=secondName;
        this.email=email;
        this.password=password;
        this.confirmPassword=confirmPassword;
        lblFirstName=new JLabel("first Name");
        lblSecondName=new JLabel("Second Name");
        lblEmail=new JLabel("Email");
        lblPassword=new JLabel("Password");
        lblConfirmPassword=new JLabel("confirm Password");
        txtFirstname=new JTextField(20);
        txtSecondName=new JTextField(20);
        txtEmail=new JTextField(20);
        pwdPassword=new JPasswordField(9);
        pwdConfirmPassword=new JPasswordField(9);
        btnSave=new JButton("Save Details");
        JPanel p=new JPanel();
        p.setLayout(new GridLayout(6,2));
        p.add(lblFirstName);
        p.add(txtFirstname);
        p.add(lblSecondName);
        p.add(txtSecondName);
        p.add(lblEmail);
        p.add(txtEmail);
        p.add(lblPassword);
        p.add(pwdPassword);
        p.add(lblConfirmPassword);
        p.add(pwdConfirmPassword);
        p.add(btnSave);
       // p.setBackground(Color.DARK_GRAY);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300,200);
        add(p);

    }

}

