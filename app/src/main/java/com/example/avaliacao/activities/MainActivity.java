package com.example.avaliacao.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.avaliacao.R;
import com.example.avaliacao.adapter.PessoaAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvPessoas;
    FloatingActionButton fabNovo;

    PessoaDAO pessoaDAO;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvPessoas = findViewById(R.id.rvPessoas);
        fabNovo = findViewById(R.id.fabNovo);

        pessoaDAO = new PessoaDAO();

        fabNovo.setOnClickListener(v -> {
            startActivity(new Intent(this, CadastroActivity.class));
        });

        RecyclerView.LayoutManager meuLayout = new LinearLayoutManager(
                this,
                LinearLayoutManager.VERTICAL,
                false
        );

        rvPessoas.setLayoutManager(meuLayout);

    }

    @Override
    protected void onResume() {
        super.onResume();

        PessoaAdapter meuAdapter = new PessoaAdapter(this, pessoaDAO);

        rvPessoas.setAdapter(meuAdapter);
    }
}