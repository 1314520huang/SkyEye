package com.skyeye.model;

public class Food {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column food.id
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column food.NAME
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column food.belong_seller_id
     *
     * @mbggenerated
     */
    private String belongSellerId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column food.belong_time
     *
     * @mbggenerated
     */
    private Integer belongTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column food.belong_type
     *
     * @mbggenerated
     */
    private Integer belongType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column food.price
     *
     * @mbggenerated
     */
    private Double price;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column food.state
     *
     * @mbggenerated
     */
    private Integer state;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column food.image
     *
     * @mbggenerated
     */
    private byte[] image;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column food.id
     *
     * @return the value of food.id
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column food.id
     *
     * @param id the value for food.id
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column food.NAME
     *
     * @return the value of food.NAME
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column food.NAME
     *
     * @param name the value for food.NAME
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column food.belong_seller_id
     *
     * @return the value of food.belong_seller_id
     *
     * @mbggenerated
     */
    public String getBelongSellerId() {
        return belongSellerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column food.belong_seller_id
     *
     * @param belongSellerId the value for food.belong_seller_id
     *
     * @mbggenerated
     */
    public void setBelongSellerId(String belongSellerId) {
        this.belongSellerId = belongSellerId == null ? null : belongSellerId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column food.belong_time
     *
     * @return the value of food.belong_time
     *
     * @mbggenerated
     */
    public Integer getBelongTime() {
        return belongTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column food.belong_time
     *
     * @param belongTime the value for food.belong_time
     *
     * @mbggenerated
     */
    public void setBelongTime(Integer belongTime) {
        this.belongTime = belongTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column food.belong_type
     *
     * @return the value of food.belong_type
     *
     * @mbggenerated
     */
    public Integer getBelongType() {
        return belongType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column food.belong_type
     *
     * @param belongType the value for food.belong_type
     *
     * @mbggenerated
     */
    public void setBelongType(Integer belongType) {
        this.belongType = belongType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column food.price
     *
     * @return the value of food.price
     *
     * @mbggenerated
     */
    public Double getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column food.price
     *
     * @param price the value for food.price
     *
     * @mbggenerated
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column food.state
     *
     * @return the value of food.state
     *
     * @mbggenerated
     */
    public Integer getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column food.state
     *
     * @param state the value for food.state
     *
     * @mbggenerated
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column food.image
     *
     * @return the value of food.image
     *
     * @mbggenerated
     */
    public byte[] getImage() {
        return image;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column food.image
     *
     * @param image the value for food.image
     *
     * @mbggenerated
     */
    public void setImage(byte[] image) {
        this.image = image;
    }
}