package dados;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SistemaDao {
    
    public static Connection conectar() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conectado = DriverManager.getConnection("jdbc:mysql://localhost:3306/controle_estoque", "root", "u7n6i8");
        return conectado;
    }
    
    public static ResultSet fazerLogin(String u, String s) throws ClassNotFoundException, SQLException {
        Connection conectado = conectar();
        PreparedStatement stEntrar = conectado.prepareStatement("SELECT * FROM usuarios WHERE usuario = ? AND senha = ?");
        stEntrar.setString(1, u);
        stEntrar.setString(2, s);
        ResultSet resultado = stEntrar.executeQuery();
        return resultado;
    }
    
    public static void salvarProduto(Produtos produto) throws ClassNotFoundException, SQLException {
        Connection conectado = conectar();
        PreparedStatement stSalvar = conectado.prepareStatement("INSERT INTO produtos VALUES(?, ?, ?)");
        stSalvar.setString(1, produto.getProduto());
        stSalvar.setString(2, produto.getMarca());
        stSalvar.setString(3, produto.getMedida());
        stSalvar.executeUpdate();
    }
    
    public static ResultSet relatorioProdutos() throws ClassNotFoundException, SQLException {
        Connection conectado = conectar();
        PreparedStatement st = conectado.prepareStatement("SELECT * FROM produtos");
        ResultSet resultado = st.executeQuery();
        return resultado;
    }
    
}