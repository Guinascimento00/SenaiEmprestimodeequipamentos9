package com.example.senaiemprestimodeequipamentos.Dominio;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

public class RepositorioUsuario {
    private SQLiteDatabase conection;
    public RepositorioUsuario(SQLiteDatabase conection){
        this.conection = conection;
    }

    public void insertUsuario(Usuario usuario){
        ContentValues contentValues = new ContentValues();
        contentValues.put("nome", usuario.getNome());
        contentValues.put("senha", usuario.getSenha());
        contentValues.put("funcao", usuario.getFuncao());
        contentValues.put("email", usuario.getEmail());

        conection.insertOrThrow("usuario", null, contentValues);
    }
}
