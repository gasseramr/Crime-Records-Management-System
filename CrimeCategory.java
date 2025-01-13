
class CrimeCategory {
    private String categoryID;
    private String name;
    private String description;
    private String catogoryName;

    public CrimeCategory(String categoryID, String name, String description, String catogoryName) {
        this.categoryID = categoryID;
        this.name = name;
        this.description = description;
        this.catogoryName = catogoryName ;
    }

    public String getCategoryID() {
        return categoryID;
    }

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getCatogoryName(){
        return catogoryName;
    }
    public String getDescription() {
        return description;
    }
}