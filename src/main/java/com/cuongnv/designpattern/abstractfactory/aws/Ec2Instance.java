package com.cuongnv.designpattern.abstractfactory.aws;

import com.cuongnv.designpattern.abstractfactory.Instance;
import com.cuongnv.designpattern.abstractfactory.Storage;

public class Ec2Instance implements Instance {

    public Ec2Instance(Capacity capacity) {
        //Map capacity to ec2 instance types. Use aws API to provision
        System.out.println("Created Ec2Instance");
    }

    @Override
    public void start() {
        System.out.println("Ec2Instance started");
    }

    @Override
    public void attachStorage(Storage storage) {
        System.out.println("Attached "+storage+" to Ec2Instance");
    }

    @Override
    public void stop() {
        System.out.println("Ec2Instance stopped");
    }

    @Override
    public String toString() {
        return "EC2Instance";
    }
}
