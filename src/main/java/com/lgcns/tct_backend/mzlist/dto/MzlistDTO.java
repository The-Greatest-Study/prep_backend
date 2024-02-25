package com.lgcns.tct_backend.mzlist.dto;

import jakarta.persistence.Id;
import lombok.Getter;

import java.util.Date;

@Getter
public class MzlistDTO {

private String mzlistId;
   private  String userId;

   private String mzlistName;
   private String mzListDescription;
   private String mzListIcon;

}
