package com.example.aluno.meemprestaai.Telas;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.example.aluno.meemprestaai.R;

public class TelaCadastrarProduto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cadastrar_produto);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Button btnPularCadastroProduto = findViewById(R.id.btnPularCadastrarProduto);
        Button btnOkcadastrarproduto = findViewById(R.id.btnConcluirCadastroUsuario);

        btnPularCadastroProduto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentCadastrarProduto = new Intent(TelaCadastrarProduto.this,TelaInicial.class);
                startActivity(intentCadastrarProduto);
            }
        });

//        btnOkcadastrarproduto.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intentProdutoCadastrado = new Intent(TelaCadastrarProduto.this, TelaInicial.class);
//                startActivity(intentProdutoCadastrado);
//            }
//        });
    }

}
