package com.example.ura.myapplication27;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

import static com.example.ura.myapplication27.Variable.debug;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener  {
    //Button bRest;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        ImageButton bRest =  findViewById(R.id.Buttom_0); // определение кнопки test
        bRest.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        Log.e(debug, "--> " + (int) (Math.random() * 100));


    }
}
