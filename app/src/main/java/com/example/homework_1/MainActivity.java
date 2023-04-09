package com.example.homework_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView text_count;
    private int num = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text_count = findViewById(R.id.textView2);

        if(savedInstanceState != null) {
            num = savedInstanceState.getInt("num_key", 0);
            text_count.setText(Integer.toString(num));
        }
    }

    public void count(View view){
        num++;
        text_count.setText(Integer.toString(num));
    }






    @Override
    public void onSaveInstanceState(Bundle savedInstanceState){
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt("num_key", num);
    }



    public MainActivity(){
        super();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast toast = Toast.makeText(getApplicationContext(), "Старт", Toast.LENGTH_LONG);
        toast.show();
    }


    @Override
    protected void onStop() {
        super.onStop();
        Toast toast = Toast.makeText(getApplicationContext(), "Стоп", Toast.LENGTH_LONG);
        toast.show();
    }

    @Override
    protected void onResume() {
        Toast toast = Toast.makeText(getApplicationContext(),"Перезагрузка", Toast.LENGTH_LONG);
        toast.show();
        super.onResume();
    }

}