package pooa20162.iff.br.veiculos.Model;

import com.orm.SugarRecord;

/**
 * Created by Wanderson on 06/03/17.
 */

public class Proprietario extends SugarRecord
{
    String nome = "";
    String endereco = "";
    String telefone = "";
    String data = "";

    public Proprietario() {
    }

    public Proprietario(String nome, String endereco, String telefone, String data) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.data = data;
    }
}
