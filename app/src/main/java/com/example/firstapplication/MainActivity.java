package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText textNumberOne;
    EditText textNumberTwo;
    Button btnSumar, btnDividir, btnMultiplicar, btnRestar, btnClear, btnExit;
    TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textNumberOne = findViewById(R.id.main_editTextNumberDecimal8);
        textNumberTwo = findViewById(R.id.main_editTextNumberDecimal9);
        btnSumar = (Button) findViewById(R.id.main_btnSumar);
        btnDividir = (Button) findViewById(R.id.main_btnDividir);
        btnMultiplicar = (Button) findViewById(R.id.main_btnDividir);
        btnRestar = (Button) findViewById(R.id.main_btnRestar);
        btnClear = (Button) findViewById(R.id.main_btn_clear);
        resultado = (TextView) findViewById(R.id.main_textView01);
    }

    public void ClearValuesBtn(View viewer) {
        textNumberOne.setText("");
        textNumberTwo.setText("");
        resultado.setText("0");
    }

    public void Suma(View viewer) {
        double resultSuma = (Double.parseDouble(textNumberOne.getText().toString())) +
                (Double.parseDouble(textNumberTwo.getText().toString()));
        resultado.setText(String.valueOf(resultSuma));
    }

    public void Restar(View viewer) {
        double resultRest = (Double.parseDouble(textNumberOne.getText().toString())) -
                (Double.parseDouble(textNumberTwo.getText().toString()));
        resultado.setText(String.valueOf(resultRest));
    }

    public void Multiplicar(View viewer) {
        double resultMulti = (Double.parseDouble(textNumberOne.getText().toString())) *
                (Double.parseDouble(textNumberTwo.getText().toString()));
        resultado.setText(String.valueOf(resultMulti));
    }

    public void Dividir(View viewer) {

        int value2 = Integer.parseInt(textNumberTwo.getText().toString());
        String msg = "No se puede dividir entre cero";
        if (value2 == 0) {
            resultado.setText(msg);
            return;
        }

        double resultDivision = (Double.parseDouble(textNumberOne.getText().toString())) /
                (Double.parseDouble(textNumberTwo.getText().toString()));
        resultado.setText(String.valueOf(resultDivision));
    }

    public void btnExit_onClick(View viewer) {
        finish();
        System.exit(0);
    }
}