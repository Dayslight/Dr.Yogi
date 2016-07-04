package pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;


public class SyncDepartment {

    @SerializedName("entity")
    @Expose
    private String entity;
    @SerializedName("ts")
    @Expose
    private Integer ts;
    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("createdDocs")
    @Expose
    private List<CreatedDoc> createdDocs = new ArrayList<CreatedDoc>();
    @SerializedName("updatedDocs")
    @Expose
    private List<Object> updatedDocs = new ArrayList<Object>();
    @SerializedName("removedDocs")
    @Expose
    private List<Object> removedDocs = new ArrayList<Object>();

    /**
     *
     * @return
     * The entity
     */
    public String getEntity() {
        return entity;
    }

    /**
     *
     * @param entity
     * The entity
     */
    public void setEntity(String entity) {
        this.entity = entity;
    }

    /**
     *
     * @return
     * The ts
     */
    public Integer getTs() {
        return ts;
    }

    /**
     *
     * @param ts
     * The ts
     */
    public void setTs(Integer ts) {
        this.ts = ts;
    }

    /**
     *
     * @return
     * The date
     */
    public String getDate() {
        return date;
    }

    /**
     *
     * @param date
     * The date
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     *
     * @return
     * The createdDocs
     */
    public List<CreatedDoc> getCreatedDocs() {
        return createdDocs;
    }

    /**
     *
     * @param createdDocs
     * The createdDocs
     */
    public void setCreatedDocs(List<CreatedDoc> createdDocs) {
        this.createdDocs = createdDocs;
    }

    /**
     *
     * @return
     * The updatedDocs
     */
    public List<Object> getUpdatedDocs() {
        return updatedDocs;
    }

    /**
     *
     * @param updatedDocs
     * The updatedDocs
     */
    public void setUpdatedDocs(List<Object> updatedDocs) {
        this.updatedDocs = updatedDocs;
    }

    /**
     *
     * @return
     * The removedDocs
     */
    public List<Object> getRemovedDocs() {
        return removedDocs;
    }

    /**
     *
     * @param removedDocs
     * The removedDocs
     */
    public void setRemovedDocs(List<Object> removedDocs) {
        this.removedDocs = removedDocs;
    }

    public class Browser {

        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("version")
        @Expose
        private String version;

        /**
         *
         * @return
         * The name
         */
        public String getName() {
            return name;
        }

        /**
         *
         * @param name
         * The name
         */
        public void setName(String name) {
            this.name = name;
        }

        /**
         *
         * @return
         * The version
         */
        public String getVersion() {
            return version;
        }

        /**
         *
         * @param version
         * The version
         */
        public void setVersion(String version) {
            this.version = version;
        }

    }

    public class CreatedBy {

        @SerializedName("_id")
        @Expose
        private String id;
        @SerializedName("email")
        @Expose
        private String email;
        @SerializedName("memberId")
        @Expose
        private Integer memberId;
        @SerializedName("role")
        @Expose
        private String role;
        @SerializedName("name")
        @Expose
        private Name_ name;

        /**
         *
         * @return
         * The id
         */
        public String getId() {
            return id;
        }

        /**
         *
         * @param id
         * The _id
         */
        public void setId(String id) {
            this.id = id;
        }

        /**
         *
         * @return
         * The email
         */
        public String getEmail() {
            return email;
        }

        /**
         *
         * @param email
         * The email
         */
        public void setEmail(String email) {
            this.email = email;
        }

        /**
         *
         * @return
         * The memberId
         */
        public Integer getMemberId() {
            return memberId;
        }

        /**
         *
         * @param memberId
         * The memberId
         */
        public void setMemberId(Integer memberId) {
            this.memberId = memberId;
        }

        /**
         *
         * @return
         * The role
         */
        public String getRole() {
            return role;
        }

        /**
         *
         * @param role
         * The role
         */
        public void setRole(String role) {
            this.role = role;
        }

        /**
         *
         * @return
         * The name
         */
        public Name_ getName() {
            return name;
        }

        /**
         *
         * @param name
         * The name
         */
        public void setName(Name_ name) {
            this.name = name;
        }

    }
    public class CreatedDoc {

        @SerializedName("_id")
        @Expose
        private String id;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("__v")
        @Expose
        private Integer v;
        @SerializedName("updatedOn")
        @Expose
        private String updatedOn;
        @SerializedName("updatedBy")
        @Expose
        private UpdatedBy updatedBy;
        @SerializedName("createdBy")
        @Expose
        private CreatedBy createdBy;
        @SerializedName("createdOn")
        @Expose
        private String createdOn;
        @SerializedName("req")
        @Expose
        private Req req;
        @SerializedName("imageIcon")
        @Expose
        private ImageIcon imageIcon;

        /**
         *
         * @return
         * The id
         */
        public String getId() {
            return id;
        }

        /**
         *
         * @param id
         * The _id
         */
        public void setId(String id) {
            this.id = id;
        }

        /**
         *
         * @return
         * The name
         */
        public String getName() {
            return name;
        }

        /**
         *
         * @param name
         * The name
         */
        public void setName(String name) {
            this.name = name;
        }

        /**
         *
         * @return
         * The v
         */
        public Integer getV() {
            return v;
        }

        /**
         *
         * @param v
         * The __v
         */
        public void setV(Integer v) {
            this.v = v;
        }

        /**
         *
         * @return
         * The updatedOn
         */
        public String getUpdatedOn() {
            return updatedOn;
        }

        /**
         *
         * @param updatedOn
         * The updatedOn
         */
        public void setUpdatedOn(String updatedOn) {
            this.updatedOn = updatedOn;
        }

        /**
         *
         * @return
         * The updatedBy
         */
        public UpdatedBy getUpdatedBy() {
            return updatedBy;
        }

        /**
         *
         * @param updatedBy
         * The updatedBy
         */
        public void setUpdatedBy(UpdatedBy updatedBy) {
            this.updatedBy = updatedBy;
        }

        /**
         *
         * @return
         * The createdBy
         */
        public CreatedBy getCreatedBy() {
            return createdBy;
        }

        /**
         *
         * @param createdBy
         * The createdBy
         */
        public void setCreatedBy(CreatedBy createdBy) {
            this.createdBy = createdBy;
        }

        /**
         *
         * @return
         * The createdOn
         */
        public String getCreatedOn() {
            return createdOn;
        }

        /**
         *
         * @param createdOn
         * The createdOn
         */
        public void setCreatedOn(String createdOn) {
            this.createdOn = createdOn;
        }

        /**
         *
         * @return
         * The req
         */
        public Req getReq() {
            return req;
        }

        /**
         *
         * @param req
         * The req
         */
        public void setReq(Req req) {
            this.req = req;
        }

        /**
         *
         * @return
         * The imageIcon
         */
        public ImageIcon getImageIcon() {
            return imageIcon;
        }

        /**
         *
         * @param imageIcon
         * The imageIcon
         */
        public void setImageIcon(ImageIcon imageIcon) {
            this.imageIcon = imageIcon;
        }

    }

    public class ImageIcon {


    }

    public class Name {

        @SerializedName("given")
        @Expose
        private String given;
        @SerializedName("family")
        @Expose
        private String family;

        /**
         *
         * @return
         * The given
         */
        public String getGiven() {
            return given;
        }

        /**
         *
         * @param given
         * The given
         */
        public void setGiven(String given) {
            this.given = given;
        }

        /**
         *
         * @return
         * The family
         */
        public String getFamily() {
            return family;
        }

        /**
         *
         * @param family
         * The family
         */
        public void setFamily(String family) {
            this.family = family;
        }

    }

    public class Name_ {

        @SerializedName("given")
        @Expose
        private String given;
        @SerializedName("family")
        @Expose
        private String family;

        /**
         *
         * @return
         * The given
         */
        public String getGiven() {
            return given;
        }

        /**
         *
         * @param given
         * The given
         */
        public void setGiven(String given) {
            this.given = given;
        }

        /**
         *
         * @return
         * The family
         */
        public String getFamily() {
            return family;
        }

        /**
         *
         * @param family
         * The family
         */
        public void setFamily(String family) {
            this.family = family;
        }

    }

    public class Os {

        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("version")
        @Expose
        private String version;

        /**
         *
         * @return
         * The name
         */
        public String getName() {
            return name;
        }

        /**
         *
         * @param name
         * The name
         */
        public void setName(String name) {
            this.name = name;
        }

        /**
         *
         * @return
         * The version
         */
        public String getVersion() {
            return version;
        }

        /**
         *
         * @param version
         * The version
         */
        public void setVersion(String version) {
            this.version = version;
        }

    }

    public class Req {

        @SerializedName("ua")
        @Expose
        private String ua;
        @SerializedName("ip")
        @Expose
        private String ip;
        @SerializedName("os")
        @Expose
        private Os os;
        @SerializedName("browser")
        @Expose
        private Browser browser;

        /**
         *
         * @return
         * The ua
         */
        public String getUa() {
            return ua;
        }

        /**
         *
         * @param ua
         * The ua
         */
        public void setUa(String ua) {
            this.ua = ua;
        }

        /**
         *
         * @return
         * The ip
         */
        public String getIp() {
            return ip;
        }

        /**
         *
         * @param ip
         * The ip
         */
        public void setIp(String ip) {
            this.ip = ip;
        }

        /**
         *
         * @return
         * The os
         */
        public Os getOs() {
            return os;
        }

        /**
         *
         * @param os
         * The os
         */
        public void setOs(Os os) {
            this.os = os;
        }

        /**
         *
         * @return
         * The browser
         */
        public Browser getBrowser() {
            return browser;
        }

        /**
         *
         * @param browser
         * The browser
         */
        public void setBrowser(Browser browser) {
            this.browser = browser;
        }

    }

    public class UpdatedBy {

        @SerializedName("_id")
        @Expose
        private String id;
        @SerializedName("email")
        @Expose
        private String email;
        @SerializedName("memberId")
        @Expose
        private Integer memberId;
        @SerializedName("role")
        @Expose
        private String role;
        @SerializedName("name")
        @Expose
        private Name name;

        /**
         *
         * @return
         * The id
         */
        public String getId() {
            return id;
        }

        /**
         *
         * @param id
         * The _id
         */
        public void setId(String id) {
            this.id = id;
        }

        /**
         *
         * @return
         * The email
         */
        public String getEmail() {
            return email;
        }

        /**
         *
         * @param email
         * The email
         */
        public void setEmail(String email) {
            this.email = email;
        }

        /**
         *
         * @return
         * The memberId
         */
        public Integer getMemberId() {
            return memberId;
        }

        /**
         *
         * @param memberId
         * The memberId
         */
        public void setMemberId(Integer memberId) {
            this.memberId = memberId;
        }

        /**
         *
         * @return
         * The role
         */
        public String getRole() {
            return role;
        }

        /**
         *
         * @param role
         * The role
         */
        public void setRole(String role) {
            this.role = role;
        }

        /**
         *
         * @return
         * The name
         */
        public Name getName() {
            return name;
        }

        /**
         *
         * @param name
         * The name
         */
        public void setName(Name name) {
            this.name = name;
        }

    }



}

