package com.rhc.test;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.channels.SocketChannel;
/**
 *客户端：打开channel——连接到远程socket——通过buffer读写数据
 *服务器：打开channel——绑定socket(等待连接)——通过buffer读写数据
 * @author RhCheng
 * @date   2015-4-1
 */
public class SumClient {
	private ByteBuffer _buffer=ByteBuffer.allocate(8);
	private IntBuffer _intBuffer;
	private SocketChannel _channel;
	
	// SumClient constructor
	public SumClient() {
		_intBuffer=_buffer.asIntBuffer();
	} 

	public int getSum(int first,int second){
		int result=0;
		try{
			_channel=connect();
			
			sendSumRequest(first,second);
			
			result=receiveResponse();
			
		}catch(IOException e){
			System.err.println(e.toString());
		}finally{
		if(_channel!=null){
			try{
				_channel.close();
			}catch(IOException e){}
			}
		}
		return result;
	}
	
	private SocketChannel connect()throws IOException{
		// remote address
		InetSocketAddress socketAddress=new InetSocketAddress("127.0.0.1",10001);
		// 打开channel并连接到远程socket
		return SocketChannel.open(socketAddress);
	}

	private void sendSumRequest(int first,int second)throws IOException{
		_buffer.clear();
		_intBuffer.put(0,first);
		_intBuffer.put(1,second);
		_channel.write(_buffer);
		System.out.println("发送加法请求 "+first+"+"+second);
	}

	private int receiveResponse()throws IOException{
		_buffer.clear();
		_channel.read(_buffer);
		return _intBuffer.get(0);
	}
	
	public static void main(String [] args){
		SumClient sumClient=new SumClient();
		System.out.println("加法结果为 :"+sumClient.getSum(100,324));
	}
}
