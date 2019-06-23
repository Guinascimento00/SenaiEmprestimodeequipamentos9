package com.example.senaiemprestimodeequipamentos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

public class cadastroUs extends AppCompatActivity {

    private Button botaosalvar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_us);
        getActionBar().hide();


    }

    public void Salvar (View view) {

        botaosalvar = findViewById(R.id.editID);
        botaosalvar = findViewById(R.id.editNome);
        botaosalvar = findViewById(R.id.editFunçao);
        botaosalvar = findViewById(R.id.editEmail);
        botaosalvar = findViewById(R.id.editSenha);

    }
}
