package sg.edu.rp.c346.id22019244.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView tvOne;
    TextView tvTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvOne = findViewById(R.id.tvOne);
        tvTwo = findViewById(R.id.tvTwo);


        tvOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("Code", getString(R.string.androidCode));
                intent.putExtra("Name", getString(R.string.androidName));
                intent.putExtra("Year", 2023);
                intent.putExtra("Sem", 1);
                intent.putExtra("Credit", 4);
                intent.putExtra("Venue", getString(R.string.androidVenue));
                startActivity(intent);


            }
        });

        tvTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ThirdActivity.class);


                intent.putExtra("Code", getString(R.string.iPadCode));
                intent.putExtra("Name", getString(R.string.iPadName));
                intent.putExtra("Year", 2023);
                intent.putExtra("Sem", 2);
                intent.putExtra("Credit", 3);
                intent.putExtra("Venue", getString(R.string.iPadVenue));
                startActivity(intent);


            }
        });



    }
}