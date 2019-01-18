package com.example.sinet.wt.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sinet.wt.Model.HeadlineModel;
import com.example.sinet.wt.R;

import java.util.List;

public class HeadlineAdapter extends PagerAdapter {

    private List<HeadlineModel> headlineModels;
    private LayoutInflater layoutInflater;
    private Context context;

    public HeadlineAdapter(List<HeadlineModel> headlineModels, Context context) {
        this.headlineModels = headlineModels;
        this.context = context;
    }

    @Override
    public int getCount() {
        return headlineModels.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view.equals(o);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container,final int position) {
        layoutInflater=LayoutInflater.from(context);
        View view=layoutInflater.inflate(R.layout.headlineitem, container, false);
        ImageView image;
        TextView title,desc;

        image=view.findViewById(R.id.headlineImage);
        title=view.findViewById(R.id.headlineTitle);
        desc=view.findViewById(R.id.headlineDescription);

        image.setImageResource(headlineModels.get(position).getImage());
        title.setText(headlineModels.get(position).getTitle());
        desc.setText(headlineModels.get(position).getDescription());

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(context, "Clicked", Toast.LENGTH_SHORT).show();
//                Intent intent = new Intent(context, DetailActivity.class);
//                intent.putExtra("param", models.get(position).getTitle());
//                context.startActivity(intent);
//                // finish();
            }
        });

        container.addView(view,0);


        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }
}
