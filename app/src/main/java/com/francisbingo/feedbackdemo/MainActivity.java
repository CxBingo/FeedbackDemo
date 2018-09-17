package com.francisbingo.feedbackdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private EditText editText;
    private String content;

    public void initView() {
        button = findViewById(R.id.ok_button);
        editText = findViewById(R.id.edit_et);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initControl();
    }

    private void initControl() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                content = editText.getText().toString();
                if (!TextUtils.isEmpty(content)) {
                    // post网络请求
                    Toast.makeText(MainActivity.this, "提交成功！", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "输入不能为空", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
