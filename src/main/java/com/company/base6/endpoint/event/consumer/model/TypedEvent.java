package com.company.base6.endpoint.event.consumer.model;

import com.company.base6.PojaGenerated;
import com.company.base6.endpoint.event.model.PojaEvent;


@PojaGenerated
public record TypedEvent(String typeName, PojaEvent payload) {}
