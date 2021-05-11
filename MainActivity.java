package com.example.exe7_tic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private EditText preco_fabrica;
    private EditText percentual_distribuidor;
    private EditText impostos_aplicados;

    private TextView lucro_distribuidor;
    private TextView valor_impostos;
    private TextView preco_final;

    private Button   btn_calcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //edit text
        preco_fabrica = findViewById(R.id.preco_fabrica);
        percentual_distribuidor = findViewById(R.id.percentual_distribuidor);
        impostos_aplicados = findViewById(R.id.impostos_aplicados);

        //textview
        lucro_distribuidor = findViewById(R.id.lucro_distribuidor);
        valor_impostos = findViewById(R.id.valor_impostos);
        preco_final = findViewById(R.id.preco_final);
        //button
        btn_calcular = findViewById(R.id.btn_calcular);

        btn_calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float preco_fabrica1 = Float.parseFloat(preco_fabrica.getText().toString());
                float percentual_distribuidor1 = Float.parseFloat(percentual_distribuidor.getText().toString());
                float  impostos_aplicados1 = Float.parseFloat(impostos_aplicados.getText().toString());

                float lucro_distribuidor1 = (preco_fabrica1 * percentual_distribuidor1)/100;
                float  impostos = (preco_fabrica1 * impostos_aplicados1)/100;
                float preco_carro = preco_fabrica1 + lucro_distribuidor1 + impostos;

                lucro_distribuidor.setText("O lucro do Distribuidor: " + lucro_distribuidor1);
                valor_impostos.setText("O Valor dos Impostos: " + impostos);
                preco_final.setText("O valor do carro : " + preco_carro);

            }
        });
    }
}