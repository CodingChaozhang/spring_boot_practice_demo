package com.lcz.springboot_netty_websocket.config;

import io.netty.channel.Channel;
import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.util.concurrent.GlobalEventExecutor;

import java.util.concurrent.ConcurrentHashMap;

/**
 * 在nettyconfig中定义一个channel组，管理所有的channel。
 * 再定义一个map，管理用户与channel的对应关系
 */
public class NettyConfig {

    // 定义一个channel组，管理所有的channel
    // GlobalEventExecutor.INSTANCE 是全局的事件执行器，是一个单例
    private static ChannelGroup channelGroup = new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);

    // 存放用户与channel的对应信息，用于给指定用户发送消息
    private static ConcurrentHashMap<String, Channel> userChannelMap = new ConcurrentHashMap<>();

    private NettyConfig(){

    }

    /**
     * 获取channel组
     * @return
     */
    public static ChannelGroup getChannelGroup(){
        return channelGroup;
    }

    public static ConcurrentHashMap<String,Channel> getUserChannelMap(){
        return userChannelMap;
    }

}
