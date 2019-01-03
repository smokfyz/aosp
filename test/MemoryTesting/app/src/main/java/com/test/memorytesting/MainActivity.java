package com.test.memorytesting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.test.memorytesting.Globals;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final EditText edit =  findViewById(R.id.editText);
                String str = edit.getText().toString();

                int num = Integer.parseInt(str);

                Globals.myArray[Globals.size] = new int[num];

                for (int i = 0; i < (Globals.myArray[Globals.size].length); i++ )
                    Globals.myArray[Globals.size][i] = i;

                Globals.size++;

                final TextView text =  findViewById(R.id.textView2);
                text.setText(Integer.toString(Globals.size));
            }
        });
    }
}
