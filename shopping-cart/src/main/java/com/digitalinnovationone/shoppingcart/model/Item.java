package com.digitalinnovationone.shoppingcart.model;
import org.springframework.data.redis.core.RedisHash;
import lombok.Data;

@Data
@RedisHash("item")
public class Item {

    private Integer productId;
    private Integer amount;

    }