package com.lgcns.tct_backend.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QRestaurant is a Querydsl query type for Restaurant
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QRestaurant extends EntityPathBase<Restaurant> {

    private static final long serialVersionUID = 1732137540L;

    public static final QRestaurant restaurant = new QRestaurant("restaurant");

    public final StringPath operationYn = createString("operationYn");

    public final StringPath restaurantAddres = createString("restaurantAddres");

    public final StringPath restaurantCategory = createString("restaurantCategory");

    public final StringPath restaurantId = createString("restaurantId");

    public final StringPath restaurantName = createString("restaurantName");

    public QRestaurant(String variable) {
        super(Restaurant.class, forVariable(variable));
    }

    public QRestaurant(Path<? extends Restaurant> path) {
        super(path.getType(), path.getMetadata());
    }

    public QRestaurant(PathMetadata metadata) {
        super(Restaurant.class, metadata);
    }

}

