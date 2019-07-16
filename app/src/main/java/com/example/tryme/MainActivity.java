package com.example.tryme;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private View windowView;
    private Button tryButton;
    private int[] colors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        windowView = findViewById(R.id.windowViewID);
        tryButton = findViewById(R.id.tryButtonID);

        colors = new int[]{Color.WHITE, Color.RED, Color.GREEN, Color.BLUE,
                Color.CYAN, Color.MAGENTA, Color.GRAY, Color.YELLOW, Color.DKGRAY};

        tryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random random = new Random();
                int randomNumber = random.nextInt(colors.length);
                windowView.setBackgroundColor(colors[randomNumber]);

            }
        });
    }
}
