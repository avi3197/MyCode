package com;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.Session;

public class Read_File_From_Server 
{
	public static void main(String[] args) 
	{
		String sftpUser="SIEdurge";
		String sftpHost="10.94.64.36";
		String sftpPort="22";
		String sftpPassword="Jan@2019";
		String commandSearchException="cat /home/SIEdurge/MONITORING/DASHBOARD_QUERIES/TOPFIVEFAILURE.txt;cat /home/SIEdurge/MONITORING/DASHBOARD_QUERIES/TOP_MAX_CPU.txt";
		
		ServerConnection de=new ServerConnection();
		Session session=de.getConnection("", sftpUser, sftpHost, sftpPort, sftpPassword);
		
		ChannelExec channelExec = (ChannelExec)session.openChannel("exec");

		String sCurrentLine;
		InputStream stream = channelExec.getInputStream();										
		channelExec.setCommand(commandSearchException);					
		channelExec.connect();
		
		List<String> list =new ArrayList<String>();
		BufferedReader br = new BufferedReader(new InputStreamReader(stream));
		while ((sCurrentLine = br.readLine()) != null) 
		{
			list.add(sCurrentLine);
		}
		session.disconnect();
		
	}
}
