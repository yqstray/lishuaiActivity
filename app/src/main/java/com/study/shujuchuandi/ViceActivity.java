package com.study.shujuchuandi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ViceActivity extends AppCompatActivity {

    TextView tvName;
    TextView tvAge;
    TextView tvOccopation;
    Button btnBack;

    Intent intentGet,intentSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vice);

        tvName=findViewById(R.id.tv_name);
        tvAge=findViewById(R.id.tv_age);
        tvOccopation=findViewById(R.id.tv_occopation);
        btnBack=findViewById(R.id.btn_back);

        intentGet=getIntent();
        intentSend=new Intent(ViceActivity.this,MainActivity.class);

        final String strName,strAge,strOccopation,strResult;
        strName=intentGet.getStringExtra("str_name");
        strAge=intentGet.getStringExtra("str_age");
        strOccopation=intentGet.getStringExtra("str_occopation");
        strResult=strName+"是一个"+strAge+"岁的"+strOccopation;

        tvName.setText(strName);
        tvAge.setText(strAge);
        tvOccopation.setText(strOccopation);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intentSend.putExtra("str_result",strResult);
                startActivity(intentSend);
            }
        });
    }
}
