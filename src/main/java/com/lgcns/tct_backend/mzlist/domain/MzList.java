package com.lgcns.tct_backend.mzlist.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "TB_MZ_LIST")
public record MzList (

     @Id
     String listId,
     String userId,

     String listName,

     Date createDate
){}
