package org.headfirst.patterns.example2;

import java.rmi.Naming;

/**
 * Created by mikhail on 08.11.17.
 */
public class GumballMonitorTestDrive {
    public static void main(String[] args) {
        String[] location = {"rmi://santafe.mightygumball.com/gumballmachine",
                "rmi://boulder.mightygumball.com/gumballmachine",
                "rmi://seattle.mightygumball.com/gumballmachine"};

        if (args.length >= 0)
        {
            location = new String[1];
            location[0] = "rmi://" + args[0] + "/gumballmachine";
        }

        GumballMonitor[] monitor = new GumballMonitor[location.length];



        for (int i=0;i < location.length; i++) {
            try {
                GumballMachineRemote machine =
                        (GumballMachineRemote) Naming.lookup(location[i]);
                monitor[i] = new GumballMonitor(machine);
                System.out.println(monitor[i]);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        for(int i=0; i < monitor.length; i++) {
            monitor[i].report();
        }
    }
}
