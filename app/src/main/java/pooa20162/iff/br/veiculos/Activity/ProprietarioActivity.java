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
    int id;
    Button btCriar, btSalvar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proprietario);
        Intent intent = getIntent();
        id = (int) intent.getSerializableExtra("id");
        final EditText etnome = (EditText) findViewById(R.id.etNome);
        final EditText etendereco = (EditText) findViewById(R.id.etEndereco);
        final EditText ettelefone = (EditText) findViewById(R.id.etTelefone);
        final EditText etdata = (EditText) findViewById(R.id.etData);

        btCriar = (Button) findViewById(R.id.btCriar);
        btSalvar = (Button) findViewById(R.id.btSalvar);

        String nome     = (String) intent.getSerializableExtra("nome");
        String endereco    = (String) intent.getSerializableExtra("endereco");
        String telefone = (String) intent.getSerializableExtra("telefone");
        String data     = (String) intent.getSerializableExtra("data");

        etnome.setText(nome);
        etendereco.setText(endereco);
        ettelefone.setText(telefone);
        etdata.setText(data);

       if (id != 0) {
            btCriar.setEnabled(false);
            btCriar.setClickable(false);
            btCriar.setVisibility(View.INVISIBLE);
            etnome.setText(nome);
            etendereco.setText(endereco);
            ettelefone.setText(telefone);
            etdata.setText(data);
        } else {
            btSalvar.setEnabled(false);
            btSalvar.setClickable(false);
            btSalvar.setVisibility(View.INVISIBLE);
        }

        btCriar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Proprietario pessoa = new Proprietario(etnome.getText().toString(), etendereco.getText().toString(), ettelefone.getText().toString(), etdata.getText().toString());
                pessoa.save();
                Intent intent = new Intent(ProprietarioActivity.this, ListaProprietarioActivity.class);
                startActivity(intent);
            }
        });

        btSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Proprietario prop = Proprietario.findById(Proprietario.class, id);

                prop.setNome(etnome.getText().toString());
                prop.setEndereco(etendereco.getText().toString());
                prop.setTelefone(ettelefone.getText().toString());
                prop.setData(etdata.getText().toString());

                prop.save();
                finish();
            }
        });
    }

}
