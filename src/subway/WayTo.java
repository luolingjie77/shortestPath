package subway;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WayTo {
public static void shuchu(int[] dist,int[] path,int[][] exchange,int e,int s,int count,int[] changePoint, String baocun)
{
	File file = new File("C:\\Users\\lenovo\\Desktop\\"+baocun);
	try {
		if(file.createNewFile() == false) return;
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	FileWriter out = null;
	try {
		out = new FileWriter(file);
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	Subway sw=new Subway();
	int[] wayTo=new int[500];//����·��
	String str="����Ϊ"+dist[e]+"\n";
	char[] text = str.toCharArray();
	try {
		out.write(text);
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	int i=0;
	wayTo[i]=e;
	i++;
	while(true)
	{
		e=path[e];
		wayTo[i]=e;
		if(e==s)
			break;
		i++;
	}
	int j;
	int p,pp;
	for(j=i;j>=0;j--)
	{
		for(int q=0;q<count;q++)
		{
			if(wayTo[j]==changePoint[q])//����ĵ���һ�����˵㣬��Ҫ������˵�������
			{
				int m=0,n=0;
				p=changePoint[q];
				pp=wayTo[j+1];
				int flag=0;
				for(m=0;m<=2;m++)
				{
					for(n=0;n<=2;n++)
					{
						if(exchange[p][m]==exchange[pp][n]&&exchange[p][m]!=0&&exchange[pp][n]!=0)
						{
							flag=exchange[pp][n];
							
						}
					}
				}
				if(flag==1)
				{
					str="һ����\n";
					text = str.toCharArray();
					try {
						out.write(text);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else if(flag==2)
				{
					str="������\n";
					text = str.toCharArray();
					try {
						out.write(text);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else if(flag==3)
				{
					str="�ĺ���\n";
					text = str.toCharArray();
					try {
						out.write(text);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else if(flag==4)
				{
					str="�����\n";
					text = str.toCharArray();
					try {
						out.write(text);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else if(flag==5)
				{
					str="������\n";
					text = str.toCharArray();
					try {
						out.write(text);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else if(flag==6)
				{
					str="�ߺ���\n";
					text = str.toCharArray();
					try {
						out.write(text);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else if(flag==7)
				{
					str="�˺��߱���\n";
					text = str.toCharArray();
					try {
						out.write(text);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else if(flag==8)
				{
					str="�ź���\n";
					text = str.toCharArray();
					try {
						out.write(text);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else if(flag==9)
				{
					str="ʮ����\n";
					text = str.toCharArray();
					try {
						out.write(text);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else if(flag==10)
				{
					str="ʮ������\n";
					text = str.toCharArray();
					try {
						out.write(text);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else if(flag==11)
				{
					str="ʮ�ĺ��߶���\n";
					text = str.toCharArray();
					try {
						out.write(text);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else if(flag==12)
				{
					str="ʮ�ĺ�������\n";
					text = str.toCharArray();
					try {
						out.write(text);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else if(flag==13)
				{
					str="ʮ�����\n";
					text = str.toCharArray();
					try {
						out.write(text);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else if(flag==14)
				{
					str="ʮ������\n";
					text = str.toCharArray();
					try {
						out.write(text);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else if(flag==15)
				{
					str="��ͨ��\n";
					text = str.toCharArray();
					try {
						out.write(text);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else if(flag==16)
				{
					str="��ƽ��\n";
					text = str.toCharArray();
					try {
						out.write(text);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else if(flag==17)
				{
					str="��ׯ��\n";
					text = str.toCharArray();
					try {
						out.write(text);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else if(flag==18)
				{
					str="��ɽ��\n";
					text = str.toCharArray();
					try {
						out.write(text);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else if(flag==19)
				{
					str="������\n";
					text = str.toCharArray();
					try {
						out.write(text);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else if(flag==20)
				{
					str="������\n";
					text = str.toCharArray();
					try {
						out.write(text);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else if(flag==21)
				{
					str="S1��\n";
					text = str.toCharArray();
					try {
						out.write(text);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else if(flag==22)
				{
					str="������\n";
					text = str.toCharArray();
					try {
						out.write(text);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else if(flag==23)
				{
					str="�෿��\n";
					text = str.toCharArray();
					try {
						out.write(text);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else if(flag==24)
				{
					str="�˺����϶�\n";
					text = str.toCharArray();
					try {
						out.write(text);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				
			}
		}
		str=sw.getKey(wayTo[j])+"\n";
		text = str.toCharArray();
		try {
			out.write(text);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
	}
	try {
		out.close();
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
}
}
