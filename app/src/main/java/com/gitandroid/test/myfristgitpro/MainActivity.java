package com.gitandroid.test.myfristgitpro;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Context context;

    private Button bottomBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this;
        initView();
    }

    private void initView() {
        bottomBtn = (Button) findViewById(R.id.btn_bottom);
        bottomBtn.setOnClickListener(new ImplBtnBottom());
    }

    private class ImplBtnBottom implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            Toast.makeText(context,"花谢花飞花满天，红消香断有谁怜。",Toast.LENGTH_SHORT).show();
        }
    }
}
