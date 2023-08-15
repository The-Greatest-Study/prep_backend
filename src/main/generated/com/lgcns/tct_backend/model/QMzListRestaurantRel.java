package com.lgcns.tct_backend.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QMzListRestaurantRel is a Querydsl query type for MzListRestaurantRel
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMzListRestaurantRel extends EntityPathBase<MzListRestaurantRel> {

    private static final long serialVersionUID = -246197558L;

    public static final QMzListRestaurantRel mzListRestaurantRel = new QMzListRestaurantRel("mzListRestaurantRel");

    public final StringPath listId = createString("listId");

    public final StringPath restaurantId = createString("restaurantId");

    public final StringPath restaurantListRelId = createString("restaurantListRelId");

    public QMzListRestaurantRel(String variable) {
        super(MzListRestaurantRel.class, forVariable(variable));
    }

    public QMzListRestaurantRel(Path<? extends MzListRestaurantRel> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMzListRestaurantRel(PathMetadata metadata) {
        super(MzListRestaurantRel.class, metadata);
    }

}

