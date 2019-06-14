package top.vsebudet.pushkinspoemsapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;

public class VerseEightActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verse_eight);


        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//Пишем стрелку назад и title для toolbar
        getSupportActionBar().setTitle("o произведении");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.example_menu_five, menu);
        return super.onCreateOptionsMenu(menu);
    }
}
