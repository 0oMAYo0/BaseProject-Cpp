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

import data.Data;

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
						
					Data[] monday = new Data[1455];
					Data[] tuesday = new Data[232];
					Data[] wednesday = new Data[234];
					Data[] thursday = new Data[190];
					Data[] friday = new Data[94];
	
					monday[0] = new Data("�u", "303", 1, 1);
					monday[1] = new Data("�u", "303", 1, 2);
					
					monday[2] = new Data("�u", "416", 1, 1);
					monday[3] = new Data("�u", "416", 1, 2);
					
					monday[4] = new Data("�y", "105", 1, 1);
					monday[5] = new Data("�y", "105", 1, 2);
					monday[6] = new Data("�y", "105", 1, 3);
					
					monday[7] = new Data("�y", "203", 1, 1);
					monday[8] = new Data("�y", "203", 1, 2);
					
					monday[9] = new Data("��", "611", 1, 1);
					monday[10] = new Data("��", "611", 1, 2);
					
					monday[11] = new Data("��", "301", 1, 1);
					monday[12] = new Data("��", "301", 1, 2);
					
					monday[13] = new Data("���", "202", 1, 1);
					monday[14] = new Data("���", "202", 1, 2);
					
					monday[15] = new Data("��", "301", 1, 15);
					monday[16] = new Data("��", "301", 1, 15);
					
					monday[17] = new Data("�y", "302", 1, 1);
					monday[18] = new Data("�y", "302", 1, 2);
					
					monday[19] = new Data("��", "104", 1, 1);
					monday[20] = new Data("��", "104", 1, 2);
					
					monday[21] = new Data("��", "208", 1, 1);
					
					monday[22] = new Data("��", "401", 1, 1);
		
					monday[23] = new Data("��", "106", 1, 1);
					monday[24] = new Data("��", "106", 1, 2);
					monday[25] = new Data("��", "106", 1, 3);
					
					monday[26] = new Data("�y", "205", 1, 1);
					monday[27] = new Data("�y", "205", 1, 2);
					
					monday[28] = new Data("�y", "206", 1, 1);
					monday[29] = new Data("�y", "206", 1, 2);
					
					monday[30] = new Data("�y", "207", 1, 1);
					
					monday[31] = new Data("�H", "603", 1, 1);
					monday[32] = new Data("�H", "603", 1, 2);
					
					monday[33] = new Data("�H", "608", 1, 1);
					monday[34] = new Data("�H", "608", 1, 2);
					
					monday[35] = new Data("�H", "504", 1, 1);
					monday[36] = new Data("�H", "504", 1, 2);
					
					monday[37] = new Data("�H", "507", 1, 1);
					monday[38] = new Data("�H", "507", 1, 2);
					
					monday[39] = new Data("��q", "B19", 1, 15);
					monday[40] = new Data("��q", "B19", 1, 15);
					monday[41] = new Data("��q", "B19", 1, 15);
					monday[42] = new Data("��q", "B19", 1, 15);
					
					monday[43] = new Data("��q", "104", 1, 1);
					monday[44] = new Data("��q", "104", 1, 2);
					
					monday[45] = new Data("�y", "407", 1, 1);
					monday[46] = new Data("�y", "407", 1, 2);
					
					monday[47] = new Data("��q", "248", 1, 1);
					monday[48] = new Data("��q", "248", 1, 2);
					
					monday[49] = new Data("��q", "107", 1, 1);
					monday[50] = new Data("��q", "107", 1, 2);
					
					monday[51] = new Data("��q", "306", 1, 1);
					
					monday[52] = new Data("��", "304", 1, 1);
					monday[53] = new Data("��", "304", 1, 2);
					
					monday[54] = new Data("��", "B03", 1, 1);
					
					monday[55] = new Data("��q", "103", 1, 1);
					monday[56] = new Data("��q", "103", 1, 2);
					
					monday[57] = new Data("��q", "102", 1, 1);
					monday[58] = new Data("��q", "102", 1, 2);
					
					monday[59] = new Data("��", "205", 1, 1);
					monday[60] = new Data("��", "205", 1, 2);
					
					monday[61] = new Data("��", "206", 1, 1);
					monday[62] = new Data("��", "206", 1, 2);
					
					monday[63] = new Data("�y", "201", 1, 1);
					monday[64] = new Data("�y", "201", 1, 2);
					
					monday[65] = new Data("��q", "502", 1, 1);
					monday[66] = new Data("��q", "502", 1, 2);
					monday[67] = new Data("��q", "502", 1, 3);
					
					monday[68] = new Data("�y", "104", 1, 1);
					monday[69] = new Data("�y", "104", 1, 2);
					
					monday[70] = new Data("�g", "509", 1, 1);
					monday[71] = new Data("�g", "509", 1, 2);
					
					monday[72] = new Data("�g", "302", 1, 1);
					monday[73] = new Data("�g", "302", 1, 2);
					
					monday[74] = new Data("��", "405", 1, 1);
					monday[75] = new Data("��", "405", 1, 2);
					monday[76] = new Data("��", "405", 1, 3);
					monday[77] = new Data("��", "405", 1, 4);
					
					monday[78] = new Data("��", "111", 1, 1);
					monday[79] = new Data("��", "111", 1, 2);
					
					monday[80] = new Data("�y", "103", 1, 1);
					monday[81] = new Data("�y", "103", 1, 2);
					
					monday[82] = new Data("��", "309", 1, 1);
					monday[83] = new Data("��", "309", 1, 2);
					
					monday[84] = new Data("��", "210", 1, 1);
					monday[85] = new Data("��", "210", 1, 2);
					monday[86] = new Data("��", "210", 1, 3);
					monday[87] = new Data("��", "210", 1, 4);
					
					monday[88] = new Data("��", "210", 1, 15);
					monday[89] = new Data("��", "210", 1, 15);
					monday[90] = new Data("��", "210", 1, 15);
					monday[91] = new Data("��", "210", 1, 15);		
					
					monday[92] = new Data("��", "209", 1, 1);
					monday[93] = new Data("��", "209", 1, 2);
					monday[94] = new Data("��", "209", 1, 3);
					monday[95] = new Data("��", "209", 1, 4);
					
					monday[96] = new Data("�H", "401", 1, 1);
					monday[97] = new Data("�H", "401", 1, 2);
					
					monday[98] = new Data("�H", "403", 1, 1);
					monday[99] = new Data("�H", "403", 1, 2);
					
					monday[100] = new Data("�H", "605", 1, 1);
					monday[101] = new Data("�H", "605", 1, 2);
					
					monday[102] = new Data("�H", "405", 1, 1);
					monday[103] = new Data("�H", "405", 1, 2);
					
					monday[104] = new Data("�H", "501", 1, 1);
					monday[105] = new Data("�H", "501", 1, 2);
					
					monday[106] = new Data("�H", "404", 1, 1);
					monday[107] = new Data("�H", "404", 1, 2);
					
					monday[108] = new Data("�H", "506", 1, 1);
					monday[109] = new Data("�H", "506", 1, 2);
					
					monday[110] = new Data("�H", "407", 1, 1);
					monday[111] = new Data("�H", "407", 1, 2);
					
					monday[112] = new Data("�H", "601", 1, 1);
					monday[113] = new Data("�H", "601", 1, 2);
					
					monday[114] = new Data("�H", "604", 1, 1);
					monday[115] = new Data("�H", "604", 1, 2);
					
					monday[116] = new Data("�H", "606", 1, 1);
					monday[117] = new Data("�H", "606", 1, 2);
					
					//�ĤG�`
					monday[118] = new Data("�u", "410", 1, 2);
					monday[119] = new Data("�u", "410", 1, 3);
					monday[120] = new Data("�u", "410", 1, 4);
					
					monday[121] = new Data("�u", "319", 1, 2);
					monday[122] = new Data("�u", "319", 1, 3);
					monday[123] = new Data("�u", "319", 1, 4);
					
					monday[124] = new Data("�y", "207", 1, 2);
					monday[125] = new Data("�y", "207", 1, 3);
					monday[126] = new Data("�y", "207", 1, 4);
					
					monday[127] = new Data("�u", "305", 1, 2);
					monday[128] = new Data("�u", "305", 1, 3);
					monday[129] = new Data("�u", "305", 1, 4);
					
					monday[130] = new Data("��", "208", 1, 2);
					monday[131] = new Data("��", "208", 1, 3);
					monday[132] = new Data("��", "208", 1, 4);
					
					monday[133] = new Data("�y", "202", 1, 2);
					monday[134] = new Data("�y", "202", 1, 3);
					monday[135] = new Data("�y", "202", 1, 4);
					
					monday[136] = new Data("�u", "204", 1, 2);
					monday[137] = new Data("�u", "204", 1, 3);
					monday[138] = new Data("�u", "204", 1, 4);
					
					monday[139] = new Data("�y", "102", 1, 2);
					
					monday[140] = new Data("��", "211", 1, 2);
					monday[141] = new Data("��", "211", 1, 3);
					monday[142] = new Data("��", "211", 1, 4);
					
					monday[143] = new Data("�u", "509", 1, 2);
					monday[144] = new Data("�u", "509", 1, 3);
					monday[145] = new Data("�u", "509", 1, 4);
					
					monday[146] = new Data("��", "519", 1, 2);
					
					monday[147] = new Data("��", "705", 1, 2);
					monday[148] = new Data("��", "705", 1, 3);
					monday[149] = new Data("��", "705", 1, 4);
					
					monday[150] = new Data("���", "204", 1, 2);
					
					monday[151] = new Data("���", "206", 1, 2);
					
					monday[152] = new Data("���", "505", 1, 2);
					monday[153] = new Data("���", "505", 1, 3);
					monday[154] = new Data("���", "505", 1, 4);
					
					monday[155] = new Data("�u", "506", 1, 2);
					monday[156] = new Data("�u", "506", 1, 3);
					monday[157] = new Data("�u", "506", 1, 4);
					
					monday[158] = new Data("��", "207", 1, 2);
					monday[159] = new Data("��", "207", 1, 3);
					monday[160] = new Data("��", "207", 1, 4);
					
					monday[161] = new Data("��", "202", 1, 2);
					monday[162] = new Data("��", "202", 1, 3);
					monday[163] = new Data("��", "202", 1, 4);
					
					monday[164] = new Data("��", "302", 1, 2);
					monday[165] = new Data("��", "302", 1, 3);
					monday[166] = new Data("��", "302", 1, 4);
					
					monday[167] = new Data("��", "401", 1, 2);
					monday[168] = new Data("��", "401", 1, 3);
					monday[169] = new Data("��", "401", 1, 4);
					
					monday[170] = new Data("���", "202", 1, 2);
					monday[171] = new Data("���", "202", 1, 3);
					monday[172] = new Data("���", "202", 1, 4);
					
					monday[173] = new Data("��", "201", 1, 2);
					monday[174] = new Data("��", "201", 1, 3);
					monday[175] = new Data("��", "201", 1, 4);
					
					monday[176] = new Data("��", "405", 1, 2);
					monday[177] = new Data("��", "405", 1, 3);
					monday[178] = new Data("��", "405", 1, 4);
					
					monday[179] = new Data("��", "306", 1, 2);
					monday[180] = new Data("��", "306", 1, 3);
					monday[181] = new Data("��", "306", 1, 4);
					
					monday[182] = new Data("��", "304", 1, 2);
					monday[183] = new Data("��", "304", 1, 3);
					monday[184] = new Data("��", "304", 1, 4);
					
					monday[185] = new Data("��", "303", 1, 2);
					monday[186] = new Data("��", "303", 1, 3);
					monday[187] = new Data("��", "303", 1, 4);
					
					monday[188] = new Data("��", "402", 1, 2);
					monday[189] = new Data("��", "402", 1, 3);
					monday[190] = new Data("��", "402", 1, 4);
					
					monday[191] = new Data("��", "808A", 1, 2);
					monday[192] = new Data("��", "808A", 1, 3);
					monday[193] = new Data("��", "808A", 1, 4);
					
					monday[194] = new Data("�H", "705", 1, 2);
					monday[195] = new Data("�H", "705", 1, 3);
					monday[196] = new Data("�H", "705", 1, 4);
					
					monday[197] = new Data("���", "203", 1, 2);
					monday[198] = new Data("���", "203", 1, 3);
					monday[199] = new Data("���", "203", 1, 4);
					
					monday[200] = new Data("��", "406", 1, 2);
					monday[201] = new Data("��", "406", 1, 3);
					monday[202] = new Data("��", "406", 1, 4);
					
					monday[203] = new Data("��", "308", 1, 2);
					monday[204] = new Data("��", "308", 1, 3);
					monday[205] = new Data("��", "308", 1, 4);
					
					monday[206] = new Data("��", "208", 1, 2);
					monday[207] = new Data("��", "208", 1, 3);
					monday[208] = new Data("��", "208", 1, 4);
					
					monday[209] = new Data("��", "107", 1, 2);
					monday[210] = new Data("��", "107", 1, 3);
					monday[211] = new Data("��", "107", 1, 4);
					
					monday[212] = new Data("��", "204", 1, 2);
					monday[213] = new Data("��", "204", 1, 3);
					monday[214] = new Data("��", "204", 1, 4);
					
					monday[215] = new Data("��", "205", 1, 2);
					monday[216] = new Data("��", "205", 1, 3);
					monday[217] = new Data("��", "205", 1, 4);
					
					monday[218] = new Data("��", "203", 1, 2);
					monday[219] = new Data("��", "203", 1, 3);
					monday[220] = new Data("��", "203", 1, 4);
					
					monday[221] = new Data("��", "206", 1, 2);
					monday[222] = new Data("��", "206", 1, 3);
					monday[223] = new Data("��", "206", 1, 4);
					
					monday[224] = new Data("��", "403", 1, 2);
					monday[225] = new Data("��", "403", 1, 3);
					monday[226] = new Data("��", "403", 1, 4);
					
					monday[227] = new Data("�y", "307", 1, 2);
					
					monday[228] = new Data("�z", "402", 1, 2);
					
					monday[229] = new Data("�z", "303", 1, 2);
					monday[230] = new Data("�z", "303", 1, 3);
					monday[231] = new Data("�z", "303", 1, 4);
					
					monday[232] = new Data("��", "103", 1, 2);
					monday[233] = new Data("��", "103", 1, 3);
					monday[234] = new Data("��", "103", 1, 4);
					
					monday[235] = new Data("�u", "302", 1, 2);
					
					monday[236] = new Data("�z", "409", 1, 2);
					monday[237] = new Data("�z", "409", 1, 3);
					monday[238] = new Data("�z", "409", 1, 4);
					
					monday[239] = new Data("��", "515", 1, 2);
					monday[240] = new Data("��", "515", 1, 3);
					monday[241] = new Data("��", "515", 1, 4);
					
					monday[242] = new Data("�y", "301", 1, 2);
					
					monday[243] = new Data("�y", "306", 1, 2);
					monday[244] = new Data("�y", "306", 1, 3);
					monday[245] = new Data("�y", "306", 1, 4);
					
					monday[246] = new Data("�z", "211", 1, 2);
					monday[247] = new Data("�z", "211", 1, 3);
					monday[248] = new Data("�z", "211", 1, 4);
					
					monday[249] = new Data("�H", "503", 1, 2);
					monday[250] = new Data("�H", "503", 1, 3);
					monday[251] = new Data("�H", "503", 1, 4);
					
					monday[252] = new Data("�H", "406", 1, 2);
					monday[253] = new Data("�H", "406", 1, 3);
					monday[254] = new Data("�H", "406", 1, 4);
					
					monday[255] = new Data("�H", "505", 1, 2);
					monday[256] = new Data("�H", "505", 1, 3);
					monday[257] = new Data("�H", "505", 1, 4);
					
					monday[258] = new Data("�H", "910", 1, 2);
					monday[259] = new Data("�H", "910", 1, 3);
					monday[260] = new Data("�H", "910", 1, 4);
					
					monday[261] = new Data("��q", "311", 1, 2);
					monday[262] = new Data("��q", "311", 1, 3);
					monday[263] = new Data("��q", "311", 1, 4);
					
					monday[264] = new Data("��", "B03", 1, 2);
					
					monday[265] = new Data("��q", "306", 1, 2);
					
					monday[266] = new Data("��q", "501A", 1, 2);
					monday[267] = new Data("��q", "501A", 1, 3);
					monday[268] = new Data("��q", "501A", 1, 4);
					
					monday[269] = new Data("�q�q", "306", 1, 2);
					monday[270] = new Data("�q�q", "306", 1, 3);
					monday[271] = new Data("�q�q", "306", 1, 4);
					
					monday[272] = new Data("�q�q", "303", 1, 2);
					monday[273] = new Data("�q�q", "303", 1, 3);
					monday[274] = new Data("�q�q", "303", 1, 4);
					
					monday[275] = new Data("��q", "108", 1, 2);
					monday[276] = new Data("��q", "108", 1, 3);
					monday[277] = new Data("��q", "108", 1, 4);
					
					monday[278] = new Data("��q", "312", 1, 2);
					monday[279] = new Data("��q", "312", 1, 3);
					monday[280] = new Data("��q", "312", 1, 8);
					
					monday[281] = new Data("�y", "303", 1, 2);
					
					monday[282] = new Data("�y", "204", 1, 2);
					
					monday[283] = new Data("��q", "402", 1, 2);
					
					monday[284] = new Data("��q", "330", 1, 2);
					monday[285] = new Data("��q", "330", 1, 3);
					monday[286] = new Data("��q", "330", 1, 4);
					
					monday[287] = new Data("��", "207", 1, 2);
					monday[288] = new Data("��", "207", 1, 3);
					monday[289] = new Data("��", "207", 1, 4);
					
					monday[290] = new Data("�q�q", "503", 1, 2);
					monday[291] = new Data("�q�q", "503", 1, 3);
					monday[292] = new Data("�q�q", "503", 1, 4);
					
					monday[293] = new Data("��q", "503", 1, 2);
					monday[294] = new Data("��q", "503", 1, 3);
					monday[295] = new Data("��q", "503", 1, 4);
					
					monday[296] = new Data("�g", "402A", 1, 2);
					monday[297] = new Data("�g", "402A", 1, 3);
					monday[298] = new Data("�g", "402A", 1, 4);
					
					monday[299] = new Data("�y", "101", 1, 2);
					monday[300] = new Data("�y", "101", 1, 3);
					monday[301] = new Data("�y", "101", 1, 4);
					
					monday[302] = new Data("�g", "514", 1, 2);
					monday[303] = new Data("�g", "514", 1, 3);
					monday[304] = new Data("�g", "514", 1, 4);
					
					monday[305] = new Data("��", "409", 1, 2);
					monday[306] = new Data("��", "409", 1, 3);
					monday[307] = new Data("��", "409", 1, 4);
					
					monday[308] = new Data("��", "209A", 1, 2);
					monday[309] = new Data("��", "209A", 1, 3);
					monday[310] = new Data("��", "209A", 1, 4);
					
					monday[311] = new Data("��", "308", 1, 2);
					monday[312] = new Data("��", "308", 1, 3);
					monday[313] = new Data("��", "308", 1, 4);
					
					monday[314] = new Data("��", "207", 1, 2);
					monday[315] = new Data("��", "207", 1, 3);
					monday[316] = new Data("��", "207", 1, 4);
					
					monday[317] = new Data("��", "105", 1, 2);
					monday[318] = new Data("��", "105", 1, 3);
					monday[319] = new Data("��", "105", 1, 4);
					
					monday[320] = new Data("��", "306", 1, 2);
					
					monday[321] = new Data("��", "104", 1, 2);
					
					monday[322] = new Data("��", "405A", 1, 2);
					monday[323] = new Data("��", "405A", 1, 3);
					monday[324] = new Data("��", "405A", 1, 4);
					
					monday[325] = new Data("��", "406B", 1, 2);
					
					monday[326] = new Data("��", "311", 1, 2);
					monday[327] = new Data("��", "311", 1, 3);
					monday[328] = new Data("��", "311", 1, 4);
					
					monday[329] = new Data("��", "305", 1, 2);
					monday[330] = new Data("��", "305", 1, 3);
					monday[331] = new Data("��", "305", 1, 4);
					
					monday[332] = new Data("��", "305", 1, 2);
					monday[333] = new Data("��", "305", 1, 3);
					monday[334] = new Data("��", "305", 1, 4);
					
					monday[335] = new Data("��", "408", 1, 2);
					monday[336] = new Data("��", "408", 1, 3);
					monday[337] = new Data("��", "408", 1, 4);
					
					monday[338] = new Data("�y", "404", 1, 2);
					monday[339] = new Data("�y", "404", 1, 3);
					monday[340] = new Data("�y", "404", 1, 4);
					
					monday[341] = new Data("��", "512", 1, 2);
					monday[342] = new Data("��", "512", 1, 3);
					monday[343] = new Data("��", "512", 1, 4);
					
					monday[344] = new Data("�y", "405", 1, 2);
					monday[345] = new Data("�y", "405", 1, 3);
					monday[346] = new Data("�y", "405", 1, 4);
					
					monday[347] = new Data("��", "209B", 1, 2);
					monday[348] = new Data("��", "209B", 1, 3);
					monday[349] = new Data("��", "209B", 1, 4);
					
					monday[350] = new Data("��", "1007", 1, 2);
					monday[351] = new Data("��", "1007", 1, 3);
					monday[352] = new Data("��", "1007", 1, 11);
					
					monday[353] = new Data("��", "613", 1, 2);
					monday[354] = new Data("��", "613", 1, 3);
					monday[355] = new Data("��", "613", 1, 4);
					
					monday[356] = new Data("��", "404", 1, 2);
					monday[357] = new Data("��", "404", 1, 3);
					monday[358] = new Data("��", "404", 1, 4);
					
					monday[359] = new Data("���", "201", 1, 2);
					monday[360] = new Data("���", "201", 1, 3);
					monday[361] = new Data("���", "201", 1, 4);
					
					monday[362] = new Data("��", "804", 1, 6);
					monday[363] = new Data("��", "804", 1, 7);
					monday[364] = new Data("��", "804", 1, 8);
					monday[365] = new Data("��", "804", 1, 9);
					
					//�ĤT�`QAQ
					monday[366] = new Data("��", "110", 1, 3);
					monday[367] = new Data("��", "110", 1, 4);
					
					monday[368] = new Data("�y", "204", 1, 3);
					monday[369] = new Data("�y", "204", 1, 4);
					
					monday[370] = new Data("�u", "302", 1, 3);
					monday[371] = new Data("�u", "302", 1, 4);
					
					monday[372] = new Data("�u", "303", 1, 3);
					monday[373] = new Data("�u", "303", 1, 4);
					
					monday[374] = new Data("�u", "416", 1, 3);
					monday[375] = new Data("�u", "416", 1, 4);
					
					monday[376] = new Data("�y", "201", 1, 3);
					monday[377] = new Data("�y", "201", 1, 4);
					
					monday[378] = new Data("�u", "410", 1, 3);
					monday[379] = new Data("�u", "410", 1, 4);
					
					monday[380] = new Data("�u", "410", 1, 3);
					monday[381] = new Data("�u", "410", 1, 4);
					
					monday[382] = new Data("��", "501", 1, 3);
					monday[383] = new Data("��", "501", 1, 4);
					
					monday[384] = new Data("�y", "205", 1, 3);
					monday[385] = new Data("�y", "205", 1, 4);
					
					monday[386] = new Data("�y", "402", 1, 3);
					monday[387] = new Data("�y", "402", 1, 4);
					
					monday[388] = new Data("�y", "302", 1, 3);
					monday[389] = new Data("�y", "302", 1, 4);
					
					monday[390] = new Data("�y", "304", 1, 3);
					monday[391] = new Data("�y", "304", 1, 4);
					
					monday[392] = new Data("��", "104", 1, 3);
					monday[393] = new Data("��", "104", 1, 4);
					
					monday[394] = new Data("��", "519", 1, 3);
					monday[395] = new Data("��", "519", 1, 4);
					
					monday[396] = new Data("��", "319", 1, 3);
					monday[397] = new Data("��", "319", 1, 4);
					
					monday[398] = new Data("���", "204", 1, 3);
					monday[399] = new Data("���", "204", 1, 4);
					
					monday[400] = new Data("���", "202", 1, 3);
					monday[401] = new Data("���", "202", 1, 4);
					
					monday[402] = new Data("���", "205", 1, 3);
					monday[403] = new Data("���", "205", 1, 4);
					
					monday[404] = new Data("���", "504", 1, 3);
					monday[405] = new Data("���", "504", 1, 4);
					
					monday[406] = new Data("�y", "203", 1, 3);
					monday[407] = new Data("�y", "203", 1, 4);
					
					monday[408] = new Data("��", "203", 1, 3);
					monday[409] = new Data("��", "203", 1, 4);
					
					monday[410] = new Data("�y", "104", 1, 3);
					monday[411] = new Data("�y", "104", 1, 4);
					
					monday[412] = new Data("��", "104", 1, 3);
					monday[413] = new Data("��", "104", 1, 4);
					
					monday[414] = new Data("��", "309", 1, 3);
					monday[415] = new Data("��", "309", 1, 4);
					
					monday[416] = new Data("�y", "303", 1, 3);
					monday[417] = new Data("�y", "303", 1, 4);
					
					monday[418] = new Data("�H", "B119A", 1, 1);
					monday[419] = new Data("�H", "B119A", 1, 2);
					monday[420] = new Data("�H", "B119A", 1, 3);
					
					monday[421] = new Data("�z", "401", 1, 3);
					
					monday[422] = new Data("�y", "301", 1, 3);
					monday[423] = new Data("�y", "301", 1, 4);
					
					monday[424] = new Data("�z", "313", 1, 3);
					monday[425] = new Data("�z", "313", 1, 4);
					
					monday[426] = new Data("��", "B01", 1, 3);
					monday[427] = new Data("��", "B01", 1, 4);
					
					monday[428] = new Data("�z", "404", 1, 3);
					monday[429] = new Data("�z", "404", 1, 4);
					
					monday[430] = new Data("��", "101", 1, 3);
					monday[431] = new Data("��", "101", 1, 4);
					
					monday[432] = new Data("��", "415", 1, 3);
					monday[433] = new Data("��", "415", 1, 4);
					
					monday[434] = new Data("��", "102", 1, 3);
					monday[435] = new Data("��", "102", 1, 4);
					
					monday[436] = new Data("�y", "305", 1, 3);
					monday[437] = new Data("�y", "305", 1, 4);
					
					monday[438] = new Data("�H", "603", 1, 3);
					monday[439] = new Data("�H", "603", 1, 4);
					
					monday[440] = new Data("�H", "605", 1, 3);
					monday[441] = new Data("�H", "605", 1, 4);
					
					monday[442] = new Data("�H", "502", 1, 3);
					monday[443] = new Data("�H", "502", 1, 4);
					
					monday[444] = new Data("�H", "608", 1, 3);
					monday[445] = new Data("�H", "608", 1, 4);
					
					monday[446] = new Data("�H", "408", 1, 3);
					monday[447] = new Data("�H", "408", 1, 4);
					
					monday[448] = new Data("�H", "404", 1, 3);
					monday[449] = new Data("�H", "404", 1, 4);
					
					monday[450] = new Data("�H", "702", 1, 3);
					monday[451] = new Data("�H", "702", 1, 4);
					
					monday[452] = new Data("�H", "B118A", 1, 3);
					monday[453] = new Data("�H", "B118A", 1, 4);
					
					monday[454] = new Data("�H", "701", 1, 3);
					monday[455] = new Data("�H", "701", 1, 4);
					
					monday[456] = new Data("�y", "307", 1, 3);
					monday[457] = new Data("�y", "307", 1, 4);
					
					monday[458] = new Data("��q", "403", 1, 3);
					monday[459] = new Data("��q", "403", 1, 4);
					
					monday[460] = new Data("��", "B03", 1, 3);
					monday[461] = new Data("��", "B03", 1, 4);
					
					monday[462] = new Data("�y", "407", 1, 3);
					
					monday[463] = new Data("��q", "B04", 1, 3);
					monday[464] = new Data("��q", "B04", 1, 4);
					
					monday[465] = new Data("��q", "107", 1, 3);
					monday[466] = new Data("��q", "107", 1, 4);
					
					monday[467] = new Data("��", "305", 1, 3);
					monday[468] = new Data("��", "305", 1, 4);
					
					monday[469] = new Data("��", "304", 1, 3);
					monday[470] = new Data("��", "304", 1, 4);
					
					monday[471] = new Data("��q", "504", 1, 3);
					monday[472] = new Data("��q", "504", 1, 4);
					
					monday[473] = new Data("��q", "103", 1, 3);
					monday[474] = new Data("��q", "103", 1, 4);
					
					monday[475] = new Data("��q", "306", 1, 3);
					monday[476] = new Data("��q", "306", 1, 4);
					
					monday[477] = new Data("��q", "402", 1, 3);
					monday[478] = new Data("��q", "402", 1, 4);
					
					monday[479] = new Data("�y", "206", 1, 3);
					monday[480] = new Data("�y", "206", 1, 4);
					
					monday[481] = new Data("��q", "511", 1, 3);
					
					monday[482] = new Data("�y", "103", 1, 3);
					monday[483] = new Data("�y", "103", 1, 4);
					
					monday[484] = new Data("��", "205", 1, 3);
					
					monday[485] = new Data("��", "206", 1, 3);
					
					monday[486] = new Data("��q", "104", 1, 3);
					monday[487] = new Data("��q", "104", 1, 4);
					
					monday[488] = new Data("��q", "404", 1, 3);
					monday[489] = new Data("��q", "404", 1, 4);
					
					monday[490] = new Data("��q", "B03", 1, 3);
					
					monday[491] = new Data("�g", "B03", 1, 3);
					monday[492] = new Data("�g", "B03", 1, 4);
					
					monday[493] = new Data("�g", "403", 1, 3);
					monday[494] = new Data("�g", "403", 1, 4);
					
					monday[495] = new Data("�g", "B10", 1, 3);
					monday[496] = new Data("�g", "B10", 1, 4);
					//�g302 �q����߫� ��207 �q����߫�
					
					monday[497] = new Data("�g", "509", 1, 3);
					monday[498] = new Data("�g", "509", 1, 4);
					
					monday[499] = new Data("�y", "102", 1, 3);
					monday[500] = new Data("�y", "102", 1, 4);
					
					monday[501] = new Data("�g", "514", 1, 3);
					monday[502] = new Data("�g", "514", 1, 4);
					
					monday[503] = new Data("��", "412", 1, 3);
					//��405 ���p�s�ϫ�
					
					monday[504] = new Data("��", "301", 1, 3);
					monday[505] = new Data("��", "301", 1, 4);
					
					monday[506] = new Data("��", "306", 1, 3);
					monday[507] = new Data("��", "306", 1, 4);
					
					monday[508] = new Data("��", "104", 1, 3);
					monday[509] = new Data("��", "104", 1, 4);
					
					monday[510] = new Data("��", "111", 1, 3);
					monday[511] = new Data("��", "111", 1, 4);
					
					monday[512] = new Data("��", "103", 1, 3);
					monday[513] = new Data("��", "103", 1, 4);
					
					monday[514] = new Data("�y", "406", 1, 3);
					monday[515] = new Data("�y", "406", 1, 4);
					
					monday[516] = new Data("�H", "203", 1, 3);
					monday[517] = new Data("�H", "203", 1, 4);
					
					monday[518] = new Data("�H", "204", 1, 3);
					monday[519] = new Data("�H", "204", 1, 4);
					
					monday[520] = new Data("�H", "B117A", 1, 3);
					monday[521] = new Data("�H", "B117A", 1, 4);
					
					monday[522] = new Data("�H", "B116A", 1, 3);
					monday[523] = new Data("�H", "B116A", 1, 4);
					
					monday[524] = new Data("��", "204", 1, 3);
					monday[525] = new Data("��", "204", 1, 4);
					
					monday[526] = new Data("�g", "B10", 1, 3);
					monday[527] = new Data("�g", "B10", 1, 4);
					//��516 �ػs�ϫ� 
					
					monday[528] = new Data("��", "307", 1, 3);
					monday[529] = new Data("��", "307", 1, 4);
					
					monday[530] = new Data("��q", "102", 1, 3);
					monday[531] = new Data("��q", "102", 1, 4);
					
					monday[532] = new Data("���", "206", 1, 3);
					monday[533] = new Data("���", "206", 1, 4);
					
					monday[534] = new Data("��q", "B07", 1, 3);
					monday[535] = new Data("��q", "B07", 1, 4);
					
					monday[536] = new Data("�H", "703", 1, 3);
					monday[537] = new Data("�H", "703", 1, 4);
					
					monday[538] = new Data("�H", "405", 1, 3);
					monday[539] = new Data("�H", "405", 1, 4);
					
					monday[540] = new Data("��", "105", 1, 3);
					monday[541] = new Data("��", "105", 1, 4);
					
					monday[542] = new Data("�H", "607", 1, 3);
					monday[543] = new Data("�H", "607", 1, 4);
					
					monday[544] = new Data("�H", "601", 1, 3);
					monday[545] = new Data("�H", "601", 1, 4);
					
					monday[546] = new Data("�H", "407", 1, 3);
					monday[547] = new Data("�H", "407", 1, 4);
					
					monday[548] = new Data("�H", "401", 1, 3);
					monday[549] = new Data("�H", "401", 1, 4);
					
					monday[550] = new Data("�H", "507", 1, 3);
					monday[551] = new Data("�H", "507", 1, 4);
					
					monday[552] = new Data("�H", "501", 1, 3);
					monday[553] = new Data("�H", "501", 1, 4);
					
					monday[554] = new Data("�H", "402", 1, 3);
					monday[555] = new Data("�H", "402", 1, 4);
					
					monday[556] = new Data("�q�q", "B03", 1, 3);
					monday[557] = new Data("�q�q", "B03", 1, 4);
					
					monday[558] = new Data("�H", "504", 1, 3);
					monday[559] = new Data("�H", "504", 1, 4);
					
					monday[560] = new Data("��q", "B02", 1, 3);
					monday[561] = new Data("��q", "B02", 1, 4);
					
					monday[562] = new Data("��", "301", 1, 3);
					monday[563] = new Data("��", "301", 1, 4);
					
					monday[564] = new Data("��q", "B08", 1, 3);
					monday[565] = new Data("��q", "B08", 1, 4);
					
					monday[566] = new Data("�H", "706", 1, 3);
					monday[567] = new Data("�H", "706", 1, 4);
					
					monday[568] = new Data("��q", "411", 1, 3);
					monday[569] = new Data("��q", "411", 1, 4);
					
					monday[570] = new Data("��", "302", 1, 3);
					monday[571] = new Data("��", "302", 1, 4);
					
					monday[572] = new Data("��q", "512", 1, 3);
					monday[573] = new Data("��q", "512", 1, 4);
					
					monday[574] = new Data("��q", "515", 1, 3);
					monday[575] = new Data("��q", "515", 1, 4);
					
					monday[576] = new Data("��q", "410", 1, 3);
					monday[577] = new Data("��q", "410", 1, 4);
					
					monday[578] = new Data("��", "201", 1, 3);
					monday[579] = new Data("��", "201", 1, 4);
					
					monday[580] = new Data("��", "202", 1, 3);
					monday[581] = new Data("��", "202", 1, 4);
					
					monday[582] = new Data("��", "303", 1, 3);
					monday[583] = new Data("��", "303", 1, 4);
					
					monday[584] = new Data("�H", "506", 1, 3);
					monday[585] = new Data("�H", "506", 1, 4);
					
					monday[586] = new Data("�H", "604", 1, 3);
					monday[587] = new Data("�H", "604", 1, 4);
					
					monday[588] = new Data("�H", "606", 1, 3);
					monday[589] = new Data("�H", "606", 1, 4);
					
					monday[590] = new Data("��", "309", 1, 3);
					monday[591] = new Data("��", "309", 1, 4);
					
					monday[592] = new Data("�H", "704", 1, 3);
					monday[593] = new Data("�H", "704", 1, 4);
					
					monday[594] = new Data("�H", "403", 1, 3);
					monday[595] = new Data("�H", "403", 1, 4);
					
					monday[596] = new Data("�g", "B10", 1, 3);
					monday[597] = new Data("�g", "B10", 1, 4);
					//�k�J ��qB22(��ť��) ��219(�E��) ��q222(�T��)
					//�ĥ|�`
					
					monday[598] = new Data("�y", "105", 1, 4);
					//�u319(�q����߫�) ���101(���z�����) �z203(�q���Ы�)
					monday[599] = new Data("�z", "401", 1, 4);
					//�u202(�ƾǹ����)
					monday[600] = new Data("��q", "511", 1, 4);
					
					monday[601] = new Data("��q", "B03", 1, 4);
					
					monday[602] = new Data("��q", "B06", 1, 4);
					
					monday[603] = new Data("��", "205", 1, 4);
					
					monday[604] = new Data("��", "412", 1, 4);
					//��405(���p�s�ϫ�) ��516(�ػs�ϫ�)
					//�Ĥ��`(12:00)
					
					monday[605] = new Data("�u", "302", 1, 5);
					
					monday[606] = new Data("�u", "416", 1, 5);
					
					monday[607] = new Data("�y", "101", 1, 5);
					
					monday[608] = new Data("�y", "103", 1, 5);
					
					monday[609] = new Data("�y", "307", 1, 5);
					
					monday[610] = new Data("�y", "206", 1, 5);
					
					monday[611] = new Data("�u", "303", 1, 5);
					
					monday[612] = new Data("�u", "305", 1, 5);
					
					monday[613] = new Data("���", "202", 1, 5);
					
					monday[614] = new Data("��", "104", 1, 5);
					
					monday[615] = new Data("��", "106", 1, 5);
					
					monday[616] = new Data("��", "204", 1, 5);
					
					monday[617] = new Data("�y", "304", 1, 5);
					
					monday[618] = new Data("�z", "404", 1, 5);
					
					monday[619] = new Data("��", "409", 1, 5);
					
					monday[620] = new Data("��", "102", 1, 5);
					
					monday[621] = new Data("��q", "102", 1, 5);
					
					monday[622] = new Data("��q", "103", 1, 5);
					
					monday[623] = new Data("��q", "104", 1, 5);
					
					monday[624] = new Data("��q", "306", 1, 5);
					//��207(�q����߫�)
					//�Ĥ��`
					
					monday[625] = new Data("�H", "704", 1, 6);
					monday[626] = new Data("�H", "704", 1, 7);
					monday[627] = new Data("�H", "704", 1, 8);
					monday[628] = new Data("�H", "704", 1, 9);
					
					monday[629] = new Data("�y", "201", 1, 6);
					monday[630] = new Data("�y", "201", 1, 7);
					
					monday[631] = new Data("�y", "302", 1, 6);
					monday[632] = new Data("�y", "302", 1, 7);
					
					monday[633] = new Data("�u", "302", 1, 6);
					monday[634] = new Data("�u", "302", 1, 7);
					monday[635] = new Data("�u", "302", 1, 8);
					
					monday[636] = new Data("�u", "410", 1, 6);
					monday[637] = new Data("�u", "410", 1, 7);
					
					monday[638] = new Data("�u", "416", 1, 6);
					monday[639] = new Data("�u", "416", 1, 7);
					
					monday[640] = new Data("�y", "207", 1, 6);
					monday[641] = new Data("�y", "207", 1, 7);
					
					monday[642] = new Data("�u", "305", 1, 6);
					monday[643] = new Data("�u", "305", 1, 7);
					
					monday[644] = new Data("�u", "516", 1, 6);
					monday[645] = new Data("�u", "516", 1, 7);
					monday[646] = new Data("�u", "516", 1, 8);
					
					monday[647] = new Data("�y", "104", 1, 6);
					monday[648] = new Data("�y", "104", 1, 7);
					monday[649] = new Data("�y", "104", 1, 8);
					
					monday[650] = new Data("�u", "209", 1, 6);
					monday[651] = new Data("�u", "209", 1, 7);
					monday[652] = new Data("�u", "209", 1, 8);
					
					monday[653] = new Data("�u", "303", 1, 6);
					monday[654] = new Data("�u", "303", 1, 7);
					monday[655] = new Data("�u", "303", 1, 8);
					//��q125(�q����߫�)
					monday[656] = new Data("��", "307", 1, 6);
					monday[657] = new Data("��", "307", 1, 7);
					
					monday[658] = new Data("�y", "401", 1, 6);
					monday[659] = new Data("�y", "401", 1, 7);
					
					monday[660] = new Data("��", "415", 1, 6);
					monday[661] = new Data("��", "415", 1, 7);
					
					monday[662] = new Data("��", "515", 1, 6);
					monday[663] = new Data("��", "515", 1, 7);
					
					monday[664] = new Data("�z", "407", 1, 6);
					monday[665] = new Data("�z", "407", 1, 7);
					
					monday[666] = new Data("��", "319", 1, 6);
					monday[667] = new Data("��", "319", 1, 7);
					//��204(�@��)
					monday[668] = new Data("���", "B102", 1, 6);
					monday[669] = new Data("���", "B102", 1, 7);
					
					monday[670] = new Data("���", "203", 1, 6);
					monday[671] = new Data("���", "203", 1, 7);
					
					monday[672] = new Data("���", "205", 1, 6);
					monday[673] = new Data("���", "205", 1, 7);
					
					monday[674] = new Data("���", "202", 1, 6);
					monday[675] = new Data("���", "202", 1, 7);
					
					monday[676] = new Data("�u", "209", 1, 6);
					monday[677] = new Data("�u", "209", 1, 7);
					
					monday[678] = new Data("�y", "403", 1, 6);
					monday[679] = new Data("�y", "403", 1, 7);
					
					monday[680] = new Data("��", "202", 1, 6);
					monday[681] = new Data("��", "202", 1, 7);
					monday[682] = new Data("��", "202", 1, 8);
					
					monday[683] = new Data("��", "102", 1, 6);
					monday[684] = new Data("��", "102", 1, 7);
					monday[685] = new Data("��", "102", 1, 8);
					
					monday[686] = new Data("��", "308", 1, 6);
					monday[687] = new Data("��", "308", 1, 7);
					monday[688] = new Data("��", "308", 1, 8);
					
					monday[689] = new Data("���", "204", 1, 6);
					monday[690] = new Data("���", "204", 1, 7);
					
					monday[691] = new Data("��", "303", 1, 6);
					monday[692] = new Data("��", "303", 1, 7);
					
					monday[693] = new Data("��", "404", 1, 6);
					monday[694] = new Data("��", "404", 1, 7);
					monday[695] = new Data("��", "404", 1, 8);
					
					monday[696] = new Data("��", "202", 1, 6);
					monday[697] = new Data("��", "202", 1, 7);
					monday[698] = new Data("��", "202", 1, 8);
					
					monday[699] = new Data("��", "309", 1, 6);
					monday[700] = new Data("��", "309", 1, 7);
					monday[701] = new Data("��", "309", 1, 8);
					
					monday[702] = new Data("��", "503", 1, 6);
					monday[703] = new Data("��", "503", 1, 7);
					monday[704] = new Data("��", "503", 1, 8);
					
					monday[705] = new Data("��", "304", 1, 6);
					monday[706] = new Data("��", "304", 1, 7);
					monday[707] = new Data("��", "304", 1, 8);
					
					monday[708] = new Data("��", "405", 1, 6);
					monday[709] = new Data("��", "405", 1, 7);
					monday[710] = new Data("��", "405", 1, 8);
					
					monday[711] = new Data("��", "204", 1, 6);
					monday[712] = new Data("��", "204", 1, 7);
					monday[713] = new Data("��", "204", 1, 8);
					
					monday[714] = new Data("��", "406", 1, 6);
					monday[715] = new Data("��", "406", 1, 7);
					monday[716] = new Data("��", "406", 1, 8);
					
					monday[717] = new Data("��", "203", 1, 6);
					monday[718] = new Data("��", "203", 1, 7);
					
					monday[719] = new Data("��", "208", 1, 6);
					monday[720] = new Data("��", "208", 1, 7);
					
					monday[721] = new Data("��", "302", 1, 6);
					monday[722] = new Data("��", "302", 1, 7);
					monday[723] = new Data("��", "302", 1, 8);
					
					monday[724] = new Data("��", "1011", 1, 6);
					monday[725] = new Data("��", "1011", 1, 7);
					monday[726] = new Data("��", "1011", 1, 8);
					
					monday[727] = new Data("��", "1013", 1, 6);
					monday[728] = new Data("��", "1013", 1, 7);
					monday[729] = new Data("��", "1013", 1, 8);
					
					monday[730] = new Data("��", "205", 1, 6);
					
					monday[731] = new Data("��", "306", 1, 6);
					monday[732] = new Data("��", "306", 1, 7);
					
					monday[733] = new Data("���", "206", 1, 6);
					monday[734] = new Data("���", "206", 1, 7);
					monday[735] = new Data("���", "206", 1, 8);
					
					monday[736] = new Data("��", "501", 1, 6);
					monday[737] = new Data("��", "501", 1, 7);
					monday[738] = new Data("��", "501", 1, 8);
					
					monday[739] = new Data("��", "527", 1, 6);
					monday[740] = new Data("��", "527", 1, 7);
					monday[741] = new Data("��", "527", 1, 8);
					
					monday[742] = new Data("�z", "401", 1, 6);
					monday[743] = new Data("�z", "401", 1, 7);
					
					monday[744] = new Data("�z", "B07", 1, 6);
					
					monday[745] = new Data("�z", "303", 1, 6);
					
					monday[746] = new Data("��", "105", 1, 6);
					monday[747] = new Data("��", "105", 1, 7);
					
					monday[748] = new Data("��", "102", 1, 6);
					monday[749] = new Data("��", "102", 1, 7);
					
					monday[750] = new Data("��", "101", 1, 6);
					monday[751] = new Data("��", "101", 1, 7);
					
					monday[752] = new Data("�z", "402", 1, 6);
					monday[753] = new Data("�z", "402", 1, 7);
					monday[754] = new Data("�z", "402", 1, 8);
					
					monday[755] = new Data("�y", "102", 1, 6);
					monday[756] = new Data("�y", "102", 1, 7);
					
					monday[757] = new Data("�z", "313", 1, 6);
					monday[758] = new Data("�z", "313", 1, 7);
					
					monday[759] = new Data("�H", "505", 1, 6);
					monday[760] = new Data("�H", "505", 1, 7);
					
					monday[761] = new Data("�H", "603", 1, 6);
					monday[762] = new Data("�H", "603", 1, 7);
					
					monday[763] = new Data("�H", "503", 1, 6);
					monday[764] = new Data("�H", "503", 1, 7);
					
					monday[765] = new Data("�H", "910", 1, 6);
					monday[766] = new Data("�H", "910", 1, 7);
					
					monday[767] = new Data("��q", "102", 1, 6);
					monday[768] = new Data("��q", "102", 1, 7);
					
					monday[769] = new Data("��q", "104", 1, 6);
					monday[770] = new Data("��q", "104", 1, 7);
					
					monday[771] = new Data("��q", "404", 1, 6);
					monday[772] = new Data("��q", "404", 1, 7);
					
					monday[773] = new Data("��q", "103", 1, 6);
					monday[774] = new Data("��q", "103", 1, 7);
					
					monday[775] = new Data("�y", "204", 1, 6);
					monday[776] = new Data("�y", "204", 1, 7);
					
					monday[777] = new Data("��q", "402", 1, 6);
					monday[778] = new Data("��q", "402", 1, 7);
					
					monday[779] = new Data("��q", "403", 1, 6);
					monday[780] = new Data("��q", "403", 1, 7);
					
					monday[781] = new Data("��q", "311", 1, 6);
					monday[782] = new Data("��q", "311", 1, 7);
					monday[783] = new Data("��q", "311", 1, 8);
					
					monday[784] = new Data("��q", "108", 1, 6);
					monday[785] = new Data("��q", "108", 1, 7);
					
					monday[786] = new Data("��q", "511", 1, 6);
					monday[787] = new Data("��q", "511", 1, 7);
					
					monday[788] = new Data("��q", "B08", 1, 6);
					monday[789] = new Data("��q", "B08", 1, 7);
					
					monday[790] = new Data("�y", "101", 1, 6);
					monday[791] = new Data("�y", "101", 1, 7);
					
					monday[792] = new Data("��q", "410", 1, 6);
					monday[793] = new Data("��q", "410", 1, 7);
					
					monday[794] = new Data("��q", "306", 1, 6);
					monday[795] = new Data("��q", "306", 1, 7);
					
					monday[796] = new Data("��q", "411", 1, 6);
					monday[797] = new Data("��q", "411", 1, 7);
					
					monday[798] = new Data("��q", "512", 1, 6);
					monday[799] = new Data("��q", "512", 1, 7);
					
					monday[800] = new Data("��q", "B07", 1, 6);
					monday[801] = new Data("��q", "B07", 1, 7);
					
					monday[802] = new Data("�H", "401", 1, 6);
					monday[803] = new Data("�H", "401", 1, 7);
					
					monday[804] = new Data("��q", "107", 1, 6);
					monday[805] = new Data("��q", "107", 1, 7);
					
					monday[806] = new Data("��q", "515", 1, 6);
					monday[807] = new Data("��q", "515", 1, 7);
					
					monday[808] = new Data("��q", "B06", 1, 6);
					monday[809] = new Data("��q", "B06", 1, 7);
					
					monday[810] = new Data("��q", "B04", 1, 6);
					monday[811] = new Data("��q", "B04", 1, 7);
					
					monday[812] = new Data("�H", "705", 1, 6);
					monday[813] = new Data("�H", "705", 1, 7);
					
					monday[814] = new Data("��q", "504", 1, 6);
					monday[815] = new Data("��q", "504", 1, 7);
					
					monday[816] = new Data("��q", "B03", 1, 6);
					monday[817] = new Data("��q", "B03", 1, 7);
					
					monday[818] = new Data("�y", "303", 1, 6);
					monday[819] = new Data("�y", "303", 1, 7);
					
					monday[820] = new Data("�H", "504", 1, 6);
					monday[821] = new Data("�H", "504", 1, 7);
					
					monday[822] = new Data("��q", "311", 1, 6);
					monday[823] = new Data("��q", "311", 1, 7);
					monday[824] = new Data("��q", "311", 1, 8);
					
					monday[825] = new Data("��", "104", 1, 6);
					monday[826] = new Data("��", "104", 1, 7);
					
					monday[827] = new Data("�g", "302", 1, 6);
					monday[828] = new Data("�g", "302", 1, 7);
					
					monday[829] = new Data("�g", "B03", 1, 6);
					monday[830] = new Data("�g", "B03", 1, 7);
					
					monday[831] = new Data("�g", "515", 1, 6);
					
					monday[832] = new Data("�g", "B10", 1, 6);
					monday[833] = new Data("�g", "B10", 1, 7);
					
					monday[834] = new Data("�z", "413", 1, 6);
					monday[835] = new Data("�z", "413", 1, 7);
					
					monday[836] = new Data("�g", "509", 1, 6);
					
					monday[837] = new Data("�g", "402A", 1, 6);
					monday[838] = new Data("�g", "402A", 1, 7);
					
					monday[839] = new Data("��", "409", 1, 6);
					monday[840] = new Data("��", "409", 1, 7);
					monday[841] = new Data("��", "409", 1, 8);
					
					monday[842] = new Data("�y", "305", 1, 6);
					monday[843] = new Data("�y", "305", 1, 7);
					
					monday[844] = new Data("��", "209A", 1, 6);
					monday[845] = new Data("��", "209A", 1, 7);
					
					monday[846] = new Data("��", "209B", 1, 6);
					monday[847] = new Data("��", "209B", 1, 7);
					monday[848] = new Data("��", "209B", 1, 8);
					
					monday[849] = new Data("��", "206", 1, 6);
					monday[850] = new Data("��", "206", 1, 7);
					monday[851] = new Data("��", "206", 1, 8);
					
					monday[852] = new Data("��", "103", 1, 6);
					monday[853] = new Data("��", "103", 1, 7);
					monday[854] = new Data("��", "103", 1, 8);
					
					monday[855] = new Data("��", "205", 1, 6);
					monday[856] = new Data("��", "205", 1, 7);
					
					monday[857] = new Data("��", "306", 1, 6);
					monday[858] = new Data("��", "306", 1, 7);
					monday[859] = new Data("��", "306", 1, 8);
					
					monday[860] = new Data("�y", "301", 1, 6);
					monday[861] = new Data("�y", "301", 1, 7);
					monday[862] = new Data("�y", "301", 1, 8);
					
					monday[863] = new Data("��", "311", 1, 6);
					monday[864] = new Data("��", "311", 1, 7);
					
					monday[865] = new Data("�H", "501", 1, 6);
					monday[866] = new Data("�H", "501", 1, 7);
					
					monday[867] = new Data("�y", "304", 1, 6);
					monday[868] = new Data("�y", "304", 1, 7);
					
					monday[869] = new Data("��", "402", 1, 6);
					monday[870] = new Data("��", "402", 1, 7);
					monday[871] = new Data("��", "402", 1, 8);
					
					monday[872] = new Data("�H", "B119A", 1, 6);
					monday[873] = new Data("�H", "B119A", 1, 7);
					monday[874] = new Data("�H", "B119A", 1, 8);
					
					monday[875] = new Data("�H", "204", 1, 6);
					monday[876] = new Data("�H", "204", 1, 7);
					monday[877] = new Data("�H", "204", 1, 8);
					
					monday[878] = new Data("��", "105", 1, 6);
					monday[879] = new Data("��", "105", 1, 7);
					monday[880] = new Data("��", "105", 1, 8);
					
					monday[881] = new Data("��", "110", 1, 6);
					
					monday[882] = new Data("��", "204", 1, 6);
					monday[883] = new Data("��", "204", 1, 7);
					
					monday[884] = new Data("��", "208", 1, 6);
					monday[885] = new Data("��", "208", 1, 7);
					
					monday[886] = new Data("��", "B06", 1, 6);
					monday[887] = new Data("��", "B06", 1, 7);
					monday[888] = new Data("��", "B06", 1, 8);
					
					monday[889] = new Data("��", "206", 1, 6);
					monday[890] = new Data("��", "206", 1, 7);
					
					monday[891] = new Data("��", "303", 1, 6);
					monday[892] = new Data("��", "303", 1, 7);
					
					monday[893] = new Data("��q", "B02", 1, 6);
					monday[894] = new Data("��q", "B02", 1, 7);
					monday[895] = new Data("��q", "B02", 1, 8);
					
					monday[896] = new Data("�H", "706", 1, 6);
					monday[897] = new Data("�H", "706", 1, 7);
					
					monday[898] = new Data("�H", "406", 1, 6);
					monday[899] = new Data("�H", "406", 1, 7);
					
					monday[900] = new Data("�H", "507", 1, 6);
					monday[901] = new Data("�H", "507", 1, 7);
					
					monday[902] = new Data("�H", "703", 1, 6);
					monday[903] = new Data("�H", "703", 1, 7);
					
					monday[904] = new Data("�H", "601", 1, 6);
					monday[905] = new Data("�H", "601", 1, 7);
					
					monday[906] = new Data("�H", "B116A", 1, 6);
					monday[907] = new Data("�H", "B116A", 1, 7);
					
					monday[908] = new Data("�y", "105", 1, 6);
					monday[909] = new Data("�y", "105", 1, 7);
					
					monday[910] = new Data("�H", "707", 1, 6);
					monday[911] = new Data("�H", "707", 1, 7);
					
					monday[912] = new Data("�H", "605", 1, 6);
					monday[913] = new Data("�H", "605", 1, 7);
					
					monday[914] = new Data("�H", "403", 1, 6);
					monday[915] = new Data("�H", "403", 1, 7);
					
					monday[916] = new Data("�H", "604", 1, 6);
					monday[917] = new Data("�H", "604", 1, 7);
					
					monday[918] = new Data("�H", "405", 1, 6);
					monday[919] = new Data("�H", "405", 1, 7);
					
					monday[920] = new Data("�q�q", "B03", 1, 6);
					monday[921] = new Data("�q�q", "B03", 1, 7);
					
					monday[922] = new Data("��", "501", 1, 6);
					monday[923] = new Data("��", "501", 1, 7);
					
					monday[924] = new Data("�H", "404", 1, 6);
					monday[925] = new Data("�H", "404", 1, 7);
					
					monday[926] = new Data("��", "203", 1, 6);
					monday[927] = new Data("��", "203", 1, 7);
					
					monday[928] = new Data("�H", "506", 1, 6);
					monday[929] = new Data("�H", "506", 1, 7);
					
					//�ĤC�`
					monday[930] = new Data("�y", "205", 1, 7);
					
					monday[931] = new Data("�y", "206", 1, 7);
					
					monday[932] = new Data("�y", "306", 1, 7);
					
					monday[933] = new Data("�u", "506-7", 1, 7);
					
					monday[934] = new Data("�H", "407", 1, 7);
					monday[935] = new Data("�H", "407", 1, 8);
					monday[936] = new Data("�H", "407", 1, 9);
					
					monday[937] = new Data("��", "107", 1, 7);
					monday[938] = new Data("��", "107", 1, 8);
					monday[939] = new Data("��", "107", 1, 9);
					
					monday[940] = new Data("��", "408", 1, 7);
					monday[941] = new Data("��", "408", 1, 8);
					monday[942] = new Data("��", "408", 1, 9);
					
					monday[943] = new Data("��", "1111", 1, 7);
					monday[944] = new Data("��", "1111", 1, 8);
					monday[945] = new Data("��", "1111", 1, 9);
					
					monday[946] = new Data("��", "305", 1, 7);
					monday[947] = new Data("��", "305", 1, 8);
					
					monday[948] = new Data("��", "106", 1, 7);
					
					monday[949] = new Data("��", "205", 1, 7);
					
					monday[950] = new Data("��", "403", 1, 7);
					monday[951] = new Data("��", "403", 1, 8);
					monday[952] = new Data("��", "403", 1, 9);
					
					monday[953] = new Data("��", "401", 1, 7);
					monday[954] = new Data("��", "401", 1, 8);
					monday[955] = new Data("��", "401", 1, 9);
					
					monday[956] = new Data("��", "712", 1, 7);
					monday[957] = new Data("��", "712", 1, 8);
					
					monday[958] = new Data("�z", "412B", 1, 7);
					monday[959] = new Data("�z", "412B", 1, 8);
					monday[960] = new Data("�z", "412B", 1, 9);
					
					monday[961] = new Data("�z", "B07", 1, 7);
					
					monday[962] = new Data("��", "209", 1, 7);
					monday[963] = new Data("��", "209", 1, 8);
					monday[964] = new Data("��", "209", 1, 9);
					
					monday[965] = new Data("�q�q", "120", 1, 7);
					monday[966] = new Data("�q�q", "120", 1, 8);
					monday[967] = new Data("�q�q", "120", 1, 9);
					
					monday[968] = new Data("�q�q", "306", 1, 7);
					monday[969] = new Data("�q�q", "306", 1, 8);
					monday[970] = new Data("�q�q", "306", 1, 9);
					
					monday[971] = new Data("��q", "409", 1, 7);
					monday[972] = new Data("��q", "409", 1, 8);
					monday[973] = new Data("��q", "409", 1, 9);
					
					monday[974] = new Data("�g", "403", 1, 7);
					monday[975] = new Data("�g", "403", 1, 8);
					monday[976] = new Data("�g", "403", 1, 9);
					
					monday[977] = new Data("�g", "515", 1, 7);
					monday[978] = new Data("�g", "515", 1, 8);
					monday[979] = new Data("�g", "515", 1, 9);
					
					monday[980] = new Data("�g", "509", 1, 7);
					
					monday[981] = new Data("�g", "514", 1, 7);
					monday[982] = new Data("�g", "514", 1, 8);
					
					monday[983] = new Data("��", "310", 1, 7);
					monday[984] = new Data("��", "310", 1, 8);
					
					monday[985] = new Data("��", "211", 1, 7);
					monday[986] = new Data("��", "211", 1, 8);
					monday[987] = new Data("��", "211", 1, 9);
					
					monday[988] = new Data("��", "111", 1, 7);
					
					monday[989] = new Data("�g", "407", 1, 7);
					monday[990] = new Data("�g", "407", 1, 8);
					monday[991] = new Data("�g", "407", 1, 9);
					
					monday[992] = new Data("�y", "202", 1, 7);
					
					monday[993] = new Data("��", "104", 1, 7);
					monday[994] = new Data("��", "104", 1, 8);
					monday[995] = new Data("��", "104", 1, 9);
					
					monday[996] = new Data("��", "207", 1, 7);
					monday[997] = new Data("��", "207", 1, 8);
					monday[998] = new Data("��", "207", 1, 9);
					
					monday[999] = new Data("��", "1007", 1, 7);
					monday[1000] = new Data("��", "1007", 1, 8);
					monday[1001] = new Data("��", "1007", 1, 9);
					
					monday[1002] = new Data("��", "1009", 1, 7);
					monday[1003] = new Data("��", "1009", 1, 8);
					monday[1004] = new Data("��", "1009", 1, 9);
					
					monday[1005] = new Data("���", "504", 1, 7);
					monday[1006] = new Data("���", "504", 1, 8);
					monday[1007] = new Data("���", "504", 1, 9);
					
					monday[1008] = new Data("��", "207", 1, 7);
					
					monday[1009] = new Data("���", "201", 1, 7);
					monday[1010] = new Data("���", "201", 1, 8);
					monday[1011] = new Data("���", "201", 1, 9);
					
					//�ĤK�`
					monday[1012] = new Data("�y", "201", 1, 8);
					monday[1013] = new Data("�y", "201", 1, 9);
					
					monday[1014] = new Data("�y", "302", 1, 8);
					monday[1015] = new Data("�y", "302", 1, 9);
					
					monday[1016] = new Data("�y", "305", 1, 8);
					monday[1017] = new Data("�y", "305", 1, 9);
					
					monday[1018] = new Data("��", "203", 1, 8);
					monday[1019] = new Data("��", "203", 1, 9);
					
					monday[1020] = new Data("�u", "410", 1, 8);
					
					monday[1021] = new Data("�u", "223", 1, 8);
					
					monday[1022] = new Data("�y", "205", 1, 8);
					
					monday[1023] = new Data("�y", "206", 1, 8);
					
					monday[1024] = new Data("�y", "306", 1, 8);
					
					monday[1025] = new Data("�y", "101", 1, 8);
					
					monday[1026] = new Data("�u", "416", 1, 8);
					
					monday[1027] = new Data("�y", "207", 1, 8);
					
					monday[1028] = new Data("�u", "504", 1, 8);
					
					monday[1029] = new Data("��", "519", 1, 8);
					monday[1030] = new Data("��", "519", 1, 9);
					
					monday[1031] = new Data("��", "105", 1, 8);
					
					monday[1032] = new Data("���", "204", 1, 8);
					monday[1033] = new Data("���", "204", 1, 9);
					
					monday[1034] = new Data("���", "505", 1, 8);
					
					monday[1035] = new Data("�u", "506", 1, 8);
					
					monday[1036] = new Data("��", "705", 1, 8);
					
					monday[1037] = new Data("�y", "105", 1, 8);
					monday[1038] = new Data("�y", "105", 1, 9);
					
					monday[1039] = new Data("��", "203", 1, 8);
					monday[1040] = new Data("��", "203", 1, 9);
					
					monday[1041] = new Data("��", "208", 1, 8);
					monday[1042] = new Data("��", "208", 1, 9);
					
					monday[1043] = new Data("��", "207", 1, 8);
					monday[1044] = new Data("��", "207", 1, 9);
					
					monday[1045] = new Data("���", "205", 1, 8);
					monday[1046] = new Data("���", "205", 1, 9);
					
					monday[1047] = new Data("��", "106", 1, 8);
					monday[1048] = new Data("��", "106", 1, 9);
					
					monday[1049] = new Data("��", "205", 1, 8);
					monday[1050] = new Data("��", "205", 1, 9);
					
					monday[1051] = new Data("�z", "205", 1, 8);
					monday[1052] = new Data("�z", "205", 1, 9);
					
					monday[1053] = new Data("�z", "401", 1, 8);
					monday[1054] = new Data("�z", "401", 1, 9);
					
					monday[1055] = new Data("�z", "313", 1, 8);
					monday[1056] = new Data("�z", "313", 1, 9);
					
					monday[1057] = new Data("�z", "409", 1, 8);
					monday[1058] = new Data("�z", "409", 1, 9);
					
					monday[1059] = new Data("�z", "404", 1, 8);
					monday[1060] = new Data("�z", "404", 1, 9);
					
					monday[1061] = new Data("��", "415", 1, 8);
					monday[1062] = new Data("��", "415", 1, 9);
					
					monday[1063] = new Data("�z", "413", 1, 8);
					monday[1064] = new Data("�z", "413", 1, 9);
					
					monday[1065] = new Data("�y", "402", 1, 8);
					monday[1066] = new Data("�y", "402", 1, 9);
					
					monday[1067] = new Data("��", "515", 1, 8);
					monday[1068] = new Data("��", "515", 1, 9);
					
					monday[1069] = new Data("��", "103", 1, 8);
					monday[1070] = new Data("��", "103", 1, 9);
					
					monday[1071] = new Data("��", "102", 1, 8);
					monday[1072] = new Data("��", "102", 1, 9);
					monday[1073] = new Data("��", "102", 1, 10);
					
					monday[1074] = new Data("��", "104", 1, 8);
					monday[1075] = new Data("��", "104", 1, 9);
					
					monday[1076] = new Data("��", "305", 1, 8);
					monday[1077] = new Data("��", "305", 1, 9);
					monday[1078] = new Data("��", "305", 1, 10);
					
					monday[1079] = new Data("�y", "102", 1, 8);
					monday[1080] = new Data("�y", "102", 1, 9);
					
					monday[1081] = new Data("��", "319", 1, 8);
					monday[1082] = new Data("��", "319", 1, 9);
					
					monday[1083] = new Data("�y", "202", 1, 8);
					monday[1084] = new Data("�y", "202", 1, 9);
					
					monday[1085] = new Data("�y", "103", 1, 8);
					monday[1086] = new Data("�y", "103", 1, 9);
					
					monday[1087] = new Data("�z", "101", 1, 8);
					monday[1088] = new Data("�z", "101", 1, 9);
					monday[1089] = new Data("�z", "101", 1, 10);
					
					monday[1090] = new Data("�H", "605", 1, 8);
					monday[1091] = new Data("�H", "605", 1, 9);
					
					monday[1092] = new Data("��q", "104", 1, 8);
					monday[1093] = new Data("��q", "104", 1, 9);
					
					monday[1094] = new Data("�H", "503", 1, 8);
					monday[1095] = new Data("�H", "503", 1, 9);
		
					monday[1096] = new Data("�H", "604", 1, 8);
					monday[1097] = new Data("�H", "604", 1, 9);
					
					monday[1098] = new Data("��q", "102", 1, 8);
					monday[1099] = new Data("��q", "102", 1, 9);
					
					//�ˬd��o��
					monday[1100] = new Data("��q", "512", 1, 8);
					monday[1101] = new Data("��q", "512", 1, 9);
					
					monday[1102] = new Data("�H", "910", 1, 8);
					monday[1103] = new Data("�H", "910", 1, 9);
					monday[1104] = new Data("�H", "910", 1, 10);
					
					monday[1105] = new Data("�y", "204", 1, 8);
					monday[1106] = new Data("�y", "204", 1, 9);
					
					monday[1107] = new Data("��q", "404", 1, 8);
					monday[1108] = new Data("��q", "404", 1, 9);
					monday[1109] = new Data("��q", "404", 1, 10);
					
					monday[1110] = new Data("��q", "403", 1, 8);
					monday[1111] = new Data("��q", "403", 1, 9);
					monday[1112] = new Data("��q", "403", 1, 10);
					
					monday[1113] = new Data("��q", "502", 1, 8);
					monday[1114] = new Data("��q", "502", 1, 9);
					monday[1115] = new Data("��q", "502", 1, 10);
					
					monday[1116] = new Data("��q", "410", 1, 8);
					monday[1117] = new Data("��q", "410", 1, 9);
					monday[1118] = new Data("��q", "410", 1, 10);
					
					monday[1119] = new Data("��q", "330", 1, 8);
					monday[1120] = new Data("��q", "330", 1, 9);
					monday[1121] = new Data("��q", "330", 1, 10);
					
					monday[1122] = new Data("��q", "306", 1, 8);
					monday[1123] = new Data("��q", "306", 1, 9);
					
					monday[1124] = new Data("��q", "312", 1, 8);
					
					monday[1125] = new Data("��q", "501A", 1, 8);
					monday[1126] = new Data("��q", "501A", 1, 9);
					monday[1127] = new Data("��q", "501A", 1, 10);
					
					monday[1128] = new Data("��q", "401", 1, 8);
					monday[1129] = new Data("��q", "401", 1, 9);
					monday[1130] = new Data("��q", "401", 1, 10);
					
					monday[1131] = new Data("��q", "107", 1, 8);
					monday[1132] = new Data("��q", "107", 1, 9);
					
					monday[1133] = new Data("��q", "B08", 1, 8);
					monday[1134] = new Data("��q", "B08", 1, 9);
					
					monday[1135] = new Data("��q", "108", 1, 8);
					monday[1136] = new Data("��q", "108", 1, 9);
					
					monday[1137] = new Data("�H", "606", 1, 8);
					monday[1138] = new Data("�H", "606", 1, 9);
					
					monday[1139] = new Data("�g", "B03", 1, 8);
					monday[1140] = new Data("�g", "B03", 1, 9);
					
					monday[1141] = new Data("�g", "509", 1, 8);
					monday[1142] = new Data("�g", "509", 1, 9);
					
					monday[1143] = new Data("�g", "B10", 1, 8);
					monday[1144] = new Data("�g", "B10", 1, 9);
					
					monday[1145] = new Data("��", "401", 1, 8);
					monday[1146] = new Data("��", "401", 1, 9);
					monday[1147] = new Data("��", "401", 1, 10);
					
					monday[1148] = new Data("��", "111", 1, 8);
					monday[1149] = new Data("��", "111", 1, 9);
					monday[1150] = new Data("��", "111", 1, 10);
					
					monday[1151] = new Data("��", "405A", 1, 8);
					monday[1152] = new Data("��", "405A", 1, 9);
					monday[1153] = new Data("��", "405A", 1, 10);
					
					monday[1154] = new Data("��", "311", 1, 8);
					monday[1155] = new Data("��", "311", 1, 9);
					monday[1156] = new Data("��", "311", 1, 10);
					
					monday[1157] = new Data("�y", "304", 1, 8);
					monday[1158] = new Data("�y", "304", 1, 9);
					
					monday[1159] = new Data("��", "308", 1, 8);
					
					monday[1160] = new Data("��", "303", 1, 8);
					
					monday[1161] = new Data("��", "501", 1, 8);
					
					monday[1162] = new Data("��", "204", 1, 8);
					
					monday[1163] = new Data("�H", "404", 1, 8);
					monday[1164] = new Data("�H", "404", 1, 9);
					
					monday[1165] = new Data("�g", "402A", 1, 8);
					monday[1166] = new Data("�g", "402A", 1, 9);
					monday[1167] = new Data("�g", "402A", 1, 10);
					
					monday[1168] = new Data("��q", "B07", 1, 8);
					monday[1169] = new Data("��q", "B07", 1, 9);
					
					monday[1170] = new Data("�H", "505", 1, 8);
					monday[1171] = new Data("�H", "505", 1, 9);
					
					monday[1172] = new Data("�H", "706", 1, 8);
					monday[1173] = new Data("�H", "706", 1, 9);
					
					monday[1174] = new Data("�H", "507", 1, 8);
					monday[1175] = new Data("�H", "507", 1, 9);
					
					monday[1176] = new Data("�H", "601", 1, 8);
					monday[1177] = new Data("�H", "601", 1, 9);
					
					monday[1178] = new Data("�H", "B116A", 1, 8);
					monday[1179] = new Data("�H", "B116A", 1, 9);
					
					monday[1180] = new Data("�H", "603", 1, 8);
					monday[1181] = new Data("�H", "603", 1, 9);
					
					monday[1182] = new Data("�H", "607", 1, 8);
					monday[1183] = new Data("�H", "607", 1, 9);
					
					monday[1184] = new Data("�H", "403", 1, 8);
					monday[1185] = new Data("�H", "403", 1, 9);
					
					monday[1186] = new Data("�H", "401", 1, 8);
					monday[1187] = new Data("�H", "401", 1, 9);
					
					monday[1188] = new Data("�q�q", "B03", 1, 8);
					monday[1189] = new Data("�q�q", "B03", 1, 9);
					
					monday[1190] = new Data("��q", "402", 1, 8);
					monday[1191] = new Data("��q", "402", 1, 9);
					monday[1192] = new Data("��q", "402", 1, 10);
					
					monday[1193] = new Data("�H", "406", 1, 8);
					
					monday[1194] = new Data("�H", "504", 1, 8);
					
					monday[1195] = new Data("�H", "506", 1, 8);
					
					monday[1196] = new Data("�H", "707", 1, 8);
					
					monday[1197] = new Data("�H", "501", 1, 8);
					
					monday[1198] = new Data("�H", "405", 1, 8);
					
					monday[1199] = new Data("��", "104", 1, 8);
					
					monday[1200] = new Data("��", "110", 1, 8);
					
					//�ĤE�`
					monday[1201] = new Data("�u", "303", 1, 9);
					
					monday[1202] = new Data("�u", "302", 1, 9);
					
					monday[1203] = new Data("�y", "407", 1, 9);
					
					monday[1204] = new Data("�u", "410", 1, 9);
					
					monday[1205] = new Data("�u", "305", 1, 9);
					
					monday[1206] = new Data("�u", "504", 1, 9);
					
					monday[1207] = new Data("��", "105", 1, 9);
					
					monday[1208] = new Data("���", "505", 1, 9);
					
					monday[1209] = new Data("�u", "506", 1, 9);
					
					monday[1210] = new Data("��", "705", 1, 9);
					
					monday[1211] = new Data("�H", "B119A", 1, 9);
					monday[1212] = new Data("�H", "B119A", 1, 10);
					
					monday[1213] = new Data("��", "206", 1, 9);
					monday[1214] = new Data("��", "206", 1, 10);
					
					monday[1215] = new Data("��", "102", 1, 9);
					monday[1216] = new Data("��", "102", 1, 10);
					
					monday[1217] = new Data("��", "302", 1, 9);
					monday[1218] = new Data("��", "302", 1, 10);
					
					monday[1219] = new Data("��", "202", 1, 9);
					monday[1220] = new Data("��", "202", 1, 10);
					
					monday[1221] = new Data("��", "405", 1, 9);
					monday[1222] = new Data("��", "405", 1, 10);
					
					monday[1223] = new Data("�H", "701", 1, 9);
					monday[1224] = new Data("�H", "701", 1, 10);
					
					monday[1225] = new Data("��", "402", 1, 9);
					monday[1226] = new Data("��", "402", 1, 10);
					
					monday[1227] = new Data("��", "204", 1, 9);
					monday[1228] = new Data("��", "204", 1, 10);
					
					monday[1229] = new Data("��", "304", 1, 9);
					monday[1230] = new Data("��", "304", 1, 10);
					
					monday[1231] = new Data("��", "308", 1, 9);
					monday[1232] = new Data("��", "308", 1, 10);
					
					monday[1233] = new Data("��", "309", 1, 9);
					monday[1234] = new Data("��", "309", 1, 10);
					
					monday[1235] = new Data("��", "406", 1, 9);
					monday[1236] = new Data("��", "406", 1, 10);
					
					monday[1237] = new Data("���", "203", 1, 9);
					monday[1238] = new Data("���", "203", 1, 10);
					
					monday[1239] = new Data("��", "404", 1, 9);
					monday[1240] = new Data("��", "404", 1, 10);
					
					monday[1241] = new Data("��", "201", 1, 9);
					monday[1242] = new Data("��", "201", 1, 10);
					
					monday[1243] = new Data("��", "305", 1, 9);
					
					monday[1244] = new Data("��", "303", 1, 9);
					
					monday[1245] = new Data("��", "209A", 1, 9);
					monday[1246] = new Data("��", "209A", 1, 10);
					
					monday[1247] = new Data("��", "209B", 1, 9);
					monday[1248] = new Data("��", "209B", 1, 10);
					
					monday[1249] = new Data("��", "409", 1, 9);
					monday[1250] = new Data("��", "409", 1, 10);
					
					monday[1251] = new Data("��", "105", 1, 9);
					monday[1252] = new Data("��", "105", 1, 10);
					
					monday[1253] = new Data("�H", "204", 1, 9);
					
					monday[1254] = new Data("��", "804", 1, 9);
					monday[1255] = new Data("��", "804", 1, 10);
					
					monday[1256] = new Data("�H", "703", 1, 9);
					monday[1257] = new Data("�H", "703", 1, 10);
					
					monday[1258] = new Data("�H", "705", 1, 9);
					monday[1259] = new Data("�H", "705", 1, 10);
					
					monday[1260] = new Data("�H", "501", 1, 9);
					
					monday[1261] = new Data("�H", "405", 1, 9);
					
					monday[1262] = new Data("�H", "506", 1, 9);
					
					monday[1263] = new Data("�H", "707", 1, 9);
					
					monday[1264] = new Data("�H", "406", 1, 9);
					
					monday[1265] = new Data("�H", "504", 1, 9);
					
					monday[1266] = new Data("��", "104", 1, 9);
					
					monday[1267] = new Data("��", "110", 1, 9);
					
					//�ĤQ�`
					monday[1268] = new Data("�y", "102", 1, 10);
					
					monday[1269] = new Data("�u", "410", 1, 10);
					
					monday[1270] = new Data("��", "401", 1, 10);
					monday[1271] = new Data("��", "401", 1, 11);
					
					monday[1272] = new Data("�z", "311", 1, 10);
					monday[1273] = new Data("�z", "311", 1, 11);
					monday[1274] = new Data("�z", "311", 1, 12);
					
					monday[1275] = new Data("��q", "511", 1, 10);
					monday[1276] = new Data("��q", "511", 1, 11);
					
					monday[1277] = new Data("��q", "103", 1, 10);
					monday[1278] = new Data("��q", "103", 1, 11);
					
					monday[1279] = new Data("��", "707", 1, 10);
					
					monday[1280] = new Data("��", "408", 1, 10);
					
					//�ĤQ�@�`
					monday[1281] = new Data("��q", "306", 1, 11);
					monday[1282] = new Data("��q", "306", 1, 12);
					monday[1283] = new Data("��q", "306", 1, 13);
					
					monday[1284] = new Data("��", "201", 1, 11);
					monday[1285] = new Data("��", "201", 1, 12);
					monday[1286] = new Data("��", "201", 1, 13);
					
					monday[1287] = new Data("���", "206", 1, 11);
					monday[1288] = new Data("���", "206", 1, 12);
					
					monday[1289] = new Data("�H", "B116A", 1, 11);
					monday[1290] = new Data("�H", "B116A", 1, 12);
					monday[1291] = new Data("�H", "B116A", 1, 13);
					
					monday[1292] = new Data("�H", "204", 1, 11);
					monday[1293] = new Data("�H", "204", 1, 12);
					monday[1294] = new Data("�H", "204", 1, 13);
					
					monday[1295] = new Data("���", "205", 1, 11);
					monday[1296] = new Data("���", "205", 1, 12);
					monday[1297] = new Data("���", "205", 1, 13);
					
					monday[1298] = new Data("��", "202", 1, 11);
					monday[1299] = new Data("��", "202", 1, 12);
					monday[1300] = new Data("��", "202", 1, 13);
					
					monday[1301] = new Data("��", "401", 1, 11);
					monday[1302] = new Data("��", "401", 1, 12);
					
					monday[1303] = new Data("��", "104", 1, 11);
					monday[1304] = new Data("��", "104", 1, 12);
					monday[1305] = new Data("��", "104", 1, 13);
					
					monday[1306] = new Data("��", "107", 1, 11);
					monday[1307] = new Data("��", "107", 1, 12);
					monday[1308] = new Data("��", "107", 1, 13);
					
					monday[1309] = new Data("��", "203", 1, 11);
					monday[1310] = new Data("��", "203", 1, 12);
					monday[1311] = new Data("��", "203", 1, 13);
					
					monday[1312] = new Data("��", "206", 1, 11);
					monday[1313] = new Data("��", "206", 1, 12);
					monday[1314] = new Data("��", "206", 1, 13);
					
					monday[1315] = new Data("��", "204", 1, 11);
					monday[1316] = new Data("��", "204", 1, 12);
					
					monday[1317] = new Data("��", "205", 1, 11);
					monday[1318] = new Data("��", "205", 1, 12);
					
					monday[1319] = new Data("��", "302", 1, 11);
					monday[1320] = new Data("��", "302", 1, 12);
					
					monday[1321] = new Data("��", "712", 1, 11);
					monday[1322] = new Data("��", "712", 1, 12);
					
					monday[1323] = new Data("��", "202", 1, 11);
					monday[1324] = new Data("��", "202", 1, 12);
					monday[1325] = new Data("��", "202", 1, 13);
					
					monday[1326] = new Data("��", "102", 1, 11);
					monday[1327] = new Data("��", "102", 1, 12);
					monday[1328] = new Data("��", "102", 1, 13);
					
					monday[1329] = new Data("��", "304", 1, 11);
					monday[1330] = new Data("��", "304", 1, 12);
					monday[1331] = new Data("��", "304", 1, 13);
					
					monday[1332] = new Data("�z", "407", 1, 11);
					monday[1333] = new Data("�z", "407", 1, 12);
					
					monday[1334] = new Data("��", "409", 1, 11);
					monday[1335] = new Data("��", "409", 1, 12);
					
					monday[1336] = new Data("��", "307", 1, 11);
					monday[1337] = new Data("��", "307", 1, 12);
					monday[1338] = new Data("��", "307", 1, 13);
					
					monday[1339] = new Data("�q�q", "306", 1, 11);
					monday[1340] = new Data("�q�q", "306", 1, 12);
					
					monday[1341] = new Data("��q", "502", 1, 11);
					monday[1342] = new Data("��q", "502", 1, 12);
					monday[1343] = new Data("��q", "502", 1, 13);
					
					monday[1344] = new Data("��q", "312", 1, 11);
					monday[1345] = new Data("��q", "312", 1, 12);
					monday[1346] = new Data("��q", "312", 1, 13);
					
					monday[1347] = new Data("��", "303", 1, 11);
					monday[1348] = new Data("��", "303", 1, 12);
					monday[1349] = new Data("��", "303", 1, 13);
					
					monday[1350] = new Data("��q", "418", 1, 11);
					monday[1351] = new Data("��q", "418", 1, 12);
					monday[1352] = new Data("��q", "418", 1, 13);
					
					monday[1353] = new Data("�q�q", "306", 1, 11);
					monday[1354] = new Data("�q�q", "306", 1, 12);
					
					monday[1355] = new Data("��q", "504", 1, 11);
					monday[1356] = new Data("��q", "504", 1, 12);
					monday[1357] = new Data("��q", "504", 1, 13);
					
					monday[1358] = new Data("�g", "402A", 1, 11);
					
					monday[1359] = new Data("��", "309", 1, 11);
					monday[1360] = new Data("��", "309", 1, 12);
					monday[1361] = new Data("��", "309", 1, 13);
					
					monday[1362] = new Data("��", "401", 1, 11);
					monday[1363] = new Data("��", "401", 1, 12);
					monday[1364] = new Data("��", "401", 1, 13);
					
					monday[1452] = new Data("��", "405A", 1, 11);
					monday[1453] = new Data("��", "405A", 1, 12);
					monday[1454] = new Data("��", "405A", 1, 13);
					
					monday[1365] = new Data("�g", "B03", 1, 11);
					monday[1366] = new Data("�g", "B03", 1, 12);
					
					monday[1367] = new Data("�g", "B10", 1, 11);
					monday[1368] = new Data("�g", "B10", 1, 12);
					
					monday[1369] = new Data("��", "501", 1, 11);
					monday[1370] = new Data("��", "501", 1, 12);
					
					monday[1371] = new Data("��", "305", 1, 11);
					monday[1372] = new Data("��", "305", 1, 12);
					monday[1373] = new Data("��", "305", 1, 13);
					
					monday[1374] = new Data("��", "207", 1, 11);
					monday[1375] = new Data("��", "207", 1, 12);
					monday[1376] = new Data("��", "207", 1, 13);
					
					monday[1377] = new Data("�H", "B117A", 1, 11);
					monday[1378] = new Data("�H", "B117A", 1, 12);
					monday[1379] = new Data("�H", "B117A", 1, 13);
					
					monday[1380] = new Data("��", "208", 1, 11);
					monday[1381] = new Data("��", "208", 1, 12);
					
					monday[1382] = new Data("��", "209", 1, 11);
					monday[1383] = new Data("��", "209", 1, 12);
					
					monday[1384] = new Data("��", "310", 1, 11);
					monday[1385] = new Data("��", "310", 1, 12);
					
					monday[1386] = new Data("���", "202", 1, 11);
					monday[1387] = new Data("���", "202", 1, 12);
					
					monday[1388] = new Data("��q", "402", 1, 11);
					monday[1389] = new Data("��q", "402", 1, 12);
					
					monday[1390] = new Data("�H", "B119A", 1, 11);
					monday[1391] = new Data("�H", "B119A", 1, 12);
					monday[1392] = new Data("�H", "B119A", 1, 13);
					
					monday[1393] = new Data("��", "106", 1, 11);
					monday[1394] = new Data("��", "106", 1, 12);
					
					monday[1395] = new Data("��q", "104", 1, 11);
					monday[1396] = new Data("��q", "104", 1, 12);
					
					monday[1397] = new Data("��", "403", 1, 11);
					monday[1398] = new Data("��", "403", 1, 12);
					
					monday[1399] = new Data("��", "404", 1, 11);
					monday[1400] = new Data("��", "404", 1, 12);
					
					monday[1401] = new Data("��", "405", 1, 11);
					monday[1402] = new Data("��", "405", 1, 12);
					
					monday[1403] = new Data("��q", "403", 1, 11);
					monday[1404] = new Data("��q", "403", 1, 12);
					
					monday[1405] = new Data("��q", "102", 1, 11);
					monday[1406] = new Data("��q", "102", 1, 12);
					
					monday[1407] = new Data("�z", "313", 1, 11);
					monday[1408] = new Data("�z", "313", 1, 12);
					monday[1409] = new Data("�z", "313", 1, 13);
					
					monday[1410] = new Data("��", "408", 1, 11);
					monday[1411] = new Data("��", "408", 1, 12);
					monday[1412] = new Data("��", "408", 1, 13);
					
					monday[1413] = new Data("��", "308", 1, 11);
					monday[1414] = new Data("��", "308", 1, 12);
					
					monday[1415] = new Data("��", "208", 1, 11);
					monday[1416] = new Data("��", "208", 1, 12);
					
					monday[1417] = new Data("��", "304", 1, 11);
					monday[1418] = new Data("��", "304", 1, 12);
					monday[1419] = new Data("��", "304", 1, 13);
					
					monday[1420] = new Data("��q", "515", 1, 11);
					monday[1421] = new Data("��q", "515", 1, 12);
					
					monday[1422] = new Data("��q", "B06", 1, 11);
					monday[1423] = new Data("��q", "B06", 1, 12);
					
					monday[1424] = new Data("��q", "B07", 1, 11);
					monday[1425] = new Data("��q", "B07", 1, 12);
					
					monday[1426] = new Data("��q", "B08", 1, 11);
					monday[1427] = new Data("��q", "B08", 1, 12);
					
					monday[1428] = new Data("��q", "107", 1, 11);
					monday[1429] = new Data("��q", "107", 1, 12);
					
					monday[1430] = new Data("��q", "108", 1, 11);
					monday[1431] = new Data("��q", "108", 1, 12);
					
					monday[1432] = new Data("��q", "410", 1, 11);
					monday[1433] = new Data("��q", "410", 1, 12);
					
					monday[1434] = new Data("��q", "411", 1, 11);
					monday[1435] = new Data("��q", "411", 1, 12);
					
					monday[1436] = new Data("��q", "512", 1, 11);
					monday[1437] = new Data("��q", "512", 1, 12);
					
					//�ĤQ�G�`
					monday[1438] = new Data("�g", "402A", 1, 12);
					
					//�ĤQ�T�`
					monday[1439] = new Data("��", "712", 1, 13);
					
					monday[1440] = new Data("��", "208", 1, 13);
					monday[1441] = new Data("��", "208", 1, 14);
					
					monday[1442] = new Data("��", "204", 1, 13);
					monday[1443] = new Data("��", "204", 1, 14);
					
					monday[1444] = new Data("��", "208", 1, 13);
					
					monday[1445] = new Data("��", "501", 1, 13);
					monday[1446] = new Data("��", "501", 1, 14);
					
					monday[1447] = new Data("��", "209", 1, 13);
					
					monday[1448] = new Data("��", "106", 1, 13);
					monday[1449] = new Data("��", "106", 1, 14);
					
					//�ĤQ�|�`
					monday[1450] = new Data("��", "208", 1, 14);
					
					monday[1451] = new Data("��", "308", 1, 14);
					//MONDAY END
					//1454
					
					//tuesday
					//�Ĥ@�`
					tuesday[0] = new Data("��q", "504", 2, 1);
					tuesday[1] = new Data("��q", "103", 2, 1);
					tuesday[2] = new Data("��q", "107", 2, 1);
					tuesday[3] = new Data("��q", "330", 2, 1);
					tuesday[4] = new Data("��q", "403", 2, 1);
					tuesday[5] = new Data("��q", "404", 2, 1);
					tuesday[6] = new Data("��q", "248", 2, 1);
					tuesday[7] = new Data("��q", "104", 2, 1);
					tuesday[8] = new Data("��q", "B07", 2, 1);
					tuesday[9] = new Data("��q", "102", 2, 1);
					tuesday[10] = new Data("��q", "410", 2, 1);
					tuesday[11] = new Data("��q", "411", 2, 1);
					
					//�ĤG�`
					tuesday[12] = new Data("��q", "108", 2, 2);
					tuesday[13] = new Data("��q", "502", 2, 2);
					tuesday[14] = new Data("��q", "504", 2, 2);
					tuesday[15] = new Data("��q", "104", 2, 2);
					tuesday[16] = new Data("��q", "311", 2, 2);
					tuesday[17] = new Data("��q", "107", 2, 2);
					tuesday[18] = new Data("��q", "103", 2, 2);
					tuesday[19] = new Data("��q", "512", 2, 2);
					tuesday[20] = new Data("��q", "330", 2, 2);
					tuesday[21] = new Data("��q", "403", 2, 2);
					tuesday[22] = new Data("��q", "312", 2, 2);
					tuesday[23] = new Data("��q", "404", 2, 2);
					tuesday[24] = new Data("��q", "418", 2, 2);
					tuesday[25] = new Data("��q", "515", 2, 2);
					tuesday[26] = new Data("��q", "501A", 2, 2);
					tuesday[27] = new Data("��q", "402", 2, 2);
					tuesday[28] = new Data("��q", "248", 2, 2);
					tuesday[29] = new Data("��q", "503", 2, 2);
					tuesday[30] = new Data("��q", "B07", 2, 2);
					tuesday[31] = new Data("��q", "102", 2, 2);
					tuesday[32] = new Data("��q", "410", 2, 2);
					tuesday[33] = new Data("��q", "411", 2, 2);
					
					//�ĤT�`
					tuesday[34] = new Data("��q", "B07", 2, 3);
					tuesday[35] = new Data("��q", "502", 2, 3);
					tuesday[36] = new Data("��q", "504", 2, 3);
					tuesday[37] = new Data("��q", "104", 2, 3);
					tuesday[38] = new Data("��q", "403", 2, 3);
					tuesday[39] = new Data("��q", "B03", 2, 3);
					tuesday[40] = new Data("��q", "311", 2, 3);
					tuesday[41] = new Data("��q", "107", 2, 3);
					tuesday[42] = new Data("��q", "511", 2, 3);
					tuesday[43] = new Data("��q", "512", 2, 3);
					tuesday[44] = new Data("��q", "402", 2, 3);
					tuesday[45] = new Data("��q", "103", 2, 3);
					tuesday[46] = new Data("��q", "330", 2, 3);
					tuesday[47] = new Data("��q", "306", 2, 3);
					tuesday[48] = new Data("��q", "312", 2, 3);
					tuesday[49] = new Data("��q", "515", 2, 3);
					tuesday[50] = new Data("��q", "404", 2, 3);
					tuesday[51] = new Data("��q", "418", 2, 3);
					tuesday[52] = new Data("��q", "410", 2, 3);
					tuesday[53] = new Data("��q", "501A", 2, 3);
					tuesday[54] = new Data("��q", "B04", 2, 3);
					tuesday[55] = new Data("��q", "248", 2, 3);
					tuesday[56] = new Data("��q", "B06", 2, 3);
					tuesday[57] = new Data("��q", "503", 2, 3);
					tuesday[58] = new Data("��q", "B08", 2, 3);
					tuesday[59] = new Data("��q", "234", 2, 3);
					tuesday[60] = new Data("��q", "102", 2, 3);
					tuesday[61] = new Data("��q", "B02", 2, 3);
					
					//�ĥ|�`
					tuesday[62] = new Data("��q", "108", 2, 4);
					tuesday[63] = new Data("��q", "B07", 2, 4);
					tuesday[64] = new Data("��q", "502", 2, 4);
					tuesday[65] = new Data("��q", "104", 2, 4);
					tuesday[66] = new Data("��q", "403", 2, 4);
					tuesday[67] = new Data("��q", "B03", 2, 4);
					tuesday[68] = new Data("��q", "311", 2, 4);
					tuesday[69] = new Data("��q", "411", 2, 4);
					tuesday[70] = new Data("��q", "511", 2, 4);
					tuesday[71] = new Data("��q", "512", 2, 4);
					tuesday[72] = new Data("��q", "402", 2, 4);
					tuesday[73] = new Data("��q", "103", 2, 4);
					tuesday[74] = new Data("��q", "504", 2, 4);
					tuesday[75] = new Data("��q", "306", 2, 4);
					tuesday[76] = new Data("��q", "312", 2, 4);
					tuesday[77] = new Data("��q", "B04", 2, 4);
					tuesday[78] = new Data("��q", "404", 2, 4);
					tuesday[79] = new Data("��q", "418", 2, 4);
					tuesday[80] = new Data("��q", "410", 2, 4);
					tuesday[81] = new Data("��q", "501A", 2, 4);
					tuesday[82] = new Data("��q", "B06", 2, 4);
					tuesday[83] = new Data("��q", "107", 2, 4);
					tuesday[84] = new Data("��q", "503", 2, 4);
					tuesday[85] = new Data("��q", "234", 2, 4);
					tuesday[86] = new Data("��q", "102", 2, 4);
					tuesday[87] = new Data("��q", "B02", 2, 4);
					tuesday[88] = new Data("��q", "B08", 2, 4);
					
					//�Ĥ��`
					tuesday[89] = new Data("��q", "404", 2, 6);
					tuesday[90] = new Data("��q", "311", 2, 6);
					tuesday[91] = new Data("��q", "205", 2, 6);
					tuesday[92] = new Data("��q", "102", 2, 6);
					tuesday[93] = new Data("��q", "504", 2, 6);
					tuesday[94] = new Data("��q", "103", 2, 6);
					tuesday[95] = new Data("��q", "402", 2, 6);
					tuesday[96] = new Data("��q", "B03", 2, 6);
					tuesday[97] = new Data("��q", "248", 2, 6);
					tuesday[98] = new Data("��q", "503", 2, 6);
					tuesday[99] = new Data("��q", "B08", 2, 6);
					tuesday[100] = new Data("��q", "B02", 2, 6);
					tuesday[101] = new Data("��q", "B07", 2, 6);
					tuesday[102] = new Data("��q", "108", 2, 6);
					tuesday[103] = new Data("��q", "511", 2, 6);
					tuesday[104] = new Data("��q", "512", 2, 6);
					tuesday[105] = new Data("��q", "515", 2, 6);
					tuesday[106] = new Data("��q", "107", 2, 6);
					tuesday[107] = new Data("��q", "411", 2, 6);
					tuesday[108] = new Data("��q", "B06", 2, 6);
					
					//�ĤC�`
					tuesday[109] = new Data("��q", "404", 2, 7);
					tuesday[110] = new Data("��q", "402", 2, 7);
					tuesday[111] = new Data("��q", "311", 2, 7);
					tuesday[112] = new Data("��q", "205", 2, 7);
					tuesday[113] = new Data("��q", "102", 2, 7);
					tuesday[114] = new Data("��q", "504", 2, 7);
					tuesday[115] = new Data("��q", "104", 2, 7);
					tuesday[116] = new Data("��q", "306", 2, 7);
					tuesday[117] = new Data("��q", "312", 2, 7);
					tuesday[118] = new Data("��q", "B03", 2, 7);
					tuesday[119] = new Data("��q", "418", 2, 7);
					tuesday[120] = new Data("��q", "410", 2, 7);
					tuesday[121] = new Data("��q", "248", 2, 7);
					tuesday[122] = new Data("��q", "403", 2, 7);
					tuesday[123] = new Data("��q", "532", 2, 7);
					tuesday[124] = new Data("��q", "503", 2, 7);
					tuesday[125] = new Data("��q", "234", 2, 7);
					tuesday[126] = new Data("��q", "B08", 2, 7);
					tuesday[127] = new Data("��q", "B02", 2, 7);
					tuesday[128] = new Data("��q", "B07", 2, 7);
					tuesday[129] = new Data("��q", "108", 2, 7);
					tuesday[130] = new Data("��q", "511", 2, 7);
					tuesday[131] = new Data("��q", "512", 2, 7);
					tuesday[132] = new Data("��q", "515", 2, 7);
					tuesday[133] = new Data("��q", "107", 2, 7);
					tuesday[134] = new Data("��q", "411", 2, 7);
					tuesday[135] = new Data("��q", "B06", 2, 7);
					
					//�ĤK�`
					tuesday[136] = new Data("��q", "104", 2, 8);
					tuesday[137] = new Data("��q", "404", 2, 8);
					tuesday[138] = new Data("��q", "402", 2, 8);
					tuesday[139] = new Data("��q", "504", 2, 8);
					tuesday[140] = new Data("��q", "306", 2, 8);
					tuesday[141] = new Data("��q", "410", 2, 8);
					tuesday[142] = new Data("��q", "B08", 2, 8);
					tuesday[143] = new Data("��q", "312", 2, 8);
					tuesday[144] = new Data("��q", "102", 2, 8);
					tuesday[145] = new Data("��q", "103", 2, 8);
					tuesday[146] = new Data("��q", "502", 2, 8);
					tuesday[147] = new Data("��q", "B04", 2, 8);
					tuesday[148] = new Data("��q", "248", 2, 8);
					tuesday[149] = new Data("��q", "B03", 2, 8);
					tuesday[150] = new Data("��q", "518", 2, 8);
					tuesday[151] = new Data("��q", "532", 2, 8);
					tuesday[152] = new Data("��q", "234", 2, 8);
					tuesday[153] = new Data("��q", "511", 2, 8);
					tuesday[154] = new Data("��q", "B07", 2, 8);
					tuesday[155] = new Data("��q", "108", 2, 8);
					tuesday[156] = new Data("��q", "512", 2, 8);
					tuesday[157] = new Data("��q", "515", 2, 8);
					tuesday[158] = new Data("��q", "411", 2, 8);
					tuesday[159] = new Data("��q", "B02", 2, 8);
					tuesday[160] = new Data("��q", "B06", 2, 8);
					tuesday[161] = new Data("��q", "107", 2, 8);
					
					//�ĤE�`
					tuesday[162] = new Data("��q", "104", 2, 9);
					tuesday[163] = new Data("��q", "402", 2, 9);
					tuesday[164] = new Data("��q", "504", 2, 9);
					tuesday[165] = new Data("��q", "306", 2, 9);
					tuesday[166] = new Data("��q", "410", 2, 9);
					tuesday[167] = new Data("��q", "B08", 2, 9);
					tuesday[168] = new Data("��q", "102", 2, 9);
					tuesday[169] = new Data("��q", "502", 2, 9);
					tuesday[170] = new Data("��q", "103", 2, 9);
					tuesday[171] = new Data("��q", "403", 2, 9);
					tuesday[172] = new Data("��q", "B03", 2, 9);
					tuesday[173] = new Data("��q", "518", 2, 9);
					tuesday[174] = new Data("��q", "532", 2, 9);
					tuesday[175] = new Data("��q", "234", 2, 9);
					tuesday[176] = new Data("��q", "511", 2, 9);
					tuesday[177] = new Data("��q", "B07", 2, 9);
					tuesday[178] = new Data("��q", "108", 2, 9);
					tuesday[179] = new Data("��q", "512", 2, 9);
					tuesday[180] = new Data("��q", "515", 2, 9);
					tuesday[181] = new Data("��q", "411", 2, 9);
					tuesday[182] = new Data("��q", "B02", 2, 9);
					tuesday[183] = new Data("��q", "B06", 2, 9);
					tuesday[184] = new Data("��q", "107", 2, 9);
					
					//�ĤQ�`
					tuesday[185] = new Data("��q", "103", 2, 10);
					tuesday[186] = new Data("��q", "104", 2, 10);
					tuesday[187] = new Data("��q", "402", 2, 10);
					tuesday[188] = new Data("��q", "306", 2, 10);
					tuesday[189] = new Data("��q", "410", 2, 10);
					tuesday[190] = new Data("��q", "B08", 2, 10);
					tuesday[191] = new Data("��q", "107", 2, 10);
					tuesday[192] = new Data("��q", "502", 2, 10);
					tuesday[193] = new Data("��q", "532", 2, 10);
					tuesday[194] = new Data("��q", "B04", 2, 10);
					tuesday[195] = new Data("��q", "103", 2, 10);
					
					//�ĤQ�@�`
					tuesday[196] = new Data("��q", "102", 2, 11);
					tuesday[197] = new Data("��q", "103", 2, 11);
					tuesday[198] = new Data("��q", "502", 2, 11);
					tuesday[199] = new Data("��q", "306", 2, 11);
					tuesday[200] = new Data("��q", "402", 2, 11);
					tuesday[201] = new Data("��q", "418", 2, 11);
					tuesday[202] = new Data("��q", "501A", 2, 11);
					tuesday[203] = new Data("��q", "511", 2, 11);
					tuesday[204] = new Data("��q", "B06", 2, 11);
					tuesday[205] = new Data("��q", "B04", 2, 11);
					tuesday[206] = new Data("��q", "B08", 2, 11);
					tuesday[207] = new Data("��q", "403", 2, 11);
					tuesday[208] = new Data("��q", "B07", 2, 11);
					tuesday[209] = new Data("��q", "107", 2, 11);
					tuesday[210] = new Data("��q", "515", 2, 11);
					
					//�ĤQ�G�`
					tuesday[211] = new Data("��q", "102", 2, 12);
					tuesday[212] = new Data("��q", "502", 2, 12);
					tuesday[213] = new Data("��q", "306", 2, 12);
					tuesday[214] = new Data("��q", "402", 2, 12);
					tuesday[215] = new Data("��q", "418", 2, 12);
					tuesday[216] = new Data("��q", "501A", 2, 12);
					tuesday[217] = new Data("��q", "511", 2, 12);
					tuesday[218] = new Data("��q", "B06", 2, 12);
					tuesday[219] = new Data("��q", "B08", 2, 12);
					tuesday[220] = new Data("��q", "B07", 2, 12);
					tuesday[221] = new Data("��q", "107", 2, 12);
					tuesday[222] = new Data("��q", "515", 2, 12);
					
					//�ĤQ�T�`
					tuesday[223] = new Data("��q", "502", 2, 13);
					tuesday[224] = new Data("��q", "306", 2, 13);
					tuesday[225] = new Data("��q", "402", 2, 13);
					tuesday[226] = new Data("��q", "418", 2, 13);
					tuesday[227] = new Data("��q", "501A", 2, 13);
					tuesday[228] = new Data("��q", "403", 2, 13);
					tuesday[229] = new Data("��q", "104", 2, 13);
					
					//�ĤQ�|�`
					tuesday[230] = new Data("��q", "403", 2, 14);
					tuesday[231] = new Data("��q", "104", 2, 14);
					
					//wednesday
					//�Ĥ@�`
					wednesday[0] = new Data("��q", "102", 3, 1);
					wednesday[1] = new Data("��q", "411", 3, 1);
					wednesday[2] = new Data("��q", "502", 3, 1);
					wednesday[3] = new Data("��q", "501A", 3, 1);
					wednesday[4] = new Data("��q", "330", 3, 1);
					wednesday[5] = new Data("��q", "B06", 3, 1);
					wednesday[6] = new Data("��q", "306", 3, 1);
					wednesday[7] = new Data("��q", "103", 3, 1);
					wednesday[8] = new Data("��q", "402", 3, 1);
					wednesday[9] = new Data("��q", "B04", 3, 1);
					wednesday[10] = new Data("��q", "512", 3, 1);
					wednesday[11] = new Data("��q", "403", 3, 1);
					wednesday[12] = new Data("��q", "504", 3, 1);
					wednesday[13] = new Data("��q", "B07", 3, 1);
					wednesday[14] = new Data("��q", "515", 3, 1);
					wednesday[15] = new Data("��q", "B02", 3, 1);
					wednesday[16] = new Data("��q", "B08", 3, 1);
					wednesday[17] = new Data("��q", "107", 3, 1);
					wednesday[18] = new Data("��q", "410", 3, 1);
					wednesday[19] = new Data("��q", "511", 3, 1);
					
					//�ĤG�`
					wednesday[20] = new Data("��q", "102", 3, 2);
					wednesday[21] = new Data("��q", "311", 3, 2);
					wednesday[22] = new Data("��q", "104", 3, 2);
					wednesday[23] = new Data("��q", "108", 3, 2);
					wednesday[24] = new Data("��q", "411", 3, 2);
					wednesday[25] = new Data("��q", "502", 3, 2);
					wednesday[26] = new Data("��q", "501A", 3, 2);
					wednesday[27] = new Data("��q", "330", 3, 2);
					wednesday[28] = new Data("��q", "312", 3, 2);
					wednesday[29] = new Data("��q", "B06", 3, 2);
					wednesday[30] = new Data("��q", "306", 3, 2);
					wednesday[31] = new Data("��q", "103", 3, 2);
					wednesday[32] = new Data("��q", "402", 3, 2);
					wednesday[33] = new Data("��q", "B04", 3, 2);
					wednesday[34] = new Data("��q", "512", 3, 2);
					wednesday[35] = new Data("��q", "403", 3, 2);
					wednesday[36] = new Data("��q", "504", 3, 2);
					wednesday[37] = new Data("��q", "404", 3, 2);
					wednesday[38] = new Data("��q", "312", 3, 2);
					wednesday[39] = new Data("��q", "503", 3, 2);
					wednesday[40] = new Data("��q", "B03", 3, 2);
					wednesday[41] = new Data("��q", "B07", 3, 2);
					wednesday[42] = new Data("��q", "515", 3, 2);
					wednesday[43] = new Data("��q", "B02", 3, 2);
					wednesday[44] = new Data("��q", "B08", 3, 2);
					wednesday[45] = new Data("��q", "107", 3, 2);
					wednesday[46] = new Data("��q", "410", 3, 2);
					wednesday[47] = new Data("��q", "511", 3, 2);
					
					//�ĤT�`
					wednesday[48] = new Data("��q", "102", 3, 3);
					wednesday[49] = new Data("��q", "B07", 3, 3);
					wednesday[50] = new Data("��q", "403", 3, 3);
					wednesday[51] = new Data("��q", "205", 3, 3);
					wednesday[52] = new Data("��q", "311", 3, 3);
					wednesday[53] = new Data("��q", "404", 3, 3);
					wednesday[54] = new Data("��q", "306", 3, 3);
					wednesday[55] = new Data("��q", "502", 3, 3);
					wednesday[56] = new Data("��q", "501A", 3, 3);
					wednesday[57] = new Data("��q", "504", 3, 3);
					wednesday[58] = new Data("��q", "330", 3, 3);
					wednesday[59] = new Data("��q", "312", 3, 3);
					wednesday[60] = new Data("��q", "103", 3, 3);
					wednesday[61] = new Data("��q", "512", 3, 3);
					wednesday[62] = new Data("��q", "B04", 3, 3);
					wednesday[63] = new Data("��q", "104", 3, 3);
					wednesday[64] = new Data("��q", "504", 3, 3);
					wednesday[65] = new Data("��q", "410", 3, 3);
					wednesday[66] = new Data("��q", "312", 3, 3);
					wednesday[67] = new Data("��q", "503", 3, 3);
					wednesday[68] = new Data("��q", "B03", 3, 3);
					wednesday[69] = new Data("��q", "B08", 3, 3);
					wednesday[70] = new Data("��q", "515", 3, 3);
					wednesday[71] = new Data("��q", "108", 3, 3);
					wednesday[72] = new Data("��q", "B06", 3, 3);
					wednesday[73] = new Data("��q", "107", 3, 3);
					wednesday[74] = new Data("��q", "411", 3, 3);
					wednesday[75] = new Data("��q", "511", 3, 3);
					wednesday[76] = new Data("��q", "B02", 3, 3);
					
					//�ĥ|�`
					wednesday[77] = new Data("��q", "102", 3, 4);
					wednesday[78] = new Data("��q", "B07", 3, 4);
					wednesday[79] = new Data("��q", "403", 3, 4);
					wednesday[80] = new Data("��q", "205", 3, 4);
					wednesday[81] = new Data("��q", "311", 3, 4);
					wednesday[82] = new Data("��q", "404", 3, 4);
					wednesday[83] = new Data("��q", "511", 3, 4);
					wednesday[84] = new Data("��q", "B03", 3, 4);
					wednesday[85] = new Data("��q", "402", 3, 4);
					wednesday[86] = new Data("��q", "306", 3, 4);
					wednesday[87] = new Data("��q", "312", 3, 4);
					wednesday[88] = new Data("��q", "103", 3, 4);
					wednesday[89] = new Data("��q", "512", 3, 4);
					wednesday[90] = new Data("��q", "B04", 3, 4);
					wednesday[91] = new Data("��q", "104", 3, 4);
					wednesday[92] = new Data("��q", "504", 3, 4);
					wednesday[93] = new Data("��q", "410", 3, 4);
					wednesday[94] = new Data("��q", "312", 3, 4);
					wednesday[95] = new Data("��q", "503", 3, 4);
					wednesday[96] = new Data("��q", "B08", 3, 4);
					wednesday[97] = new Data("��q", "515", 3, 4);
					wednesday[98] = new Data("��q", "108", 3, 4);
					wednesday[99] = new Data("��q", "B06", 3, 4);
					wednesday[100] = new Data("��q", "107", 3, 4);
					wednesday[101] = new Data("��q", "411", 3, 4);
					wednesday[102] = new Data("��q", "511", 3, 4);
					wednesday[103] = new Data("��q", "B02", 3, 4);
					
					//�Ĥ��`
					wednesday[104] = new Data("��q", "403", 3, 6);
					wednesday[105] = new Data("��q", "104", 3, 6);
					wednesday[106] = new Data("��q", "404", 3, 6);
					wednesday[107] = new Data("��q", "402", 3, 6);
					wednesday[108] = new Data("��q", "411", 3, 6);
					wednesday[109] = new Data("��q", "B08", 3, 6);
					wednesday[110] = new Data("��q", "103", 3, 6);
					wednesday[111] = new Data("��q", "306", 3, 6);
					wednesday[112] = new Data("��q", "515", 3, 6);
					wednesday[113] = new Data("��q", "102", 3, 6);
					wednesday[114] = new Data("��q", "518", 3, 6);
					wednesday[115] = new Data("��q", "504", 3, 6);
					wednesday[116] = new Data("��q", "B04", 3, 6);
					wednesday[117] = new Data("��q", "504", 3, 6);
					wednesday[118] = new Data("��q", "518", 3, 6);
					wednesday[119] = new Data("��q", "B03", 3, 6);
					wednesday[120] = new Data("��q", "B02", 3, 6);
					wednesday[121] = new Data("��q", "108", 3, 6);
					wednesday[122] = new Data("��q", "B07", 3, 6);
					wednesday[123] = new Data("��q", "107", 3, 6);
					
					//�ĤC�`
					wednesday[124] = new Data("��q", "403", 3, 7);
					wednesday[125] = new Data("��q", "404", 3, 7);
					wednesday[126] = new Data("��q", "402", 3, 7);
					wednesday[127] = new Data("��q", "411", 3, 7);
					wednesday[128] = new Data("��q", "511", 3, 7);
					wednesday[129] = new Data("��q", "B08", 3, 7);
					wednesday[130] = new Data("��q", "103", 3, 7);
					wednesday[131] = new Data("��q", "104", 3, 7);
					wednesday[132] = new Data("��q", "306", 3, 7);
					wednesday[133] = new Data("��q", "331", 3, 7);
					wednesday[134] = new Data("��q", "512", 3, 7);
					wednesday[135] = new Data("��q", "515", 3, 7);
					wednesday[136] = new Data("��q", "102", 3, 7);
					wednesday[137] = new Data("��q", "504", 3, 7);
					wednesday[138] = new Data("��q", "518", 3, 7);
					wednesday[139] = new Data("��q", "410", 3, 7);
					wednesday[140] = new Data("��q", "B04", 3, 7);
					wednesday[141] = new Data("��q", "248", 3, 7);
					wednesday[142] = new Data("��q", "B06", 3, 7);
					wednesday[143] = new Data("��q", "518", 3, 7);
					wednesday[144] = new Data("��q", "B03", 3, 7);
					wednesday[145] = new Data("��q", "B02", 3, 7);
					wednesday[146] = new Data("��q", "108", 3, 7);
					wednesday[147] = new Data("��q", "B07", 3, 7);
					wednesday[148] = new Data("��q", "107", 3, 7);
					
					//�ĤK�`
					wednesday[149] = new Data("��q", "306", 3, 8);
					wednesday[150] = new Data("��q", "404", 3, 8);
					wednesday[151] = new Data("��q", "504", 3, 8);
					wednesday[152] = new Data("��q", "402", 3, 8);
					wednesday[153] = new Data("��q", "411", 3, 8);
					wednesday[154] = new Data("��q", "B08", 3, 8);
					wednesday[155] = new Data("��q", "330", 3, 8);
					wednesday[156] = new Data("��q", "312", 3, 8);
					wednesday[157] = new Data("��q", "512", 3, 8);
					wednesday[158] = new Data("��q", "511", 3, 8);
					wednesday[159] = new Data("��q", "102", 3, 8);
					wednesday[160] = new Data("��q", "518", 3, 8);
					wednesday[161] = new Data("��q", "518", 3, 8);
					wednesday[162] = new Data("��q", "108", 3, 8);
					wednesday[163] = new Data("��q", "410", 3, 8);
					wednesday[164] = new Data("��q", "501A", 3, 8);
					wednesday[165] = new Data("��q", "248", 3, 8);
					wednesday[166] = new Data("��q", "B06", 3, 8);
					wednesday[167] = new Data("��q", "331", 3, 8);
					wednesday[168] = new Data("��q", "518", 3, 8);
					wednesday[169] = new Data("��q", "502", 3, 8);
					wednesday[170] = new Data("��q", "B03", 3, 8);
					wednesday[171] = new Data("��q", "B07", 3, 8);
					wednesday[172] = new Data("��q", "107", 3, 8);
					
					//�ĤE�`
					wednesday[173] = new Data("��q", "402", 3, 9);
					wednesday[174] = new Data("��q", "306", 3, 9);
					wednesday[175] = new Data("��q", "504", 3, 9);
					wednesday[176] = new Data("��q", "411", 3, 9);
					wednesday[177] = new Data("��q", "B08", 3, 9);
					wednesday[178] = new Data("��q", "330", 3, 9);
					wednesday[179] = new Data("��q", "331", 3, 9);
					wednesday[180] = new Data("��q", "331", 3, 9);
					wednesday[181] = new Data("��q", "312", 3, 9);
					wednesday[182] = new Data("��q", "512", 3, 9);
					wednesday[183] = new Data("��q", "511", 3, 9);
					wednesday[184] = new Data("��q", "102", 3, 9);
					wednesday[185] = new Data("��q", "108", 3, 9);
					wednesday[186] = new Data("��q", "410", 3, 9);
					wednesday[187] = new Data("��q", "501A", 3, 9);
					wednesday[188] = new Data("��q", "248", 3, 9);
					wednesday[189] = new Data("��q", "502", 3, 9);
					wednesday[190] = new Data("��q", "B07", 3, 9);
					wednesday[191] = new Data("��q", "107", 3, 9);
					
					//�ĤQ�`
					wednesday[192] = new Data("��q", "402", 3, 10);
					wednesday[193] = new Data("��q", "504", 3, 10);
					wednesday[194] = new Data("��q", "330", 3, 10);
					wednesday[195] = new Data("��q", "312", 3, 10);
					wednesday[196] = new Data("��q", "501A", 3, 10);
					wednesday[197] = new Data("��q", "502", 3, 10);
					wednesday[198] = new Data("��q", "234", 3, 10);
					wednesday[199] = new Data("��q", "107", 3, 10);
					
					//�ĤQ�@�`
					wednesday[200] = new Data("��q", "330", 3, 11);
					wednesday[201] = new Data("��q", "108", 3, 11);
					wednesday[202] = new Data("��q", "518", 3, 11);
					wednesday[203] = new Data("��q", "411", 3, 11);
					wednesday[204] = new Data("��q", "501A", 3, 11);
					wednesday[205] = new Data("��q", "518", 3, 11);
					wednesday[206] = new Data("��q", "511", 3, 11);
					wednesday[207] = new Data("��q", "311", 3, 11);
					wednesday[208] = new Data("��q", "515", 3, 11);
					wednesday[209] = new Data("��q", "107", 3, 11);
					wednesday[210] = new Data("��q", "B07", 3, 11);
					wednesday[211] = new Data("��q", "403", 3, 11);
					wednesday[212] = new Data("��q", "B02", 3, 11);
					wednesday[213] = new Data("��q", "410", 3, 11);
					
					//�ĤQ�G�`
					wednesday[214] = new Data("��q", "330", 3, 12);
					wednesday[215] = new Data("��q", "108", 3, 12);
					wednesday[216] = new Data("��q", "518", 3, 12);
					wednesday[217] = new Data("��q", "411", 3, 12);
					wednesday[218] = new Data("��q", "501A", 3, 12);
					wednesday[219] = new Data("��q", "511", 3, 12);
					wednesday[220] = new Data("��q", "311", 3, 12);
					wednesday[221] = new Data("��q", "515", 3, 12);
					wednesday[222] = new Data("��q", "107", 3, 12);
					wednesday[223] = new Data("��q", "B07", 3, 12);
					wednesday[224] = new Data("��q", "403", 3, 12);
					wednesday[225] = new Data("��q", "B02", 3, 12);
					wednesday[224] = new Data("��q", "403", 3, 12);
					
					//�ĤQ�T�`
					wednesday[225] = new Data("��q", "330", 3, 13);
					wednesday[226] = new Data("��q", "108", 3, 13);
					wednesday[227] = new Data("��q", "518", 3, 13);
					wednesday[228] = new Data("��q", "411", 3, 13);
					wednesday[229] = new Data("��q", "501A", 3, 13);
					wednesday[230] = new Data("��q", "511", 3, 13);
					wednesday[231] = new Data("��q", "311", 3, 13);
					wednesday[232] = new Data("��q", "515", 3, 13);
					wednesday[233] = new Data("��q", "107", 3, 13);
					
					//thursday
					//�Ĥ@�`
					thursday[0] = new Data("��q", "410", 4, 1);
					thursday[1] = new Data("��q", "306", 4, 1);
					thursday[2] = new Data("��q", "104", 4, 1);
					thursday[3] = new Data("��q", "403", 4, 1);
					thursday[4] = new Data("��q", "B03", 4, 1);
					thursday[5] = new Data("��q", "330", 4, 1);
					thursday[6] = new Data("��q", "404", 4, 1);
					thursday[7] = new Data("��q", "102", 4, 1);
					thursday[8] = new Data("��q", "107", 4, 1);
					
					//�ĤG�`
					thursday[9] = new Data("��q", "B06", 4, 2);
					thursday[10] = new Data("��q", "410", 4, 2);
					thursday[11] = new Data("��q", "402", 4, 2);
					thursday[12] = new Data("��q", "306", 4, 2);
					thursday[13] = new Data("��q", "311", 4, 2);
					thursday[14] = new Data("��q", "205", 4, 2);
					thursday[15] = new Data("��q", "403", 4, 2);
					thursday[16] = new Data("��q", "B04", 4, 2);
					thursday[17] = new Data("��q", "104", 4, 2);
					thursday[18] = new Data("��q", "103", 4, 2);
					thursday[19] = new Data("��q", "235", 4, 2);
					thursday[20] = new Data("��q", "102", 4, 2);
					thursday[21] = new Data("��q", "403", 4, 2);
					thursday[22] = new Data("��q", "B03", 4, 2);
					thursday[23] = new Data("��q", "330", 4, 2);
					thursday[24] = new Data("��q", "312", 4, 2);
					thursday[25] = new Data("��q", "318", 4, 2);
					thursday[26] = new Data("��q", "404", 4, 2);
					thursday[27] = new Data("��q", "418", 4, 2);
					thursday[28] = new Data("��q", "409", 4, 2);
					thursday[29] = new Data("��q", "107", 4, 2);
					thursday[30] = new Data("��q", "504", 4, 2);
					thursday[31] = new Data("��q", "515", 4, 2);
					thursday[32] = new Data("��q", "411", 4, 2);
					thursday[33] = new Data("��q", "515", 4, 2);
					
					//�ĤT�`
					thursday[34] = new Data("��q", "B06", 4, 3);
					thursday[35] = new Data("��q", "402", 4, 3);
					thursday[36] = new Data("��q", "306", 4, 3);
					thursday[37] = new Data("��q", "311", 4, 3);
					thursday[38] = new Data("��q", "205", 4, 3);
					thursday[39] = new Data("��q", "404", 4, 3);
					thursday[40] = new Data("��q", "504", 4, 3);
					thursday[41] = new Data("��q", "103", 4, 3);
					thursday[42] = new Data("��q", "235", 4, 3);
					thursday[43] = new Data("��q", "102", 4, 3);
					thursday[44] = new Data("��q", "B03", 4, 3);
					thursday[45] = new Data("��q", "104", 4, 3);
					thursday[46] = new Data("��q", "330", 4, 3);
					thursday[47] = new Data("��q", "312", 4, 3);
					thursday[48] = new Data("��q", "318", 4, 3);
					thursday[49] = new Data("��q", "418", 4, 3);
					thursday[50] = new Data("��q", "409", 4, 3);
					thursday[51] = new Data("��q", "107", 4, 3);
					thursday[52] = new Data("��q", "515", 4, 3);
					thursday[53] = new Data("��q", "411", 4, 3);
					thursday[54] = new Data("��q", "B02", 4, 3);
					thursday[55] = new Data("��q", "B07", 4, 3);
					thursday[56] = new Data("��q", "B08", 4, 3);
					thursday[57] = new Data("��q", "108", 4, 3);
					thursday[58] = new Data("��q", "410", 4, 3);
					thursday[59] = new Data("��q", "511", 4, 3);
					thursday[60] = new Data("��q", "512", 4, 3);
					
					//�ĥ|�`
					thursday[61] = new Data("��q", "306", 4, 4);
					thursday[62] = new Data("��q", "311", 4, 4);
					thursday[63] = new Data("��q", "205", 4, 4);
					thursday[64] = new Data("��q", "404", 4, 4);
					thursday[65] = new Data("��q", "504", 4, 4);
					thursday[66] = new Data("��q", "235", 4, 4);
					thursday[67] = new Data("��q", "102", 4, 4);
					thursday[68] = new Data("��q", "312", 4, 4);
					thursday[69] = new Data("��q", "318", 4, 4);
					thursday[70] = new Data("��q", "104", 4, 4);
					thursday[71] = new Data("��q", "418", 4, 4);
					thursday[72] = new Data("��q", "409", 4, 4);
					thursday[73] = new Data("��q", "107", 4, 4);
					thursday[74] = new Data("��q", "515", 4, 4);
					thursday[75] = new Data("��q", "411", 4, 4);
					thursday[76] = new Data("��q", "B02", 4, 4);
					thursday[77] = new Data("��q", "B07", 4, 4);
					thursday[78] = new Data("��q", "B08", 4, 4);
					thursday[79] = new Data("��q", "108", 4, 4);
					thursday[80] = new Data("��q", "410", 4, 4);
					thursday[81] = new Data("��q", "511", 4, 4);
					thursday[82] = new Data("��q", "512", 4, 4);
					
					//�Ĥ��`
					thursday[83] = new Data("��q", "330", 4, 5);
					thursday[84] = new Data("��q", "429", 4, 5);
					
					//�Ĥ��`
					thursday[85] = new Data("��q", "429", 4, 6);
					thursday[86] = new Data("��q", "205", 4, 6);
					thursday[87] = new Data("��q", "104", 4, 6);
					thursday[88] = new Data("��q", "248", 4, 6);
					thursday[89] = new Data("��q", "411", 4, 6);
					thursday[90] = new Data("��q", "107", 4, 6);
					thursday[91] = new Data("��q", "108", 4, 6);
					thursday[92] = new Data("��q", "330", 4, 6);
					thursday[93] = new Data("��q", "B06", 4, 6);
					thursday[94] = new Data("��q", "504", 4, 6);
					thursday[95] = new Data("��q", "515", 4, 6);
					thursday[96] = new Data("��q", "102", 4, 6);
					thursday[97] = new Data("��q", "B02", 4, 6);
					thursday[98] = new Data("��q", "B07", 4, 6);
					thursday[99] = new Data("��q", "B08", 4, 6);
					thursday[100] = new Data("��q", "306", 4, 6);
					thursday[101] = new Data("��q", "410", 4, 6);
					
					//�ĤC�`
					thursday[102] = new Data("��q", "104", 4, 7);
					thursday[103] = new Data("��q", "311", 4, 7);
					thursday[104] = new Data("��q", "205", 4, 7);
					thursday[105] = new Data("��q", "248", 4, 7);
					thursday[106] = new Data("��q", "318", 4, 7);
					thursday[107] = new Data("��q", "107", 4, 7);
					thursday[108] = new Data("��q", "108", 4, 7);
					thursday[109] = new Data("��q", "330", 4, 7);
					thursday[110] = new Data("��q", "403", 4, 7);
					thursday[111] = new Data("��q", "533-1", 4, 7);
					thursday[112] = new Data("��q", "503", 4, 7);
					thursday[113] = new Data("��q", "B06", 4, 7);
					thursday[114] = new Data("��q", "504", 4, 7);
					thursday[115] = new Data("��q", "515", 4, 7);
					thursday[116] = new Data("��q", "429", 4, 7);
					thursday[117] = new Data("��q", "102", 4, 7);
					thursday[118] = new Data("��q", "B02", 4, 7);
					thursday[119] = new Data("��q", "B07", 4, 7);
					thursday[120] = new Data("��q", "B08", 4, 7);
					thursday[121] = new Data("��q", "306", 4, 7);
					thursday[122] = new Data("��q", "410", 4, 7);
					
					//�ĤK�`
					thursday[123] = new Data("��q", "311", 4, 8);
					thursday[124] = new Data("��q", "205", 4, 8);
					thursday[125] = new Data("��q", "248", 4, 8);
					thursday[126] = new Data("��q", "501A", 4, 8);
					thursday[127] = new Data("��q", "B07", 4, 8);
					thursday[128] = new Data("��q", "318", 4, 8);
					thursday[129] = new Data("��q", "107", 4, 8);
					thursday[130] = new Data("��q", "B02", 4, 8);
					thursday[131] = new Data("��q", "102", 4, 8);
					thursday[132] = new Data("��q", "502", 4, 8);
					thursday[133] = new Data("��q", "330", 4, 8);
					thursday[134] = new Data("��q", "533-1", 4, 8);
					thursday[135] = new Data("��q", "503", 4, 8);
					thursday[136] = new Data("��q", "103", 4, 8);
					thursday[137] = new Data("��q", "504", 4, 8);
					thursday[138] = new Data("��q", "410", 4, 8);
					thursday[139] = new Data("��q", "B08", 4, 8);
					
					//�ĤE�`
					thursday[140] = new Data("��q", "311", 4, 9);
					thursday[141] = new Data("��q", "248", 4, 9);
					thursday[142] = new Data("��q", "501A", 4, 9);
					thursday[143] = new Data("��q", "B07", 4, 9);
					thursday[144] = new Data("��q", "318", 4, 9);
					thursday[145] = new Data("��q", "107", 4, 9);
					thursday[146] = new Data("��q", "B02", 4, 9);
					thursday[147] = new Data("��q", "102", 4, 9);
					thursday[148] = new Data("��q", "502", 4, 9);
					thursday[149] = new Data("��q", "330", 4, 9);
					thursday[150] = new Data("��q", "533-1", 4, 9);
					thursday[151] = new Data("��q", "503", 4, 9);
					thursday[152] = new Data("��q", "504", 4, 9);
					thursday[153] = new Data("��q", "B06", 4, 9);
					thursday[154] = new Data("��q", "410", 4, 9);
					thursday[155] = new Data("��q", "B08", 4, 9);
					
					//�ĤQ�`
					thursday[156] = new Data("��q", "504", 4, 10);
					thursday[157] = new Data("��q", "501A", 4, 10);
					thursday[158] = new Data("��q", "502", 4, 10);
					thursday[159] = new Data("��q", "330", 4, 10);
					thursday[160] = new Data("��q", "410", 4, 10);
			
					//�ĤQ�@�`
					thursday[161] = new Data("��q", "248", 4, 11);
					thursday[162] = new Data("��q", "401", 4, 11);
					thursday[163] = new Data("��q", "108", 4, 11);
					thursday[164] = new Data("��q", "511", 4, 11);
					thursday[165] = new Data("��q", "504", 4, 11);
					thursday[166] = new Data("��q", "311", 4, 11);
					thursday[167] = new Data("��q", "515", 4, 11);
					thursday[168] = new Data("��q", "107", 4, 11);
					thursday[169] = new Data("��q", "102", 4, 11);
					thursday[170] = new Data("��q", "B08", 4, 11);
					thursday[171] = new Data("��q", "104", 4, 11);
					
					//�ĤQ�G�`
					thursday[172] = new Data("��q", "248", 4, 12);
					thursday[173] = new Data("��q", "401", 4, 12);
					thursday[174] = new Data("��q", "108", 4, 12);
					thursday[175] = new Data("��q", "511", 4, 12);
					thursday[176] = new Data("��q", "504", 4, 12);
					thursday[177] = new Data("��q", "311", 4, 12);
					thursday[178] = new Data("��q", "107", 4, 12);
					thursday[179] = new Data("��q", "102", 4, 12);
					thursday[180] = new Data("��q", "B08", 4, 12);
					thursday[181] = new Data("��q", "104", 4, 12);
					
					//�ĤQ�T�`
					thursday[182] = new Data("��q", "248", 4, 13);
					thursday[183] = new Data("��q", "401", 4, 13);
					thursday[184] = new Data("��q", "108", 4, 13);
					thursday[185] = new Data("��q", "511", 4, 13);
					thursday[186] = new Data("��q", "504", 4, 13);
					thursday[187] = new Data("��q", "311", 4, 13);
					thursday[188] = new Data("��q", "104", 4, 13);
					
					//�ĤQ�|�`
					thursday[189] = new Data("��q", "104", 4, 14);
					
					//friday
					//�Ĥ@�`
					friday[0] = new Data("��q", "402", 5, 1);
					friday[1] = new Data("��q", "504", 5, 1);
					friday[2] = new Data("��q", "102", 5, 1);
					friday[3] = new Data("��q", "410", 5, 1);
					friday[4] = new Data("��q", "403", 5, 1);
					friday[5] = new Data("��q", "306", 5, 1);
					friday[6] = new Data("��q", "103", 5, 1);
					friday[7] = new Data("��q", "104", 5, 1);
					friday[8] = new Data("��q", "B03", 5, 1);
					friday[9] = new Data("��q", "B07", 5, 1);
					friday[10] = new Data("��q", "B02", 5, 1);
					friday[11] = new Data("��q", "B08", 5, 1);
					
					//�ĤG�`
					friday[12] = new Data("��q", "402", 5, 2);
					friday[13] = new Data("��q", "504", 5, 2);
					friday[14] = new Data("��q", "502", 5, 2);
					friday[15] = new Data("��q", "234", 5, 2);
					friday[16] = new Data("��q", "102", 5, 2);
					friday[17] = new Data("��q", "410", 5, 2);
					friday[18] = new Data("��q", "501A", 5, 2);
					friday[19] = new Data("��q", "330", 5, 2);
					friday[20] = new Data("��q", "306", 5, 2);
					friday[21] = new Data("��q", "103", 5, 2);
					friday[22] = new Data("��q", "104", 5, 2);
					friday[23] = new Data("��q", "B06", 5, 2);
					friday[24] = new Data("��q", "107", 5, 2);
					friday[25] = new Data("��q", "234", 5, 2);
					friday[26] = new Data("��q", "B07", 5, 2);
					friday[27] = new Data("��q", "B02", 5, 2);
					friday[28] = new Data("��q", "B08", 5, 2);
					
					//�ĤT�`
					friday[29] = new Data("��q", "402", 5, 3);
					friday[30] = new Data("��q", "502", 5, 3);
					friday[31] = new Data("��q", "504", 5, 3);
					friday[32] = new Data("��q", "234", 5, 3);
					friday[33] = new Data("��q", "102", 5, 3);
					friday[34] = new Data("��q", "501A", 5, 3);
					friday[35] = new Data("��q", "330", 5, 3);
					friday[36] = new Data("��q", "104", 5, 3);
					friday[37] = new Data("��q", "306", 5, 3);
					friday[38] = new Data("��q", "107", 5, 3);
					friday[39] = new Data("��q", "418", 5, 3);
					friday[40] = new Data("��q", "103", 5, 3);
					friday[41] = new Data("��q", "B08", 5, 3);
					
					//�ĥ|�`
					friday[42] = new Data("��q", "402", 5, 4);
					friday[43] = new Data("��q", "502", 5, 4);
					friday[44] = new Data("��q", "234", 5, 4);
					friday[45] = new Data("��q", "403", 5, 4);
					friday[46] = new Data("��q", "102", 5, 4);
					friday[47] = new Data("��q", "501A", 5, 4);
					friday[48] = new Data("��q", "330", 5, 4);
					friday[49] = new Data("��q", "104", 5, 4);
					friday[50] = new Data("��q", "306", 5, 4);
					friday[51] = new Data("��q", "107", 5, 4);
					friday[52] = new Data("��q", "418", 5, 4);
					friday[53] = new Data("��q", "103", 5, 4);
					friday[54] = new Data("��q", "B08", 5, 4);
					
					//�Ĥ��`
					friday[55] = new Data("��q", "418", 5, 5);
					
					//�Ĥ��`
					friday[56] = new Data("��q", "403", 5, 6);
					friday[57] = new Data("��q", "104", 5, 6);
					friday[58] = new Data("��q", "102", 5, 6);
					friday[59] = new Data("��q", "306", 5, 6);
					friday[60] = new Data("��q", "103", 5, 6);
					friday[61] = new Data("��q", "B02", 5, 6);
					friday[62] = new Data("��q", "515", 5, 6);
					
					//�ĤC�`
					friday[63] = new Data("��q", "403", 5, 7);
					friday[64] = new Data("��q", "102", 5, 7);
					friday[65] = new Data("��q", "104", 5, 7);
					friday[66] = new Data("��q", "402", 5, 7);
					friday[67] = new Data("��q", "103", 5, 7);
					friday[68] = new Data("��q", "107", 5, 7);
					friday[69] = new Data("��q", "108", 5, 7);
					friday[70] = new Data("��q", "410", 5, 7);
					friday[71] = new Data("��q", "411", 5, 7);
					friday[72] = new Data("��q", "306", 5, 7);
					friday[73] = new Data("��q", "511", 5, 7);
					friday[74] = new Data("��q", "B02", 5, 7);
					friday[75] = new Data("��q", "515", 5, 7);
					
					//�ĤK�`
					friday[76] = new Data("��q", "512", 5, 8);
					friday[77] = new Data("��q", "515", 5, 8);
					friday[78] = new Data("��q", "B06", 5, 8);
					friday[79] = new Data("��q", "107", 5, 8);
					friday[80] = new Data("��q", "B02", 5, 8);
					
					//�ĤE�`
					friday[81] = new Data("��q", "512", 5, 9);
					friday[82] = new Data("��q", "515", 5, 9);
					friday[83] = new Data("��q", "B06", 5, 9);
					friday[84] = new Data("��q", "107", 5, 9);
				
					//�ĤQ�`
					friday[85] = new Data("��q", "306", 5, 10);
					friday[86] = new Data("��q", "409", 5, 10);
					
					//�ĤQ�@�`
					friday[87] = new Data("��q", "306", 5, 11);
					friday[88] = new Data("��q", "409", 5, 11);
					
					//�ĤQ�G�`
					friday[89] = new Data("��q", "409", 5, 12);
					
					//�ĤQ�T�`
					friday[90] = new Data("��q", "402", 5, 13);
					friday[91] = new Data("��q", "107", 5, 13);
					
					//�ĤQ�|�`
					friday[92] = new Data("��q", "402", 5, 14);
					friday[93] = new Data("��q", "107", 5, 14);
       				
			       	int day;
					int num;
					int rest;
					String building;
					String classroom;
					int i=0, j=0, way;
					Data temp = new Data();
					
					Data[] useClassroom = new Data[100];
					System.out.println("�{�ҪűЫ�\n");
					System.out.println("�п�ܷj�M�覡:1.�j�M�t�]2.�j�M�ЫǥN�X");
					
					way = keyboard.nextInt();
					keyboard.nextLine();
					switch(way) {
					case 1:
						System.out.println("��ܤ��: 1.�P���@  2.�P���G  3.�P���T  4.�P���|  5.�P����");
						day = keyboard.nextInt();
						keyboard.nextLine();
						
						System.out.println("��ܲĴX�`:1.�Ĥ@�` 2.�ĤG�` 3.�ĤT�` 4.�ĥ|�`  5.�Ĥ��`  6.�Ĥ��` 7.�ĤC�` 8.�ĤK�` 9.�ĤE�` 10.�ĤQ�` 11.�ĤQ�@�` 12.�ĤQ�G�` 13.�ĤQ�T�` 14.�ĤQ�|�`");
						num = keyboard.nextInt();
						keyboard.nextLine();
						
						System.out.println("��J�t�]²��(EX:�u���]->�u�A��q�]->��q): ");
						building = keyboard.nextLine();
						
						
						if(day==1) {//Monday
							for(i=0, j=0; i<monday.length; i++) {
								if(monday[i].getClassNum()==num && building.equals(monday[i].getBuilding())) {
									//�ŦX�`���]�ŦX�ؿv�� 
									useClassroom[j] = monday[i];
									j++;
								}
							}
						}
						else if(day==2) {//TuesDay
							for(i=0, j=0; i<tuesday.length; i++) {
								if(tuesday[i].getClassNum()==num && building.equals(tuesday[i].getBuilding())) {
									useClassroom[j] = tuesday[i];
									j++;
								}
							}
						}
						else if(day==3) {//Wednesday
							for(i=0, j=0; i<wednesday.length; i++) {
								if(wednesday[i].getClassNum()==num && building.equals(wednesday[i].getBuilding())) {
									useClassroom[j] = wednesday[i];
									j++;
								}
							}
						}
						else if(day==4) {//Thursday
							for(i=0, j=0; i<thursday.length; i++) {
								if(thursday[i].getClassNum()==num && building.equals(thursday[i].getBuilding())) {
									useClassroom[j] = thursday[i];
									j++;
								}
							}
						}
						else if(day==5) {//Friday
							for(i=0, j=0; i<friday.length; i++) {
								if(friday[i].getClassNum()==num && building.equals(friday[i].getBuilding())) {
									useClassroom[j] = friday[i];
									j++;
								}
							}
						}
						
						for(i=0; i<j-1; i++) {//sorting
							for(int l=0; l<j-1-i; l++) {
								//��ӳ��OB�N����ЫǶ���
								if(useClassroom[l].getRoom().charAt(0)=='B'&&useClassroom[l+1].getRoom().charAt(0)=='B') {
									
									for(int k=1; k<useClassroom[l].getRoom().length(); k++) {
										if((int)useClassroom[l].getRoom().charAt(k)!=(int)useClassroom[l+1].getRoom().charAt(k)) {
											if((int)useClassroom[l].getRoom().charAt(k)>(int)useClassroom[l+1].getRoom().charAt(k)) {
												temp = useClassroom[l];
												useClassroom[l] = useClassroom[l+1];
												useClassroom[l+1] = temp;
												break;
											}
											else if((int)useClassroom[l].getRoom().charAt(k)<(int)useClassroom[l+1].getRoom().charAt(k)) {
												break;
											}
										}
									}
								}
								//�e���OB��O
								else if(useClassroom[l].getRoom().charAt(0)!='B'&&useClassroom[l+1].getRoom().charAt(0)=='B') {
									temp = useClassroom[l];
									useClassroom[l] = useClassroom[l+1];
									useClassroom[l+1] = temp;
								}
								else if(useClassroom[l].getRoom().charAt(0)!='B'&&useClassroom[l+1].getRoom().charAt(0)!='B') {
									for(int k=0; k<useClassroom[l].getRoom().length(); k++) {
										if((int)useClassroom[l].getRoom().charAt(k)!=(int)useClassroom[l+1].getRoom().charAt(k)) {
											if((int)useClassroom[l].getRoom().charAt(k)>(int)useClassroom[l+1].getRoom().charAt(k)) {
												temp = useClassroom[l];
												useClassroom[l] = useClassroom[l+1];
												useClassroom[l+1] = temp;
												break;
											}
											else if((int)useClassroom[l].getRoom().charAt(k)<(int)useClassroom[l+1].getRoom().charAt(k)) {
												break;
											}
										}
									}
								}
							}
						}
						String use;
						for(i=0; i<j-1; i++) {//�����
							use = useClassroom[i].getRoom();
							if(use.equals(useClassroom[i+1].getRoom())) {
								continue;
							}
							System.out.println(useClassroom[i]);
						}
						if(useClassroom[0]==null) {
							System.out.println("No classroom in this building is using.");
						}
						else {
							System.out.println("These classroom above are using.");
						}
						break;
					case 2:
						System.out.println("��ܤ��: 1.�P���@  2.�P���G  3.�P���T  4.�P���|  5.�P����");
						day = keyboard.nextInt();
						keyboard.nextLine();
						
						System.out.println("��ܲĴX�`:1.�Ĥ@�` 2.�ĤG�` 3.�ĤT�` 4.�ĥ|�`  5.�Ĥ��`  6.�Ĥ��` 7.�ĤC�` 8.�ĤK�` 9.�ĤE�` 10.�ĤQ�` 11.�ĤQ�@�` 12.�ĤQ�G�` 13.�ĤQ�T�` 14.�ĤQ�|�`");
						num = keyboard.nextInt();
						keyboard.nextLine();
						
						System.out.println("��J�t�]²��(EX:�u���]->�u�A��q�]->��q): ");
						building = keyboard.nextLine();
						System.out.println("��J�ЫǥN�X: ");
						classroom = keyboard.nextLine();
						
						if(day==1) {//Monday
							for(i=0; i<monday.length; i++) {
								if(building.equals(monday[i].getBuilding())) {
									
									System.out.printf("%d\n", monday[i].getClassNum());
									if(classroom.equals(monday[i].getRoom())) {
										//�ŦX�ؿv�A�ŦX�Ы�
										System.out.println("Sorry, the classroom is using.");
										break;
									}
									else if(i==monday.length-1 && !(classroom.equals(monday[i].getRoom()))) {
										System.out.println("The classroom is EMPTY, Thanks for using!");
									}
								}
							}
						}
						else if(day==2) {//TuesDay
							for(i=0; i<tuesday.length; i++) {
								if(building.equals(tuesday[i].getBuilding())) {
									System.out.printf("%d\n", tuesday[i].getClassNum());
									if(classroom.equals(tuesday[i].getRoom())) {
										System.out.println("Sorry, the classroom is using.");
										break;
									}
									else if(i==tuesday.length-1 && !(classroom.equals(tuesday[i].getRoom()))) {
										System.out.println("The classroom is EMPTY, Thanks for using!");
									}
								}
							}
						}
						else if(day==3) {
							for(i=0; i<wednesday.length; i++) {
								if(building.equals(wednesday[i].getBuilding())) {
									System.out.printf("%d\n", wednesday[i].getClassNum());
									if(classroom.equals(wednesday[i].getRoom())) {
										System.out.println("Sorry, the classroom is using.");
										break;
									}
									else if(i==wednesday.length-1 && !(classroom.equals(wednesday[i].getRoom()))) {
										System.out.println("The classroom is EMPTY, Thanks for using!");
									}
								}
							}
						}
						else if(day==4) {
							
							for(i=0; i<thursday.length; i++) {
								if(building.equals(thursday[i].getBuilding())) {
									System.out.printf("%d\n", thursday[i].getClassNum());
									
									if(classroom.equals(thursday[i].getRoom())) {
										System.out.println("Sorry, the classroom is using.");
										break;
									}
									else if(i==thursday.length-1 && !(classroom.equals(thursday[i].getRoom()))) {
										System.out.println("The classroom is EMPTY, Thanks for using!");
									}
								}
							}
						}
						else if(day==5) {
							
							for(i=0; i<friday.length; i++) {
								if(building.equals(friday[i].getBuilding())) {
									System.out.printf("%d\n", friday[i].getClassNum());
									if(classroom.equals(friday[i].getRoom())) {
										System.out.println("Sorry, the classroom is using.");
										break;
									}
									else if(i==friday.length-1 && !(classroom.equals(friday[i].getRoom()))) {
										System.out.println("The classroom is EMPTY, Thanks for using!");
									}
								}
							}
						}
						break;
					}
					
					keyboard.close();
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
