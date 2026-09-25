package aula17;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class NinjaDAO implements NinjaDAOInterface {

    public void criarTabela() {
        String sql = "CREATE TABLE IF NOT EXISTS ninja (" +
                     "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                     "nome TEXT NOT NULL, " +
                     "aldeia TEXT NOT NULL, " +
                     "clan TEXT NOT NULL);";
        
        try (Connection conn = ConexaoFactory.getConnection();
             Statement stmt = conn.createStatement()) {
            
            stmt.execute(sql);
            System.out.println("\nTabela 'ninja' verificada/criada com sucesso!");

        } catch (SQLException e) {
            System.out.println("Erro ao criar tabela: " + e.getMessage());
        }
    }

    // Método para Inserir (INSERT) um ninja
    @Override
    public void salvar(Ninja ninja) {
        String sql = "INSERT INTO ninja (nome, aldeia, clan) VALUES (?, ?, ?)";
        try (Connection conn = ConexaoFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1, ninja.getNome());
            stmt.setString(2, ninja.getAldeia());
            stmt.setString(3, ninja.getClan());
            stmt.executeUpdate();
            System.out.println("Ninja -> " + ninja.getNome() + " salvo com sucesso! ✅");

        } catch (SQLException e) {
            System.out.println("Erro ao salvar ninja: " + e.getMessage());
        }
    }

    // UPDATE
    @Override
    public void atualizar(Ninja ninja) {
        String sql = "UPDATE ninja SET nome = ?, aldeia = ?, clan = ? WHERE id = ?;";
    
        try (Connection conn = ConexaoFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1, ninja.getNome());
            stmt.setString(2, ninja.getAldeia());
            stmt.setString(3, ninja.getClan());
            stmt.setInt(4, ninja.getId());
            stmt.executeUpdate();
            System.out.println("Ninja com ID -> " + ninja.getId() + " Atualizado com sucesso! ✅");
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar ninja: " + e.getMessage());
        }
    }

    // DELETE
    @Override
    public void deletar(int id) {
        String sql = "DELETE FROM ninja WHERE id = ?;";

        try (Connection conn = ConexaoFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("Ninja com ID -> " + id + " Deletado com sucesso! ✅");

        } catch (SQLException e) {
            System.out.println("Erro ao deletar id selecionado. " + e.getMessage());
        }
    }

    // Buscar por id
    @Override
    public Ninja buscarPorId(int id) {
        String sql = "SELECT * FROM ninja WHERE id = ?;";

        try (Connection conn = ConexaoFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return new Ninja(
                        rs.getInt("id"),
                        rs.getString("nome"),
                        rs.getString("aldeia"),
                        rs.getString("clan")
                    );
                }
            }

        } catch (SQLException e) {
            System.out.println("Erro ao buscar ninja por ID: " + e.getMessage());
        }

        return null;
    }

    // Listar SELECT
    @Override
    public List<Ninja> listar() {
        List<Ninja> ninjas = new ArrayList<>();
        String sql = "SELECT id, nome, aldeia, clan FROM ninja";

        try (Connection conn = ConexaoFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet resultadoSet = stmt.executeQuery()) {
            
            while (resultadoSet.next()) {
                Ninja n = new Ninja(
                    resultadoSet.getInt("id"),
                    resultadoSet.getString("nome"),
                    resultadoSet.getString("aldeia"),
                    resultadoSet.getString("clan")
                );
                ninjas.add(n);
            }

        } catch (SQLException e) {
            System.out.println("Erro ao listar ninjas: " + e.getMessage());
        }
        return ninjas;
    }

    // dropar a tabela pra deixar limpinha
    public void droparTabela() {
        String sql = "DROP TABLE ninja;";

        try (Connection conn = ConexaoFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.execute();
            System.out.println("\n__Tabela limpa pronta pra uso__");
        } catch (SQLException e) {
            System.out.println("Erro ao tentar limpar tabela: " + e.getMessage());
        }
    }

}