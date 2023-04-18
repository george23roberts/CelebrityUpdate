public class Celebrity{
    
    private int age;
    private int height;
    private String hairColor;
    private String gender;
    private String race;
    private String weight;
    private String job;
    

    public Celebrity(int age, String weight, String hairColor, String gender, String race, int height, String job){
        this.age = age;
        this.height = height;
        this.hairColor = hairColor;
        this.gender = gender;
        this.race = race; 
        this.weight = weight;
        this.job = job;
        



    }
    
    
    public int getAge(){
        return this.age;
    }
    
    
    public int getHeight(){
        return this.height;
    }
    
    public String getHairColor(){
        return this.hairColor;
    }
    public String getGender(){
        return this.gender;
    }
    public String race(){
        return this.race;
    }
    public String weight(){
        return this.weight;
    }
    public String getJob(){
        return this.job;
    }
    

}
