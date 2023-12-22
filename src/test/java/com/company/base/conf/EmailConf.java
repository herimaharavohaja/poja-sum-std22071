package com.company.base.conf;

import org.springframework.test.context.DynamicPropertyRegistry;
import com.company.base.PojaGenerated;

@PojaGenerated
public class EmailConf {

  void configureProperties(DynamicPropertyRegistry registry) {
    registry.add("aws.ses.source", () -> "dummy-ses-source");
  }
}
