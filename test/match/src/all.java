import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class all {
	
	public static void main(String[] args) throws IOException {
		
		Scanner keyboardInput1;
        keyboardInput1 = new Scanner(System.in);

        Scanner keyboardInput2;
        keyboardInput2 = new Scanner(System.in);
        
        Scanner keyboardInput3;
        keyboardInput3 = new Scanner(System.in);

        Scanner keyboard = new Scanner(System.in);
        Scanner keyboard_account = new Scanner(System.in);
        Scanner keyboard_password = new Scanner(System.in);
        
        //System.out.println("Please input the path of sid file 1: ");
        String inputFilePath1;

        //System.out.println("Please input the path of sid file 2: ");
        String inputFilePath2;
      
        FileReader fe = new FileReader("announce.txt");
        BufferedReader br = new BufferedReader(fe);
        while(br.ready()) {
        	
        	System.out.println(br.readLine());
        }
        fe.close();
        
        String password, account_c = null, account = null;
        int managerID, choose_person = 0;
        int login = 0, flag_manager = 0;

       // keyboard.nextLine(); //�M���h�l����r��
        FileWriter fw = new FileWriter("User.txt", true);
        FileWriter fw_m = new FileWriter("manager.txt", true);
        FileWriter fw_c = new FileWriter("compare.txt", true);
        
        Scanner keyboardmanager = new Scanner(System.in);
		int choosemanager;
        
        int yyy = 1;
        
        
        while(yyy>0) {
        	System.out.println("��ܻy��(Choose a language): 1.����  2.English");
        	int lan = keyboardInput1.nextInt();
        	if(lan == 1) {
			
        		System.out.println("�п�ܥ\��: 1.�M��űЫ�   2.�^�����D   3.�{�ҥ�����");
        		int feat = keyboardInput2.nextInt();
        		if(feat == 1) {
        			
        			System.out.println("�{�ҪűЫ�");
        			int data;
                    System.out.println("��ܤ��: 1.�P���@  2.�P���G  3.�P���T  4.�P���|  5.�P����");
                    data = keyboardInput2.nextInt();
                    System.out.println("��ܲĴX�`:1.�Ĥ@�` 2.�ĤG�` 3.�ĤT�` 4.�ĥ|�`  5.�Ĥ��`  6.�Ĥ��` 7.�ĤC�` 8.�ĤK�` 9.�ĤE�` 10.�ĤQ�` 11.�ĤQ�@�` 12.�ĤQ�G�` 13.�ĤQ�T�` 14.�ĤQ�|�`");
                    int clas;
                    clas = keyboardInput1.nextInt();
                    int rest;
                    System.out.println("��ܥ𮧮ɶ�: 1.�@�`��  2.��`��  3.�T�`��  4.�|�`��");
                    rest = keyboardInput3.nextInt();
                    for(int ii=0; ii<rest; ii++)
                    {
                        if(ii == 0)
                        {

                            inputFilePath1 = "�����Ы�.txt";
                            inputFilePath2 = data + "-" + clas + ".txt";

                            Scanner fileInput1 = null;
                            Scanner fileInput2 = null;

                            try
                            {
                                fileInput1 = new Scanner(new FileInputStream(inputFilePath1));
                            }
                            catch (FileNotFoundException c)
                            {
                                c.printStackTrace();
                            }

                            try
                            {
                                fileInput2 = new Scanner(new FileInputStream(inputFilePath2));
                            }
                            catch (FileNotFoundException c)
                            {
                                c.printStackTrace();
                            }

                            //System.out.println("Please input the output file path: ");
                            String outputFilePath = "�Ĥ@��.txt";
                            //System.out.println("Output file path: " + outputFilePath);
                            PrintWriter textOutput = null;

                            try
                            {
                                textOutput = new PrintWriter(new FileOutputStream(outputFilePath));
                            }
                            catch(FileNotFoundException c)
                            {
                                c.printStackTrace();
                            }

                            boolean a;
                            int b = 0;
                            int count = 0;
                            String result1 = null;
                            String result2 = null;
                            while (fileInput1.hasNext())
                            {

                                result1 = fileInput1.nextLine();
                                while (fileInput2.hasNext())
                                {

                                    result2 = fileInput2.nextLine();


                                    a = result1.equals(result2);


                                    if(a)
                                    {

                                        b = 0;
                                        break;
                                    }
                                    else
                                    {
                                        count++;
                                        b++;
                                    }
                                }
                                if(b>0)
                                {

                                    textOutput.println(result1);
                                    if(rest==1)
                                    {
                                        System.out.println(result1);
                                    }
                                    b = 0;
                                }

                                try
                                {

                                    fileInput2 = new Scanner(new FileInputStream(inputFilePath2));
                                }
                                catch (FileNotFoundException e)
                                {

                                    e.printStackTrace();
                                }

                            }
                            if(count==0 && rest == 1)
                            {

                                System.out.println("�d�L�Ы�!");
                            }
                            fileInput1.close();
                            fileInput2.close();
                            textOutput.close();
                        }
                        else if(ii == 1)
                        {
                            inputFilePath1 = "�Ĥ@��.txt";
                            clas = clas+1;
                            inputFilePath2 = data + "-" + clas + ".txt";

                            Scanner fileInput1 = null;
                            Scanner fileInput2 = null;

                            try
                            {
                                fileInput1 = new Scanner(new FileInputStream(inputFilePath1));
                            }
                            catch (FileNotFoundException c)
                            {
                                c.printStackTrace();
                            }

                            try
                            {
                                fileInput2 = new Scanner(new FileInputStream(inputFilePath2));
                            }
                            catch (FileNotFoundException c)
                            {
                                c.printStackTrace();
                            }

                            //System.out.println("Please input the output file path: ");
                            String outputFilePath = "�ĤG��.txt";
                            //System.out.println("Output file path: " + outputFilePath);
                            PrintWriter textOutput = null;

                            try
                            {
                                textOutput = new PrintWriter(new FileOutputStream(outputFilePath));
                            }
                            catch(FileNotFoundException c)
                            {
                                c.printStackTrace();
                            }

                            boolean a;
                            int b = 0;
                            int count = 0;
                            String result1 = null;
                            String result2 = null;
                            while (fileInput1.hasNext())
                            {

                                result1 = fileInput1.nextLine();
                                while (fileInput2.hasNext())
                                {

                                    result2 = fileInput2.nextLine();


                                    a = result1.equals(result2);

                                    if(a)
                                    {

                                        b = 0;
                                        break;
                                    }
                                    else
                                    {
                                        count++;
                                        b++;
                                    }
                                }
                                if(b>0)
                                {

                                    textOutput.println(result1);
                                    if(rest==2)
                                    {
                                        System.out.println(result1);
                                    }
                                    b = 0;
                                }

                                try
                                {

                                    fileInput2 = new Scanner(new FileInputStream(inputFilePath2));
                                }
                                catch (FileNotFoundException e)
                                {

                                    e.printStackTrace();
                                }

                            }

                            if(count==0 && rest == 2)
                            {
                                System.out.println("�d�L�Ы�!");
                            }

                            fileInput1.close();
                            fileInput2.close();
                            textOutput.close();
                        }
                        else if(ii == 2)
                        {
                            inputFilePath1 = "�ĤG��.txt";
                            clas = clas+1;
                            inputFilePath2 = data + "-" + clas + ".txt";

                            Scanner fileInput1 = null;
                            Scanner fileInput2 = null;

                            try
                            {
                                fileInput1 = new Scanner(new FileInputStream(inputFilePath1));
                            }
                            catch (FileNotFoundException c)
                            {
                                c.printStackTrace();
                            }

                            try
                            {
                                fileInput2 = new Scanner(new FileInputStream(inputFilePath2));
                            }
                            catch (FileNotFoundException c)
                            {
                                c.printStackTrace();
                            }

                            //System.out.println("Please input the output file path: ");
                            String outputFilePath = "�ĤT��.txt";
                            //System.out.println("Output file path: " + outputFilePath);
                            PrintWriter textOutput = null;

                            try
                            {
                                textOutput = new PrintWriter(new FileOutputStream(outputFilePath));
                            }
                            catch(FileNotFoundException c)
                            {
                                c.printStackTrace();
                            }

                            boolean a;
                            int b = 0;
                            int count = 0;
                            String result1 = null;
                            String result2 = null;
                            while (fileInput1.hasNext())
                            {

                                result1 = fileInput1.nextLine();
                                while (fileInput2.hasNext())
                                {

                                    result2 = fileInput2.nextLine();


                                    a = result1.equals(result2);

                                    if(a)
                                    {

                                        b = 0;
                                        break;
                                    }
                                    else
                                    {
                                        count++;
                                        b++;
                                    }
                                }
                                if(b>0)
                                {

                                    textOutput.println(result1);
                                    if(rest==3)
                                    {
                                        System.out.println(result1);
                                    }
                                    b = 0;
                                }

                                try
                                {

                                    fileInput2 = new Scanner(new FileInputStream(inputFilePath2));
                                }
                                catch (FileNotFoundException e)
                                {

                                    e.printStackTrace();
                                }

                            }

                            if(count==0 && rest == 3)
                            {
                                System.out.println("�d�L�Ы�!");
                            }

                            fileInput1.close();
                            fileInput2.close();
                            textOutput.close();
                        }
                        else if(ii == 3)
                        {
                            inputFilePath1 = "�ĤT��.txt";
                            clas = clas+1;
                            inputFilePath2 = data + "-" + clas + ".txt";

                            Scanner fileInput1 = null;
                            Scanner fileInput2 = null;

                            try
                            {
                                fileInput1 = new Scanner(new FileInputStream(inputFilePath1));
                            }
                            catch (FileNotFoundException c)
                            {
                                c.printStackTrace();
                            }

                            try
                            {
                                fileInput2 = new Scanner(new FileInputStream(inputFilePath2));
                            }
                            catch (FileNotFoundException c)
                            {
                                c.printStackTrace();
                            }

                            //System.out.println("Please input the output file path: ");
                            String outputFilePath = "�ĥ|��.txt";
                            //System.out.println("Output file path: " + outputFilePath);
                            PrintWriter textOutput = null;

                            try
                            {
                                textOutput = new PrintWriter(new FileOutputStream(outputFilePath));
                            }
                            catch(FileNotFoundException c)
                            {
                                c.printStackTrace();
                            }

                            boolean a;
                            int b = 0;
                            int count = 0;
                            String result1 = null;
                            String result2 = null;
                            while (fileInput1.hasNext())
                            {

                                result1 = fileInput1.nextLine();
                                while (fileInput2.hasNext())
                                {

                                    result2 = fileInput2.nextLine();


                                    a = result1.equals(result2);

                                    if(a)
                                    {

                                        b = 0;
                                        break;
                                    }
                                    else
                                    {
                                        count++;
                                        b++;
                                    }
                                }
                                if(b>0)
                                {

                                    textOutput.println(result1);
                                    if(rest==4)
                                    {
                                        System.out.println(result1);
                                    }
                                    b = 0;
                                }

                                try
                                {

                                    fileInput2 = new Scanner(new FileInputStream(inputFilePath2));
                                }
                                catch (FileNotFoundException e)
                                {

                                    e.printStackTrace();
                                }

                            }

                            if(count==0 && rest == 4)
                            {
                                System.out.println("�d�L�Ы�!");
                            }
                            fileInput1.close();
                            fileInput2.close();
                            textOutput.close();
                        }
                           
                    }
                    break;
        		}
        		else if(feat == 2) {
        			
        			System.out.println("�^�����D");
        			System.out.println("�п�ܥ\��(1.���U 2.�n�J):");
        	        int choose = keyboard.nextInt();
        			 if(choose == 1) //���U
        		        {
        		            System.out.println("�п�ܵ��U����(1.�ϥΪ� 2.�޲z��):");
        		            choose_person = keyboard.nextInt();
        		          //  keyboard.nextLine();
        		            System.out.println("���U");
        		  
        		            while(true)
        		            {
        		            	System.out.println("�п�J�b��:");
        		            	
        		                account = keyboard_account.nextLine();
        		                FileReader FileStream = new FileReader("compare.txt");
        		                BufferedReader fr = new BufferedReader(FileStream);
        		                while((account_c = fr.readLine()) != null)
        		                {                    
        		                    if(account_c.compareTo(account) != 0)
        		                    {
        		                    	continue;
        		                    }
        		                    else
        		                    {
        		                    	System.out.println("�b������");
        		                    	break;
        		                    }
        		                }
        		                if(account_c == null)
        		                	break;
        		                fr.close();
        		               
        		            }
        		        
        			                
        			        System.out.println("�п�J�K�X:");
        			        password = keyboard_password.nextLine();
        			        if( choose_person == 2) 
        			        {
        			          	while(true)
        			            {
        			                System.out.println("�п�J���ҽX:");
        			                managerID = keyboard.nextInt();
        			                if(managerID != 1468)
        			                    System.out.println("���ҥ���");
        			                else 
        			                {
        			                	
        			                    fw_m.write(account + "\r\n");
        			                    fw_m.write(password + "\r\n");
        			                    fw_m.flush();
        			                    break;
        			                }
        			                    		
        			            }
        			                	
        			        }
        			        fw.write(account + "\r\n");
        			        fw.write(password + "\r\n");
        			        fw.flush();
        			        fw_c.write(account + "\r\n");
        			        fw_c.flush();
        			        System.out.println("���U���\");     
        			        //String a = account + ".txt";
        			        File newtxt = new File(account + ".txt"); //�C�ӨϥΪ̳��Ыؤ@��txt��
        			       // File newtxt = new File(a);
        			        newtxt.createNewFile();	 
        			        /****/
        			       /* System.out.println(a);
        			        FileWriter fw_t = new FileWriter(a, true);
        			        fw_t.write(a + "\r\n");
        			        fw_t.flush();*/
        			            
        			  
        			            
        			        
        			       /* fw.close();
        			        fw_c.close();
        			        fw_m.close();
        			        keyboard.close();
        			        keyboard_account.close();
        			        keyboard_password.close();*/
        		        }
        		     

        		        int flag = 0;
        		        if(choose == 2) //�n�J
        		        {
        		        	System.out.println("�n�J");
        		        	while(true)
        		            {
        		            	System.out.println("�п�J�b��:");
        		            	
        		                account = keyboard_account.nextLine();
        		                FileReader FileStream = new FileReader("compare.txt");
        		                BufferedReader fr = new BufferedReader(FileStream);
        		                //int flag = 0;
        		                while((account_c = fr.readLine()) != null)
        		                {                    
        		                    if(account_c.compareTo(account) == 0)
        		                    {
        		                    	flag = 1;
        		                    }
        		                    
        		                }
        		                if(flag == 0)
        		                	System.out.println("�L���b��");
        		                if(account_c == null)
        		                	break;               
        		            }
        		        	
        		        	
        		        	if(flag == 1)
        		        	{
        		        		System.out.println("�п�J�K�X:");   
        		        		String password_c = null;
        		        		int flag_p = 0;
        		        		//FileReader FileStream = new FileReader("User.txt");
        		                //BufferedReader fr = new BufferedReader(FileStream);
        		                while(true)
        		                {
        		                	FileReader FileStream = new FileReader("User.txt");
        		                	BufferedReader fr = new BufferedReader(FileStream);
        		                	password = keyboard_password.nextLine();
        		                	
        		                    //password_c = fr.readLine();
        		            		while((password_c = fr.readLine()) != null)
        		            		{
        		            			//System.out.println(password_c);
        		            			if(password_c.compareTo(account) == 0)
        		            			{
        		            				
        		            				if((password_c = fr.readLine()).compareTo(password) == 0)
        		            				{
        		            					System.out.println("�n�J���\");
        		            					flag_p = 1;
        		            					login = 1;
        		            					break;
        		            				}
        		         
        		            			}
        		            		}
        		            		if(flag_p == 1)
        		            		{
        		            			break;
        		            		}
        		            		System.out.println("�K�X���~\n�п�J�K�X:");
        		            		fr.close();
        		                }
        		                
        		                
        		        	}
        		        	
        		        }
        		        if(login == 1) //���\�n�J���ܥ\��
        		        {
        		        	String manager; //�P�_�O�_���޲z��
        		        	FileReader FileStream = new FileReader("manager.txt");
        		        	BufferedReader fr = new BufferedReader(FileStream);
        		        	while((manager = fr.readLine()) != null)
        		    		{
        		        		//System.out.println(manager);
        		        		if(manager.compareTo(account) == 0)
        		    			{
        		        			flag_manager = 1;
        		        			break;
        		    			}
        		        		else
        		        			manager = fr.readLine();
        		        		if(manager == null)
        		        			break;
        		    		}
        		        	fr.close();
        		        	
        		        	if(flag_manager == 1) //�������޲z��
        		        	{
        		        		
        		        		System.out.println("�п�ܥ\��(1.�^�а��D2.�m�����i):");
        		        		
        		        		choosemanager = keyboardmanager.nextInt();
        		        		keyboardmanager.nextLine();
        		        		if(choosemanager == 1)
        		        		{
        		        			System.out.println("��ܨϥΪ̪����D:");
        		        			
        		        			 FileReader FileStream_2 = new FileReader("compare.txt");
        		                     BufferedReader fr_2 = new BufferedReader(FileStream_2);
        		                     
        		                     while((account_c = fr_2.readLine()) != null)
        		                     {    
        		                    	 System.out.println(account_c);
        		                     }
        		                     String chooseUser = keyboardmanager.nextLine();
        		                     
        		                     //FileWriter fw_man = new FileWriter(chooseUser + ".txt", true);
        		                     String question;
        		                     //String test = "good_2";
        		                    /* fw_man.write(test + "\r\n");
        		                     fw_man.flush();
        		                     fw_man.close();*/
        		                     FileReader FileStream_user = new FileReader(chooseUser + ".txt");
        		                     BufferedReader fr_user = new BufferedReader(FileStream_user);
        		                   
        		                     while((question = fr_user.readLine()) != null)
        		             		{         
        		                    	 System.out.println(question);
        		             		}
        		                     
        		                     String answer = keyboardmanager.nextLine();
        		                     FileWriter fw_man = new FileWriter(chooseUser + ".txt", true);
        		                     fw_man.write("�޲z��:" + answer + "\r\n"); //�^�а��D
        		                     fw_man.flush();
        		                     System.out.println("�^�Ц��\");
        		                     fw_man.close();
        		                     fr_2.close();
        		                     fr_user.close();
        		                }
        		        		if(choosemanager == 2) //���i
        		        		{
        		                    FileWriter fw_acc = new FileWriter("announce.txt", true);
        		                    System.out.println("�п�J���i���e:");
        		                    String announce = keyboardmanager.nextLine();
        		                    fw_acc.write(announce);
        		                    fw_acc.flush();
        		                    fw_acc.close();
        		        		}
        		        		//keyboardmanager.close();
        		        	}
        		        	else //�ϥΪ�
        		        	{
        		        		System.out.println("�п�ܥ\��(1.���D�^��2.���D����):");
        		        		Scanner keyboardInput = new Scanner(System.in);
        		        		int input = keyboardInput.nextInt();
        		        		if(input == 1)
        		        		{
        		        			System.out.println("�п�J���D:");
        		        			String question = keyboardmanager.nextLine();
        		        			//System.out.println(account);
        		        			FileWriter fw_user = new FileWriter(account + ".txt", true);
        		        			fw_user.write(account + ":" + question + "\r\n");
        		        			fw_user.flush();
        		        			System.out.println("��J���\");
        		        		}
        		        		if(input == 2)
        		        		{
        		        			System.out.println("���D����:");
        		        			FileReader FileStream_user = new FileReader(account + ".txt");
        		                    BufferedReader fr_user = new BufferedReader(FileStream_user);
        		                    String record;
        		                    while((record = fr_user.readLine()) != null)
        		             		{         
        		                    	 System.out.println(record);
        		             		}
        		                    
        		                  
        		        		}
        		        		keyboardInput.close();
        		        		
        		        	}
        		        }
        			break;
        		}
        		else if(feat == 3) {
        			
        			System.out.println("�{�ҥ�����");
        			int i;
        			System.out.printf(" ");
        			for(i=0;i<98;i++) {
        				System.out.print("��");
        			}
        			System.out.println("");
        			System.out.printf("�i");
        			for(i=0;i<98;i++) {
        				System.out.print(" ");
        			}
        			
        			System.out.println("�i");
        			System.out.print("�i  �i�i�i�i�i�i�i�i�i�i�i�i�i�i�i");
        			for(i=0;i<81;i++) {
        				System.out.print(" ");
        			}
        			System.out.println("�i");
        			System.out.print("�i  �i�i�i�i�i�i�i�i�i�i�i�i�i�i�i");
        			for(i=0;i<81;i++) {
        				System.out.print(" ");
        			}
        			System.out.println("�i");
        			
        			System.out.print("�i  �i�i�i�i�i�i�i�i�i�i�i�i�i�i�i");
        			for(i=0;i<81;i++) {
        				System.out.print(" ");
        			}
        			System.out.println("�i");
        			
        			System.out.print("�i  �i�i�i�i�i�i�i�i�i�i�i�i�i�i�i");
        			for(i=0;i<81;i++) {
        				System.out.print(" ");
        			}
        			System.out.println("�i");
        			
        			System.out.print("�i  �i�i�i�i�i�i�i�i�i�i�i�i�i�i�i");
        			for(i=0;i<81;i++) {
        				System.out.print(" ");
        			}
        			System.out.println("�i");
        			
        			System.out.print("�i  �i�i�i�i�i�i�i�i�i�i�i�i�i�i�i");
        			for(i=0;i<81;i++) {
        				System.out.print(" ");
        			}
        			System.out.println("�i");
        			
        			System.out.print("�i  �i�i�i�i�i�i�i�i�i�i�i�i�i�i�i");
        			for(i=0;i<81;i++) {
        				System.out.print(" ");
        			}
        			System.out.println("�i");
        			
        			System.out.print("�i  �i�i�i�i�i�i�i�i�i�i�i�i�i�i�i");
        			for(i=0;i<81;i++) {
        				System.out.print(" ");
        			}
        			System.out.println("�i");
        			System.out.printf("�i  �ǫ�� ");
        			for(i=0;i<161;i++) {
        				System.out.print(" ");
        			}
        			System.out.println("�i");
        			
        			//�H�W���ǫ��
        			System.out.print("�i");
        			for(i=0;i<98;i++) {
        				System.out.print(" ");
        			}
        			System.out.println("�i");
        			System.out.print("�i  �i�i�i�i�i�i�i�i�i�i�i�i�i  �i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i");
        			for(i=0;i<61;i++) {
        				System.out.print(" ");
        			}
        			System.out.println("�i");
        			System.out.print("�i  �i�i�i�i�i�i�i�i�i�i�i�i�i  �i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i");
        			for(i=0;i<61;i++) {
        				System.out.print(" ");
        			}
        			System.out.println("�i");
        			System.out.print("�i  �i�i�i�i�i�i�i�i�i�i�i�i�i  �i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i");
        			for(i=0;i<61;i++) {
        				System.out.print(" ");
        			}
        			System.out.println("�i");
        			System.out.print("�i  �i�i�i�i�i�i�i�i�i�i�i�i�i  �i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i");
        			for(i=0;i<61;i++) {
        				System.out.print(" ");
        			}
        			System.out.println("�i");
        			System.out.printf("�i  �g����Q�]          �z�Ǥj��");
        			for(i=0;i<132;i++) {
        				System.out.print(" ");
        			}
        			System.out.println("�i");
        			//�H�W�����Q��z��
        			
        			System.out.printf("�i");
        			for(i=0;i<98;i++) {
        				System.out.print(" ");
        			}
        			
        			System.out.println("�i");
        			System.out.print("�i  �i�i�i�i�i�i�i�i�i�i�i�i�i�i�i");
        			for(i=0;i<81;i++) {
        				System.out.print(" ");
        			}
        			System.out.println("�i");
        			System.out.print("�i  �i�i�i�i�i�i�i�i�i�i�i�i�i�i�i");
        			for(i=0;i<81;i++) {
        				System.out.print(" ");
        			}
        			System.out.println("�i");
        			
        			System.out.print("�i  �i�i�i�i�i�i�i�i�i�i�i�i�i�i�i");
        			for(i=0;i<81;i++) {
        				System.out.print(" ");
        			}
        			System.out.println("�i");
        			
        			System.out.print("�i  �i�i�i�i�i�i�i�i�i�i�i�i�i�i�i");
        			for(i=0;i<81;i++) {
        				System.out.print(" ");
        			}
        			System.out.println("�i");
        			
        			System.out.print("�i  �i�i�i�i�i�i�i�i�i�i�i�i�i�i�i");
        			for(i=0;i<81;i++) {
        				System.out.print(" ");
        			}
        			System.out.println("�i");
        			
        			System.out.print("�i  �i�i�i�i�i�i�i�i�i�i�i�i�i�i�i");
        			for(i=0;i<81;i++) {
        				System.out.print(" ");
        			}
        			System.out.println("�i");
        			
        			System.out.print("�i  �i�i�i�i�i�i�i�i�i�i�i�i�i�i�i");
        			for(i=0;i<81;i++) {
        				System.out.print(" ");
        			}
        			System.out.println("�i");
        			
        			System.out.print("�i  �i�i�i�i�i�i�i�i�i�i�i�i�i�i�i");
        			for(i=0;i<81;i++) {
        				System.out.print(" ");
        			}
        			System.out.println("�i");
        			System.out.printf("�i  �|���] ");
        			for(i=0;i<161;i++) {
        				System.out.print(" ");
        			}
        			System.out.println("�i");
        			
        			//�H�W���|���]
        			
        			System.out.print("�i");
        			for(i=0;i<98;i++) {
        				System.out.print(" ");
        			}
        			System.out.println("�i");
        			System.out.print("�i  �i�i�i�i�i�i�i�i�i�i�i�i�i  �i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i  �i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i");
        			for(i=0;i<39;i++) {
        				System.out.print(" ");
        			}
        			System.out.println("�i");
        			System.out.print("�i  �i�i�i�i�i�i�i�i�i�i�i�i�i  �i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i  �i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i");
        			for(i=0;i<39;i++) {
        				System.out.print(" ");
        			}
        			System.out.println("�i");
        			System.out.print("�i  �i�i�i�i�i�i�i�i�i�i�i�i�i  �i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i  �i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i");
        			for(i=0;i<39;i++) {
        				System.out.print(" ");
        			}
        			System.out.println("�i");
        			System.out.print("�i  �i�i�i�i�i�i�i�i�i�i�i�i�i  �i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i");
        			for(i=0;i<61;i++) {
        				System.out.print(" ");
        			}
        			System.out.println("�i");
        			System.out.printf("�i  �y��j��             �Ĥ@�۫ݩ�                       �H���j��");
        			for(i=0;i<92;i++) {
        				System.out.print(" ");
        			}
        			System.out.println("�i");
        			//�H�W���y�� �Ĥ@�۫ݩ� �H���j��
        			break;
        		}
        		else {
        			
        			System.out.println("�Э��s��J");
        		}
        	}
        	else if(lan == 2) {
        		
        		System.out.println("Please select a function: 1.Search for empty classrooms   2.Return problem   3.Fen-gjia plan");
        		int feat = keyboardInput2.nextInt();
        		if(feat == 1) {
        			
        			System.out.println("Fen-gjia empty classrooms");
        			int data;
                    System.out.println("Select date: 1.Monday  2.Tuseday  3.Wednesday  4.Thursday  5.Friday");
                    data = keyboardInput2.nextInt();
                    System.out.println("Select period: 1.First period 2.Second period 3.Third period 4.fourth period 5.fifth period 6.sixth period 7.sevsnth period 8.eighth period 9.ninth period 10.tenth period 11.eleventh period 12.twelfth period 13.thirteenth period 14.fourteenth period");
                    int clas;
                    clas = keyboardInput1.nextInt();
                    int rest;
                    System.out.println("Choose a break time: 1.one period  2.two period  3.three period  4.four period");
                    rest = keyboardInput3.nextInt();
                    for(int ii=0; ii<rest; ii++)
                    {
                        if(ii == 0)
                        {

                            inputFilePath1 = "�����Ы�.txt";
                            inputFilePath2 = data + "-" + clas + ".txt";

                            Scanner fileInput1 = null;
                            Scanner fileInput2 = null;

                            try
                            {
                                fileInput1 = new Scanner(new FileInputStream(inputFilePath1));
                            }
                            catch (FileNotFoundException c)
                            {
                                c.printStackTrace();
                            }

                            try
                            {
                                fileInput2 = new Scanner(new FileInputStream(inputFilePath2));
                            }
                            catch (FileNotFoundException c)
                            {
                                c.printStackTrace();
                            }

                            //System.out.println("Please input the output file path: ");
                            String outputFilePath = "�Ĥ@��.txt";
                            //System.out.println("Output file path: " + outputFilePath);
                            PrintWriter textOutput = null;

                            try
                            {
                                textOutput = new PrintWriter(new FileOutputStream(outputFilePath));
                            }
                            catch(FileNotFoundException c)
                            {
                                c.printStackTrace();
                            }

                            boolean a;
                            int b = 0;
                            int count = 0;
                            String result1 = null;
                            String result2 = null;
                            while (fileInput1.hasNext())
                            {

                                result1 = fileInput1.nextLine();
                                while (fileInput2.hasNext())
                                {

                                    result2 = fileInput2.nextLine();


                                    a = result1.equals(result2);


                                    if(a)
                                    {

                                        b = 0;
                                        break;
                                    }
                                    else
                                    {
                                        count++;
                                        b++;
                                    }
                                }
                                if(b>0)
                                {

                                    textOutput.println(result1);
                                    if(rest==1)
                                    {
                                        System.out.println(result1);
                                    }
                                    b = 0;
                                }

                                try
                                {

                                    fileInput2 = new Scanner(new FileInputStream(inputFilePath2));
                                }
                                catch (FileNotFoundException e)
                                {

                                    e.printStackTrace();
                                }

                            }
                            if(count==0 && rest == 1)
                            {

                                System.out.println("Not Found classroom!");
                            }
                            fileInput1.close();
                            fileInput2.close();
                            textOutput.close();
                        }
                        else if(ii == 1)
                        {
                            inputFilePath1 = "�Ĥ@��.txt";
                            clas = clas+1;
                            inputFilePath2 = data + "-" + clas + ".txt";

                            Scanner fileInput1 = null;
                            Scanner fileInput2 = null;

                            try
                            {
                                fileInput1 = new Scanner(new FileInputStream(inputFilePath1));
                            }
                            catch (FileNotFoundException c)
                            {
                                c.printStackTrace();
                            }

                            try
                            {
                                fileInput2 = new Scanner(new FileInputStream(inputFilePath2));
                            }
                            catch (FileNotFoundException c)
                            {
                                c.printStackTrace();
                            }

                            //System.out.println("Please input the output file path: ");
                            String outputFilePath = "�ĤG��.txt";
                            //System.out.println("Output file path: " + outputFilePath);
                            PrintWriter textOutput = null;

                            try
                            {
                                textOutput = new PrintWriter(new FileOutputStream(outputFilePath));
                            }
                            catch(FileNotFoundException c)
                            {
                                c.printStackTrace();
                            }

                            boolean a;
                            int b = 0;
                            int count = 0;
                            String result1 = null;
                            String result2 = null;
                            while (fileInput1.hasNext())
                            {

                                result1 = fileInput1.nextLine();
                                while (fileInput2.hasNext())
                                {

                                    result2 = fileInput2.nextLine();


                                    a = result1.equals(result2);

                                    if(a)
                                    {

                                        b = 0;
                                        break;
                                    }
                                    else
                                    {
                                        count++;
                                        b++;
                                    }
                                }
                                if(b>0)
                                {

                                    textOutput.println(result1);
                                    if(rest==2)
                                    {
                                        System.out.println(result1);
                                    }
                                    b = 0;
                                }

                                try
                                {

                                    fileInput2 = new Scanner(new FileInputStream(inputFilePath2));
                                }
                                catch (FileNotFoundException e)
                                {

                                    e.printStackTrace();
                                }

                            }

                            if(count==0 && rest == 2)
                            {
                                System.out.println("Not Found classroom!");
                            }

                            fileInput1.close();
                            fileInput2.close();
                            textOutput.close();
                        }
                        else if(ii == 2)
                        {
                            inputFilePath1 = "�ĤG��.txt";
                            clas = clas+1;
                            inputFilePath2 = data + "-" + clas + ".txt";

                            Scanner fileInput1 = null;
                            Scanner fileInput2 = null;

                            try
                            {
                                fileInput1 = new Scanner(new FileInputStream(inputFilePath1));
                            }
                            catch (FileNotFoundException c)
                            {
                                c.printStackTrace();
                            }

                            try
                            {
                                fileInput2 = new Scanner(new FileInputStream(inputFilePath2));
                            }
                            catch (FileNotFoundException c)
                            {
                                c.printStackTrace();
                            }

                            //System.out.println("Please input the output file path: ");
                            String outputFilePath = "�ĤT��.txt";
                            //System.out.println("Output file path: " + outputFilePath);
                            PrintWriter textOutput = null;

                            try
                            {
                                textOutput = new PrintWriter(new FileOutputStream(outputFilePath));
                            }
                            catch(FileNotFoundException c)
                            {
                                c.printStackTrace();
                            }

                            boolean a;
                            int b = 0;
                            int count = 0;
                            String result1 = null;
                            String result2 = null;
                            while (fileInput1.hasNext())
                            {

                                result1 = fileInput1.nextLine();
                                while (fileInput2.hasNext())
                                {

                                    result2 = fileInput2.nextLine();


                                    a = result1.equals(result2);

                                    if(a)
                                    {

                                        b = 0;
                                        break;
                                    }
                                    else
                                    {
                                        count++;
                                        b++;
                                    }
                                }
                                if(b>0)
                                {

                                    textOutput.println(result1);
                                    if(rest==3)
                                    {
                                        System.out.println(result1);
                                    }
                                    b = 0;
                                }

                                try
                                {

                                    fileInput2 = new Scanner(new FileInputStream(inputFilePath2));
                                }
                                catch (FileNotFoundException e)
                                {

                                    e.printStackTrace();
                                }

                            }

                            if(count==0 && rest == 3)
                            {
                                System.out.println("Not Found classroom!");
                            }

                            fileInput1.close();
                            fileInput2.close();
                            textOutput.close();
                        }
                        else if(ii == 3)
                        {
                            inputFilePath1 = "�ĤT��.txt";
                            clas = clas+1;
                            inputFilePath2 = data + "-" + clas + ".txt";

                            Scanner fileInput1 = null;
                            Scanner fileInput2 = null;

                            try
                            {
                                fileInput1 = new Scanner(new FileInputStream(inputFilePath1));
                            }
                            catch (FileNotFoundException c)
                            {
                                c.printStackTrace();
                            }

                            try
                            {
                                fileInput2 = new Scanner(new FileInputStream(inputFilePath2));
                            }
                            catch (FileNotFoundException c)
                            {
                                c.printStackTrace();
                            }

                            //System.out.println("Please input the output file path: ");
                            String outputFilePath = "�ĥ|��.txt";
                            //System.out.println("Output file path: " + outputFilePath);
                            PrintWriter textOutput = null;

                            try
                            {
                                textOutput = new PrintWriter(new FileOutputStream(outputFilePath));
                            }
                            catch(FileNotFoundException c)
                            {
                                c.printStackTrace();
                            }

                            boolean a;
                            int b = 0;
                            int count = 0;
                            String result1 = null;
                            String result2 = null;
                            while (fileInput1.hasNext())
                            {

                                result1 = fileInput1.nextLine();
                                while (fileInput2.hasNext())
                                {

                                    result2 = fileInput2.nextLine();


                                    a = result1.equals(result2);

                                    if(a)
                                    {

                                        b = 0;
                                        break;
                                    }
                                    else
                                    {
                                        count++;
                                        b++;
                                    }
                                }
                                if(b>0)
                                {

                                    textOutput.println(result1);
                                    if(rest==4)
                                    {
                                        System.out.println(result1);
                                    }
                                    b = 0;
                                }

                                try
                                {

                                    fileInput2 = new Scanner(new FileInputStream(inputFilePath2));
                                }
                                catch (FileNotFoundException e)
                                {

                                    e.printStackTrace();
                                }

                            }

                            if(count==0 && rest == 4)
                            {
                                System.out.println("Not Found classroom!");
                            }
                            fileInput1.close();
                            fileInput2.close();
                            textOutput.close();
                        }
                           
                    }
        			break;
        		}
        		else if(feat == 2) {
        			
        			System.out.println("Return problem");
        			System.out.println("Please select a function(1.Registered 2.Sign in):");
        	        int choose = keyboard.nextInt();
        			 if(choose == 1) //���U
        		        {
        		            System.out.println("Please choose to register(1.User 2.Administrator):");
        		            choose_person = keyboard.nextInt();
        		          //  keyboard.nextLine();
        		            System.out.println("Registered");
        		  
        		            while(true)
        		            {
        		            	System.out.println("Please enter your account:");
        		            	
        		                account = keyboard_account.nextLine();
        		                FileReader FileStream = new FileReader("compare.txt");
        		                BufferedReader fr = new BufferedReader(FileStream);
        		                while((account_c = fr.readLine()) != null)
        		                {                    
        		                    if(account_c.compareTo(account) != 0)
        		                    {
        		                    	continue;
        		                    }
        		                    else
        		                    {
        		                    	System.out.println("Duplicate account");
        		                    	break;
        		                    }
        		                }
        		                if(account_c == null)
        		                	break;
        		                fr.close();
        		               
        		            }
        		        
        			                
        			        System.out.println("Please enter your password:");
        			        password = keyboard_password.nextLine();
        			        if( choose_person == 2) 
        			        {
        			          	while(true)
        			            {
        			                System.out.println("Please enter verification code:");
        			                managerID = keyboard.nextInt();
        			                if(managerID != 1468)
        			                    System.out.println("Verification failed");
        			                else 
        			                {
        			                	
        			                    fw_m.write(account + "\r\n");
        			                    fw_m.write(password + "\r\n");
        			                    fw_m.flush();
        			                    break;
        			                }
        			                    		
        			            }
        			                	
        			        }
        			        fw.write(account + "\r\n");
        			        fw.write(password + "\r\n");
        			        fw.flush();
        			        fw_c.write(account + "\r\n");
        			        fw_c.flush();
        			        System.out.println("Registration success");     
        			        //String a = account + ".txt";
        			        File newtxt = new File(account + ".txt"); //�C�ӨϥΪ̳��Ыؤ@��txt��
        			       // File newtxt = new File(a);
        			        newtxt.createNewFile();	 
        			        /****/
        			       /* System.out.println(a);
        			        FileWriter fw_t = new FileWriter(a, true);
        			        fw_t.write(a + "\r\n");
        			        fw_t.flush();*/
        			            
        			  
        			            
        			        
        			       /* fw.close();
        			        fw_c.close();
        			        fw_m.close();
        			        keyboard.close();
        			        keyboard_account.close();
        			        keyboard_password.close();*/
        		        }
        		     

        		        int flag = 0;
        		        if(choose == 2) //�n�J
        		        {
        		        	System.out.println("Sign in");
        		        	while(true)
        		            {
        		            	System.out.println("Please enter your account:");
        		            	
        		                account = keyboard_account.nextLine();
        		                FileReader FileStream = new FileReader("compare.txt");
        		                BufferedReader fr = new BufferedReader(FileStream);
        		                //int flag = 0;
        		                while((account_c = fr.readLine()) != null)
        		                {                    
        		                    if(account_c.compareTo(account) == 0)
        		                    {
        		                    	flag = 1;
        		                    }
        		                    
        		                }
        		                if(flag == 0)
        		                	System.out.println("Not found account");
        		                if(account_c == null)
        		                	break;               
        		            }
        		        	
        		        	
        		        	if(flag == 1)
        		        	{
        		        		System.out.println("Please enter your password:");   
        		        		String password_c = null;
        		        		int flag_p = 0;
        		        		//FileReader FileStream = new FileReader("User.txt");
        		                //BufferedReader fr = new BufferedReader(FileStream);
        		                while(true)
        		                {
        		                	FileReader FileStream = new FileReader("User.txt");
        		                	BufferedReader fr = new BufferedReader(FileStream);
        		                	password = keyboard_password.nextLine();
        		                	
        		                    //password_c = fr.readLine();
        		            		while((password_c = fr.readLine()) != null)
        		            		{
        		            			//System.out.println(password_c);
        		            			if(password_c.compareTo(account) == 0)
        		            			{
        		            				
        		            				if((password_c = fr.readLine()).compareTo(password) == 0)
        		            				{
        		            					System.out.println("Sign in suceesfully");
        		            					flag_p = 1;
        		            					login = 1;
        		            					break;
        		            				}
        		         
        		            			}
        		            		}
        		            		if(flag_p == 1)
        		            		{
        		            			break;
        		            		}
        		            		System.out.println("Wrong password\nPlease enter your password:");
        		            		fr.close();
        		                }
        		                
        		                
        		        	}
        		        	
        		        }
        		        if(login == 1) //���\�n�J���ܥ\��
        		        {
        		        	String manager; //�P�_�O�_���޲z��
        		        	FileReader FileStream = new FileReader("manager.txt");
        		        	BufferedReader fr = new BufferedReader(FileStream);
        		        	while((manager = fr.readLine()) != null)
        		    		{
        		        		//System.out.println(manager);
        		        		if(manager.compareTo(account) == 0)
        		    			{
        		        			flag_manager = 1;
        		        			break;
        		    			}
        		        		else
        		        			manager = fr.readLine();
        		        		if(manager == null)
        		        			break;
        		    		}
        		        	fr.close();
        		        	
        		        	if(flag_manager == 1) //�������޲z��
        		        	{
        		        		
        		        		System.out.println("Please select a function(1.Reply question2.Top announcement):");
        		        		
        		        		choosemanager = keyboardmanager.nextInt();
        		        		keyboardmanager.nextLine();
        		        		if(choosemanager == 1)
        		        		{
        		        			System.out.println("Select user question:");
        		        			
        		        			 FileReader FileStream_2 = new FileReader("compare.txt");
        		                     BufferedReader fr_2 = new BufferedReader(FileStream_2);
        		                     
        		                     while((account_c = fr_2.readLine()) != null)
        		                     {    
        		                    	 System.out.println(account_c);
        		                     }
        		                     String chooseUser = keyboardmanager.nextLine();
        		                     
        		                     //FileWriter fw_man = new FileWriter(chooseUser + ".txt", true);
        		                     String question;
        		                     //String test = "good_2";
        		                    /* fw_man.write(test + "\r\n");
        		                     fw_man.flush();
        		                     fw_man.close();*/
        		                     FileReader FileStream_user = new FileReader(chooseUser + ".txt");
        		                     BufferedReader fr_user = new BufferedReader(FileStream_user);
        		                   
        		                     while((question = fr_user.readLine()) != null)
        		             		{         
        		                    	 System.out.println(question);
        		             		}
        		                     
        		                     String answer = keyboardmanager.nextLine();
        		                     FileWriter fw_man = new FileWriter(chooseUser + ".txt", true);
        		                     fw_man.write("Administrator:" + answer + "\r\n"); //�^�а��D
        		                     fw_man.flush();
        		                     System.out.println("Reply successfully");
        		                     fw_man.close();
        		                     fr_2.close();
        		                     fr_user.close();
        		                }
        		        		if(choosemanager == 2) //���i
        		        		{
        		                    FileWriter fw_acc = new FileWriter("announce.txt", true);
        		                    System.out.println("Please enter the announcement content:");
        		                    String announce = keyboardmanager.nextLine();
        		                    fw_acc.write(announce);
        		                    fw_acc.flush();
        		                    fw_acc.close();
        		        		}
        		        		//keyboardmanager.close();
        		        	}
        		        	else //�ϥΪ�
        		        	{
        		        		System.out.println("Please select a function(1.Problem return2.Problem record):");
        		        		Scanner keyboardInput = new Scanner(System.in);
        		        		int input = keyboardInput.nextInt();
        		        		if(input == 1)
        		        		{
        		        			System.out.println("Please enter a question:");
        		        			String question = keyboardmanager.nextLine();
        		        			//System.out.println(account);
        		        			FileWriter fw_user = new FileWriter(account + ".txt", true);
        		        			fw_user.write(account + ":" + question + "\r\n");
        		        			fw_user.flush();
        		        			System.out.println("Input success");
        		        		}
        		        		if(input == 2)
        		        		{
        		        			System.out.println("Problem record:");
        		        			FileReader FileStream_user = new FileReader(account + ".txt");
        		                    BufferedReader fr_user = new BufferedReader(FileStream_user);
        		                    String record;
        		                    while((record = fr_user.readLine()) != null)
        		             		{         
        		                    	 System.out.println(record);
        		             		}
        		                    
        		                  
        		        		}
        		        		keyboardInput.close();
        		        		
        		        	}
        		        }
        			break;
        		}
        		else if(feat == 3) {
        			
        			System.out.println("Fen-gjia plan");
        			int i;
        			System.out.printf(" ");
        			for(i=0;i<98;i++) {
        				System.out.print("��");
        			}
        			System.out.println("");
        			System.out.printf("�i");
        			for(i=0;i<98;i++) {
        				System.out.print(" ");
        			}
        			
        			System.out.println("�i");
        			System.out.print("�i  �i�i�i�i�i�i�i�i�i�i�i�i�i�i�i");
        			for(i=0;i<81;i++) {
        				System.out.print(" ");
        			}
        			System.out.println("�i");
        			System.out.print("�i  �i�i�i�i�i�i�i�i�i�i�i�i�i�i�i");
        			for(i=0;i<81;i++) {
        				System.out.print(" ");
        			}
        			System.out.println("�i");
        			
        			System.out.print("�i  �i�i�i�i�i�i�i�i�i�i�i�i�i�i�i");
        			for(i=0;i<81;i++) {
        				System.out.print(" ");
        			}
        			System.out.println("�i");
        			
        			System.out.print("�i  �i�i�i�i�i�i�i�i�i�i�i�i�i�i�i");
        			for(i=0;i<81;i++) {
        				System.out.print(" ");
        			}
        			System.out.println("�i");
        			
        			System.out.print("�i  �i�i�i�i�i�i�i�i�i�i�i�i�i�i�i");
        			for(i=0;i<81;i++) {
        				System.out.print(" ");
        			}
        			System.out.println("�i");
        			
        			System.out.print("�i  �i�i�i�i�i�i�i�i�i�i�i�i�i�i�i");
        			for(i=0;i<81;i++) {
        				System.out.print(" ");
        			}
        			System.out.println("�i");
        			
        			System.out.print("�i  �i�i�i�i�i�i�i�i�i�i�i�i�i�i�i");
        			for(i=0;i<81;i++) {
        				System.out.print(" ");
        			}
        			System.out.println("�i");
        			
        			System.out.print("�i  �i�i�i�i�i�i�i�i�i�i�i�i�i�i�i");
        			for(i=0;i<81;i++) {
        				System.out.print(" ");
        			}
        			System.out.println("�i");
        			System.out.printf("�i  �ǫ�� ");
        			for(i=0;i<161;i++) {
        				System.out.print(" ");
        			}
        			System.out.println("�i");
        			
        			//�H�W���ǫ��
        			System.out.print("�i");
        			for(i=0;i<98;i++) {
        				System.out.print(" ");
        			}
        			System.out.println("�i");
        			System.out.print("�i  �i�i�i�i�i�i�i�i�i�i�i�i�i  �i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i");
        			for(i=0;i<61;i++) {
        				System.out.print(" ");
        			}
        			System.out.println("�i");
        			System.out.print("�i  �i�i�i�i�i�i�i�i�i�i�i�i�i  �i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i");
        			for(i=0;i<61;i++) {
        				System.out.print(" ");
        			}
        			System.out.println("�i");
        			System.out.print("�i  �i�i�i�i�i�i�i�i�i�i�i�i�i  �i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i");
        			for(i=0;i<61;i++) {
        				System.out.print(" ");
        			}
        			System.out.println("�i");
        			System.out.print("�i  �i�i�i�i�i�i�i�i�i�i�i�i�i  �i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i");
        			for(i=0;i<61;i++) {
        				System.out.print(" ");
        			}
        			System.out.println("�i");
        			System.out.printf("�i  �g����Q�]          �z�Ǥj��");
        			for(i=0;i<132;i++) {
        				System.out.print(" ");
        			}
        			System.out.println("�i");
        			//�H�W�����Q��z��
        			
        			System.out.printf("�i");
        			for(i=0;i<98;i++) {
        				System.out.print(" ");
        			}
        			
        			System.out.println("�i");
        			System.out.print("�i  �i�i�i�i�i�i�i�i�i�i�i�i�i�i�i");
        			for(i=0;i<81;i++) {
        				System.out.print(" ");
        			}
        			System.out.println("�i");
        			System.out.print("�i  �i�i�i�i�i�i�i�i�i�i�i�i�i�i�i");
        			for(i=0;i<81;i++) {
        				System.out.print(" ");
        			}
        			System.out.println("�i");
        			
        			System.out.print("�i  �i�i�i�i�i�i�i�i�i�i�i�i�i�i�i");
        			for(i=0;i<81;i++) {
        				System.out.print(" ");
        			}
        			System.out.println("�i");
        			
        			System.out.print("�i  �i�i�i�i�i�i�i�i�i�i�i�i�i�i�i");
        			for(i=0;i<81;i++) {
        				System.out.print(" ");
        			}
        			System.out.println("�i");
        			
        			System.out.print("�i  �i�i�i�i�i�i�i�i�i�i�i�i�i�i�i");
        			for(i=0;i<81;i++) {
        				System.out.print(" ");
        			}
        			System.out.println("�i");
        			
        			System.out.print("�i  �i�i�i�i�i�i�i�i�i�i�i�i�i�i�i");
        			for(i=0;i<81;i++) {
        				System.out.print(" ");
        			}
        			System.out.println("�i");
        			
        			System.out.print("�i  �i�i�i�i�i�i�i�i�i�i�i�i�i�i�i");
        			for(i=0;i<81;i++) {
        				System.out.print(" ");
        			}
        			System.out.println("�i");
        			
        			System.out.print("�i  �i�i�i�i�i�i�i�i�i�i�i�i�i�i�i");
        			for(i=0;i<81;i++) {
        				System.out.print(" ");
        			}
        			System.out.println("�i");
        			System.out.printf("�i  �|���] ");
        			for(i=0;i<161;i++) {
        				System.out.print(" ");
        			}
        			System.out.println("�i");
        			
        			//�H�W���|���]
        			
        			System.out.print("�i");
        			for(i=0;i<98;i++) {
        				System.out.print(" ");
        			}
        			System.out.println("�i");
        			System.out.print("�i  �i�i�i�i�i�i�i�i�i�i�i�i�i  �i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i  �i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i");
        			for(i=0;i<39;i++) {
        				System.out.print(" ");
        			}
        			System.out.println("�i");
        			System.out.print("�i  �i�i�i�i�i�i�i�i�i�i�i�i�i  �i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i  �i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i");
        			for(i=0;i<39;i++) {
        				System.out.print(" ");
        			}
        			System.out.println("�i");
        			System.out.print("�i  �i�i�i�i�i�i�i�i�i�i�i�i�i  �i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i  �i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i");
        			for(i=0;i<39;i++) {
        				System.out.print(" ");
        			}
        			System.out.println("�i");
        			System.out.print("�i  �i�i�i�i�i�i�i�i�i�i�i�i�i  �i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i�i");
        			for(i=0;i<61;i++) {
        				System.out.print(" ");
        			}
        			System.out.println("�i");
        			System.out.printf("�i  �y��j��             �Ĥ@�۫ݩ�                       �H���j��");
        			for(i=0;i<92;i++) {
        				System.out.print(" ");
        			}
        			System.out.println("�i");
        			//�H�W���y�� �Ĥ@�۫ݩ� �H���j��
        			break;
        		}
        		else {
        			
        			System.out.println("Please enter again");
        		}
        	}
        	else {
        		
        		System.out.println("�Э��s��J(Please enter again)");
        	}
        }
		
		keyboardInput1.close();
		keyboardInput2.close();
		keyboardInput3.close();
		keyboard.close();
		keyboard_account.close();
		keyboard_password.close();
		keyboardmanager.close();
		fw.close();
        fw_c.close();
        fw_m.close();
	}

}
