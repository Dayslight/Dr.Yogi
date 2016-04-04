package jsonresponse;

import android.content.Context;
import android.os.AsyncTask;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import helpers.ApiHelper;
import helpers.JsonParserHelper;
import shredpref.AuthPref;

/**
 * Created by bijaybogati on 3/12/16.
 */
public class LoginResponse extends
        AsyncTask<Void, Void, Boolean> {

    Context mContext;
    String mUsername;
    String mPassword;
    String mAuth;

    boolean returnVal;


    // Json Response...

    String TAG_EMAIL = "email";
    String TAG_PASSWORD = "password";
    String TAG_AUTH = "JWT_ACCESS_TOKEN";

    LoginResponse(Context context, String username, String password) {
        this.mContext = context;
        this.mUsername = username;
        this.mPassword = password;

    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected Boolean doInBackground(Void... voids) {

        JsonParserHelper jsonParser = new JsonParserHelper();
        List<NameValuePair> sendparam = new ArrayList<NameValuePair>();
        sendparam.add(new BasicNameValuePair(TAG_EMAIL, mUsername));
        sendparam.add(new BasicNameValuePair(TAG_PASSWORD, mPassword));
        String json = jsonParser.makeServiceCall(ApiHelper.loginurl, JsonParserHelper.POST, sendparam);

        if (json != null) {
            try {
                JSONObject jsonObj = new JSONObject(json);
                mAuth = jsonObj.getString(TAG_AUTH);
                assert mAuth != null;
                StoreAuth(mAuth);

                returnVal = true;


            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return returnVal;
    }

    @Override
    protected void onPostExecute(Boolean jsonObject) {
        super.onPostExecute(jsonObject);
    }

    public void StoreAuth(String authToken) {

        AuthPref authPref = new AuthPref(mContext);
        authPref.setAuthToken(authToken);


    }
}
