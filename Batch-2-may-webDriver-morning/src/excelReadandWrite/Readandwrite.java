package excelReadandWrite;

public class Readandwrite {

	public static void main(String[] args) {
		
		Xls_Reader wr=new Xls_Reader("./src/exceltest/worksheet.xlsx");
		
		String sname="data";
		
		int count=wr.getRowCount(sname);
		System.out.println(count);
	
		for(int rnum=2;rnum<=count;rnum++)
		{
			String uname=wr.getCellData(sname, "Username", rnum);
			System.out.println(uname);
			
			String pass=wr.getCellData(sname, "Password", rnum);
			System.out.println(pass);
			
			wr.setCellData(sname, "Status", rnum, "dataprinted");
		}

	}

}
