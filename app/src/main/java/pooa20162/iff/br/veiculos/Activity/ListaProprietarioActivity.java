package pooa20162.iff.br.veiculos.Activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.ArrayList;

import pooa20162.iff.br.veiculos.Adapter.ProprietarioAdapter;
import pooa20162.iff.br.veiculos.Model.Proprietario;
import pooa20162.iff.br.veiculos.R;

public class ListaProprietarioActivity extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_proprietario);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListaProprietarioActivity.this, ProprietarioActivity.class);
                intent.putExtra("id", 0);
                startActivity(intent);
            }
        });
    }

    protected void onResume()
    {
        super.onResume();
        ListView lista = (ListView) findViewById(R.id.lvProprietario);

        final ArrayList<Proprietario> prop = (ArrayList<Proprietario>)
                Proprietario.listAll(Proprietario.class);

        ArrayAdapter adapter = new ProprietarioAdapter(this, prop);
        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(ListaProprietarioActivity.this, ProprietarioActivity.class);
                intent.putExtra("id", prop.get(i).getId().intValue());
                intent.putExtra("nome", prop.get(i).getNome());
                intent.putExtra("endereco", prop.get(i).getEndereco());
                intent.putExtra("telefone", prop.get(i).getTelefone());
                intent.putExtra("data", prop.get(i).getData());

                startActivity(intent);

            }
        });
    }
}