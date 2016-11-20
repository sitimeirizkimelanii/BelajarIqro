package id.sch.smktelkom_mlg.project.xiirpl304142434.belajariqro;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class bljr_iqro extends AppCompatActivity {
    private static final String TAG = "lagu";
    MediaPlayer play, play2, play3, play4, play5, play6, play7, play8, play9, play10, play11, play12, play13, play14, play15,
    play16, play17, play18, play19, play20, play21, play22, play23, play24, play25, play26, play27, play28, play29, play30;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bljr_iqro);
        play = MediaPlayer.create(this, R.raw.alef);
        findViewById(R.id.button_a).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doclick();
            }

            private void doclick() {
                play.start();
            }
        });

        play2 = MediaPlayer.create(this, R.raw.ba);
        findViewById(R.id.imageButton3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doclick();
            }

            private void doclick() {
                play2.start();
            }
        });

        play3 = MediaPlayer.create(this, R.raw.ta);
        findViewById(R.id.imageButton4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doclick();
            }

            private void doclick() {
                play3.start();
            }
        });

        play5 = MediaPlayer.create(this, R.raw.jim);
        findViewById(R.id.imageButton6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doclick();
            }

            private void doclick() { play5.start();
            }
        });

        play8 = MediaPlayer.create(this, R.raw.dal);
        findViewById(R.id.imageButton9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doclick();
            }

            private void doclick() { play8.start();
            }
        });

        play10 = MediaPlayer.create(this, R.raw.ra);
        findViewById(R.id.imageButton11).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doclick();
            }

            private void doclick() { play10.start();
            }
        });

        play22 = MediaPlayer.create(this, R.raw.kaf);
        findViewById(R.id.imageButton23).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doclick();
            }

            private void doclick() { play22.start();
            }
        });

        play23 = MediaPlayer.create(this, R.raw.lam);
        findViewById(R.id.imageButton24).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doclick();
            }

            private void doclick() { play23.start();
            }
        });

        play24 = MediaPlayer.create(this, R.raw.meem);
        findViewById(R.id.imageButton25).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doclick();
            }

            private void doclick() { play24.start();
            }
        });

        play25 = MediaPlayer.create(this, R.raw.noon);
        findViewById(R.id.imageButton26).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doclick();
            }

            private void doclick() { play25.start();
            }
        });

        play26 = MediaPlayer.create(this, R.raw.waw);
        findViewById(R.id.imageButton27).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doclick();
            }

            private void doclick() { play26.start();
            }
        });

        play27 = MediaPlayer.create(this, R.raw.hamza);
        findViewById(R.id.imageButton28).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doclick();
            }

            private void doclick() { play27.start();
            }
        });
    }


}
