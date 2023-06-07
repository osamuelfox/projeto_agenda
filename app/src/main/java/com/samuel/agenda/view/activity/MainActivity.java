package com.samuel.agenda.view.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.samuel.agenda.DAO.AlunoDAO;
import com.samuel.agenda.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_alunos);

        AlunoDAO dao = new AlunoDAO();


        setTitle("Lista de Alunos");

        List<String> alunos = new ArrayList<>(
                Arrays.asList("Samuel", "Monica","Pedro", "Matheus", "Maria", "Ana", "Lucas", "Maruzam", "Brennda", "Joao" ));

        ListView listaDeAlunos = findViewById(R.id.activity_lista);
        listaDeAlunos.setAdapter(new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1, dao.todos()));
    }
}