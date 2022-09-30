package com.example;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author 不要有情绪的  ljy
 * @Date 2022/9/15 9:26
 * @Description:
 */
public class Server_ {
    public static void main(String[] args) throws IOException {
        //生成ServerSocket对象监视端口5000
        ServerSocket serverSocket = new ServerSocket(5000);

        //当我们没有连接诶服务器时，我们就堵塞这个程序，accept
        System.out.println("等待目标客户端连接.......");
        Socket socket = serverSocket.accept();

        //从数据通道接收数据
        System.out.println("正在接收数据......");
        InputStream inputStream = socket.getInputStream();

        //发送数据到数据通道
        System.out.println("正在写入数据到数据通道......");
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello client".getBytes());

        //关闭流
        serverSocket.close();
        socket.close();
        inputStream.close();
        outputStream.close();

        System.out.println("服务端已关闭......");
    }
}
