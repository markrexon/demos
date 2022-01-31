 // It is a android calculator functionallity code
package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
  private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button zero;
    private Button add;
    private Button sub;
    private Button mul;
    private Button div;
    private TextView info;
    private TextView result;
    private Button equal;
    private  Button clear;

    private final char ADDITION ='+';
    private final char SUBTRATION ='-';
    private final char MULTIPLICATION ='*';
    private final char DIVISION ='/';
    private final char EQU =0;
    private char CHOICE;

    private double val1 =Double.NaN;
    private double val2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButtonViews();

        zero.setOnClickListener((v) ->{
                info.setText(info.getText().toString() +"0");

        });

        one.setOnClickListener((v) ->{
                info.setText(info.getText().toString() +"1");

        });
        two.setOnClickListener((v) ->{
                info.setText(info.getText().toString() +"2");

        });
        three.setOnClickListener((v) ->{
                info.setText(info.getText().toString() +"3");

        });
        four.setOnClickListener((v) ->{
                info.setText(info.getText().toString() +"4");

        });
        five.setOnClickListener((v) ->{
                info.setText(info.getText().toString() +"5");

        });
        six.setOnClickListener((v) ->{
                info.setText(info.getText().toString() +"6");

        });
        seven.setOnClickListener((v) ->{
                info.setText(info.getText().toString() +"7");

        });
        eight.setOnClickListener((v) ->{
                info.setText(info.getText().toString() +"8");

        });
        nine.setOnClickListener((v) ->{
                info.setText(info.getText().toString() +"9");

        });
        add.setOnClickListener((v) ->{
          compute();
                CHOICE=ADDITION;
                result.setText(String.valueOf(val1) + "+");
                info.setText(null);

        });
        sub.setOnClickListener((v) ->{
                compute();
                CHOICE=SUBTRATION;
                result.setText(String.valueOf(val1) + "-");
                info.setText(null);

        });
        mul.setOnClickListener((v)->{
                compute();
                CHOICE=MULTIPLICATION;
                result.setText(String.valueOf(val1) + "*");
                info.setText(null);


        });
        div.setOnClickListener((v)-> {
                compute();
                CHOICE=DIVISION;
                result.setText(String.valueOf(val1) + "/");
                info.setText(null);

        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                CHOICE=EQU;
                result.setText(result.getText().toString()+String.valueOf(val2) + "=" +String.valueOf(val2));
                //5+4=9
                info.setText(null);
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(info.getText().length()>0){
                    CharSequence name=info.getText().toString();
                    info.setText(name.subSequence(0,name.length()-1));
                }
                else{
                    val1=Double.NaN;
                    val2=Double.NaN;
                    info.setText(null);
                    result.setText(null);
                }
            }
        });

    }
    private void ButtonViews(){
        one = (Button)findViewById(R.id.btn1);
        two = (Button)findViewById(R.id.btn2);
        three = (Button)findViewById(R.id.btn3);
        four = (Button)findViewById(R.id.btn4);
        five = (Button)findViewById(R.id.btn5);
        six = (Button)findViewById(R.id.btn6);
        seven = (Button)findViewById(R.id.btn7);
        eight = (Button)findViewById(R.id.btn8);
        nine = (Button)findViewById(R.id.btn9);
        zero = (Button)findViewById(R.id.btn0);
      equal = (Button)findViewById(R.id.btnEqual);

        add = (Button)findViewById(R.id.btnadd);
        sub = (Button)findViewById(R.id.btnsub);
        mul = (Button)findViewById(R.id.btnmul);
        div = (Button)findViewById(R.id.btndiv);

        clear = (Button)findViewById(R.id.btnClear);

        info = (TextView) findViewById(R.id.tvControl);
        result = (TextView) findViewById(R.id.tvDisplay);
    }
    private void compute(){
        if(!Double.isNaN(val1)){
            val2 = Double.parseDouble(info.getText().toString());
            switch (CHOICE){
                case ADDITION:
                    val1=val1+val2;
                    break;
                case SUBTRATION:
                    val1=val1-val2;
                    break;
                case MULTIPLICATION:
                    val1=val1*val2;
                    break;
                case DIVISION:
                    val1=val1/val2;
                    break;
                case EQU:
                    break;
            }
        }
        else{
            val1=Double.parseDouble(info.getText().toString());
        }
    }

}
