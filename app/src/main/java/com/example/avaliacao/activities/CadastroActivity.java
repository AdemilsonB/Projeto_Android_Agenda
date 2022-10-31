package com.example.avaliacao.activities;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.avaliacao.model.Pessoa;

import com.example.avaliacao.R;

public class CadastroActivity extends AppCompatActivity {

    EditText etNome;
    EditText etIdade;
    EditText etCpf;
    EditText etEmail;
    Button bSalvar;

    PessoaDAO dao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        etNome = findViewById(R.id.etNome);
        etIdade = findViewById(R.id.etIdade);
        etCpf = findViewById(R.id.etCpf);
        etEmail = findViewById(R.id.etEmail);
        bSalvar = findViewById(R.id.bSalvar);

        dao = new PessoaDAO();

        bSalvar.setOnClickListener(v -> {

            if (    etNome.getText().toString().isEmpty() ||
                    etIdade.getText().toString().isEmpty() ||
                    etCpf.getText().toString().isEmpty() ||
                    etEmail.getText().toString().isEmpty())
            {
                Toast.makeText(this, "Por favor preencha todos os campos!!", Toast.LENGTH_LONG).show();
            }else{
                Pessoa pessoa = new Pessoa(
                        etNome.getText().toString(),
                        Integer.parseInt(etIdade.getText().toString()),
                        etCpf.getText().toString(),
                        etEmail.getText().toString());

                dao.addPessoa(pessoa);

                Toast.makeText(this, "O novo carro foi salvo com sucesso!", Toast.LENGTH_SHORT).show();

                finish();
            }
        });
    }
}