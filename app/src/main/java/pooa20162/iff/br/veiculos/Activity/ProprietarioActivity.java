package pooa20162.iff.br.veiculos.Activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import pooa20162.iff.br.veiculos.Model.Proprietario;
import pooa20162.iff.br.veiculos.R;

public class ProprietarioActivity extends Activity {
    String nome, endereco, telefone, data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proprietario);

        Button btCriar = (Button) findViewById(R.id.btCriar);

        btCriar.setOnClickListener( new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                EditText etnome = (EditText) findViewById(R.id.etNome);
                EditText etendereco = (EditText) findViewById(R.id.etEndereco);
                EditText ettelefone = (EditText) findViewById(R.id.etTelefone);
                EditText etdata = (EditText) findViewById(R.id.etData);

                Proprietario pessoa = new Proprietario(etnome.getText().toString(), etendereco.getText().toString(), ettelefone.getText().toString(), etdata.getText().toString());
                pessoa.save();
                Intent intent = new Intent(ProprietarioActivity.this, ListaProprietarioActivity.class);
                startActivity(intent);
            }
        });
    }

    public void salvar() {
        EditText etnome = (EditText) findViewById(R.id.etNome);
        EditText etendereco = (EditText) findViewById(R.id.etEndereco);
        EditText ettelefone = (EditText) findViewById(R.id.etTelefone);
        EditText etdata = (EditText) findViewById(R.id.etData);

        Proprietario pessoa = new Proprietario(etnome.getText().toString(), etendereco.getText().toString(), ettelefone.getText().toString(), etdata.getText().toString());
        pessoa.save();
    }
}
