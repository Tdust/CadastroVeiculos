package pooa20162.iff.br.veiculos.Model;

import com.orm.SugarRecord;

import java.util.ArrayList;

/**
 * Created by Wanderson on 06/03/17.
 */

public class Proprietario extends SugarRecord
{
    String nome = "";
    String endereco = "";
    String telefone = "";
    String data = "";
    ArrayList<Veiculo> garagem;

    public Proprietario() {
    }

    public Proprietario(String nome, String endereco, String telefone, String data) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.data = data;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public ArrayList<Veiculo> getGaragem() {
        return garagem;
    }

    public void setGaragem(ArrayList<Veiculo> garagem) {
        this.garagem = garagem;
    }
}
