package pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;


public class SyncOrganization {

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
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("email")
        @Expose
        private String email;
        @SerializedName("contactPhone")
        @Expose
        private String contactPhone;
        @SerializedName("address1")
        @Expose
        private String address1;
        @SerializedName("address2")
        @Expose
        private String address2;
        @SerializedName("kind")
        @Expose
        private String kind;
        @SerializedName("__v")
        @Expose
        private Integer v;
        @SerializedName("updatedOn")
        @Expose
        private String updatedOn;
        @SerializedName("url")
        @Expose
        private String url;
        @SerializedName("city")
        @Expose
        private City city;
        @SerializedName("state")
        @Expose
        private State state;
        @SerializedName("country")
        @Expose
        private Country country;
        @SerializedName("createdBy")
        @Expose
        private CreatedBy createdBy;
        @SerializedName("createdOn")
        @Expose
        private String createdOn;
        @SerializedName("req")
        @Expose
        private Req req;
        @SerializedName("prescription")
        @Expose
        private Prescription prescription;
        @SerializedName("contactPeopleCount")
        @Expose
        private Integer contactPeopleCount;
        @SerializedName("contactPeople")
        @Expose
        private List<Object> contactPeople = new ArrayList<Object>();
        @SerializedName("logo")
        @Expose
        private Logo logo;
        @SerializedName("followupDays")
        @Expose
        private Integer followupDays;
        @SerializedName("active")
        @Expose
        private Boolean active;
        @SerializedName("open")
        @Expose
        private Open open;
        @SerializedName("faxes")
        @Expose
        private List<Object> faxes = new ArrayList<Object>();
        @SerializedName("phones")
        @Expose
        private List<String> phones = new ArrayList<String>();
        @SerializedName("description")
        @Expose
        private String description;

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
         * @return The address2
         */
        public String getAddress2() {
            return address2;
        }

        /**
         * @param address2 The address2
         */
        public void setAddress2(String address2) {
            this.address2 = address2;
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
         * @return The updatedOn
         */
        public String getUpdatedOn() {
            return updatedOn;
        }

        /**
         * @param updatedOn The updatedOn
         */
        public void setUpdatedOn(String updatedOn) {
            this.updatedOn = updatedOn;
        }

        /**
         * @return The url
         */
        public String getUrl() {
            return url;
        }

        /**
         * @param url The url
         */
        public void setUrl(String url) {
            this.url = url;
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
         * @return The prescription
         */
        public Prescription getPrescription() {
            return prescription;
        }

        /**
         * @param prescription The prescription
         */
        public void setPrescription(Prescription prescription) {
            this.prescription = prescription;
        }

        /**
         * @return The contactPeopleCount
         */
        public Integer getContactPeopleCount() {
            return contactPeopleCount;
        }

        /**
         * @param contactPeopleCount The contactPeopleCount
         */
        public void setContactPeopleCount(Integer contactPeopleCount) {
            this.contactPeopleCount = contactPeopleCount;
        }

        /**
         * @return The contactPeople
         */
        public List<Object> getContactPeople() {
            return contactPeople;
        }

        /**
         * @param contactPeople The contactPeople
         */
        public void setContactPeople(List<Object> contactPeople) {
            this.contactPeople = contactPeople;
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

        /**
         * @return The followupDays
         */
        public Integer getFollowupDays() {
            return followupDays;
        }

        /**
         * @param followupDays The followupDays
         */
        public void setFollowupDays(Integer followupDays) {
            this.followupDays = followupDays;
        }

        /**
         * @return The active
         */
        public Boolean getActive() {
            return active;
        }

        /**
         * @param active The active
         */
        public void setActive(Boolean active) {
            this.active = active;
        }

        /**
         * @return The open
         */
        public Open getOpen() {
            return open;
        }

        /**
         * @param open The open
         */
        public void setOpen(Open open) {
            this.open = open;
        }

        /**
         * @return The faxes
         */
        public List<Object> getFaxes() {
            return faxes;
        }

        /**
         * @param faxes The faxes
         */
        public void setFaxes(List<Object> faxes) {
            this.faxes = faxes;
        }

        /**
         * @return The phones
         */
        public List<String> getPhones() {
            return phones;
        }

        /**
         * @param phones The phones
         */
        public void setPhones(List<String> phones) {
            this.phones = phones;
        }

        /**
         * @return The description
         */
        public String getDescription() {
            return description;
        }

        /**
         * @param description The description
         */
        public void setDescription(String description) {
            this.description = description;
        }

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

    public class Open {

        @SerializedName("start")
        @Expose
        private Integer start;
        @SerializedName("end")
        @Expose
        private Integer end;
        @SerializedName("allTime")
        @Expose
        private Boolean allTime;

        /**
         * @return The start
         */
        public Integer getStart() {
            return start;
        }

        /**
         * @param start The start
         */
        public void setStart(Integer start) {
            this.start = start;
        }

        /**
         * @return The end
         */
        public Integer getEnd() {
            return end;
        }

        /**
         * @param end The end
         */
        public void setEnd(Integer end) {
            this.end = end;
        }

        /**
         * @return The allTime
         */
        public Boolean getAllTime() {
            return allTime;
        }

        /**
         * @param allTime The allTime
         */
        public void setAllTime(Boolean allTime) {
            this.allTime = allTime;
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

    public class Prescription {

        @SerializedName("templateEngine")
        @Expose
        private String templateEngine;

        /**
         * @return The templateEngine
         */
        public String getTemplateEngine() {
            return templateEngine;
        }

        /**
         * @param templateEngine The templateEngine
         */
        public void setTemplateEngine(String templateEngine) {
            this.templateEngine = templateEngine;
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

}

