package pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AuthLogin {

    @SerializedName("success")
    @Expose
    private Boolean success;
    @SerializedName("token")
    @Expose
    private String token;

    /**
     * @return The success
     */
    public Boolean getSuccess() {
        return success;
    }

    /**
     * @param success The success
     */
    public void setSuccess(Boolean success) {
        this.success = success;
    }

    /**
     * @return The token
     */
    public String getToken() {
        return token;
    }

    /**
     * @param token The token
     */
    public void setToken(String token) {
        this.token = token;
    }

}