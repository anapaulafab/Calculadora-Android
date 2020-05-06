package com.example.aluno.helloworld;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mensagem(View view){

        Toast.makeText(this, "Hello World!! ", Toast.LENGTH_SHORT).show();
    }

    public void somar(View view){
        EditText editValor1 = (EditText) findViewById(R.id.campoValor1);
        String textCampoValor1 = editValor1.getText().toString();

        EditText editValor2 = (EditText) findViewById(R.id.campoValor2);
        String textCampoValor2 = editValor2.getText().toString();

        Double valor1 = Double.parseDouble(textCampoValor1);
        Double valor2 = Double.parseDouble(textCampoValor2);

        Double resultado = valor1 + valor2;

        TextView textResultado = (TextView) findViewById(R.id.resultado);
        textResultado.setText("O resultado é: "+resultado);

        Toast.makeText(this, "Resultado: "+resultado, Toast.LENGTH_SHORT).show();
    }

    public void chamarSegunda(View view){
        Intent itt=new Intent(this, Segunda.class);
        startActivity(itt);
    }

}
