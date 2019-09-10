package com.cuongnv.designpattern.abstractfactory.aws;

import com.cuongnv.designpattern.abstractfactory.Instance;
import com.cuongnv.designpattern.abstractfactory.ResourceFactory;
import com.cuongnv.designpattern.abstractfactory.Storage;

public class AwsResourceFactory implements ResourceFactory {


    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new Ec2Instance(capacity);
    }

    @Override
    public Storage createStorage(int capMid) {
        return new S3Storage(capMid);
    }
}
