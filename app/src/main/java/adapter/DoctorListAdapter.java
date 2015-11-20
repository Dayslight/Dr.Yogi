package adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.dryogi.R;

import java.util.ArrayList;

public class DoctorListAdapter extends BaseAdapter {

    private static LayoutInflater inflater = null;
    ArrayList<String> mdoctorlist;
    private Context activity_context;


    public DoctorListAdapter(Context applicationContext,
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

            vi = inflater.inflate(R.layout.doctorlist_viewitem, null);

            holder = new ViewHolder();
//            holder.countrytxt = (TextView) vi
//                    .findViewById(R.id.txt_cityname);


            vi.setTag(holder);
        } else {
            holder = (ViewHolder) vi.getTag();


        }


        return vi;
    }


    public static class ViewHolder {


    }


}