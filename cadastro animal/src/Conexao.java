import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

    public static Connection conectar() {

        try {

            return DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/adocao",
                    "root",
                    ""
            );

        } catch (Exception erro) {

            System.out.println(erro);
            return null;

        }

    }

}