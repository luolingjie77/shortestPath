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
	int[] wayTo=new int[500];//保存路径
	String str="距离为"+dist[e]+"\n";
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
			if(wayTo[j]==changePoint[q])//如果改点是一个换乘点，就要输出换乘到几号线
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
					str="一号线\n";
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
					str="二号线\n";
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
					str="四号线\n";
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
					str="五号线\n";
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
					str="六号线\n";
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
					str="七号线\n";
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
					str="八号线北段\n";
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
					str="九号线\n";
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
					str="十号线\n";
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
					str="十三号线\n";
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
					str="十四号线东段\n";
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
					str="十四号线西段\n";
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
					str="十五号线\n";
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
					str="十六号线\n";
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
					str="八通线\n";
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
					str="昌平线\n";
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
					str="亦庄线\n";
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
					str="房山线\n";
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
					str="机场线\n";
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
					str="大兴线\n";
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
					str="S1线\n";
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
					str="西郊线\n";
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
					str="燕房线\n";
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
					str="八号线南段\n";
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
