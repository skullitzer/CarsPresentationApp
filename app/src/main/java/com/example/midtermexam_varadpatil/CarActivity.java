package com.example.midtermexam_varadpatil;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class CarActivity extends AppCompatActivity {

    int id;
    String brand;
    float km;

    @Override
    public String toString() {
        return "CarActivity{" +
                "brand='" + brand + '\'' +
                ", km=" + km +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getKm() {
        return km;
    }

    public void setKm(float km) {
        this.km = km;
    }

    public CarActivity(int id, String brand, float km) {
        this.id = id;
        this.brand = brand;
        this.km = km;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car);

        Button finishButton = findViewById(R.id.button2);
        finishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Finish the activity and close the app
            }
        });

        ImageView car1ImageView = findViewById(R.id.imageView2);

        car1ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start a new activity here
                Intent intent = new Intent(CarActivity.this, CarDetails.class);
                startActivity(intent);
            }
        });

        TextView displayTextView = findViewById(R.id.textView3);

        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("userInput")) {
            String userInput = intent.getStringExtra("userInput");
            displayTextView.setText(userInput);
        }
    }
}
