package fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;

import com.dryogi.R;

import java.util.ArrayList;

import adapter.TimeslotAdapter;


public class TimeShotFragment extends Fragment implements
        ExpandableListView.OnChildClickListener {

    ExpandableListView expandbleLis;
    TimeslotAdapter mNewAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment

        View vi = inflater.inflate(R.layout.fragment_time_shot, container, false);

        expandbleLis = (ExpandableListView) vi.findViewById(R.id.expandableListView);
        expandbleLis.setDividerHeight(2);
        expandbleLis.setGroupIndicator(null);
        expandbleLis.setClickable(true);

        setGroupData();
        setChildGroupData();

        mNewAdapter = new TimeslotAdapter(groupItem, childItem);
        mNewAdapter
                .setInflater(
                        (LayoutInflater) getActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE),
                        getActivity());
        expandbleLis.setAdapter(mNewAdapter);
        expandbleLis.setOnChildClickListener(this);


        return vi;
    }


    public void setGroupData() {
        groupItem.add("Morning before 12pm");
        groupItem.add("Afternoon 12 - 4pm");
        groupItem.add("Evening 4 - 8pm");
    }

    ArrayList<String> groupItem = new ArrayList<String>();
    ArrayList<Object> childItem = new ArrayList<Object>();

    public void setChildGroupData() {
        /**
         * Add Data For TecthNology
         */
        ArrayList<String> child = new ArrayList<String>();
        child.add("10:00 PM - 10:45PM");
        child.add("11:00 PM - 11:45PM");
        childItem.add(child);

        /**
         * Add Data For Mobile
         */
        child = new ArrayList<String>();
        child.add("12:00 PM - 12:45PM");
        child.add("01:00 PM - 01:45PM");
        child.add("02:00 PM - 02:45PM");
        child.add("03:00 PM - 03:45PM");
        childItem.add(child);
        /**
         * Add Data For Manufacture
         */
        child = new ArrayList<String>();
        child.add("04:00 PM - 04:45PM");
        child.add("05:00 PM - 05:45PM");
        child.add("06:00 PM - 06:45PM");
        child.add("07:00 PM - 07:45PM");
        childItem.add(child);

    }

    @Override
    public boolean onChildClick(ExpandableListView parent, View v,
                                int groupPosition, int childPosition, long id) {


        return true;

    }

}
