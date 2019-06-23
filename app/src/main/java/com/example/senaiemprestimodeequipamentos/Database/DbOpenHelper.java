package com.example.senaiemprestimodeequipamentos.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DbOpenHelper extends SQLiteOpenHelper {
    public static int version = 1;
    public static String  nomeBd = "senai";
    public DbOpenHelper(Context context) {
        super(context, nomeBd, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String usuario =" CREATE TABLE IF NOT EXISTS usuario("+
                        "id_funcionario INTEGER PRIMARY KEY , "+
                        "nome VARCHAR(20) , "+
                        "senha VARCHAR(50) , "+
                        "funcao VARCHAR(50) , "+
                        "email VARCHAR(50) ) ";

        String equipamentos ="CREATE TABLE IF NOT EXISTS equipamentos("+
                             "codEquip INTEGER PRIMARY KEY AUTOINCREMENT,"+
                             "nome VARCHAR (100),"+
                             "marca VARCHAR (100),"+
                             "descricao VARCHAR (100),"+
                             "foto blob ) ";
        String emprestimo ="CREATE TABLE IF NOT EXISTS emprestimo("+
                            "cod_emprestimo INTEGER PRIMARY KEY AUTOINCREMENT,"+
                            "dt_emprestimo DATE,"+
                            "dt_devolucao DATE,"+
                            "local VARCHAR (100))";

    try{
        db.execSQL(usuario);
        Log.i("INFO", "FUNFOU");

    }catch(Exception e){
            Log.i("INFO", "NAO FUNFOU");
        }
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
