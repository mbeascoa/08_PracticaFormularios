package com.example.a08_practicaformularios;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;



    public class MainActivity2 extends AppCompatActivity {

        private TextView txtCursos;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main2);
            this.txtCursos = (TextView)findViewById(R.id.txtMuestra);


            //Recogemos los parámetros enviados por el primer Activity  a través del método getExtras
            Bundle bundle=getIntent().getExtras();
            String horario=bundle.getString("Horario");
            String curso=bundle.getString("Cursos");

            this.txtCursos.setText(Html.fromHtml("Horario:" + horario + "<br/>" + "Cursos:" + curso)
                    , TextView.BufferType.SPANNABLE);

        }
    }


