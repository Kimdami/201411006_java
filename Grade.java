class Grade{
	void changegrade(double s){
        if(s >= 90 && s <=100){
            System.out.println("Grade is A ");
        }
		else if(s >= 80 && s <90){
            System.out.println("Grade is  B ");
        }
		else if(s >= 70 && s <80){
            System.out.println("Grade is  C ");
        }
		else if(s >= 60 && s <70){
            System.out.println("Grade is  D ");
        }
		else
			System.out.println("Grade is  F ");
    }
    public static void main(String[] args){
    	Grade s = new Grade();
    	s.changegrade(74.9);   
    }
}
