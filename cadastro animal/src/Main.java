import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    JFrame tela = new JFrame("Tela de Cadastro");
    tela.setSize(500, 500);
    tela.setLayout(null);

    JLabel labelNome = new JLabel("Nome");
    labelNome.setBounds(20, 20, 150, 20);
    tela.add(labelNome);

    JTextField nome = new JTextField();
    nome.setBounds(20, 45, 250, 30);
    tela.add(nome);

    JLabel labelIdade = new JLabel("Idade");
    labelIdade.setBounds(20, 85, 150, 20);
    tela.add(labelIdade);

    JTextField idade = new JTextField();
    idade.setBounds(20, 110, 250, 30);
    tela.add(idade);

    JLabel labelTipo = new JLabel("Tipo");
    labelTipo.setBounds(20, 150, 150, 20);
    tela.add(labelTipo);

    JComboBox<Tipo> racaInput = new JComboBox(Tipo.values());
    racaInput.setBounds(20, 175, 250, 30);
    tela.add(racaInput);

    JLabel labelRaca = new JLabel("Ra�a");
    labelRaca.setBounds(20, 215, 150, 20);
    tela.add(labelRaca);

    JTextField raca = new JTextField();
    raca.setBounds(20, 240, 250, 30);
    tela.add(raca);

    JLabel labelEndereco = new JLabel("Endere�o");
    labelEndereco.setBounds(20, 280, 150, 20);
    tela.add(labelEndereco);

    JTextField endereco = new JTextField();
    endereco.setBounds(20, 305, 250, 30);
    tela.add(endereco);

    JButton enviar = new JButton("Enviar");
    enviar.setBounds(80, 360, 150, 40);
    tela.add(enviar);


    Adocao adocao = new Adocao();

    enviar.addActionListener(e ->{
        String sql = "INSERT INTO animal(nome,idade,tipo,raca,endereco) VALUES (?,?,?,?,?)";
        String nomeAnimal = nome.getText();
        String idadeAnimal = idade.getText();
        String tipo = racaInput.getSelectedItem().toString();
        String racaAnimal = raca.getText();
        String enderecoAdocao = endereco.getText();
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement ps = conexao.prepareStatement(sql);

            ps.setString(1 ,nomeAnimal);
            ps.setString(2 ,idadeAnimal);
            ps.setString(3,tipo);
            ps.setString(4,racaAnimal);
            ps.setString(5,enderecoAdocao);
            ps.executeUpdate();

            JOptionPane.showMessageDialog(null,"salvo com sucesso");
            ps.close();
            conexao.close();

        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }        });

    tela.setVisible(true);

}
