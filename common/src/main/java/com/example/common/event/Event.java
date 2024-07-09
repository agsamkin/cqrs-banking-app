package com.example.common.event;

import com.example.common.domain.aggregate.Aggregate;

public interface Event {

    void apply(Aggregate aggregate);

}
