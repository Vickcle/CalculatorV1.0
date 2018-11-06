package com.bignerdranch.android.calculator_v10;


import com.singularsys.jep.EvaluationException;
import com.singularsys.jep.Jep;
import com.singularsys.jep.ParseException;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ActivitySecond extends AppCompatActivity {
    public StringBuilder sentenceStrBu;
    public TextView textView,tv_Sentences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.common_cal);
        textView = (TextView) findViewById(R.id.cal_et);
        tv_Sentences = (TextView) findViewById(R.id.co_cal_tv);
    }

    //获取算式


    //设置算式

    //清空算式
    public void cls_btnFunction(View view) {
        textView.setText("");
    }
    //加括号
    public void bracket_btnFunction(View view) {
        textView.setText(textView.getText().toString()+"()");
    }
    //删除
    public void del_btnFunction(View view) {
        String str=textView.getText().toString();
        if(textView.getText().length()!=0)
            textView.setText(str.substring(0, str.length()-1));
    }
    //除号
    public void mod_btnFunction(View view) {
        textView.setText(textView.getText().toString()+"/");
    }
    //    7进入计算
    public void seven_btnFunction(View view) {
        textView.setText(textView.getText().toString()+"7");
    }
    //8进入计算
    public void eight_btnFunction(View view) {
        textView.setText(textView.getText().toString()+"8");
    }
    //9进入计算
    public void nine_btnFunction(View view) {
        textView.setText(textView.getText().toString()+"9");
    }
    //乘法运算
    public void plus_btnFunction(View view) {
        textView.setText(textView.getText().toString()+"*");
    }
    //4加入计算
    public void four_btnFunction(View view) {
        textView.setText(textView.getText().toString()+"4");
    }
    //5加入计算
    public void five_btnFunction(View view) {
        textView.setText(textView.getText().toString()+"5");
    }
    //6加入计算
    public void six_btnFunction(View view) {
        textView.setText(textView.getText().toString()+"6");
    }
    public void sub_btnFunction(View view) {
        textView.setText(textView.getText().toString()+"-");
    }
    //1加入计算
    public void one_btnFunction(View view) {
        textView.setText(textView.getText().toString()+"1");
    }
    //2加入计算
    public void two_btnFunction(View view) {
        textView.setText(textView.getText().toString()+"2");
    }
    //3加入计算
    public void three_btnFunction(View view) {
        textView.setText(textView.getText().toString()+"3");
    }
    //加法运算
    public void add_btnFunction(View view) {
        textView.setText(textView.getText().toString()+"+");
    }
    //0加入计算
    public void zero_btnFunction(View view) {
        textView.setText(textView.getText().toString()+"0");
    }
    //小数点加入计算
    public void dot_btnFunction(View view) {
        textView.setText(textView.getText().toString()+".");
    }
    //获得结果
    public void result_btnFunction(View view) {
        String str=textView.getText().toString();
        Jep jep=new Jep();
        try {
            jep.parse(str);
            try {
                tv_Sentences.setText(str.toString());
                textView.setText(jep.evaluate().toString());
            } catch (EvaluationException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        };
    }

}
