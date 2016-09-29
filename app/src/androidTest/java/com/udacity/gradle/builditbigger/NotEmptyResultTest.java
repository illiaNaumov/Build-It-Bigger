package com.udacity.gradle.builditbigger;

import android.test.AndroidTestCase;

/**
 * Created by ilyua on 29.09.2016.
 */

public class NotEmptyResultTest extends AndroidTestCase {

    @SuppressWarnings("unchecked")
    public void test() {
        String result = null;
        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask();
        endpointsAsyncTask.execute(getContext());
        try {
            result = endpointsAsyncTask.get();
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertNotNull(result);
    }
}
