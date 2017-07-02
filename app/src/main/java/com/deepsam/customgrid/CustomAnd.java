package com.deepsam.customgrid;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

    class myadapter extends BaseAdapter {

    private Context mContext;
    private final String[] Name;
    private final int[] ImageId;

    public myadapter(Context context, String[] Name, int[] ImageId) {
        mContext = context;
        this.Name = Name;
        this.ImageId = ImageId;
    }

    @Override
    public int getCount() {
        return Name.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        View gridViewAndroid;
        ImageView imageview;
        LayoutInflater inflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null) {

            gridViewAndroid = new View(mContext);
            imageview=new ImageView(mContext);
            imageview.setLayoutParams(new GridView.LayoutParams(200, 200));
            imageview.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageview.setPadding(15, 15, 15, 15);
            gridViewAndroid = inflater.inflate(R.layout.activity_custom_and, null);
            TextView textViewAndroid = (TextView) gridViewAndroid.findViewById(R.id.textView);
            ImageView imageViewAndroid = (ImageView) gridViewAndroid.findViewById(R.id.imageView);
            textViewAndroid.setText(Name[i]);
            imageViewAndroid.setImageResource(ImageId[i]);
        } else {
            gridViewAndroid = (View) convertView;
        }

        return gridViewAndroid;
    }
}
