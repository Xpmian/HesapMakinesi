package com.example.denem1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    TextView txt,son;
    Button bt0,bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,btopla,btcıkar,btcarp,btbol,bttamsil,btsil,btesit,btnokta,btyuzde;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt=findViewById(R.id.ekran);
        txt.setText("0");
        bt0=findViewById(R.id.button0);
        bt1=findViewById(R.id.button1);
        bt2=findViewById(R.id.button2);
        bt3=findViewById(R.id.button3);
        bt4=findViewById(R.id.button4);
        bt5=findViewById(R.id.button5);
        bt6=findViewById(R.id.button6);
        bt7=findViewById(R.id.button7);
        bt8=findViewById(R.id.button8);
        bt9=findViewById(R.id.button9);
        btnokta=findViewById(R.id.buttonnokta);
        btyuzde=findViewById(R.id.buttonyuzde);
        bttamsil=findViewById(R.id.buttontamsil);
        btopla=findViewById(R.id.buttontopla);
        btcarp=findViewById(R.id.buttoncarp);
        btbol=findViewById(R.id.buttonbol);
        btcıkar=findViewById(R.id.buttoncıkar);
        btsil=findViewById(R.id.buttonsil);
        son=findViewById(R.id.sonuc);
        son.setText("0");
        btesit=findViewById(R.id.buttonesit);

        bt0.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                int a=0;
                if(txt.getText().toString() == "0")
                {
                    txt.setText("");
                }
                else if( txt.getText().toString()  == "+" ||
                         txt.getText().toString()   == "X" ||
                         txt.getText().toString()   == "÷" ||
                         txt.getText().toString()   == "-"   )
                {
                    txt.setText("");
                }
                txt.setText(txt.getText() + String.valueOf(a));
            }
        });

        bt1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                int a=1;
                if(txt.getText().toString() == "0")
                {
                    txt.setText("");
                }
                else if( txt.getText().toString()  == "+" ||
                        txt.getText().toString()   == "X" ||
                        txt.getText().toString()   == "÷" ||
                        txt.getText().toString()   == "-"   )
                {
                    txt.setText("");
                }
                txt.setText(txt.getText() + String.valueOf(a));
            }
        });
        bt2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                int a=2;
                if(txt.getText().toString() == "0")
                {
                    txt.setText("");
                }
                else if( txt.getText().toString()  == "+" ||
                        txt.getText().toString()   == "X" ||
                        txt.getText().toString()   == "÷" ||
                        txt.getText().toString()   == "-"   )
                {
                    txt.setText("");
                }
                txt.setText(txt.getText() + String.valueOf(a));
            }
        });

        bt3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                int a=3;
                if(txt.getText().toString() == "0")
                {
                    txt.setText("");
                }
                else if( txt.getText().toString()  == "+" ||
                         txt.getText().toString()  == "X" ||
                         txt.getText().toString()  == "÷" ||
                         txt.getText().toString()  == "-"   )
                {
                    txt.setText("");
                }
                    txt.setText(txt.getText() + String.valueOf(a));
            }
        });

        bt4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                int a=4;
                if(txt.getText().toString() == "0")
                {
                    txt.setText("");
                }
                else if( txt.getText().toString()  == "+" ||
                        txt.getText().toString()   == "X" ||
                        txt.getText().toString()   == "÷" ||
                        txt.getText().toString()   == "-"   )
                {
                    txt.setText("");
                }
                txt.setText(txt.getText() + String.valueOf(a));
            }
        });

        bt5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                int a=5;
                if(txt.getText().toString() == "0")
                {
                    txt.setText("");
                }
                else if( txt.getText().toString()  == "+" ||
                        txt.getText().toString()   == "X" ||
                        txt.getText().toString()   == "÷" ||
                        txt.getText().toString()   == "-"   )
                {
                    txt.setText("");
                }
                txt.setText(txt.getText() + String.valueOf(a));
            }
        });

        bt6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                int a=6;
                if(txt.getText().toString() == "0")
                {
                    txt.setText("");
                }
                else if( txt.getText().toString()  == "+" ||
                        txt.getText().toString()   == "X" ||
                        txt.getText().toString()   == "÷" ||
                        txt.getText().toString()   == "-"   )
                {
                    txt.setText("");
                }
                txt.setText(txt.getText() + String.valueOf(a));
            }
        });

        bt7.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                int a=7;
                if(txt.getText().toString() == "0")
                {
                    txt.setText("");
                }
                else if( txt.getText().toString()  == "+" ||
                        txt.getText().toString()   == "X" ||
                        txt.getText().toString()   == "÷" ||
                        txt.getText().toString()   == "-"   )
                {
                    txt.setText("");
                }
                txt.setText(txt.getText() + String.valueOf(a));
            }
        });

        bt8.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                int a=8;
                if(txt.getText().toString() == "0")
                {
                    txt.setText("");
                }
                else if( txt.getText().toString()  == "+" ||
                        txt.getText().toString()   == "X" ||
                        txt.getText().toString()   == "÷" ||
                        txt.getText().toString()   == "-"   )
                {
                    txt.setText("");
                }
                txt.setText(txt.getText() + String.valueOf(a));
            }
        });

        bt9.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                int a=9;
                if(txt.getText().toString() == "0")
                {
                    txt.setText("");
                }
                else if( txt.getText().toString()  == "+" ||
                        txt.getText().toString()   == "X" ||
                        txt.getText().toString()   == "÷" ||
                        txt.getText().toString()   == "-"   )
                {
                    txt.setText("");
                }
                txt.setText(txt.getText() + String.valueOf(a));
            }
        });

        btopla.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                int b = son.getText().length();
                String c = son.getText().toString();
                String d = c.substring(b-1,b);
                if(d.equals("*") || d.equals("-") || d.equals("÷") || d.equals("%"))
                {
                    String f = c.substring(0,b-1);
                    son.setText(f + "+");
                    txt.setText("0");
                }
                else
                {
                    String a = son.getText().toString();
                    String l = txt.getText().toString();
                    if(l.equals("0"))
                    {
                        son.setText("0");
                    }
                    else
                    {
                        son.setText(l + "+");
                        txt.setText("0");
                    }
                }

            }
        });

        btcıkar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                int b = son.getText().length();
                String c = son.getText().toString();
                String d = c.substring(b-1,b);
                if(d.equals("*") || d.equals("+") || d.equals("÷") || d.equals("%"))
                {
                    String f = c.substring(0,b-1);
                    son.setText(f + "-");
                    txt.setText("0");
                }
                else
                {
                    String a = txt.getText().toString();
                    son.setText(a + "-");
                    txt.setText("0");
                }
            }
        });

        btbol.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                int b = son.getText().length();
                String c = son.getText().toString();
                String d = c.substring(b-1,b);
                if(d.equals("*") || d.equals("-") || d.equals("+") || d.equals("%"))
                {
                    String f = c.substring(0,b-1);
                    son.setText(f + "÷");
                    txt.setText("0");
                }
                else
                {
                    String a = txt.getText().toString();
                    son.setText(a + "÷");
                    txt.setText("0");
                }
            }
        });

        btcarp.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                int b = son.getText().length();
                String c = son.getText().toString();
                String d = c.substring(b-1,b);
                if(d.equals("+") || d.equals("-") || d.equals("÷") || d.equals("%"))
                {
                    String f = c.substring(0,b-1);
                    son.setText(f + "*");
                    txt.setText("0");
                }
                else
                {
                    String a = txt.getText().toString();
                    son.setText(a + "*");
                    txt.setText("0");
                }
            }
        });

        btyuzde.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                int b = son.getText().length();
                String c = son.getText().toString();
                String d = c.substring(b-1,b);
                if(d.equals("+") || d.equals("-") || d.equals("÷")  || d.equals("*"))
                {
                    String f = c.substring(0,b-1);
                    son.setText(f + "%");
                    txt.setText("0");
                }
                else
                {
                    String a = txt.getText().toString();
                    son.setText(a + "%");
                    txt.setText("0");
                }
            }
        });

        bttamsil.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                if(txt.getText().toString().equals("0"))
                {
                    txt.setText("0");
                    son.setText("0");
                }
                else
                {
                    txt.setText("0");
                    son.setText("0");
                }
            }
        });

        btsil.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                int a = txt.getText().length();
                String b = txt.getText().toString();
                String c = b.substring(0,a-1);
                txt.setText(c);
            }
        });

        btesit.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                int a = son.getText().length();
                String sembol= son.getText().toString().substring(a-1,a);
                if(sembol.equals("+"))
                {
                    int f = son.getText().length();
                    String b = txt.getText().toString();
                    String c = son.getText().toString().substring(0,f-1);
                    double sayi1 = Double.parseDouble(b);
                    double sayi2 = Double.parseDouble(c);
                    double sonuc = sayi1 + sayi2;
                    String sonuc1 = String.valueOf(sonuc);
                    son.setText(sonuc1 + "+");
                    txt.setText("0");
                }
                else if(sembol.equals("*"))
                {
                    int f = son.getText().length();
                    String b = txt.getText().toString();
                    String c = son.getText().toString().substring(0,f-1);
                    double sayi1 = Double.parseDouble(b);
                    double sayi2 = Double.parseDouble(c);
                    double sonuc = sayi1 * sayi2;
                    String sonuc1 = String.valueOf(sonuc);
                    son.setText(sonuc1 + "*");
                    txt.setText("0");
                }
                else if(sembol.equals("-"))
                {
                    int f = son.getText().length();
                    String b = txt.getText().toString();
                    String c = son.getText().toString().substring(0,f-1);
                    double sayi1 = Double.parseDouble(b);
                    double sayi2 = Double.parseDouble(c);
                    double sonuc = sayi2 - sayi1;
                    String sonuc1 = String.valueOf(sonuc);
                    son.setText(sonuc1 + "-");
                    txt.setText("0");
                }
                else if(sembol.equals("÷"))
                {
                    int f = son.getText().length();
                    String b = txt.getText().toString();
                    String c = son.getText().toString().substring(0,f-1);
                    double sayi1 = Double.parseDouble(b);
                    double sayi2 = Double.parseDouble(c);
                    double sonuc = sayi2 / sayi1;
                    String sonuc1 = String.valueOf(sonuc);
                    son.setText(sonuc1 + "÷");
                    txt.setText("0");
                }
                else if(sembol.equals("%"))
                {
                    int f = son.getText().length();
                    String b = txt.getText().toString();
                    String c = son.getText().toString().substring(0,f-1);
                    double sayi1 = Double.parseDouble(b);
                    double sayi2 = Double.parseDouble(c);
                    double ara = sayi2*sayi1;
                    double sonuc = ara / 100;
                    String sonuc1 = String.valueOf(sonuc);
                    son.setText(sonuc1 + "%");
                    txt.setText("0");
                }
            }
        });

        btnokta.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                if(txt.getText().toString() == "0")
                {
                    txt.setText("");
                }
                else if(  txt.getText().toString()  == "+" ||
                         txt.getText().toString()   == "X" ||
                         txt.getText().toString()   == "÷" ||
                         txt.getText().toString()   == "-"   )
                {
                    txt.setText("");
                }
                txt.setText(txt.getText() + ".");
            }
        });
    }
}