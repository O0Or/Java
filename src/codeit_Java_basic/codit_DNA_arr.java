package codeit_Java_basic;

public class codit_DNA_arr {
	public static void main(String[] args) {
        String dna = "GATCCGCCCGCCTCGGCCTCCCAAAGTGCTGGGATTACAGGTGTGAGCCA"
                + "CCACGCCCGGCTAATTTTTATTTATTTATTTAAAGACAGAGTCTCACTCT"
                + "GTCACTCAGGCTAGAGTGCAGTGGCACCATCTCAGCTCACTGCAGCCTTG"
                + "ACCTCCCTGGGCTCCGGTGATTTCACCCTCCCAAGTAGCTAGGACTACAG"
                + "GCACATGCCACGACACCCAGCTAATTTTTTATTTTCTGTGAAGTCAAGGT"
                + "CTTGCTACGTTGCCCATGCTGGTATCAAACCCCTGGGCTCAATCAATCCT"
                + "TCCACCTCAGCCTCCCCAAGTATTGGGGTTACAGGCATGAGCTACCACAC"
                + "TCAGCCCTAGCCTACTTGAAACGTGTTCAGAGCATTTAAGTTACCCTACA"
                + "GTTGGGCAAAGTCATCTAACACAAAGCCCTTTTTATAGTAATAAAATGTT"
                + "GTATATCTCATGTGATTTATTGAATATTGTTACTGAAAGTGAGAAACAGC"
                + "ATGGTTGCATGAAAGGAGGCACAGTCGAGCCAGGCACAGCCTGGGCGCAG"
                + "AGCGAGACTCAAAAAAAGAAAAGGCCAGGCGCACTGGCTCACGCCTGTAA"
                + "TCCCAGCATTTCGGGAGGCTGAGGCGGGTGGATCACCTGAGGTCAGGAGT"
                + "TCAAGACCAGCCTAGCCAACATGGTGAAACCCCGTCTCTACTAAAATACA"
                + "AAAATTAACCGGGCGTGATGGCAGGTGCCTGTAATCCCAGCTACTTGGGA"
                + "GGCTGAGGCAGGAGAATCGCTTGAACCAGGAGGCGGAGGTTGCAGGGAGC"
                + "CAAGATGGCGCCACTGCACTCCAGCCTGGGCGATAGAGTGAGACTCCGTC"
                + "TCAGAAAAAAAAGAAAAGAAACGAGGCACAGTCGCATGCACATGTAGTCC"
                + "CAGTTACTTGAGAGGCTAAGGCAGGAGGATCTCTTGAGCCCAAGAGTTTG"
                + "AGTCCAGCCTGAACAACATAGCAAGACATCATCTCTAAAATTTAAAAAAG"
                + "GGCCGGGCACAGTGGCTCACACCTGTAATCCCAGCACTTTGGGAGGTGGA"
                + "GGTGGGTAGATCACCTGACGTCAGGAGTTGGAAACCAGCCTGGCTAACAT";
     char[] charArray = dna.toCharArray();
     int cnt1 = 0;
     int cnt2 = 0;
     int cnt3 = 0;
     
     int i;
     char[] dnaArray = new char[4];  // dna�˻��� 4ĭ¥�� �迭 ����
     for(i = 0;i<charArray.length-3;i++)  // ������ ACAT������ �˻��ؾ��ϴϱ� ����-3����
     {
    	
         dnaArray[0] = charArray[i];
         dnaArray[1] = charArray[i + 1];
         dnaArray[2] = charArray[i + 2];
         dnaArray[3] = charArray[i + 3];
         
//         for (int i = 0; i < charArray.length - 3; i++) {
//         for (int j = 0; j < current.length ; j++) {
//             current[j] = charArray[i + j];
//         } ����for�� ������ ��밡��
         
         String dnaString = new String(dnaArray); //���� 4���� ������ ���ڿ��� ����
  
    	 switch (dnaString){  // ����ġ�� ��, ī��Ʈ
    	 case "TAGG":
    		 cnt1++;
    	 break;
    	 case "CCAG":
    		 cnt2++;
    	 break;
    	 case "AGCC":
    		 cnt3++;
    	 break;
    	 }

     }
//         if(stringFromCharArr.equals("TAGG"))
//         cnt1++;
//         else if(stringFromCharArr.equals("CCAG"))
//         cnt2++;
//         else if(stringFromCharArr.equals("AGCC"))
//         cnt3++;
//         

 System.out.print("TAGG: ");
 System.out.println(cnt1);
 System.out.print("CCAG: ");
 System.out.println(cnt2);
 System.out.print("AGCC: ");
 System.out.println(cnt3);
	}
}  	


