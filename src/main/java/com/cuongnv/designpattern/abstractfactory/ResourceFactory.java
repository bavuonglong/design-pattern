package com.cuongnv.designpattern.abstractfactory;

public interface ResourceFactory {

    Instance createInstance(Instance.Capacity capacity);

    Storage createStorage(int capMid);

}
