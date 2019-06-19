package com.example.senaiemprestimodeequipamentos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Adm1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adm1);

        getSupportActionBar().hide();

    }
        public void emprestadosAdm (View V){
            setContentView(R.layout.activity_emprestados);

        }
        public void todosEquips (View V){
            setContentView(R.layout.activity_todos_equips);

        }
        public void marcarEmprestimo (View V){
            setContentView(R.layout.activity_emprestimo);

        }
}
