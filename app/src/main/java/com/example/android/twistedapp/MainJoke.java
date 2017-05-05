package com.example.android.twistedapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainJoke extends AppCompatActivity {
    private TextView mjokeView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_joke);


        mjokeView = (TextView) findViewById(R.id.jokeView);


        String[] jokeArray = {
                "What's the only part of a Muslim to have had a wash?\n" +
                        "\n" +
                        "The brain.",
                "I had a threesome last night with two Down syndrome girls.\n" +
                        "\n" +
                        "Nothing better than having your meat in two veg.",
                "I wonder if the Arachnophobia Helpline have a web site.",
                "Daily Mail online: \"Masturbation may help prevent the common cold.\"\n" +
                        "\n" +
                        "Hope so, I've got no tissues left",
                " not saying you should totally distrust the internet, but there's a huge discrepancy between the number of iPads I've won, and the number of iPads i own",
                "Lesbians, if you hate men so much, stop trying to look like them!\n" +
                        "\n" +
                        "You don't see jews dressed as nazis."

        };

        for (String dummyfield : jokeArray) {
            mjokeView.append(dummyfield + "\n\n\n");
        }


    }

}
