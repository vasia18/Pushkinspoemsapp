package top.vsebudet.pushkinspoemsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_go_to;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_go_to = findViewById(R.id.btn_go_to);

    }

    public void BtnActivity(View view) {
        Intent intent = new Intent(MainActivity.this, DistributionMenuActivity.class);
        startActivity(intent);
    }

}
