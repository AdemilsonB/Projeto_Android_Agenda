package com.example.avaliacao.adapter;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.avaliacao.R;

public class PessoaViewHolder extends RecyclerView.ViewHolder {

    TextView tvNome;
    TextView tvIdade;
    TextView tvCpf;
    TextView tvEmail;

    public PessoaViewHolder(@NonNull View itemView) {
        super(itemView);

        tvNome  = itemView.findViewById(R.id.tvNome);
        tvIdade = itemView.findViewById(R.id.tvIdade);
        tvCpf   = itemView.findViewById(R.id.tvCpf);
        tvEmail = itemView.findViewById(R.id.tvEmail);
    }
}