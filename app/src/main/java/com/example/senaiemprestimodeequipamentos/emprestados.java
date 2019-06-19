package com.example.senaiemprestimodeequipamentos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

public class emprestados extends AppCompatActivity {
private RecyclerView recyclerView4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emprestados);

        getSupportActionBar().hide();
    }
    public void carregarEmprestados() {

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView4.setLayoutManager(layoutManager);
        recyclerView4.setHasFixedSize(true);
        recyclerView4.addItemDecoration(new DividerItemDecoration(getApplicationContext(), LinearLayout.VERTICAL));

    }

}
