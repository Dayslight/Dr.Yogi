package pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Specialist {

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
    @SerializedName("departments")
    @Expose
    private List<Department> departments = new ArrayList<Department>();
    @SerializedName("affiliates")
    @Expose
    private List<Affiliate> affiliates = new ArrayList<Affiliate>();
    @SerializedName("departmentCount")
    @Expose
    private Integer departmentCount;
    @SerializedName("affiliateCount")
    @Expose
    private Integer affiliateCount;
    @SerializedName("role")
    @Expose
    private String role;
    @SerializedName("name")
    @Expose
    private Name name;
    @SerializedName("schedules")
    @Expose
    private List<Object> schedules = new ArrayList<Object>();
    @SerializedName("scheduleCount")
    @Expose
    private Integer scheduleCount;

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
     * @return The schedules
     */
    public List<Object> getSchedules() {
        return schedules;
    }

    /**
     * @param schedules The schedules
     */
    public void setSchedules(List<Object> schedules) {
        this.schedules = schedules;
    }

    /**
     * @return The scheduleCount
     */
    public Integer getScheduleCount() {
        return scheduleCount;
    }

    /**
     * @param scheduleCount The scheduleCount
     */
    public void setScheduleCount(Integer scheduleCount) {
        this.scheduleCount = scheduleCount;
    }


    public class Id_ {

        @SerializedName("_id")
        @Expose
        private String id;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("address1")
        @Expose
        private String address1;
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
        @SerializedName("logo")
        @Expose
        private Logo logo;

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
         * @return The address1
         */
        public String getAddress1() {
            return address1;
        }

        /**
         * @param address1 The address1
         */
        public void setAddress1(String address1) {
            this.address1 = address1;
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

        /**
         * @return The logo
         */
        public Logo getLogo() {
            return logo;
        }

        /**
         * @param logo The logo
         */
        public void setLogo(Logo logo) {
            this.logo = logo;
        }

    }

    public class ImageIcon {


    }

    public class ImageIcon_ {


    }

    public class Logo {

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

    }

    public class Organization {

        @SerializedName("_id")
        @Expose
        private Id_ id;

        /**
         * @return The id
         */
        public Id_ getId() {
            return id;
        }

        /**
         * @param id The _id
         */
        public void setId(Id_ id) {
            this.id = id;
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

        @SerializedName("thumbnailx250")
        @Expose
        private String thumbnailx250;
        @SerializedName("thumbnail")
        @Expose
        private String thumbnail;
        @SerializedName("original")
        @Expose
        private String original;

        /**
         * @return The thumbnailx250
         */
        public String getThumbnailx250() {
            return thumbnailx250;
        }

        /**
         * @param thumbnailx250 The thumbnailx250
         */
        public void setThumbnailx250(String thumbnailx250) {
            this.thumbnailx250 = thumbnailx250;
        }

        /**
         * @return The thumbnail
         */
        public String getThumbnail() {
            return thumbnail;
        }

        /**
         * @param thumbnail The thumbnail
         */
        public void setThumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
        }

        /**
         * @return The original
         */
        public String getOriginal() {
            return original;
        }

        /**
         * @param original The original
         */
        public void setOriginal(String original) {
            this.original = original;
        }
    }

    public class Affiliate {

        @SerializedName("organization")
        @Expose
        private Organization organization;

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

    public class Department {
        @SerializedName("_id")
        @Expose
        private Id id;

        /**
         * @return The id
         */
        public Id getId() {
            return id;
        }

        /**
         * @param id The _id
         */
        public void setId(Id id) {
            this.id = id;
        }

    }

    public class Department_ {

        @SerializedName("_id")
        @Expose
        private String id;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("imageIcon")
        @Expose
        private ImageIcon_ imageIcon;

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
         * @return The imageIcon
         */
        public ImageIcon_ getImageIcon() {
            return imageIcon;
        }

        /**
         * @param imageIcon The imageIcon
         */
        public void setImageIcon(ImageIcon_ imageIcon) {
            this.imageIcon = imageIcon;
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

    public class Id {

        @SerializedName("_id")
        @Expose
        private String id;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("imageIcon")
        @Expose
        private ImageIcon imageIcon;

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
         * @return The imageIcon
         */
        public ImageIcon getImageIcon() {
            return imageIcon;
        }

        /**
         * @param imageIcon The imageIcon
         */
        public void setImageIcon(ImageIcon imageIcon) {
            this.imageIcon = imageIcon;
        }

    }


}