class Student extends Person{
	private int[] testScores;
    
    Student(String firstName, String lastName, int identification, int[] scores){
       super(firstName, lastName, identification);
       this.testScores = scores;

    }
    
    public char calculate(){
        double average = 0;
        int numScores=0;
        for(int testScore: testScores){
            average+=testScore;
            numScores++;
        }
        average = average/numScores;
        if(average>=90) return 'O';
        else if(average>=80) return 'E';
        else if(average>=70) return 'A';
        else if(average>=55) return 'P';
        else if(average>=40) return 'D';
        else return 'T';
    }
   
}