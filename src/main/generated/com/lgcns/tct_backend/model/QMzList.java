package com.lgcns.tct_backend.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QMzList is a Querydsl query type for MzList
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMzList extends EntityPathBase<MzList> {

    private static final long serialVersionUID = 1517434482L;

    public static final QMzList mzList = new QMzList("mzList");

    public final StringPath createDate = createString("createDate");

    public final StringPath listId = createString("listId");

    public final StringPath listName = createString("listName");

    public final StringPath userId = createString("userId");

    public QMzList(String variable) {
        super(MzList.class, forVariable(variable));
    }

    public QMzList(Path<? extends MzList> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMzList(PathMetadata metadata) {
        super(MzList.class, metadata);
    }

}

