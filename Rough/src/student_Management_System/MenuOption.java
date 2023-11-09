package student_Management_System;

import java.util.*;
import java.util.Map.Entry;

public class MenuOption 
{
	int ch;
	Scanner sc=new Scanner(System.in);
	int studentNum;
	
	String studentArr[];
	Map m=new HashMap();
	int deleteStudent;
	int updateStudent;
	
	public void task()
	{
		java.util.Date dt=new java.util.Date();
		System.out.println("Date : "+dt+"\t");
		
		while(true)
		{
			System.out.println("\n Menu Option \n" +"\n+ 1. Add Student \n"+" \n 2.View Student \n " 
					+" \n 3. Delete Student \n" +"\n 4.Update Student \n"+" \n 5. Exit \n");
					
					ch=sc.nextInt();
					
							
						switch(ch)
						{
							case 1:
							{
								System.out.println("Adding New Student \n");
								
								System.out.println("How many Student you add");
								studentNum=sc.nextInt();
								
								
								studentArr=new String[studentNum];
								for(int i=0; i<studentNum; i++)
								{
									System.out.println("Enter "+(i+1) +" name");

									studentArr[i]=sc.next();
								}
								
								for(int i=0;i<studentNum; i++)
								{
									System.out.print((i+1)+ " : "+studentArr[i] +" \t");
								}
								
								for(int i=0; i<studentNum; i++)
								{
									m.put(i, studentArr[i]);
								}
								
								Set s1=m.entrySet();
								Iterator itr1=s1.iterator();
								
								
								System.out.println();
								System.out.println(studentNum +" name added Successfully");
								System.out.println();
								
								//mo.invokeCase();
								break;
							}
							case 2:
							{
								if(m.isEmpty())
								{
									System.out.println("No one Data is add");

								}
								else
								{
									System.out.println("View Student \n");
									
									Set s=m.entrySet();
									Iterator itr=s.iterator();
									while(itr.hasNext())
									{
										
										Map.Entry en=(Entry) itr.next();
										System.out.println(en.getKey()+" " +en.getValue());
									}
									System.out.println();
										
								}
								
								


								break;
							}
							case 3:
							{
								System.out.println("Delete an Student \n");
								
								Set s2=m.entrySet();
								Iterator itr3=s2.iterator();
								while(itr3.hasNext())
								{
									Map.Entry en3=(Entry)itr3.next();
									System.out.println(en3.getKey()+" "+en3.getValue());
											
								}
								System.out.println("\n Which student you want to remove");
								deleteStudent=sc.nextInt();
								System.out.println("You want to delete Student " + m.get(deleteStudent));
								System.out.println("Type 1 : yes and 2 : no");								
								int ds=sc.nextInt();
								if(ds==1)
								{
									System.out.println(m.get(deleteStudent)+ " Successfully");
									m.remove(deleteStudent);
									
									for(int i=0 ; i<studentNum-1; i++)
									{
										 
										m.put(i, m.get(i));
									}
									
								}
								else
								{
									System.out.println(m.get(deleteStudent) +" not remove in a List");
								}
								System.out.println();
								
								

								break;
							}
							
							case 4:
							{
								System.out.println("Update Student");
								System.out.println("How many Student you want to update");
								updateStudent=sc.nextInt();
								String upStu[]=new String[updateStudent];
								for(int i=0; i<updateStudent; i++)
								{
									System.out.println("Enter "+(i+1) +" name");
									upStu[i]=sc.next();
									
								}
								for(int i=0; i<updateStudent; i++)
								{
									m.put(i+studentNum, upStu[i]);
								}
								System.out.println();
								

								break;
							}
							
							case 5:
							{
								System.out.println(" \t THANK YOU ");
								System.exit(0);
							}
						}
					
					
		}
		
		
	}
	
}
