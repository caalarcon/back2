import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class Main {

    public static void main(String[] args) {

        JFrame tela = new JFrame("Cadastro de Doação");
        tela.setSize(600, 600);
        tela.setLayout(null);


        JLabel labelNome = new JLabel("Nome");
        labelNome.setBounds(20, 20, 150, 40);
        tela.add(labelNome);

        JTextField nome = new JTextField();
        nome.setBounds(20, 50, 250, 40);
        tela.add(nome);


        JLabel labelIdade = new JLabel("Idade");
        labelIdade.setBounds(20, 100, 150, 40);
        tela.add(labelIdade);

        JTextField idade = new JTextField();
        idade.setBounds(20, 130, 250, 40);
        tela.add(idade);


        JLabel labelTipo = new JLabel("Tipo");
        labelTipo.setBounds(20, 180, 150, 40);
        tela.add(labelTipo);

        String[] tipos = {
                "Cachorro",
                "Gato",
                "Papagaio",
                "Chinchila"
        };

        JComboBox tipo = new JComboBox(tipos);
        tipo.setBounds(20, 210, 250, 40);
        tela.add(tipo);


        JLabel labelRaca = new JLabel("Raça");
        labelRaca.setBounds(20, 260, 150, 40);
        tela.add(labelRaca);

        JTextField raca = new JTextField();
        raca.setBounds(20, 290, 250, 40);
        tela.add(raca);


        JLabel labelEndereco = new JLabel("Endereço");
        labelEndereco.setBounds(20, 340, 150, 40);
        tela.add(labelEndereco);

        JTextField endereco = new JTextField();
        endereco.setBounds(20, 370, 250, 40);
        tela.add(endereco);


        JLabel labelTelefone = new JLabel("Telefone");
        labelTelefone.setBounds(20, 420, 150, 40);
        tela.add(labelTelefone);

        JTextField telefone = new JTextField();
        telefone.setBounds(20, 450, 250, 40);
        tela.add(telefone);


        JButton cadastrar = new JButton("Cadastrar");
        cadastrar.setBounds(320, 210, 150, 40);
        tela.add(cadastrar);

        cadastrar.addActionListener(e -> {

            String sql = "INSERT INTO doacao(nome, idade, tipo, raca, endereco, telefone) VALUES (?,?,?,?,?,?)";

            String nomeAnimal = nome.getText();
            String idadeAnimal = idade.getText();
            String tipoAnimal = tipo.getSelectedItem().toString();
            String racaAnimal = raca.getText();
            String enderecoPessoa = endereco.getText();
            String telefonePessoa = telefone.getText();

            try {

                Connection conexao = Conexao.conectar();

                if (conexao == null) {

                    JOptionPane.showMessageDialog(null, "Erro na conexão com o banco!");
                    return;

                }

                PreparedStatement ps = conexao.prepareStatement(sql);

                ps.setString(1, nomeAnimal);
                ps.setString(2, idadeAnimal);
                ps.setString(3, tipoAnimal);
                ps.setString(4, racaAnimal);
                ps.setString(5, enderecoPessoa);
                ps.setString(6, telefonePessoa);

                ps.executeUpdate();

                conexao.close();
                ps.close();

                JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");

            } catch (Exception ex) {

                JOptionPane.showMessageDialog(null, "Erro ao cadastrar!");

            }

        });

        tela.setVisible(true);

    }

}