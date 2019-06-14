package top.vsebudet.pushkinspoemsapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class DistributionMenuActivity extends AppCompatActivity {

    Button btnDistribution_Prisoner;
    Button btnDistribution_Cloud;
    Button btnDistribution_Myself;
    Button btnDistribution_Tidier;
    Button btnDistribution_TheBird;
    Button btnDistribution_Weather;
    Button btnDistribution_October;
    Button btnDistribution_Winter;
    Button btnDistribution_MyMime;
    Button btnDistribution_Signs;
    Button btnDistribution_Answer;
    Button btnDistribution_When;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_distribution_menu);


        btnDistribution_Prisoner = findViewById(R.id.btnDistribution_Prisoner);
        btnDistribution_Cloud = findViewById(R.id.btnDistribution_Cloud);
        btnDistribution_Myself = findViewById(R.id.btnDistribution_Myself);
        btnDistribution_Tidier = findViewById(R.id.btnDistribution_Tidier);
        btnDistribution_TheBird = findViewById(R.id.btnDistribution_TheBird);
        btnDistribution_Weather = findViewById(R.id.btnDistribution_Weather);
        btnDistribution_October = findViewById(R.id.btnDistribution_October);
        btnDistribution_Winter = findViewById(R.id.btnDistribution_Winter);
        btnDistribution_MyMime = findViewById(R.id.btnDistribution_MyMime);
        btnDistribution_Signs = findViewById(R.id.btnDistribution_Signs);
        btnDistribution_Answer = findViewById(R.id.btnDistribution_Answer);
        btnDistribution_When = findViewById(R.id.btnDistribution_When);


    }

    public void Click_btnDistribution_Prisoner(View view) {
        btnDistribution_Prisoner.setText("Уже прочитано");
        Intent intent = new Intent(DistributionMenuActivity.this, VerseOneActivity.class);
        startActivity(intent);
    }

    public void Click_btnDistribution_Cloud(View view) {
        Intent intent = new Intent(DistributionMenuActivity.this, VerseTwoActivity.class);
        startActivity(intent);
    }

    public void Click_btnDistribution_Myself(View view) {
        Intent intent = new Intent(DistributionMenuActivity.this, VerseFreeActivity.class);
        startActivity(intent);
    }

    public void Click_btnDistribution_Tidier(View view) {
        Intent intent = new Intent(DistributionMenuActivity.this, VerseForeActivity.class);
        startActivity(intent);
    }

    public void Click_btnDistribution_TheBird(View view) {
        Intent intent = new Intent(DistributionMenuActivity.this, VerseFiveActivity.class);
        startActivity(intent);
    }

    public void Click_btnDistribution_Weather(View view) {
        Intent intent = new Intent(DistributionMenuActivity.this, VerseSixActivity.class);
        startActivity(intent);
    }

    public void Click_btnDistribution_October(View view) {
        Intent intent = new Intent(DistributionMenuActivity.this, VerseeSvenActivity.class);
        startActivity(intent);
    }

    public void Click_btnDistribution_Winter(View view) {
        Intent intent = new Intent(DistributionMenuActivity.this, VerseEightActivity.class);
        startActivity(intent);
    }

    public void Click_btnDistribution_MyMime(View view) {
        Intent intent = new Intent(DistributionMenuActivity.this, VerseNineActivity.class);
        startActivity(intent);
    }

    public void Click_btnDistribution_Signs(View view) {
        Intent intent = new Intent(DistributionMenuActivity.this, VerseTenActivity.class);
        startActivity(intent);
    }

    public void Click_btnDistribution_Answer(View view) {
        Intent intent = new Intent(DistributionMenuActivity.this, VerseElevenActivity.class);
        startActivity(intent);
    }

    public void Click_btnDistribution_When(View view) {
        Intent intent = new Intent(DistributionMenuActivity.this, VerseTwelveActivity.class);
        startActivity(intent);
    }
}
