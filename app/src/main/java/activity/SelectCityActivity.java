package activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.dryogi.R;
import com.rengwuxian.materialedittext.MaterialEditText;

import java.util.ArrayList;

import adapter.CityListAdapter;

public class SelectCityActivity extends Activity {

    ListView locationList;
    ArrayList<String> arrayfrmXmllocation = new ArrayList<String>();
    CityListAdapter list_adapters;
    MaterialEditText inputSearch;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_city);


        locationList = (ListView) findViewById(R.id.listView);
        inputSearch = (MaterialEditText) findViewById(R.id.inputSearch);


        arrayfrmXmllocation.add("Kathmandu");
        arrayfrmXmllocation.add("Pokhara");
        arrayfrmXmllocation.add("Bharatpur");


        list_adapters = new CityListAdapter(getApplicationContext(), arrayfrmXmllocation);
        locationList.setAdapter(list_adapters);


        locationList.setClickable(true);
        locationList.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {


                if (getIntent().getExtras().get("class").toString().equals("splash")) {

                    Intent intent = new Intent(getApplicationContext(), FirstPageActivity.class);
                    startActivity(intent);
                    finish();
                } else if (getIntent().getExtras().get("class").toString().equals("inner")) {

                    finish();
                }


            }
        });


        inputSearch.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence cs, int arg1, int arg2, int arg3) {
                // When user changed the Text
                list_adapters.getFilter().filter(cs);


            }

            @Override
            public void beforeTextChanged(CharSequence arg0, int arg1, int arg2,
                                          int arg3) {
                // TODO Auto-generated method stub

            }

            @Override
            public void afterTextChanged(Editable arg0) {
                // TODO Auto-generated method stub
            }
        });


    }

}
