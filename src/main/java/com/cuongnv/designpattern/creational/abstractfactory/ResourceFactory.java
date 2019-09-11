package com.cuongnv.designpattern.creational.abstractfactory;

public interface ResourceFactory {

    Instance createInstance(Instance.Capacity capacity);

    Storage createStorage(int capMid);

}
