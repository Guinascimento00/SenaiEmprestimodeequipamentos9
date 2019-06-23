package com.example.senaiemprestimodeequipamentos.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import com.example.senaiemprestimodeequipamentos.R;

public class todosEquips extends AppCompatActivity {
private RecyclerView recyclerView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todos_equips);

        getSupportActionBar().hide();
    }
    public void carregarTodosEquips() {

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView3.setLayoutManager(layoutManager);
        recyclerView3.setHasFixedSize(true);
        recyclerView3.addItemDecoration(new DividerItemDecoration(getApplicationContext(), LinearLayout.VERTICAL));

    }



}
