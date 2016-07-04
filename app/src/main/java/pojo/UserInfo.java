package pojo;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class UserInfo {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("memberId")
    @Expose
    private Integer memberId;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("gender")
    @Expose
    private String gender;
    @SerializedName("contactPhone")
    @Expose
    private String contactPhone;
    @SerializedName("__v")
    @Expose
    private Integer v;
    @SerializedName("createdOn")
    @Expose
    private String createdOn;
    @SerializedName("medicalHistoryReportCount")
    @Expose
    private Integer medicalHistoryReportCount;
    @SerializedName("medicalHistoryReports")
    @Expose
    private List<Object> medicalHistoryReports = new ArrayList<Object>();
    @SerializedName("followingOrganizations")
    @Expose
    private List<String> followingOrganizations = new ArrayList<String>();
    @SerializedName("departmentCount")
    @Expose
    private Integer departmentCount;
    @SerializedName("departments")
    @Expose
    private List<Department> departments = new ArrayList<Department>();
    @SerializedName("affiliateCount")
    @Expose
    private Integer affiliateCount;
    @SerializedName("affiliates")
    @Expose
    private List<Affiliate> affiliates = new ArrayList<Affiliate>();
    @SerializedName("role")
    @Expose
    private String role;
    @SerializedName("name")
    @Expose
    private Name name;
    @SerializedName("avatar")
    @Expose
    private Avatar avatar;

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
     * @return The gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender The gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return The contactPhone
     */
    public String getContactPhone() {
        return contactPhone;
    }

    /**
     * @param contactPhone The contactPhone
     */
    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
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
     * @return The medicalHistoryReportCount
     */
    public Integer getMedicalHistoryReportCount() {
        return medicalHistoryReportCount;
    }

    /**
     * @param medicalHistoryReportCount The medicalHistoryReportCount
     */
    public void setMedicalHistoryReportCount(Integer medicalHistoryReportCount) {
        this.medicalHistoryReportCount = medicalHistoryReportCount;
    }

    /**
     * @return The medicalHistoryReports
     */
    public List<Object> getMedicalHistoryReports() {
        return medicalHistoryReports;
    }

    /**
     * @param medicalHistoryReports The medicalHistoryReports
     */
    public void setMedicalHistoryReports(List<Object> medicalHistoryReports) {
        this.medicalHistoryReports = medicalHistoryReports;
    }

    /**
     * @return The followingOrganizations
     */
    public List<String> getFollowingOrganizations() {
        return followingOrganizations;
    }

    /**
     * @param followingOrganizations The followingOrganizations
     */
    public void setFollowingOrganizations(List<String> followingOrganizations) {
        this.followingOrganizations = followingOrganizations;
    }

    /**
     * @return The departmentCount
     */
    public Integer getDepartmentCount() {
        return departmentCount;
    }

    /**
     * @param departmentCount The departmentCount
     */
    public void setDepartmentCount(Integer departmentCount) {
        this.departmentCount = departmentCount;
    }

    /**
     * @return The departments
     */
    public List<Department> getDepartments() {
        return departments;
    }

    /**
     * @param departments The departments
     */
    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    /**
     * @return The affiliateCount
     */
    public Integer getAffiliateCount() {
        return affiliateCount;
    }

    /**
     * @param affiliateCount The affiliateCount
     */
    public void setAffiliateCount(Integer affiliateCount) {
        this.affiliateCount = affiliateCount;
    }

    /**
     * @return The affiliates
     */
    public List<Affiliate> getAffiliates() {
        return affiliates;
    }

    /**
     * @param affiliates The affiliates
     */
    public void setAffiliates(List<Affiliate> affiliates) {
        this.affiliates = affiliates;
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

    /**
     * @return The avatar
     */
    public Avatar getAvatar() {
        return avatar;
    }

    /**
     * @param avatar The avatar
     */
    public void setAvatar(Avatar avatar) {
        this.avatar = avatar;
    }

    public class Affiliate {

        @SerializedName("_id")
        @Expose
        private String id;
        @SerializedName("createdOn")
        @Expose
        private String createdOn;
        @SerializedName("isContactPerson")
        @Expose
        private Boolean isContactPerson;
        @SerializedName("organization")
        @Expose
        private Organization organization;

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
         * @return The isContactPerson
         */
        public Boolean getIsContactPerson() {
            return isContactPerson;
        }

        /**
         * @param isContactPerson The isContactPerson
         */
        public void setIsContactPerson(Boolean isContactPerson) {
            this.isContactPerson = isContactPerson;
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

    }

    public class Avatar {

        @SerializedName("urls")
        @Expose
        private Urls urls;
        @SerializedName("isSilhouette")
        @Expose
        private Boolean isSilhouette;

        /**
         * @return The urls
         */
        public Urls getUrls() {
            return urls;
        }

        /**
         * @param urls The urls
         */
        public void setUrls(Urls urls) {
            this.urls = urls;
        }

        /**
         * @return The isSilhouette
         */
        public Boolean getIsSilhouette() {
            return isSilhouette;
        }

        /**
         * @param isSilhouette The isSilhouette
         */
        public void setIsSilhouette(Boolean isSilhouette) {
            this.isSilhouette = isSilhouette;
        }

    }

    public class City {

        @SerializedName("_id")
        @Expose
        private String id;
        @SerializedName("name")
        @Expose
        private String name;

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

    }

    public class Country {

        @SerializedName("_id")
        @Expose
        private String id;
        @SerializedName("name")
        @Expose
        private String name;

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

    }

    public class Department {

        @SerializedName("_id")
        @Expose
        private String id;
        @SerializedName("name")
        @Expose
        private String name;

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

    }

    public class Name {

        @SerializedName("prefix")
        @Expose
        private String prefix;
        @SerializedName("given")
        @Expose
        private String given;
        @SerializedName("family")
        @Expose
        private String family;
        @SerializedName("full")
        @Expose
        private String full;

        /**
         * @return The prefix
         */
        public String getPrefix() {
            return prefix;
        }

        /**
         * @param prefix The prefix
         */
        public void setPrefix(String prefix) {
            this.prefix = prefix;
        }

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

        /**
         * @return The full
         */
        public String getFull() {
            return full;
        }

        /**
         * @param full The full
         */
        public void setFull(String full) {
            this.full = full;
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
        @SerializedName("city")
        @Expose
        private City city;
        @SerializedName("state")
        @Expose
        private State state;
        @SerializedName("country")
        @Expose
        private Country country;

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

        /**
         * @return The city
         */
        public City getCity() {
            return city;
        }

        /**
         * @param city The city
         */
        public void setCity(City city) {
            this.city = city;
        }

        /**
         * @return The state
         */
        public State getState() {
            return state;
        }

        /**
         * @param state The state
         */
        public void setState(State state) {
            this.state = state;
        }

        /**
         * @return The country
         */
        public Country getCountry() {
            return country;
        }

        /**
         * @param country The country
         */
        public void setCountry(Country country) {
            this.country = country;
        }

    }

    public class State {

        @SerializedName("_id")
        @Expose
        private String id;
        @SerializedName("name")
        @Expose
        private String name;

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

    }

    public class Urls {

        @SerializedName("x250")
        @Expose
        private String x250;
        @SerializedName("x80")
        @Expose
        private String x80;
        @SerializedName("x40")
        @Expose
        private String x40;
        @SerializedName("x20")
        @Expose
        private String x20;

        /**
         * @return The x250
         */
        public String getX250() {
            return x250;
        }

        /**
         * @param x250 The x250
         */
        public void setX250(String x250) {
            this.x250 = x250;
        }

        /**
         * @return The x80
         */
        public String getX80() {
            return x80;
        }

        /**
         * @param x80 The x80
         */
        public void setX80(String x80) {
            this.x80 = x80;
        }

        /**
         * @return The x40
         */
        public String getX40() {
            return x40;
        }

        /**
         * @param x40 The x40
         */
        public void setX40(String x40) {
            this.x40 = x40;
        }

        /**
         * @return The x20
         */
        public String getX20() {
            return x20;
        }

        /**
         * @param x20 The x20
         */
        public void setX20(String x20) {
            this.x20 = x20;
        }

    }

}


