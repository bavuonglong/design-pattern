package com.cuongnv.designpattern.creational.abstractfactory;

import com.cuongnv.designpattern.creational.abstractfactory.aws.AwsResourceFactory;
import com.cuongnv.designpattern.creational.abstractfactory.gcp.GoogleResourceFactory;

public class Client {

    private ResourceFactory factory;

    public Client(ResourceFactory factory) {
        this.factory = factory;
    }

    public Instance createServer(Instance.Capacity capacity, int storageMib) {
        Instance instance = factory.createInstance(capacity);
        Storage storage = factory.createStorage(storageMib);
        instance.attachStorage(storage);

        return instance;
    }

    public static void main(String[] args) {
        Client aws = new Client(new AwsResourceFactory());
        Instance i1 = aws.createServer(Instance.Capacity.micro, 2048);
        i1.start();
        i1.stop();

        System.out.println("***********************");
        Client gcp = new Client(new GoogleResourceFactory());
        i1 = gcp.createServer(Instance.Capacity.micro, 2048);
        i1.start();
        i1.stop();
    }

}
