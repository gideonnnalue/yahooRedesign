package com.example.android.yahooapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<YahooModel> yahooModels = new ArrayList<>();

    private RecyclerView mailRecycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        yahooModels.add(new YahooModel("I am very happy to have meet you today and i hope we meet again",
                "Facebook", "2h ago"));
        yahooModels.add(new YahooModel("How are you dear, hope you are doing alright, take care goodbye.",
                "Linkdeln", "4h ago"));
        yahooModels.add(new YahooModel("Where are you from, i hope you can make it soon to my party",
                "Whatsapp", "2m ago"));
        yahooModels.add(new YahooModel("Come see me soon ok... alright, bye bye dear, love you.....",
                "Twitter", "6d ago"));
        yahooModels.add(new YahooModel("See you soon my love, greetings dear and say hi to your family",
                "Instagram", "9w ago"));

        initViews();





        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                yahooModels.add(new YahooModel("I am very happy to have meet you today and i hope we meet again",
                        "Facebook", "2h ago"));
                yahooModels.add(new YahooModel("How are you dear, hope you are doing alright, take care goodbye.",
                        "Linkdeln", "4h ago"));
                yahooModels.add(new YahooModel("Where are you from, i hope you can make it soon to my party",
                        "Whatsapp", "2m ago"));
                yahooModels.add(new YahooModel("Come see me soon ok... alright, bye bye dear, love you.....",
                        "Twitter", "6d ago"));
                yahooModels.add(new YahooModel("See you soon my love, greetings dear and say hi to your family",
                        "Instagram", "9w ago"));

                initViews();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        initViews();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void initViews() {
        mailRecycler = (RecyclerView) findViewById(R.id.yahoo_mail_recycler);

        YahooMailAdapter yahooMailAdapter = new YahooMailAdapter(yahooModels);

        mailRecycler.setAdapter(yahooMailAdapter);

        mailRecycler.setLayoutManager(new LinearLayoutManager(this));
    }
}
