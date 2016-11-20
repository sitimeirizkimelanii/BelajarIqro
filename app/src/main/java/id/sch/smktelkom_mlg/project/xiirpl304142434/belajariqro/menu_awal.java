package id.sch.smktelkom_mlg.project.xiirpl304142434.belajariqro;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class menu_awal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_awal);

        ImageButton belajariqro = (ImageButton) findViewById(R.id.belajar_iqro);
        belajariqro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), bljr_iqro.class);
                startActivity(i);
            }
        });
    }
}
