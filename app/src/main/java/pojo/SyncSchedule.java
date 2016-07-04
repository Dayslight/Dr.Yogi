package pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;


public class SyncSchedule {

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
     * @return The entity
     */
    public String getEntity() {
        return entity;
    }

    /**
     * @param entity The entity
     */
    public void setEntity(String entity) {
        this.entity = entity;
    }

    /**
     * @return The ts
     */
    public Integer getTs() {
        return ts;
    }

    /**
     * @param ts The ts
     */
    public void setTs(Integer ts) {
        this.ts = ts;
    }

    /**
     * @return The date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date The date
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return The createdDocs
     */
    public List<CreatedDoc> getCreatedDocs() {
        return createdDocs;
    }

    /**
     * @param createdDocs The createdDocs
     */
    public void setCreatedDocs(List<CreatedDoc> createdDocs) {
        this.createdDocs = createdDocs;
    }

    /**
     * @return The updatedDocs
     */
    public List<Object> getUpdatedDocs() {
        return updatedDocs;
    }

    /**
     * @param updatedDocs The updatedDocs
     */
    public void setUpdatedDocs(List<Object> updatedDocs) {
        this.updatedDocs = updatedDocs;
    }

    /**
     * @return The removedDocs
     */
    public List<Object> getRemovedDocs() {
        return removedDocs;
    }

    /**
     * @param removedDocs The removedDocs
     */
    public void setRemovedDocs(List<Object> removedDocs) {
        this.removedDocs = removedDocs;
    }


    public class User {

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
         * @return The id
         */
        public String getId() {
            return id;
        }

        /**
         * @param id The _id
         */
        public void setId(String id) {
            this.id = id;
        }

        /**
         * @return The email
         */
        public String getEmail() {
            return email;
        }

        /**
         * @param email The email
         */
        public void setEmail(String email) {
            this.email = email;
        }

        /**
         * @return The memberId
         */
        public Integer getMemberId() {
            return memberId;
        }

        /**
         * @param memberId The memberId
         */
        public void setMemberId(Integer memberId) {
            this.memberId = memberId;
        }

        /**
         * @return The role
         */
        public String getRole() {
            return role;
        }

        /**
         * @param role The role
         */
        public void setRole(String role) {
            this.role = role;
        }

        /**
         * @return The name
         */
        public Name_ getName() {
            return name;
        }

        /**
         * @param name The name
         */
        public void setName(Name_ name) {
            this.name = name;
        }

    }

    public class Browser {

        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("version")
        @Expose
        private String version;

        /**
         * @return The name
         */
        public String getName() {
            return name;
        }

        /**
         * @param name The name
         */
        public void setName(String name) {
            this.name = name;
        }

        /**
         * @return The version
         */
        public String getVersion() {
            return version;
        }

        /**
         * @param version The version
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
        private Name name;

        /**
         * @return The id
         */
        public String getId() {
            return id;
        }

        /**
         * @param id The _id
         */
        public void setId(String id) {
            this.id = id;
        }

        /**
         * @return The email
         */
        public String getEmail() {
            return email;
        }

        /**
         * @param email The email
         */
        public void setEmail(String email) {
            this.email = email;
        }

        /**
         * @return The memberId
         */
        public Integer getMemberId() {
            return memberId;
        }

        /**
         * @param memberId The memberId
         */
        public void setMemberId(Integer memberId) {
            this.memberId = memberId;
        }

        /**
         * @return The role
         */
        public String getRole() {
            return role;
        }

        /**
         * @param role The role
         */
        public void setRole(String role) {
            this.role = role;
        }

        /**
         * @return The name
         */
        public Name getName() {
            return name;
        }

        /**
         * @param name The name
         */
        public void setName(Name name) {
            this.name = name;
        }

    }

    public class CreatedDoc {

        @SerializedName("_id")
        @Expose
        private String id;
        @SerializedName("day")
        @Expose
        private String day;
        @SerializedName("date")
        @Expose
        private String date;
        @SerializedName("startTime")
        @Expose
        private Integer startTime;
        @SerializedName("endTime")
        @Expose
        private Integer endTime;
        @SerializedName("__v")
        @Expose
        private Integer v;
        @SerializedName("createdBy")
        @Expose
        private CreatedBy createdBy;
        @SerializedName("createdOn")
        @Expose
        private String createdOn;
        @SerializedName("req")
        @Expose
        private Req req;
        @SerializedName("organization")
        @Expose
        private Organization organization;
        @SerializedName("user")
        @Expose
        private User user;

        /**
         * @return The id
         */
        public String getId() {
            return id;
        }

        /**
         * @param id The _id
         */
        public void setId(String id) {
            this.id = id;
        }

        /**
         * @return The day
         */
        public String getDay() {
            return day;
        }

        /**
         * @param day The day
         */
        public void setDay(String day) {
            this.day = day;
        }

        /**
         * @return The date
         */
        public String getDate() {
            return date;
        }

        /**
         * @param date The date
         */
        public void setDate(String date) {
            this.date = date;
        }

        /**
         * @return The startTime
         */
        public Integer getStartTime() {
            return startTime;
        }

        /**
         * @param startTime The startTime
         */
        public void setStartTime(Integer startTime) {
            this.startTime = startTime;
        }

        /**
         * @return The endTime
         */
        public Integer getEndTime() {
            return endTime;
        }

        /**
         * @param endTime The endTime
         */
        public void setEndTime(Integer endTime) {
            this.endTime = endTime;
        }

        /**
         * @return The v
         */
        public Integer getV() {
            return v;
        }

        /**
         * @param v The __v
         */
        public void setV(Integer v) {
            this.v = v;
        }

        /**
         * @return The createdBy
         */
        public CreatedBy getCreatedBy() {
            return createdBy;
        }

        /**
         * @param createdBy The createdBy
         */
        public void setCreatedBy(CreatedBy createdBy) {
            this.createdBy = createdBy;
        }

        /**
         * @return The createdOn
         */
        public String getCreatedOn() {
            return createdOn;
        }

        /**
         * @param createdOn The createdOn
         */
        public void setCreatedOn(String createdOn) {
            this.createdOn = createdOn;
        }

        /**
         * @return The req
         */
        public Req getReq() {
            return req;
        }

        /**
         * @param req The req
         */
        public void setReq(Req req) {
            this.req = req;
        }

        /**
         * @return The organization
         */
        public Organization getOrganization() {
            return organization;
        }

        /**
         * @param organization The organization
         */
        public void setOrganization(Organization organization) {
            this.organization = organization;
        }

        /**
         * @return The user
         */
        public User getUser() {
            return user;
        }

        /**
         * @param user The user
         */
        public void setUser(User user) {
            this.user = user;
        }

    }

    public class Name {

        @SerializedName("given")
        @Expose
        private String given;
        @SerializedName("family")
        @Expose
        private String family;

        /**
         * @return The given
         */
        public String getGiven() {
            return given;
        }

        /**
         * @param given The given
         */
        public void setGiven(String given) {
            this.given = given;
        }

        /**
         * @return The family
         */
        public String getFamily() {
            return family;
        }

        /**
         * @param family The family
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
         * @return The given
         */
        public String getGiven() {
            return given;
        }

        /**
         * @param given The given
         */
        public void setGiven(String given) {
            this.given = given;
        }

        /**
         * @return The family
         */
        public String getFamily() {
            return family;
        }

        /**
         * @param family The family
         */
        public void setFamily(String family) {
            this.family = family;
        }

    }

    public class Organization {

        @SerializedName("_id")
        @Expose
        private String id;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("email")
        @Expose
        private String email;
        @SerializedName("kind")
        @Expose
        private String kind;

        /**
         * @return The id
         */
        public String getId() {
            return id;
        }

        /**
         * @param id The _id
         */
        public void setId(String id) {
            this.id = id;
        }

        /**
         * @return The name
         */
        public String getName() {
            return name;
        }

        /**
         * @param name The name
         */
        public void setName(String name) {
            this.name = name;
        }

        /**
         * @return The email
         */
        public String getEmail() {
            return email;
        }

        /**
         * @param email The email
         */
        public void setEmail(String email) {
            this.email = email;
        }

        /**
         * @return The kind
         */
        public String getKind() {
            return kind;
        }

        /**
         * @param kind The kind
         */
        public void setKind(String kind) {
            this.kind = kind;
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
         * @return The name
         */
        public String getName() {
            return name;
        }

        /**
         * @param name The name
         */
        public void setName(String name) {
            this.name = name;
        }

        /**
         * @return The version
         */
        public String getVersion() {
            return version;
        }

        /**
         * @param version The version
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
         * @return The ua
         */
        public String getUa() {
            return ua;
        }

        /**
         * @param ua The ua
         */
        public void setUa(String ua) {
            this.ua = ua;
        }

        /**
         * @return The ip
         */
        public String getIp() {
            return ip;
        }

        /**
         * @param ip The ip
         */
        public void setIp(String ip) {
            this.ip = ip;
        }

        /**
         * @return The os
         */
        public Os getOs() {
            return os;
        }

        /**
         * @param os The os
         */
        public void setOs(Os os) {
            this.os = os;
        }

        /**
         * @return The browser
         */
        public Browser getBrowser() {
            return browser;
        }

        /**
         * @param browser The browser
         */
        public void setBrowser(Browser browser) {
            this.browser = browser;
        }
    }

}


