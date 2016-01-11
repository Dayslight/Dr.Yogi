package fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import com.dryogi.R;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import adapter.TimePageAdapter;
import view.MyViewPager;

/**
 * Created by bijaybogati on 12/21/15.
 */
public class CreatAccountFragment extends Fragment {

    private MyViewPager mViewPager;
    TextView datetxt;
    String[] days;

    ImageButton backdatebtn, nextdatebtn;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View vi = inflater.inflate(R.layout.fragment_create_account, container, false);


        datetxt = (TextView) vi.findViewById(R.id.datetxt);
        backdatebtn = (ImageButton) vi.findViewById(R.id.backdatebtn);
        nextdatebtn = (ImageButton) vi.findViewById(R.id.nextdatebtn);


        mViewPager = (MyViewPager) vi.findViewById(R.id.materialViewPager);
        mViewPager.setAdapter(new TimePageAdapter(getFragmentManager(), getActivity()));

        DateFormat format = new SimpleDateFormat("EEEE dd MMM");
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_WEEK, calendar.getTime().getDay() + 1);

        days = new String[7];
        for (int i = 0; i < 7; i++) {
            days[i] = format.format(calendar.getTime());
            calendar.add(Calendar.DAY_OF_MONTH, 1);

            System.out.println("Check this ... " + days[i]);
        }


        datetxt.setText(days[0]);
        backdatebtn.setVisibility(View.INVISIBLE);


        mViewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

                switch (position) {

                    case 0:
                        datetxt.setText(days[0]);
                        backdatebtn.setVisibility(View.INVISIBLE);
                        break;
                    case 1:
                        datetxt.setText(days[1]);
                        backdatebtn.setVisibility(View.VISIBLE);

                        break;
                    case 2:
                        datetxt.setText(days[2]);
                        backdatebtn.setVisibility(View.VISIBLE);

                        break;
                    case 3:
                        datetxt.setText(days[3]);
                        backdatebtn.setVisibility(View.VISIBLE);

                        break;
                    case 4:
                        datetxt.setText(days[4]);
                        backdatebtn.setVisibility(View.VISIBLE);

                        break;
                    case 5:
                        datetxt.setText(days[5]);
                        backdatebtn.setVisibility(View.VISIBLE);

                        break;
                    case 6:
                        datetxt.setText(days[6]);
                        backdatebtn.setVisibility(View.VISIBLE);

                        break;


                }

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });


        nextdatebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (mViewPager.getCurrentItem() != 6) {
                    mViewPager.setCurrentItem(mViewPager.getCurrentItem() + 1);
                }
            }
        });


        backdatebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mViewPager.setCurrentItem(mViewPager.getCurrentItem() - 1);


            }
        });


        return vi;
    }
}
