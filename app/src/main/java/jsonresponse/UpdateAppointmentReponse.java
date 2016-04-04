package jsonresponse;

import android.content.Context;
import android.os.AsyncTask;

import org.json.JSONObject;

/**
 * Created by bijaybogati on 3/12/16.
 */
public class UpdateAppointmentReponse extends AsyncTask<Void, Void, JSONObject> {


    Context mContext;

    public UpdateAppointmentReponse(Context context) {

        this.mContext = context;

    }


    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected JSONObject doInBackground(Void... voids) {
        return null;
    }

    @Override
    protected void onPostExecute(JSONObject jsonObject) {
        super.onPostExecute(jsonObject);
    }
}
