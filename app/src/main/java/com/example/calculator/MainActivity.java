package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button plus;
    TextView res;
    Button minus;
    Button divide;
    Button into;
    Button clr;
    Button one;
    Button two;
    Button three;
    Button four;
    Button five;
    Button six;
    Button seven;
    Button eight;
    Button nine;
    Button dot;
    Button equal;
    Button zero;
    int choice =0;
    double a;
    double b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        plus  = (Button)findViewById(R.id.plus);
        res    = (TextView) findViewById(R.id.result);
        minus = (Button)findViewById(R.id.minus);
        divide = (Button)findViewById(R.id.divide);
        into = (Button)findViewById(R.id.into);
        one= (Button)findViewById(R.id.one);
        two= (Button)findViewById(R.id.two);
        three= (Button)findViewById(R.id.three);
        four = (Button)findViewById(R.id.four);
        five= (Button)findViewById(R.id.five);
        six = (Button)findViewById(R.id.six);
        seven = (Button)findViewById(R.id.seven);
        nine= (Button)findViewById(R.id.nine);
        dot = (Button)findViewById(R.id.dot);
        equal = (Button)findViewById(R.id.equal);
        zero=(Button)findViewById(R.id.zero);
        eight=(Button)findViewById(R.id.eight);
        clr =(Button)findViewById(R.id.clear);
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                choice =1;
                String s=res.getText().toString();
               try {
                   a = Double.valueOf(s);

               }catch (NumberFormatException e){}
                res.setText(res.getText() + "+");
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                choice =2;
                String s=res.getText().toString();
                try {
                    a = Double.valueOf(s);

                }catch (NumberFormatException e){}
                res.setText(res.getText() + "-");

            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                choice =3;
                String s=res.getText().toString();
                try {
                    a = Double.valueOf(s);

                }catch (NumberFormatException e){}
                res.setText(res.getText().toString()+"/");
            }
        });
        into.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                choice =4;
                String s=res.getText().toString();
                try {
                    a = Double.valueOf(s);

                }catch (NumberFormatException e){}
                res.setText(res.getText().toString()+"*");
            }
        });
        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText("");
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText(res.getText()+"0");
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText(res.getText()+"1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText(res.getText()+"2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText(res.getText()+"3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText(res.getText()+"4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText(res.getText()+"5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText(res.getText()+"6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText(res.getText()+"7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText(res.getText()+"8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText(res.getText()+"9");
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s=res.getText().toString();
                switch (choice)
                {
                    case 1: try {
                                b=Double.valueOf(s.substring(s.lastIndexOf('+')+1));

                            }catch (NumberFormatException e){}
                            res.setText(String.valueOf(a+b));
                            break;
                    case 2: try {
                        b=Double.valueOf(s.substring(s.lastIndexOf('-')+1));

                        }catch (NumberFormatException e){}
                        res.setText(String.valueOf(a-b));
                        break;
                    case 3: try {
                        b=Double.valueOf(s.substring(s.lastIndexOf('/')+1));

                        }catch (NumberFormatException e){}
                        if(b==0)
                        {
                            res.setText("divide by zero error");
                            break;
                        }
                        res.setText(String.valueOf(a/b));
                        break;
                    case 4: try {
                        b=Double.valueOf(s.substring(s.lastIndexOf('*')+1));
                        }catch (NumberFormatException e){}
                        res.setText(String.valueOf(a*b));
                        break;

                }


            }
        });











    }

}