package id.sch.smktelkom_mlg.project.xiirpl304142434.belajariqro;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class Quiz1Activity extends AppCompatActivity {


    TextView tvHasil;
    RadioButton rbA;
    RadioButton rbB;
    RadioButton rbC;
    RadioButton rb2A;
    RadioButton rb2B;
    RadioButton rb2C;
    RadioButton rb3A;
    RadioButton rb3B;
    RadioButton rb3C;
    RadioButton rb4A;
    RadioButton rb4B;
    RadioButton rb4C;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz3);

        setTitle("Ayo Belajar");

        tvHasil = (TextView) findViewById(R.id.textViewHasil);
        rbA = (RadioButton) findViewById(R.id.radioButtonA);
        rbB = (RadioButton) findViewById(R.id.radioButtonB);
        rbC = (RadioButton) findViewById(R.id.radioButtonC);
        rb2A = (RadioButton) findViewById(R.id.radioButton2A);
        rb2B = (RadioButton) findViewById(R.id.radioButton2B);
        rb2C = (RadioButton) findViewById(R.id.radioButton2C);
        rb3A = (RadioButton) findViewById(R.id.radioButton3A);
        rb3B = (RadioButton) findViewById(R.id.radioButton3B);
        rb3C = (RadioButton) findViewById(R.id.radioButton3C);
        rb4A = (RadioButton) findViewById(R.id.radioButton4A);
        rb4B = (RadioButton) findViewById(R.id.radioButton4B);
        rb4C = (RadioButton) findViewById(R.id.radioButton4C);


        //Button buttonSelesai = (Button) findViewById(R.id.buttonSelesai);
        //buttonSelesai.setOnClickListener(new View.OnClickListener() {
        //  @Override
        //public void onClick(View view) {
        //  Intent i = new Intent(getApplicationContext(), Quiz2Activity.class);
        //  startActivity(i);
        // }
        //});

        Button button = (Button) findViewById(R.id.buttonSelesai);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doClick();
            }
        });

    }

    private void doClick() {

        String hasil = null;

        if (rbA.isChecked()) {
            hasil = " 1. Benar ";
        } else if (rbB.isChecked()) {
            hasil = " 1. Salah ";
        } else if (rbC.isChecked()) {
            hasil = " 1. Salah ";
        }

        String hasil2 = null;

        if (rb2A.isChecked()) {
            hasil2 = " 2. Benar ";
        } else if (rb2B.isChecked()) {
            hasil2 = " 2. Salah ";
        } else if (rb2C.isChecked()) {
            hasil2 = " 2. Salah ";
        }


        String hasil3 = null;

        if (rb3A.isChecked()) {
            hasil3 = " 3. Benar ";
        } else if (rb3B.isChecked()) {
            hasil3 = " 3. Salah ";
        } else if (rb3C.isChecked()) {
            hasil3 = " 3. Salah ";
        }

        String hasil4 = null;
        if (rb4A.isChecked()) {
            hasil4 = " 4. Benar ";
        } else if (rb4B.isChecked()) {
            hasil4 = " 4. Salah ";
        } else if (rb4C.isChecked()) {
            hasil4 = " 4. Salah ";
        }

//        int hasillA = Integer.parseInt(rbA.getText().toString());
//        int hasillB= Integer.parseInt(rbB.getText().toString());
//        int hasillC = Integer.parseInt(rbC.getText().toString());
//
//        int hasill2A = Integer.parseInt(rb2A.getText().toString());
//        int hasill2B= Integer.parseInt(rb2B.getText().toString());
//        int hasill2C= Integer.parseInt(rb2C.getText().toString());
//
//        int hasill3A = Integer.parseInt(rbA.getText().toString());
//        int hasill3B= Integer.parseInt(rbB.getText().toString());
//        int hasill3C = Integer.parseInt(rbC.getText().toString());


        tvHasil.setText((hasil + hasil2 + hasil3 + hasil4));


    }
}

