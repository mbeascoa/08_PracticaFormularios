package com.example.a08_practicaformularios;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Html;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.view.View;

public class MainActivity extends AppCompatActivity {

        private RadioButton rdbMorning, rdbTarde, rdbNada;
        private RadioGroup grupo;
        private CheckBox chkNet, chkJava, chkOracle;
        private String curso;
        private String horario;


        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            this.rdbMorning = (RadioButton)findViewById(R.id.radioMañana);
            this.rdbTarde = (RadioButton)findViewById(R.id.radioTarde);
            this.rdbNada = (RadioButton)findViewById(R.id.RadioSinNada);
            this.grupo = (RadioGroup)findViewById(R.id.radioGroup1);
            this.chkNet = (CheckBox)findViewById(R.id.chkNet);
            this.chkJava = (CheckBox)findViewById(R.id.chkJava);
            this.chkOracle = (CheckBox)findViewById(R.id.chkOracle);

        }
        public void clickRdbNada(View view) {
            chkNet.setEnabled(false);
            chkOracle.setEnabled(false);
            chkJava.setEnabled(false);
            chkNet.setChecked(false);
            chkOracle.setChecked(false);
            chkJava.setChecked(false);
        }
        public void clickActivar(View view) {
            chkNet.setEnabled(true);
            chkOracle.setEnabled(true);
            chkJava.setEnabled(true);

        }

        public void mostrar(View view) {

            curso = "";
            int radioSelect = this.grupo.getCheckedRadioButtonId();
            switch (radioSelect)
            {
                case R.id.radioMañana:
                    horario = "Mañana";
                    break;

                case R.id.radioTarde:
                    horario = "Tarde";
                    break;

                case R.id.RadioSinNada:
                    horario = "Nada";
                    break;
            }

            if (chkNet.isChecked())
            {
                curso += " Net ";
            }

            if (chkJava.isChecked())
            {
                curso += " Java ";
            }

            if (chkOracle.isChecked())
            {
                curso += " Oracle ";
            }

            Intent i = new Intent(this, MainActivity2.class );
            // Añadimos los dos parámetros con el método putExtra
            i.putExtra("Horario", horario);
            i.putExtra("Cursos", curso);
            startActivity(i);



        }

    }
