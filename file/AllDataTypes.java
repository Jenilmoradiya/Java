package com.file;

import java.io.*;

 class AllDataTypes implements Serializable {

		int id;
		String name;
		float marks;
		
		AllDataTypes(int id, String name, float marks){
			this.id=id;
			this.name=name;
			this.marks=marks;
		}
		
		public String toString() {
			return "id ;"+this.id +"name :"+this.name +"marks :"+this.marks;
		}

	}
         class SerializableDemo{
        public static void main(String[] args)throws Exception {
        	    AllDataTypes s=new AllDataTypes(1,"Jenil", 90);
				FileOutputStream f=new FileOutputStream("new");
				ObjectOutputStream oos= new ObjectOutputStream(f);
				oos.writeObject(s);
				f.flush();
				f.close();
				System.out.println("File made.");
				
			
        }
}
