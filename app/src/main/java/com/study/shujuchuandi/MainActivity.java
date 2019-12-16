package com.study.shujuchuandi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etName;
    EditText etAge;
    EditText etOccopation;
    Button btnSend;
    TextView tvResult;

    Intent intentSend,intentGet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName=findViewById(R.id.et_name);
        etAge=findViewById(R.id.et_age);
        etOccopation=findViewById(R.id.et_occupation);
        btnSend=findViewById(R.id.btn_send);
        tvResult=findViewById(R.id.tv_result);

        intentSend=new Intent(MainActivity.this,ViceActivity.class);
        intentGet=getIntent();

        tvResult.setText(intentGet.getStringExtra("str_result"));

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intentSend.putExtra("str_name",etName.getText().toString());
                intentSend.putExtra("str_age",etAge.getText().toString());
                intentSend.putExtra("str_occopation",etOccopation.getText().toString());
                startActivity(intentSend);
            }
        });
    }
}
