package com.example.avaliacao.controller;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.avaliacao.model.Pessoa;

import java.util.List;

@Dao
public interface PessoaDAO {

    @Insert
    void addPessoa(Pessoa pessoa);

    @Update
    void editarPessoa(Pessoa pessoa);

    @Delete
    void excluirPessoa(Pessoa pessoa);

    @Query("SELECT * FROM `pessoas.tb`")
    List<Pessoa> getPessoas();


}

