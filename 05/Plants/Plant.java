public class Plant {
	private boolean alive=true;
	private boolean uprooted;
    private double height;
    private String species;

    public Plant(double height, String species){
        this.height = height;
        this.species = species;
    }

    public boolean isAlive(){
        return alive;
    }

    public void kill(){
        if(alive){
            alive = false;
        }
    }

    public double getHeight(){
        return height;
    }

    public String getSpecies(){
        return species;
    }

    public boolean uprooted(){
        return uprooted;
    }

    public void uproot(){
        uprooted=true;
        return;
    }

    public boolean isWeed(){
        return false;
    }

    @Override
    public boolean equals(Object obj){
        Plant newPlant = (Plant) obj;
        if(this.alive==newPlant.isAlive() &&
            this.species.equals(newPlant.getSpecies()) &&
            this.height == newPlant.height &&
            this.uprooted == newPlant.uprooted()
        ) {
            return true;
        } else {
            return false;
        }
    }

}
