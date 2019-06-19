package com.example.senaiemprestimodeequipamentos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();
    }
    public void entrar (View V) {

        TextView nome = (TextView) findViewById(R.id.id);
        TextView senha = (TextView) findViewById(R.id.senha);
        String i = nome.getText().toString();
        String s = senha.getText().toString();

        TextView resultado = (TextView) findViewById(R.id.textViewResultado);

        if (i.equals("admin") && s.equals("admin")) {

            resultado.setText("Logado ");
            Intent intent1 = new Intent(getApplicationContext(),Adm1.class);
            startActivity(intent1);
            finish();
        } else {
            resultado.setText("senha incorreta ");
        }
        if (i.equals("usuario") && s.equals("usuario")){

            resultado.setText("Logado!");
            Intent intent1 = new Intent(getApplicationContext(),usuario1.class);
            startActivity(intent1);

        finish();
        }
    }

}
