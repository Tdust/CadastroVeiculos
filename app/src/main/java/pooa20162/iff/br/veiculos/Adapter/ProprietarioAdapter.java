package pooa20162.iff.br.veiculos.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import pooa20162.iff.br.veiculos.Model.Proprietario;
import pooa20162.iff.br.veiculos.R;

/**
 * Created by aluno on 06/03/17.
 */

public class ProprietarioAdapter extends ArrayAdapter<Proprietario> {
    private final Context context;
    private final ArrayList<Proprietario> elementos;

    public ProprietarioAdapter(Context context, ArrayList<Proprietario> elementos) {
        super(context, R.layout.linhaproprietario, elementos);
        this.context = context;
        this.elementos = elementos;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.linhaproprietario, parent, false);
        TextView nome = (TextView) rowView.findViewById(R.id.pNome);
        TextView endereco = (TextView) rowView.findViewById(R.id.pEndereco);
        TextView telefone = (TextView) rowView.findViewById(R.id.pTelefone);
        TextView data = (TextView) rowView.findViewById(R.id.pData);
        nome.setText(elementos.get(position).getNome());
        endereco.setText(elementos.get(position).getEndereco());
        telefone.setText(elementos.get(position).getTelefone());
        data.setText(elementos.get(position).getData());
        return rowView;
    }
}
