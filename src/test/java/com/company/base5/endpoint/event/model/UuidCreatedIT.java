package com.company.base5.endpoint.event.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.company.base5.PojaGenerated;
import com.company.base5.conf.FacadeIT;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.Duration;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

@PojaGenerated
class UuidCreatedIT extends FacadeIT {

  @Autowired ObjectMapper om;

  @Test
  public void serialize_then_deserialize() throws JsonProcessingException {
    var uuid = new UuidCreated("dummy");

    var serialized = om.writeValueAsString(uuid);
    var deserialized = om.readValue(serialized, UuidCreated.class);

    assertEquals(uuid, deserialized);
    assertEquals("dummy", deserialized.getUuid());
    assertEquals(Duration.ofSeconds(10), deserialized.maxConsumerDuration());
    assertEquals(Duration.ofSeconds(30), deserialized.maxConsumerBackoffBetweenRetries());
  }
}
