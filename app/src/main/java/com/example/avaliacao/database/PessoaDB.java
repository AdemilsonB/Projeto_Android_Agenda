package com.example.avaliacao.database;
import android.content.Context;


import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.avaliacao.model.Pessoa;

@Database(entities = {Pessoa.class}, version = 1, exportSchema = false)
public abstract class PessoasDB extends RoomDatabase {

    private static final String DB_NAME = "pessoas";

    public abstract PessoaDAO getPessoaDAO;

    private static PessoasDB instance;

    public static PessoasDB getInstance(Context context)
    {
        if(instance == null)
        {
            return Room.databaseBuilder(context, PessoasDB.class, DB_NAME)
                    .allowMainThreadQueries()
                    . build();
        }
        return instance;

    }
}

