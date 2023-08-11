package com.lgcns.tct_backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "TB_MZ_LIST")
public class MzList {

  @Id
  @Column(name = "LIST_ID")
  private String listId;

  @Column(name = "USER_ID")
  private String userId;

  @Column(name = "LIST_NAME")
  private String listName;

  @Column(name = "CREATED_DATE")
  private String createDate;
  
}