package pooa20162.iff.br.veiculos.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import pooa20162.iff.br.veiculos.Model.Veiculo;
import pooa20162.iff.br.veiculos.R;

public class VeiculoActivity extends AppCompatActivity {
    Button btCriar, btSalvar;
    int id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_veiculo);

        Intent intent = getIntent();
        id = (int) intent.getSerializableExtra("id");
        final EditText etplaca = (EditText) findViewById(R.id.etPlaca);
        final EditText etmodelo = (EditText) findViewById(R.id.etModelo);
        final EditText etano = (EditText) findViewById(R.id.etAno);

        btCriar = (Button) findViewById(R.id.btCriarVeiculo);
        btSalvar = (Button) findViewById(R.id.btSalvarVeiculo);

        String placa     = (String) intent.getSerializableExtra("placa");
        String modelo    = (String) intent.getSerializableExtra("modelo");
        String ano = (String) intent.getSerializableExtra("ano");

        etplaca.setText(placa);
        etmodelo.setText(modelo);
        etano.setText(ano);

        if (id != 0) {
            btCriar.setEnabled(false);
            btCriar.setClickable(false);
            btCriar.setVisibility(View.INVISIBLE);
            etplaca.setText(placa);
            etmodelo.setText(modelo);
            etano.setText(ano);
        } else {
            btSalvar.setEnabled(false);
            btSalvar.setClickable(false);
            btSalvar.setVisibility(View.INVISIBLE);
        }

        btCriar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Veiculo carro = new Veiculo(null, etplaca.getText().toString(), etmodelo.getText().toString(), etano.getText().toString());
                carro.save();
                Intent intent = new Intent(VeiculoActivity.this, ListaVeiculoActivity.class);
                startActivity(intent);
                finish();
            }
        });

        btSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Veiculo carro = Veiculo.findById(Veiculo.class, id);

                carro.setPlaca(etplaca.getText().toString());
                carro.setModelo(etmodelo.getText().toString());
                carro.setAno(etano.getText().toString());

                carro.save();
                finish();
            }
        });
    }
}
