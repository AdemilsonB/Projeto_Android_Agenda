package com.example.avaliacao.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.avaliacao.R;
import com.example.avaliacao.model.Pessoa;

public class PessoaAdapter extends RecyclerView.Adapter {


    private Context context;
    private PessoaDAO pessoaDAO;

    public PessoaAdapter(Context context, PessoaDAO pessoaDAO) {
        this.context = context;
        this.pessoaDAO = pessoaDAO;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View viewPessoa =  LayoutInflater.from(context).inflate(R.layout.layout_pessoa, parent, false);

        PessoaViewHolder pessoaViewHolder = new PessoaViewHolder(viewPessoa);

        return pessoaViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        PessoaViewHolder pessoaViewHolder = (PessoaViewHolder) holder;

        Pessoa p = pessoaDAO.getPessoa(position);
        pessoaViewHolder.tvNome.setText(p.getNome());
        pessoaViewHolder.tvIdade.setText("Idade: " + p.getIdade());
        pessoaViewHolder.tvCpf.setText("CPF: " + p.getCpf());
        pessoaViewHolder.tvEmail.setText("E-mail: " + p.getEmail());


    }

    @Override
    public int getItemCount() {
        return pessoaDAO.getListaPessoas().size();
    }
}