import javax.swing.JOptionPane;

public class Main {
	
	
	// ====================WARNING: COPYRIGHT BY NAUFAL AZIM 2021 FINAL EXAM SEM 1 FUNDAMENTAL OF PROGRAMMING (JAVA)=================================== 
	
	
	
	private static String name;
	private static int id = 300000;

	public static void main(String[] args) {
		// Student Name - Array (DONE)
		// Tuition Level - SPM, PT3, UPSR
		// Number of subjects to register
		// Proses: Calculate Fees
		// Display register number  (DONE)
		
		//Attributes: 
		String tuition_level;
		String tuition_option;
		String subjectString;
		
		int package_level = 0;
		int package_class = 0;
		int total_subject = 0;
		double payment = 0;
		
		
// ==============================================Nama pelajar & Nombor register:=============================================================================
		
		String[] name = new String[5];
		String entry;
		for(int count = 0; count < 5; ++count) {
			entry = JOptionPane.showInputDialog(null, "Masukkan Nama Pelajar");
			name[count] = entry;
			id++;
			
			
			
			
// =================================================Sistem Pemilihan Level Exam:===============================================================================
			
			
			tuition_level = JOptionPane.showInputDialog("Pilihan Level Exam:\n 1-UPSR\n 2-PT3\n 3-SPM");
	        package_level = Integer.parseInt(tuition_level);
		
			
			
// ======================================================Pemilihan PACKAGE KELAS PART UPSR============================================================================
	        
			
			 if (package_level == 1) {
		        	tuition_option = JOptionPane.showInputDialog("Pilih Package Kelas:\n 1- Normal\n 2- VIP\n 3- Premium Tutor");
		        	package_class = Integer.parseInt(tuition_option);
		        	
		        	
		        	if(package_class == 1) {
		        		subjectString = JOptionPane.showInputDialog("Berapa Subject Pelajar Ingin Berdaftar: ");
		        		total_subject = Integer.parseInt(subjectString);
		        	} else if (package_class == 2) {
		        		subjectString = JOptionPane.showInputDialog(
		                        "Berapa Subject Pelajar Ingin Berdaftar: ");
		                total_subject = Integer.parseInt(subjectString);
		        	}else if(package_class == 3) {
		        		subjectString = JOptionPane.showInputDialog(
		                        "Berapa Subject Pelajar Ingin Berdaftar: ");
		                total_subject = Integer.parseInt(subjectString);
		        	} else
		                JOptionPane.showMessageDialog(null, "MAKLUMAT TIADA DALAM DATABASE", "Error Message",
		                        JOptionPane.ERROR_MESSAGE);
		   }
			
			
			
			
			
//================================================================Pemilihan PACKAGE KELAS PART PT3================================================================================
			
			 else if (package_level == 2){
		        	tuition_option = JOptionPane.showInputDialog("Pilih Package Kelas:\n 1- Normal\n 2- VIP\n 3- Premium Tutor");
		            package_class = Integer.parseInt(tuition_option);

		            if (package_class == 1){
		                subjectString = JOptionPane.showInputDialog("Berapa Subject Pelajar Ingin Berdaftar: ");
		                total_subject = Integer.parseInt(subjectString);
		            } else if (package_class == 2) {
		                subjectString = JOptionPane.showInputDialog(
		                        "Berapa Subject Pelajar Ingin Berdaftar: ");
		                total_subject = Integer.parseInt(subjectString);
		            } else if (package_class == 3) {
		                subjectString = JOptionPane.showInputDialog(
		                        "Berapa Subject Pelajar Ingin Berdaftar: ");
		                total_subject = Integer.parseInt(subjectString);
		            } else
		                JOptionPane.showMessageDialog(null, "MAKLUMAT TIADA DALAM DATABASE", "Error Message",
		                        JOptionPane.ERROR_MESSAGE);

		        }
		        
			
			
//================================================================Pemilihan PACKAGE KELAS PART SPM================================================================================
			
			 else if (package_level == 3) {
		        	tuition_option = JOptionPane.showInputDialog("Pilih Package Kelas:\n 1- Normal\n 2- VIP\n 3- Premium Tutor");
		            package_class = Integer.parseInt(tuition_option);
		            
		            if (package_class == 1) {
		            	subjectString = JOptionPane.showInputDialog("Berapa Subject Pelajar Ingin Berdaftar: ");
		                total_subject = Integer.parseInt(subjectString);
		            }else if (package_class == 2) {
		            	subjectString = JOptionPane.showInputDialog("Berapa Subject Pelajar Ingin Berdaftar: ");
		                total_subject = Integer.parseInt(subjectString);
		            }else if (package_class == 3) {
		            	subjectString = JOptionPane.showInputDialog("Berapa Subject Pelajar Ingin Berdaftar: ");
		                total_subject = Integer.parseInt(subjectString);
		            }else
		            	 JOptionPane.showMessageDialog(null, "MAKLUMAT TIADA DALAM DATABASE", "Error Message",
		                         JOptionPane.ERROR_MESSAGE);
		        }
			 
			 
			 
			 
			
			
//=========================================================================== Proses Calculation:=============================================================================================
			 
			 
			
			 if (package_level == 1 && package_class == 1)
		            payment = 30; 
		        else if (package_level == 1 && package_class == 2)
		            payment = 50;
		        else if (package_level == 1 && package_class == 3)
		            payment = 90;
		        else if (package_level == 2 && package_class == 1)
		            payment = 40;
		        else if (package_level == 2 && package_class == 2)
		            payment = 60;
		        else if (package_level == 2 && package_class == 3)
		            payment = 80;
		        else if (package_level == 3 && package_class == 1)
		            payment = 50;
		        else if (package_level == 3 && package_class == 2)
		            payment = 70;
		        else if (package_level == 3 && package_class == 3)
		            payment = 90;
		        
		        else
		            System.out.println("MAKLUMAT TIADA DALAM DATABASE");
			   
			
			// Result pada output:
			System.out.println("Nama Pelajar Baru                                     : " +name[count]);
			System.out.println("Nombor Pendaftaran Pelajar                            : "+id);
			System.out.println("Pilihan peperiksaan (1)UPSR (2)PT3  (3)SPM            :" +package_level);
			System.out.println("Pilihan Package Kelas (1)NORMAL (2)VIP (3)PREMIUM     :" +package_class);
			System.out.println("Bayaran Pelajar Dikenakan                             : RM " + total_subject * payment);

		}

		
		
	} // Penutup
}
