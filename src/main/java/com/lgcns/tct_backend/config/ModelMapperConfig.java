package com.lgcns.tct_backend.config;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfig {

  
  @Bean
  public ModelMapper modelMapper() {
    ModelMapper modelMapper = new ModelMapper();

    // modelMapper.getConfiguration()
    // .setMatchingStrategy(MatchingStrategies.STRICT)
    // .setDestinationNamingConvention(LombokBuilderNamingConvention.INSTANCE)
    // .setDestinationNameTransformer(LombokBuilderNameTransformer.INSTANCE);

    return modelMapper;
  }
}