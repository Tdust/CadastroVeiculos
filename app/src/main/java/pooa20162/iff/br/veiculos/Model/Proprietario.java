package pooa20162.iff.br.veiculos.Model;

import android.os.Parcel;
import android.os.Parcelable;

import com.orm.SugarRecord;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Wanderson on 06/03/17.
 */

public class Proprietario extends SugarRecord implements Parcelable {
    String nome = "";
    String endereco = "";
    String telefone = "";
    String data = "";

    List<Veiculo> getVeiculos() {
        return Veiculo.find(Veiculo.class, "Proprietário = ?", new String(getId().toString()));
    }

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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(nome);
        parcel.writeString(endereco);
        parcel.writeString(telefone);
        parcel.writeString(data);
    }

    protected Proprietario(Parcel in) {
        nome = in.readString();
        endereco = in.readString();
        telefone = in.readString();
        data = in.readString();
    }

    public static final Creator<Proprietario>
            CREATOR = new Creator<Proprietario>() {
        @Override
        public Proprietario createFromParcel(Parcel in) {
            return new Proprietario(in);
        }

        @Override
        public Proprietario[] newArray(int size) {
            return new Proprietario[size];
        }
    };

    public String toString (){
        return nome;
    }
}