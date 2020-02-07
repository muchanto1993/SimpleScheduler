/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gigssoft;

import java.util.Date;
import java.util.TimerTask;

/**
 *
 * @author manto
 */
public class TimerExample extends TimerTask {

    private String name;

    public TimerExample(String n) {
        this.name = n;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " " + name + " the task has executed successfully " + new Date());
        if ("Task1".equalsIgnoreCase(name)) {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

}
