package com.allen.hellondk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    static {
        System.loadLibrary("jni-add");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.tvHelloNDK);
        int result = add(3, 66);
        textView.setText("我是一个jni加法: " + result);
    }

    private native int add(int a, int b);   //jni
}
