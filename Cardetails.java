package test1;

import java.util.ArrayList;

public class Cardetails {

	public static void main(String[] args) {
		Cars c1=new Cars("2 Lakhs","Alto","Maruti");
		Cars c2=new Cars("5 Lakhs","Swift","Maruti");
		Cars c3=new Cars("12 Lakhs","S class","Mercedes");
		Cars c4=new Cars("1 crore","gallarado","Lamborgini");
		 Showroom sh=new Showroom();
		sh.setSname("ION motors");
		ArrayList<Cars> cars=new ArrayList<>();
		cars.add(c1);
		cars.add(c2);
		cars.add(c3);
		cars.add(c4);
		System.out.println(sh.getSname());
		ArrayList<Cars> cr= sh.getCars();
    try{
		for(Cars a:cr)
		{
		System.out.println(a.getCarprice()+" "+a.getCarname()+" "+a.getCarcompany());
         }
        }
    catch(Exception e){
    	e.printStackTrace();
		}

		

	}
	}

