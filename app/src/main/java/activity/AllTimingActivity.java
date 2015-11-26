package activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.dryogi.R;

import java.util.ArrayList;

import adapter.AllTimeListAdapter;

public class AllTimingActivity extends AppCompatActivity {


    ListView alltimelistview;

    ArrayList<String> arrayalltimelist = new ArrayList<String>();

    AllTimeListAdapter allTimeListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_timing);


        alltimelistview = (ListView) findViewById(R.id.alltimelistview);

        arrayalltimelist.add("1");
        arrayalltimelist.add("2");
        arrayalltimelist.add("3");
        arrayalltimelist.add("4");
        arrayalltimelist.add("5");
        arrayalltimelist.add("6");
        arrayalltimelist.add("7");



        allTimeListAdapter = new AllTimeListAdapter(getApplicationContext(), arrayalltimelist);
        alltimelistview.setAdapter(allTimeListAdapter);


    }

}
