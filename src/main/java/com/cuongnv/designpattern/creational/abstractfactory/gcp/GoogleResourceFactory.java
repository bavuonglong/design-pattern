package com.cuongnv.designpattern.creational.abstractfactory.gcp;

import com.cuongnv.designpattern.creational.abstractfactory.Instance;
import com.cuongnv.designpattern.creational.abstractfactory.ResourceFactory;
import com.cuongnv.designpattern.creational.abstractfactory.Storage;

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
