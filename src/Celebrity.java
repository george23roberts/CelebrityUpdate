public class Celebrity{
    
    private String name;
    private String age;
    private String height;
    private String hairColor;
    private String gender;
    private String race;
    private String weight;
    private String job;
    

    public Celebrity(String age, String weight, String hairColor, String gender, String race, String height, String job, String Name){
        this.name = Name;
        this.age = age;
        this.height = height;
        this.hairColor = hairColor;
        this.gender = gender;
        this.race = race; 
        this.weight = weight;
        this.job = job;
        



    }
    
    public String getName(){
        return this.name;
    }
    public String getAge(){
        return this.age;
    }
    public String getHeight(){
        return this.height;
    }
    
    public String getHairColor(){
        return this.hairColor;
    }
    public String getGender(){
        return this.gender;
    }
    public String getRace(){
        return this.race;
    }
    public String getWeight(){
        return this.weight;
    }
    public String getJob(){
        return this.job;
    }


  
    

}
