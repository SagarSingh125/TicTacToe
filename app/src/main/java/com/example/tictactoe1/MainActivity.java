package com.example.tictactoe1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn1 ,btn2 ,btn3 ,btn4,btn5 ,btn6 ,btn7 ,btn8 ,btn9;
    String b1value,b2value,b3value,b4value,b5value,b6value,b7value,b8value,b9value;
    int count=0,flag=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idFinding();
    }


    private void idFinding() {
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);

    }


    public void onclicking(View view) {
        Button curbutton=(Button) view;
        if(curbutton.getText().toString().equals("")) {
            count++;
            if (flag == 0) {
                curbutton.setText("X");
                flag = 1;
            } else {
                curbutton.setText("O");
                flag = 0;
            }
            if (count >= 4) {
                b1value = btn1.getText().toString();
                b2value = btn2.getText().toString();
                b3value = btn3.getText().toString();
                b4value = btn4.getText().toString();
                b5value = btn5.getText().toString();
                b6value = btn6.getText().toString();
                b7value = btn7.getText().toString();
                b8value = btn8.getText().toString();
                b9value = btn9.getText().toString();

                // winning_possiblities
                if (b1value.equals(b2value) && b2value.equals(b3value) && !b1value.equals("")) {
                    Toast.makeText(this, "Winner :" + b1value, Toast.LENGTH_SHORT).show();
                    restartgame();
                } else if (b4value.equals(b5value) && b5value.equals(b6value) && !b4value.equals("")) {
                    Toast.makeText(this, "Winner :" + b4value, Toast.LENGTH_SHORT).show();
                    restartgame();
                } else if (b7value.equals(b8value) && b8value.equals(b9value) && !b7value.equals("")) {
                    Toast.makeText(this, "Winner :" + b7value, Toast.LENGTH_SHORT).show();
                    restartgame();
                } else if (b1value.equals(b4value) && b4value.equals(b7value) && !b1value.equals("")) {
                    Toast.makeText(this, "Winner :" + b1value, Toast.LENGTH_SHORT).show();
                    restartgame();
                } else if (b2value.equals(b5value) && b5value.equals(b8value) && !b2value.equals("")) {
                    Toast.makeText(this, "winner :" + b2value, Toast.LENGTH_SHORT).show();
                    restartgame();
                } else if (b3value.equals(b6value) && b6value.equals(b9value) && !b3value.equals("")) {
                    Toast.makeText(this, "Winner :" + b3value, Toast.LENGTH_SHORT).show();
                    restartgame();
                } else if (b1value.equals(b5value) && b5value.equals(b9value) && !b1value.equals("")) {
                    Toast.makeText(this, "Winner :" + b1value, Toast.LENGTH_SHORT).show();
                    restartgame();
                } else if (b3value.equals(b5value) && b5value.equals(b7value) && !b3value.equals("")) {
                    Toast.makeText(this, "Winner :" + b3value, Toast.LENGTH_SHORT).show();
                    restartgame();
                }else if(count==9){
                    Toast.makeText(this, "Match is Drawn !", Toast.LENGTH_SHORT).show();
                    restartgame();
                }

            }
        }
    }

    public void restartgame(){
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        count=0;
        flag=0;
    }

    public void restartgame(View view) {
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        count=0;
        flag=0;
        Toast.makeText(this, "MATCH is RESET :", Toast.LENGTH_SHORT).show();
    }
}