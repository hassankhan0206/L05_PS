package sg.edu.rp.c346.id22019244.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    TextView iPadDisplay;
    Button btnReturn;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        iPadDisplay = findViewById(R.id.iPadDisplay);
        btnReturn = findViewById(R.id.btnReturn);

        Intent intentReceived = getIntent();
        String code = intentReceived.getStringExtra("Code");
        String name = intentReceived.getStringExtra("Name");
        int year = intentReceived.getIntExtra("Year", 0);
        int sem = intentReceived.getIntExtra("Sem", 0);
        int credit = intentReceived.getIntExtra("Credit", 0);
        String venue = intentReceived.getStringExtra("Venue");

        iPadDisplay.setText(
                "Module Code: " + code +
                        "\nModule Name: " + name +
                        "\nAcademic Year: " + year +
                        "\nSemester: " + sem +
                        "\nModule Credit: " + credit +
                        "\nVenue: " + venue
        );

        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Intent returnBtn = new Intent("android.intent.action.MAIN");
                //startActivity(returnBtn);
                finish();
            }
        });






    }
}