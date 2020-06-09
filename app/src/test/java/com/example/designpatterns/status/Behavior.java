package com.example.designpatterns.status;

/**
 * https://blog.csdn.net/lyabc123456/article/details/80476317
 *
 * 如果经常乘坐巴士或公交车的朋友可能比较熟悉，
 * 公交车有几个状态，开门、关门、行驶、停车，对应状态下的行为是有一些规则的，
 * 比如公交车在行驶过程中是不允许开门不能上人的，只有在停止状态下并且开门状态下才能上人，
 * 并且必须是关门状态下才能够启动开始行驶。
 */
public interface Behavior {
    void openDoor();
    void closeDoor();
    void run();
    void stop();

}
