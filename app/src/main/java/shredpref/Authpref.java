package shredpref;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by bijaybogati on 3/12/16.
 */
public class AuthPref {
    String AUTHPREF = "JWT_ACCESS_TOKEN";
    Context mContext;
    SharedPreferences pref;
    SharedPreferences.Editor editor;

    String authToken = "authToken";

    public AuthPref(Context context) {

        this.mContext = context;
        this.pref = mContext
                .getSharedPreferences(AUTHPREF, Context.MODE_PRIVATE);

    }

    public String getAuthToken() {
        return pref.getString(authToken, "");
    }

    public void setAuthToken(String authToken) {
        editor = pref.edit();
        editor.putString(authToken, authToken);
        editor.apply();

    }
}
