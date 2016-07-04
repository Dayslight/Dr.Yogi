package pojo;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class SyncAppointment {

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
        @SerializedName("age")
        @Expose
        private Integer age;
        @SerializedName("reason")
        @Expose
        private String reason;
        @SerializedName("time")
        @Expose
        private Integer time;
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
        @SerializedName("payment")
        @Expose
        private Payment payment;
        @SerializedName("isPaid")
        @Expose
        private Boolean isPaid;
        @SerializedName("isFollowup")
        @Expose
        private Boolean isFollowup;
        @SerializedName("organization")
        @Expose
        private Organization organization;
        @SerializedName("patient")
        @Expose
        private Patient patient;
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
         * @return The age
         */
        public Integer getAge() {
            return age;
        }

        /**
         * @param age The age
         */
        public void setAge(Integer age) {
            this.age = age;
        }

        /**
         * @return The reason
         */
        public String getReason() {
            return reason;
        }

        /**
         * @param reason The reason
         */
        public void setReason(String reason) {
            this.reason = reason;
        }

        /**
         * @return The time
         */
        public Integer getTime() {
            return time;
        }

        /**
         * @param time The time
         */
        public void setTime(Integer time) {
            this.time = time;
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
         * @return The payment
         */
        public Payment getPayment() {
            return payment;
        }

        /**
         * @param payment The payment
         */
        public void setPayment(Payment payment) {
            this.payment = payment;
        }

        /**
         * @return The isPaid
         */
        public Boolean getIsPaid() {
            return isPaid;
        }

        /**
         * @param isPaid The isPaid
         */
        public void setIsPaid(Boolean isPaid) {
            this.isPaid = isPaid;
        }

        /**
         * @return The isFollowup
         */
        public Boolean getIsFollowup() {
            return isFollowup;
        }

        /**
         * @param isFollowup The isFollowup
         */
        public void setIsFollowup(Boolean isFollowup) {
            this.isFollowup = isFollowup;
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
         * @return The patient
         */
        public Patient getPatient() {
            return patient;
        }

        /**
         * @param patient The patient
         */
        public void setPatient(Patient patient) {
            this.patient = patient;
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

    public class Payment {

        @SerializedName("method")
        @Expose
        private String method;
        @SerializedName("amount")
        @Expose
        private Integer amount;

        /**
         * @return The method
         */
        public String getMethod() {
            return method;
        }

        /**
         * @param method The method
         */
        public void setMethod(String method) {
            this.method = method;
        }

        /**
         * @return The amount
         */
        public Integer getAmount() {
            return amount;
        }

        /**
         * @param amount The amount
         */
        public void setAmount(Integer amount) {
            this.amount = amount;
        }

    }

    public class Patient {

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
        private Name__ name;

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
        public Name__ getName() {
            return name;
        }

        /**
         * @param name The name
         */
        public void setName(Name__ name) {
            this.name = name;
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

    public class Name__ {

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


}







