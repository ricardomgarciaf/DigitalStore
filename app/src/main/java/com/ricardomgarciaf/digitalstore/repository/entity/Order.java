package com.ricardomgarciaf.digitalstore.repository.entity;

import java.time.OffsetDateTime;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import androidx.room.PrimaryKey;

import static androidx.room.ForeignKey.CASCADE;

@Entity(tableName = "order", indices = {@Index("id")}, foreignKeys = {@ForeignKey(entity = User.class,parentColumns = "id",childColumns = "userId",onDelete = CASCADE), @ForeignKey(entity = Product.class,parentColumns = "id",childColumns = "productId",onDelete = CASCADE)})
public class Order {

    @NonNull
    @PrimaryKey(autoGenerate = true)
    private String id;

    @ColumnInfo(name = "userId")
    private String userId;

    @ColumnInfo(name = "productId")
    private String productId;

    @ColumnInfo(name = "quantity")
    private int quantity;

    @ColumnInfo(name = "dateCreated")
    private OffsetDateTime dateCreated;

    public Order(@NonNull String id, String userId, String productId, int quantity) {
        this.id = id;
        this.userId = userId;
        this.productId = productId;
        this.quantity = quantity;
        this.dateCreated=OffsetDateTime.now();
    }

    @NonNull
    public String getId() {
        return id;
    }

    public void setId(@NonNull String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public OffsetDateTime getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(OffsetDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }
}
