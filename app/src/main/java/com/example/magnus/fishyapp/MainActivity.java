package com.example.magnus.fishyapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.magnus.fishyapp.Fish.Salmon;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Salmon lax = new Salmon();

    // Example of a call to a native method
    TextView tv = (TextView) findViewById(R.id.sample_text);
    //tv.setText(stringFromJNI());
        tv.setText(lax.species+ "HÄR ÄR LITE TESTING" + lax.description);
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }
}
