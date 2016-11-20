package id.sch.smktelkom_mlg.project.xiirpl304142434.belajariqro;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class bljr_iqro extends AppCompatActivity {
    private static final String TAG = "lagu";
    MediaPlayer play;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bljr_iqro);
        play = MediaPlayer.create(this, R.raw.song);
        findViewById(R.id.button_a).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doclick();
            }

            private void doclick() {
                play.start();
            }
        });
    }


}
