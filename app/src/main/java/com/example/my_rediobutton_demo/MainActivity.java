package com.example.my_rediobutton_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton genderButton;
    private TextView Result_textView;
    private Button showbutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup.findViewById(R.id.radio_groupId);
        Result_textView.findViewById(R.id.resultTextviewId);
        showbutton.findViewById(R.id.showButton);

        showbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId=radioGroup.getCheckedRadioButtonId();
                genderButton.findViewById(selectedId);

                String value=genderButton.getText().toString();

                Result_textView.setText(value +"is selected");


            }
        });




    }
}