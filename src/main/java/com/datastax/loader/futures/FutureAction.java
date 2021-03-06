package com.datastax.loader.futures;

import java.lang.String;
import java.lang.Throwable;
import com.datastax.driver.core.ResultSet;

public interface FutureAction {
    public void onSuccess(ResultSet rs, String line);
    public void onFailure(Throwable t, String line);
    public void onTooManyFailures();
}
