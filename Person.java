public abstract class Person {
    private String name;
    private int age;
    private boolean isMale;
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public int getAge() {
        return age;
    }
 
    public void setAge(int age) {
        this.age = age;
    }
 
    public boolean isMale() {
        return isMale;
    }
 
    public void setMale(boolean isMale) {
        this.isMale = isMale;
    }
 
    public Person(String name, int age, boolean isMale) {
        this.name = name;
        this.age = age;
        this.isMale = isMale;
    }
    
    public Person(){}

    public String toJson() {
        return "{\"name\":" + "\"" + name + "\"" + "," + "\"age\":" + "\"" + age + "\"" + ","
                + "\"isMale\":" + isMale + "}";
    }

    public void writeToFile(String filePath) throws IOException {
        Writer writer = null;

        try {
            writer = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream(filePath), "utf-8"));
            writer.write(this.toJson());
        } finally {
            writer.close();
        }
    }

    public void readFromFile(String url) {
        try {
            FileReader reader = new FileReader(url);
            BufferedReader in = new BufferedReader(reader);
            String string;
            while ((string = in.readLine()) != null) {
                System.out.println(string);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

      public void FromJson(String filePath) {
      JSONParser parser = new JSONParser();

       try {
         Object obj = this.getParser().parse(new FileReader(filePath));
           JSONObject jsonObject = (JSONObject) obj;
           
           String name = (String) jsonObject.get("name");
           Long age = (Long) jsonObject.get("age");
           boolean isMale = (boolean) jsonObject.get("isMale");

           this.setName(name);
           this.setAge(age.intValue());
           this.setIsMale(isMale);
           System.out.println("\n--------------------------\n" + "Студент " + name + "\n Bік:" + age +"\n");


        } catch (Exception e) {
        e.printStackTrace();
        }
   }
}
