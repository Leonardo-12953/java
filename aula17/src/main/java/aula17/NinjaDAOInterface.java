package aula17;

import java.util.List;

public interface NinjaDAOInterface {
    void salvar(Ninja ninja);
    Ninja buscarPorId(int id);
    List<Ninja> listar();
    void atualizar(Ninja ninja); // ✅ Ajustado para 1 parâmetro
    void deletar(int id);
}