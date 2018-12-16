package cp317.greenthumb;

import android.Manifest;
import android.content.pm.PackageManager;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.io.IOException;
import java.util.Set;
import android.content.Intent;

/**
 @Name: MainMenuActivity.java
 @Type: Activity class
 @Deception: this is Activity class that is used as the main screen/main menu of the app from which all the other pages can be reached..
 */


public class MainMenuActivity extends AppCompatActivity {
    private ImageButton settingsButton,scanButton,searchButton;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        if (ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[] { Manifest.permission.CAMERA, Manifest.permission.WRITE_EXTERNAL_STORAGE }, 0);
        }

        //Initialize Buttons

        //Scan Page
        scanButton = findViewById(R.id.scanButton);
        scanButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                openScan();
            }
        });

        //Settings Page
        settingsButton = findViewById(R.id.settingsButton);
        settingsButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                openSettings();
            }
        });
        //Search Page
        searchButton = findViewById(R.id.searchButton);
        searchButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                openSearch();
            }
        });

    }

    /**
     * Open the scan view
     */
    public void openScan() {
        Intent i = new Intent(this, ScanActivity.class);
        startActivity(i);
    }

    /**
     * Open the settings page
     */
    public void openSettings() {
        Intent i = new Intent(this, SettingsActivity.class);
        startActivity(i);
    }

    /**
     * Opens search page
     */
    public void openSearch() {
        Intent i = new Intent(this, SearchActivity.class);
        startActivity(i);
    }

}