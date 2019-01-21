package com.example.sinet.wt;

<<<<<<< Updated upstream
import android.database.DataSetObserver;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.ViewPager;
=======
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
>>>>>>> Stashed changes
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
<<<<<<< Updated upstream
import android.view.ViewGroup;
import android.widget.Adapter;

import com.example.sinet.wt.Adapter.HeadlineAdapter;
import com.example.sinet.wt.Model.HeadlineModel;

import java.util.ArrayList;
import java.util.List;
=======
>>>>>>> Stashed changes

public class HomeActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

<<<<<<< Updated upstream

    ViewPager viewPager;
    HeadlineAdapter adapter;
    List<HeadlineModel> models;

=======
>>>>>>> Stashed changes
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
<<<<<<< Updated upstream

        //headlines swipe layout

        models=new ArrayList<>();
        models.add(new HeadlineModel(R.drawable.namecard,"आजको ताजा खबर","३ माघ, बिर्तामोड । नेपाल कम्युनिस्ट पार्टीका नेता योगेश भट्टराईले नेपाल बाहिर विद्यार्थी बेच्न खुलेका काराखानाले डा. गोबिन्द केसीलाई उचालेर पटकपटक अनसन बसाल्ने गरेको आरोप लगाएका छन् । झापाको बिर्तामोडमा बिहीबार सञ्चारकर्मीसाग कुरा गर्दै संसदको शिक्षा तथा स्वास्थ्य समितिका सदस्य समेत रहेका भट्टराईले चिकित्सा शिक्षा विधेयकले डा. केसीका माग पूरा गरिसकेको दावी गरे ।"));
        models.add(new HeadlineModel(R.drawable.namecard,"आजको ताजा खबर","३ माघ, बिर्तामोड । नेपाल कम्युनिस्ट पार्टीका नेता योगेश भट्टराईले नेपाल बाहिर विद्यार्थी बेच्न खुलेका काराखानाले डा. गोबिन्द केसीलाई उचालेर पटकपटक अनसन बसाल्ने गरेको आरोप लगाएका छन् । झापाको बिर्तामोडमा बिहीबार सञ्चारकर्मीसाग कुरा गर्दै संसदको शिक्षा तथा स्वास्थ्य समितिका सदस्य समेत रहेका भट्टराईले चिकित्सा शिक्षा विधेयकले डा. केसीका माग पूरा गरिसकेको दावी गरे ।"));
        models.add(new HeadlineModel(R.drawable.namecard,"आजको ताजा खबर","३ माघ, बिर्तामोड । नेपाल कम्युनिस्ट पार्टीका नेता योगेश भट्टराईले नेपाल बाहिर विद्यार्थी बेच्न खुलेका काराखानाले डा. गोबिन्द केसीलाई उचालेर पटकपटक अनसन बसाल्ने गरेको आरोप लगाएका छन् । झापाको बिर्तामोडमा बिहीबार सञ्चारकर्मीसाग कुरा गर्दै संसदको शिक्षा तथा स्वास्थ्य समितिका सदस्य समेत रहेका भट्टराईले चिकित्सा शिक्षा विधेयकले डा. केसीका माग पूरा गरिसकेको दावी गरे ।"));
        models.add(new HeadlineModel(R.drawable.namecard,"आजको ताजा खबर","३ माघ, बिर्तामोड । नेपाल कम्युनिस्ट पार्टीका नेता योगेश भट्टराईले नेपाल बाहिर विद्यार्थी बेच्न खुलेका काराखानाले डा. गोबिन्द केसीलाई उचालेर पटकपटक अनसन बसाल्ने गरेको आरोप लगाएका छन् । झापाको बिर्तामोडमा बिहीबार सञ्चारकर्मीसाग कुरा गर्दै संसदको शिक्षा तथा स्वास्थ्य समितिका सदस्य समेत रहेका भट्टराईले चिकित्सा शिक्षा विधेयकले डा. केसीका माग पूरा गरिसकेको दावी गरे ।"));

        adapter = new HeadlineAdapter(models,this);
        viewPager=findViewById(R.id.headlineViewPager);
        viewPager.setAdapter(adapter);

=======
>>>>>>> Stashed changes
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
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

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
