package com.example.ativ_comp_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edLarguraA, edLarguraB, edAlturaA, edAlturaB;
    private TextView tvArea, tvPerimetro;
    private Button btCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edLarguraA = findViewById(R.id.edLarguraA);
        edLarguraB = findViewById(R.id.edLarguraB);
        edAlturaA = findViewById(R.id.edAlturaA);
        edAlturaB = findViewById(R.id.edAlturaB);

        tvArea = findViewById(R.id.tvArea);
        tvPerimetro = findViewById(R.id.tvPerimetro);

        btCalcular = findViewById(R.id.btCalcular);

        btCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double largura = (Double.parseDouble(edLarguraA.getText().toString()) + Double.parseDouble(edLarguraB.getText().toString()));

                double altura = (Double.parseDouble(edAlturaA.getText().toString()) + Double.parseDouble(edAlturaB.getText().toString()));

                double perimetro = (largura*2) + (altura*2);

                double area = largura * altura;

                tvPerimetro.setText(String.valueOf(perimetro));
                tvArea.setText(String.valueOf(area));

            }
        });

    }
}