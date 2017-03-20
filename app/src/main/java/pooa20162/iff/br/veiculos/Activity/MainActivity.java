package pooa20162.iff.br.veiculos.Activity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import pooa20162.iff.br.veiculos.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void chamaTelaProprietarios(View v){
        Intent intent = new Intent(MainActivity.this, ListaProprietarioActivity.class);
        startActivity(intent);
    }
    public void chamaTelaVeiculos(View v){
        Intent intent = new Intent(MainActivity.this, ListaVeiculoActivity.class);
        startActivity(intent);
    }
    private Context getContext(){
        return this;
    }
}
