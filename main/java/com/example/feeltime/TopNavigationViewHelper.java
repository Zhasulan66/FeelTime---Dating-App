package com.example.feeltime;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.MenuItem;

import androidx.annotation.NonNull;

import com.example.feeltime.Matches.MatchesActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;
//import com.github.ittianyu:BottomNavigationViewEx:2.0.4;

public class TopNavigationViewHelper {
    private static final String TAG = "TopNavigationViewHelper";

    public static void setupTopNavigationView(BottomNavigationView tv){ //ViewEx
        Log.d(TAG, "setupTopNavigationView: setting navigationview");
    }

    public static void enableNavigation(final Context context, BottomNavigationView view){ //ViewEx
        view.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener(){
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item){
                switch (item.getItemId()){
                    case R.id.ic_profile:
                        Intent i = new Intent(context, SettingsActivity.class);
                        context.startActivity(i);
                        break;
                    case R.id.ic_matched:
                        Intent i1 = new Intent(context, MatchesActivity.class);
                        context.startActivity(i1);
                        break;
                }
                return false;
            }
        });
    }

}
