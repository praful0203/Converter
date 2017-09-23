package com.example.praful.converter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText txt_number;
    TextView hex_num;
    Button btnConvert;
    ImageButton btnClear;
    String num;
    int numb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_number = (EditText) findViewById(R.id.txt_number);
        hex_num = (TextView)findViewById(R.id.hex_num);
        btnConvert = (Button)findViewById(R.id.btnConvert);
        btnClear = (ImageButton)findViewById(R.id.btnClear);

        btnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num = txt_number.getText().toString().trim();
                numb = Integer.parseInt(num);
                //numCovert();
                conMethod();
            }
        });



        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt_number.setText("");
                hex_num.setText("");
            }
        });
    }

    private void numCovert() {

        String hex = Integer.toHexString(numb);
        hex_num.setText(hex);
    }


    private  void conMethod() {

        char ch[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        int rem;
        String hexadecimal="";

        while(numb != 0)
        {
            rem=numb%16;
            hexadecimal= ch[rem] + hexadecimal;
            numb= numb/16;
        }
        System.out.print(hexadecimal);
        hex_num.setText(""+hexadecimal);
    }
}
