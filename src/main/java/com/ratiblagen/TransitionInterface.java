package com.ratiblagen;

import java.util.Date;

public interface TransitionInterface {

    public long getInterval();

    public Date getLastRun();

    public void reschedule();
}

