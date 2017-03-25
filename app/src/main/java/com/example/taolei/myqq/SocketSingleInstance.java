package com.example.taolei.myqq;

import java.io.IOException;
import java.net.Socket;

/**
 * Created by Tao Lei on 2017/3/23.
 */

public class SocketSingleInstance {
    private static Socket socket;
    private static String desIp = "192.168.191.1";
    public static String mName;
    public SocketSingleInstance()
    {
    }
    public static Socket getInstance()
    {
        if(socket == null)
        {
            try {
                    socket = new Socket(desIp, 2020);
            }catch (IOException e)
            {
                e.printStackTrace();
            }
        }
        return socket;
    }

}
