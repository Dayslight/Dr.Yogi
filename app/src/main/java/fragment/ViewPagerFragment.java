package fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dryogi.R;

import java.util.ArrayList;

import adapter.CustomGrid;
import view.ExpandableHeightGridView;


public class ViewPagerFragment extends Fragment {

    ExpandableHeightGridView category_grid;

    ArrayList<String> arraygridItem = new ArrayList<String>();



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        View vi = inflater.inflate(R.layout.fragment_view_pager, container, false);

        //  Temp


        arraygridItem.add("Dentist");
        arraygridItem.add("Gynecologist");
        arraygridItem.add("Dermatoligist");
        arraygridItem.add("Homeopath");

        arraygridItem.add("Dentist");
        arraygridItem.add("Gynecologist");
        arraygridItem.add("Dermatoligist");
        arraygridItem.add("Homeopath");

        //

        category_grid = (ExpandableHeightGridView) vi.findViewById(R.id.grid_category);
        category_grid.setFocusable(false);

        CustomGrid adapter = new CustomGrid(getActivity(), arraygridItem);
        category_grid.setAdapter(adapter);
        category_grid.setExpanded(true);


        return vi;
    }

}
