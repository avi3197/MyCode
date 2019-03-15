package com;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;

public class ServerConnection 
{
	public  Session getConnection(String serverNode,
	String sftpUser,
	String sftpHost,
	String sftpPort,
	String sftpPassword) 
	{

/*			String serverNode=unixParameters.getServerNode();
			String sftpUser=unixParameters.getSftpUser();
			String sftpHost=unixParameters.getSftpHost();
			String sftpPort=unixParameters.getSftpPort();
			String sftpPassword=unixParameters.getSftpPassword();
*/
			System.out.println("Connecting  SFTP channel for "+serverNode+"\r\nHOST:"+sftpHost+"  PORT:"+ sftpPort +"  USER:"+sftpUser+"  PASSWORD:"+sftpPassword);
			JSch jsch = new JSch();
			Session session = null;
			Channel channel = null;
			ChannelSftp channelSftp = null;
			try {
				session = jsch.getSession(sftpUser, sftpHost, Integer.parseInt(sftpPort));
				session.setPassword(sftpPassword);
				java.util.Properties config = new java.util.Properties();
				config.put("StrictHostKeyChecking", "no");
				//config.put("kex", "diffie-hellman-group1-sha1,diffie-hellman-group14-sha1,diffie-hellman-group-exchange-sha1,diffie-hellman-group-exchange-sha256");

				session.setConfig(config);
				session.connect();
				System.out.println("Host connected.");
				channel = session.openChannel("sftp");
				channel.connect();			
				channelSftp = (ChannelSftp) channel;
				System.out.println("Sftp channel opened and connected\r\nHOST : "+sftpHost+"  USER : "+sftpUser);


			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (JSchException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return session;
	} 
}
