package com.example.semproject;

        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.view.View;

        import com.airbnb.lottie.LottieAnimationView;

        import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    private boolean fingerOn = false;
    private boolean buttonOn = false;
    private boolean switchOn = false;

    LottieAnimationView yellowSwitch;
    LottieAnimationView whiteBox;
    LottieAnimationView Finger;
    LottieAnimationView myswitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        yellowSwitch = findViewById(R.id.hello);
        whiteBox = findViewById(R.id.boxopen);
        Finger = findViewById(R.id.fingeroncamera);
        myswitch = findViewById(R.id.myswitch);



        myswitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Handler handler = new Handler();

                myswitch.setMinAndMaxProgress(0f,0.5f);
                myswitch.playAnimation();

                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        yellowSwitch.setTranslationY(-160f);
                    }
                }, 90);


                myswitch.setMinAndMaxProgress(0.6f,1f);
                myswitch.playAnimation();

                 handler.postDelayed(new Runnable() {
                     @Override
                     public void run() {
                         yellowSwitch.setTranslationY(0);
                     }
                 }, 600);

            }
        });

        yellowSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                yellowSwitch.setMinAndMaxProgress(0f,0.5f);
                yellowSwitch.setSpeed(2);
                yellowSwitch.playAnimation();

                whiteBox.setMinAndMaxProgress(0f, 0.5f);
                whiteBox.playAnimation();
                Finger.setMinAndMaxProgress(0f, 0.5f);
                Finger.playAnimation();


                yellowSwitch.setMinAndMaxProgress(0.6f, 1f);
                yellowSwitch.playAnimation();
                Finger.setMinAndMaxProgress(0.6f, 1f);
                Finger.playAnimation();
                whiteBox.setMinAndMaxProgress(0.6f,1f);
                whiteBox.playAnimation();
            }
        });
    }
}