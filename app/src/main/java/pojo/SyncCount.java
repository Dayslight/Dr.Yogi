package pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;


public class SyncCount {

    @SerializedName("ts")
    @Expose
    private Integer ts;
    @SerializedName("result")
    @Expose
    private List<Result> result = new ArrayList<Result>();

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
     * The result
     */
    public List<Result> getResult() {
        return result;
    }

    /**
     *
     * @param result
     * The result
     */
    public void setResult(List<Result> result) {
        this.result = result;
    }

    public class Result {

        @SerializedName("entity")
        @Expose
        private String entity;
        @SerializedName("createdCount")
        @Expose
        private Integer createdCount;
        @SerializedName("updatedCount")
        @Expose
        private Integer updatedCount;
        @SerializedName("removedCount")
        @Expose
        private Integer removedCount;

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
         * The createdCount
         */
        public Integer getCreatedCount() {
            return createdCount;
        }

        /**
         *
         * @param createdCount
         * The createdCount
         */
        public void setCreatedCount(Integer createdCount) {
            this.createdCount = createdCount;
        }

        /**
         *
         * @return
         * The updatedCount
         */
        public Integer getUpdatedCount() {
            return updatedCount;
        }

        /**
         *
         * @param updatedCount
         * The updatedCount
         */
        public void setUpdatedCount(Integer updatedCount) {
            this.updatedCount = updatedCount;
        }

        /**
         *
         * @return
         * The removedCount
         */
        public Integer getRemovedCount() {
            return removedCount;
        }

        /**
         *
         * @param removedCount
         * The removedCount
         */
        public void setRemovedCount(Integer removedCount) {
            this.removedCount = removedCount;
        }

    }


}