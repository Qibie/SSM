package com.learn.ssm.chapter10.rmi.commonservice.impl;

import com.learn.ssm.chapter10.rmi.commonservice.Service;
import com.learn.ssm.chapter10.rmi.commonservice.ServiceServer;
import com.learn.ssm.chapter10.rmi.commonservice.service.DayOfTheWeekService;
import com.learn.ssm.chapter10.rmi.commonservice.service.DiceService;
import com.learn.ssm.chapter10.rmi.commonservice.service.MiniMusicService;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;

public class ServiceServerImpl extends UnicastRemoteObject implements ServiceServer {
    HashMap serviceList;

    protected ServiceServerImpl() throws RemoteException {
        setUpServices();
    }

    private void setUpServices() {
        serviceList = new HashMap();
        serviceList.put("Dice Rolling Service", new DiceService());
        serviceList.put("Day of the Week Service", new DayOfTheWeekService());
        serviceList.put("Visual Music Service", new MiniMusicService());
    }


    @Override
    public Object[] getServiceList() throws RemoteException {
        System.out.println("int remote");
        return serviceList.keySet().toArray();
    }

    @Override
    public Service getService(Object serviceKey) throws RemoteException {
        Service thheService = (Service) serviceList.get(serviceKey);
        return thheService;
    }

    public static void main(String[] args) {
        try {
            Naming.rebind("ServiceServer", new ServiceServerImpl());
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Remote service is running");
    }
}
