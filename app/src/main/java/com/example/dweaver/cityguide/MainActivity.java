package com.example.dweaver.cityguide;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String[] attraction={"YouTube Channel","Minecraft Mod Spotlight", "Blender Tutorial", "Live Stream Gaming", "Minecraft Sky Factory Video"};
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_main,R.id.travel, attraction));

    }
    protected void onListItemClick (ListView l, View v, int position, long id){
        switch(position){
            case 0:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/ReapingFire/")));
                break;
            case 1:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=ax2HO2HDUfU")));
                break;
            case 2:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=sb4ryQMvRi4")));
                break;
            case 3:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=gU1f9T3lgvQ")));
                break;
            case 4:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=v-i3Oc4rRfw")));
                break;
        }
    }
}
