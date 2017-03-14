package pooa20162.iff.br.veiculos.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import pooa20162.iff.br.veiculos.Model.Proprietario;
import pooa20162.iff.br.veiculos.Model.Veiculo;
import pooa20162.iff.br.veiculos.R;

/**
 * Created by Wanderson on 13/03/17.
 */

public class VeiculoAdapter extends ArrayAdapter<Veiculo> {
    private final Context context;
    private final ArrayList<Veiculo> carros;

    public VeiculoAdapter(Context context, ArrayList<Veiculo> carros) {
        super(context, R.layout.linhaproprietario, carros);
        this.context = context;
        this.carros = carros;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.linhaproprietario, parent, false);
        TextView nome = (TextView) rowView.findViewById(R.id.vPlaca);
        TextView endereco = (TextView) rowView.findViewById(R.id.vModelo);
        TextView telefone = (TextView) rowView.findViewById(R.id.vAno);
        TextView data = (TextView) rowView.findViewById(R.id.vProp);
        nome.setText(carros.get(position).getPlaca());
        endereco.setText(carros.get(position).getModelo());
        telefone.setText(carros.get(position).getAno());
        data.setText(carros.get(position).getDono().getNome());
        return rowView;
    }
}
