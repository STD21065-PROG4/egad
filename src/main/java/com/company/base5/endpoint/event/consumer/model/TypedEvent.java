package com.company.base5.endpoint.event.consumer.model;

import com.company.base5.PojaGenerated;
import com.company.base5.endpoint.event.model.PojaEvent;


@PojaGenerated
public record TypedEvent(String typeName, PojaEvent payload) {}
