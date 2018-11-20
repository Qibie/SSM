package com.learn.ssm.chapter10.rmi.commonservice;

import java.rmi.*;

public interface ServiceServer extends Remote {
    Object[] getServiceList() throws RemoteException;

    Service getService(Object serviceKey) throws RemoteException;
}
