package com.mckenney.udacity.myappportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private Button buttonSpotify;
    private Button buttonScores;
    private Button buttonLibrary;
    private Button buttonBuildIt;
    private Button buttonXYZ;
    private Button buttonCapstone;


    //TOAST DURATION
    int toastDuration = Toast.LENGTH_SHORT;

    // TOAST TEXT
    CharSequence textSpotify = "This will launch the Spotify App";
    CharSequence textScores = "This will launch the Football Scores App";
    CharSequence textLibrary = "This will launch the Library App";
    CharSequence textBuildIt = "This will launch the Build It Bigger App";
    CharSequence textXYZ = "This will launch the XYZ Reader App";
    CharSequence textCapstone = "This will launch the final Capstone Project App";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Context toastContext = getApplicationContext();

        // TOAST OBJECTS
        final Toast spotifyToast = Toast.makeText(toastContext, textSpotify, toastDuration);
        final Toast scoresToast = Toast.makeText(toastContext, textScores, toastDuration);
        final Toast libraryToast = Toast.makeText(toastContext, textLibrary, toastDuration);
        final Toast buildItToast = Toast.makeText(toastContext, textBuildIt, toastDuration);
        final Toast xyzToast = Toast.makeText(toastContext, textXYZ, toastDuration);
        final Toast capstoneToast = Toast.makeText(toastContext, textCapstone, toastDuration);


        //All Buttons listed below - Could have probably organized them into a class and called a method instead.

        buttonSpotify = (Button) findViewById(R.id.button_spotify);
        buttonSpotify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                spotifyToast.show();

            }
        });

        buttonScores = (Button) findViewById(R.id.button_scores);
        buttonScores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoresToast.show();

            }
        });

        buttonLibrary = (Button) findViewById(R.id.button_library);
        buttonLibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                libraryToast.show();

            }
        });

        buttonBuildIt = (Button) findViewById(R.id.button_buildit);
        buttonBuildIt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buildItToast.show();

            }
        });

        buttonXYZ = (Button) findViewById(R.id.button_xyz);
        buttonXYZ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xyzToast.show();

            }
        });

        buttonCapstone = (Button) findViewById(R.id.button_capstone);
        buttonCapstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                capstoneToast.show();

            }
        });

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
}
