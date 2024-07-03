package com.example.event;

import com.example.domain.aggregate.Aggregate;

public interface Event {

    void apply(Aggregate aggregate);

}
