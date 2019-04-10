package com.example.myfirstproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Button button0;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button buttonAdd;
    Button buttonSubtract;
    Button buttonMul;
    Button buttonDiv;
    Button buttonClear;
    Button buttonEqual;
    String result;
    String tmp;
    String operator;
    TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initControl();
        initControlListener();
    }
    private void initControlListener(){
        button0.setOnClickListener((v) -> { onNumberButtonClicked( pos: "0");});
        button1.setOnClickListener((v) -> { onNumberButtonClicked( pos: "1");});
        button2.setOnClickListener((v) -> { onNumberButtonClicked( pos: "2");});
        button3.setOnClickListener((v) -> { onNumberButtonClicked( pos: "3");});
        button4.setOnClickListener((v) -> { onNumberButtonClicked( pos: "4");});
        button5.setOnClickListener((v) -> { onNumberButtonClicked( pos: "5");});
        button6.setOnClickListener((v) -> { onNumberButtonClicked( pos: "6");});
        button7.setOnClickListener((v) -> { onNumberButtonClicked( pos: "7");});
        button8.setOnClickListener((v) -> { onNumberButtonClicked( pos: "8");});
        button9.setOnClickListener((v) -> { onNumberButtonClicked( pos: "9");});

        buttonClear.setOnClickListener((v) -> { onClearButtonClicked(); });
        buttonSubtract.setOnClickListener((v) ->{
            onOperatorButtonClicked("-");
        });
        buttonAdd.setOnClickListener((v) -> { onOperatorButtonClicked("+"); });
        buttonMul.setOnClickListener((v) -> { onOperatorButtonClicked("X"); });
        buttonDiv.setOnClickListener((v) -> { onOperatorButtonClicked("/"); });
        buttonEqual.setOnClickListener((v) -> { onOperatorButtonClicked(); });
    }
}   private void onEqualButtonClicked() {
      int res = 0;
      try{
          int mumber = Integer.valueOf(tmp);
          int number2 =Integer.ValueOf(resultTextView.getText().toString());
          switch (operator) {
              case "+":
                  res = number + number2;
                  break;
              case "/":
                  res = number / number2;
                  break;
              case "-":
                  res = number - number2;
                  break;
              case "X":
                  res = number * number2;
                  break;
          }
          result = String.valueOf(res);
          resultTextView.setText(result);
      }
      catch (Exception e){
          e.printStackTrace();
      }
}
private void onOperatorButtonClicked(String operator) {
    tmp = resultTextView.getText().toString();
    onClearButtonClicked();
    this.operator = operator;
}

private void onClearButtonClicked() {
    result = "";
    resultTextView.setText("");
}
private void onNumberButtonClicked(String pos) {
    result = resultTextView.getText().toString();
    result = result + pos;
    resultTextView.setText(result);
}
private void initcontrol() {
    button0 =(Button)findViewById(R.id.button0);
    button1 =(Button)findViewById(R.id.button1);
    button2 =(Button)findViewById(R.id.button2);
    button3 =(Button)findViewById(R.id.button3);
    button4 =(Button)findViewById(R.id.button4);
    button5 =(Button)findViewById(R.id.button5);
    button6 =(Button)findViewById(R.id.button6);
    button7 =(Button)findViewById(R.id.button7);
    button8 =(Button)findViewById(R.id.button8);
    button9 =(Button)findViewById(R.id.button9);

    buttonAdd = (Button)findViewById(R.id.buttonAdd);
    buttonClear = (Button)findViewById(R.id.buttonClear);
    buttonSubstract = (Button)findViewById(R.id.buttonSub);
    buttonMul = (Button)findViewById(R.id.buttonMul);
    buttonDiv = (Button)findViewById(R.id.buttonDiv);
    buttonEqual = (Button)findViewById(R.id.buttonEqual);

    resultTextView = (TextView)findViewById(R.id.text_view_result);
}
