import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaLogin extends JFrame {

    private JTextField campoEmail;
    private JPasswordField campoSenha;
    private JButton botaoLogin;
    private JButton botaoLimpar;

    public TelaLogin() {

        setTitle("Tela de Login");
        setSize(350, 220);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(5, 1, 10, 10));

        JLabel labelEmail = new JLabel("E-mail:");
        campoEmail = new JTextField();

        JLabel labelSenha = new JLabel("Senha:");
        campoSenha = new JPasswordField();

        botaoLogin = new JButton("Login");
        botaoLimpar = new JButton("Limpar");

        // Painel Email
        JPanel painelEmail = new JPanel(new BorderLayout());
        painelEmail.add(labelEmail, BorderLayout.NORTH);
        painelEmail.add(campoEmail, BorderLayout.CENTER);

        // Painel Senha
        JPanel painelSenha = new JPanel(new BorderLayout());
        painelSenha.add(labelSenha, BorderLayout.NORTH);
        painelSenha.add(campoSenha, BorderLayout.CENTER);

        // Painel Botões
        JPanel painelBotoes = new JPanel();
        painelBotoes.add(botaoLogin);
        painelBotoes.add(botaoLimpar);

        add(new JLabel("LOGIN", SwingConstants.CENTER));
        add(painelEmail);
        add(painelSenha);
        add(painelBotoes);

        // Ação do botão Login
        botaoLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String email = campoEmail.getText();
                String senha = new String(campoSenha.getPassword());

                // Verificar campos vazios
                if (email.isEmpty() || senha.isEmpty()) {
                    JOptionPane.showMessageDialog(null,
                            "Preencha todos os campos!");
                }

                // Validar login
                else if (email.equals("admin@senai.com") &&
                        senha.equals("123456")) {

                    JOptionPane.showMessageDialog(null,
                            "Login realizado com sucesso!");
                }

                else {
                    JOptionPane.showMessageDialog(null,
                            "E-mail ou senha inválidos!");
                }
            }
        });

        // Ação do botão Limpar
        botaoLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                campoEmail.setText("");
                campoSenha.setText("");
            }
        });
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }
}