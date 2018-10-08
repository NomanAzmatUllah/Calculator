package com.example.imran.calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    double num1,num2,sum;
    EditText txt1 ,txt2;
    Button b1,b2,b3,b4,b5,b6,b7;
    TextView text;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        castId();
    }

    public  void onClick(View view)
    {

        num1 = Double.parseDouble(txt1.getText().toString());
        num2 = Double.parseDouble(txt2.getText().toString());
        switch (view.getId()) {

            case R.id.button1:
                sum = num1 + num2;
                text.setText(""+ sum);
                break;

            case  R.id.button2:
                sum = num1-num2;
            text.setText("" +sum);
            break;

            case  R.id.button3:
                sum = num1*num2;
                text.setText("" + sum);
                break;

            case  R.id.button4:
                sum = num1/num2;
                text.setText("" + sum);
                break;




    }
    }
        public void clearTextView(View view) {
        text.setText(null);
        txt1.getText().clear();
        txt2.getText().clear();
    }

    private void castId(){
        txt1 = (EditText) findViewById(R.id.text1);
        txt2 = (EditText) findViewById(R.id.text2);
        b1 = (Button) findViewById(R.id.button1);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button4);
        b5= (Button) findViewById(R.id.clear);
        text = (TextView) findViewById(R.id.text3);
    }

}

