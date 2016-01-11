package adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.dryogi.R;

import java.util.ArrayList;

import activity.ClinicDetailActivity;

public class PracticesListAdapter extends BaseAdapter {

    private static LayoutInflater inflater = null;
    ArrayList<String> mdoctorlist;
    private Context activity_context;


    public PracticesListAdapter(Context applicationContext,
                                ArrayList<String> doctorlist) {
        // TODO Auto-generated constructor stub

        activity_context = applicationContext;
        mdoctorlist = doctorlist;

        inflater = (LayoutInflater) activity_context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);


    }

    public int getCount() {

        return mdoctorlist.size();
    }

    public Object getItem(int position) {
        return mdoctorlist.get(position);
    }

    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        View vi = convertView;
        ViewHolder holder;

        if (convertView == null) {

            vi = inflater.inflate(R.layout.practicesitems, null);

            holder = new ViewHolder();
//            holder.countrytxt = (TextView) vi
//                    .findViewById(R.id.txt_cityname);


            vi.setTag(holder);
        } else {
            holder = (ViewHolder) vi.getTag();


        }

        vi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity_context, ClinicDetailActivity.class);
                activity_context.startActivity(intent);
            }
        });


        return vi;
    }


    public static class ViewHolder {


    }


}