package fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.dryogi.R;

import java.util.ArrayList;

import activity.AllFeedBackActivity;
import adapter.FeedbackListAdapter;
import view.NonScrollListView;


public class FeedBackFragment extends Fragment {

    NonScrollListView feedbackList;
    ArrayList<String> arrayfeedbacklist = new ArrayList<String>();

    FeedbackListAdapter feedbackListAdapter;

    TextView allfeedbackstxt;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View vi = inflater.inflate(R.layout.fragment_feed_back, container, false);

        feedbackList = (NonScrollListView) vi.findViewById(R.id.feedbacklist);

        allfeedbackstxt = (TextView) vi.findViewById(R.id.allfeedbackstxt);


        allfeedbackstxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), AllFeedBackActivity.class);
                startActivity(intent);
            }
        });



        arrayfeedbacklist.add("1");
        arrayfeedbacklist.add("2");
        arrayfeedbacklist.add("3");


        feedbackListAdapter = new FeedbackListAdapter(getActivity(), arrayfeedbacklist);
        feedbackList.setAdapter(feedbackListAdapter);





        return vi;
    }

}
