import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexaoBanco {
    public static void main(String[] args) {
        // Caminho do banco SQLite (cria o ficheiro meubanco.db sozinho)
        String url = "jdbc:sqlite:meubanco.db";

        // 1. CRIAR A TABELA PRIMEIRO (se não existir)
        String sqlCriarTabela = "CREATE TABLE IF NOT EXISTS cliente (" +
                                "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                                "nome TEXT NOT NULL, " +
                                "email TEXT NOT NULL);";

        try (Connection conexao = DriverManager.getConnection(url);
             Statement stmtCriar = conexao.createStatement()) {
            
            stmtCriar.execute(sqlCriarTabela);
            System.out.println("Tabela 'cliente' pronta para uso!");

        } catch (SQLException e) {
            System.out.println("Erro ao criar tabela: " + e.getMessage());
        }

        // 2. INSERIR DADOS (INSERT)
        String sqlInsert = "INSERT INTO cliente (nome, email) VALUES (?, ?)";

        try (Connection conexao = DriverManager.getConnection(url); // Apenas a URL no SQLite
             PreparedStatement stmt = conexao.prepareStatement(sqlInsert)) {
            
            stmt.setString(1, "Leonardo");
            stmt.setString(2, "leonardo@email.com");

            int linhasAfetadas = stmt.executeUpdate();
            System.out.println("Cliente inserido com sucesso! Linhas inseridas: " + linhasAfetadas);

        } catch (SQLException e) {
            System.out.println("Erro ao inserir: " + e.getMessage());
        }

        // 3. LER DADOS (SELECT)
        String sqlSelect = "SELECT id, nome, email FROM cliente";

        try (Connection conexao = DriverManager.getConnection(url); // Apenas a URL no SQLite
             PreparedStatement stmt = conexao.prepareStatement(sqlSelect);
             ResultSet rs = stmt.executeQuery()) {
            
            System.out.println("\n--- LISTA DE CLIENTES ---");
            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String email = rs.getString("email");

                System.out.println("ID: " + id + " | Nome: " + nome + " | Email: " + email);
            }    
        } catch (SQLException e) {
            System.out.println("Erro ao consultar: " + e.getMessage());
        }
    }
}