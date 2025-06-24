package school.hei.arith.conf;

import org.springframework.test.context.DynamicPropertyRegistry;
import school.hei.arith.PojaGenerated;

@PojaGenerated
public class BucketConf {

  void configureProperties(DynamicPropertyRegistry registry) {
    registry.add("aws.s3.bucket", () -> "dummy-bucket");
  }
}
