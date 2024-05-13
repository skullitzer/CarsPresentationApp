package com.example.midtermexam_varadpatil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CarDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardetails);

        final EditText editText = findViewById(R.id.editTextText);
        Button returnButton = findViewById(R.id.button);
        final TextView displayTextView = findViewById(R.id.textView2);

        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userInput = editText.getText().toString();

                Intent intent = new Intent(CarDetails.this, CarActivity.class);
                intent.putExtra("userInput", userInput);
                startActivity(intent);
            }
        });
    }
}