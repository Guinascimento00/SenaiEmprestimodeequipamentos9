package com.example.senaiemprestimodeequipamentos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class calendarioEmprestimo extends AppCompatActivity {

    private RecyclerView recyclerView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendario_emprestimo);
        recyclerView2= findViewById(R.id.recyclerView2);
        getSupportActionBar().hide();
    }

    public void carregarUsuarios() {

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView2.setLayoutManager(layoutManager);
        recyclerView2.setHasFixedSize(true);
        recyclerView2.addItemDecoration(new DividerItemDecoration(getApplicationContext(), LinearLayout.VERTICAL));

    }

    public void feito (View V){
        String alertFeito ="Item Emprestado1";
        Toast.makeText(this,alertFeito,Toast.LENGTH_LONG).show();

    }

}
