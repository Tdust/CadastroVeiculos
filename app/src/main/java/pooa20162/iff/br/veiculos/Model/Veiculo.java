package pooa20162.iff.br.veiculos.Model;

import com.orm.SugarRecord;

/**
 * Created by Wanderson on 13/03/17.
 */

public class Veiculo extends SugarRecord{
    String placa, modelo, ano;
    Proprietario dono;

    public Veiculo(Proprietario dono, String modelo, String ano, String placa) {
        this.dono = dono;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
    }

    public Veiculo() {    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public Proprietario getDono() {
        return dono;
    }

    public void setDono(Proprietario novoDono) {
        this.dono = novoDono;
    }
}
