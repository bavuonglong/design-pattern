package com.cuongnv.designpattern.abstractfactory.gcp;

import com.cuongnv.designpattern.abstractfactory.Instance;
import com.cuongnv.designpattern.abstractfactory.ResourceFactory;
import com.cuongnv.designpattern.abstractfactory.Storage;

public class GoogleResourceFactory implements ResourceFactory {


    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new GoogleComputeEngineInstance(capacity);
    }

    @Override
    public Storage createStorage(int capMid) {
        return new GoogleCloudStorage(capMid);
    }
}
