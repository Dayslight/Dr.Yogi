package pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class SyncCheckUp {

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
    private List<Object> createdDocs = new ArrayList<Object>();
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
    public List<Object> getCreatedDocs() {
        return createdDocs;
    }

    /**
     * @param createdDocs The createdDocs
     */
    public void setCreatedDocs(List<Object> createdDocs) {
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

}