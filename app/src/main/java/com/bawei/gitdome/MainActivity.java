package com.bawei.gitdome;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //注释：演示
        TextView tv = new TextView(MainActivity.this, null);
        //创建一个按钮
        Button button = new Button(MainActivity.this, null);
        //创建一个输入框
        EditText editText = new EditText(MainActivity.this,null);
    }
}
