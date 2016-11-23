package id.sch.smktelkom_mlg.project.xiirpl304142434.belajariqro;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MenuQuizActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_quiz);

        Button button1 = (Button) findViewById(R.id.buttonQuiz1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Quiz1Activity.class);
                startActivity(i);
            }
        });


        Button button2 = (Button) findViewById(R.id.buttonQuiz2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Quiz2Activity.class);
                startActivity(i);
            }
        });


        Button button3 = (Button) findViewById(R.id.buttonQuiz3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Quiz3Activity.class);
                startActivity(i);
            }
        });


        Button button4 = (Button) findViewById(R.id.buttonQuiz4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Quiz4Activity.class);
                startActivity(i);
            }
        });

    }
}
