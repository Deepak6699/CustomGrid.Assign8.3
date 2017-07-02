package com.deepsam.customgrid;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    GridView androidGridView;
      String Name[]={"GINGER BREAD","HONEY COMB","ICE CREAM SANDWICH","JELLY BEAN","KITKAT","LOLLIPOP"};
     int[] ImageId={R.drawable.ginger,R.drawable.honey,R.drawable.icecream,R.drawable.jellybean,

            R.drawable.kitkat,R.drawable.lollipop};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myadapter myadapter1 = new myadapter(MainActivity.this,Name,ImageId);
        androidGridView=(GridView)findViewById(R.id.androidgrid);
        androidGridView.setAdapter(myadapter1);

    }
}


