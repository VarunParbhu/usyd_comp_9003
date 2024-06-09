import java.util.List;
import java.util.ArrayList;
public class Gardener {
	public void removeUndesirables(List<Plant> garden){
		List<Plant> toRemove = new ArrayList<Plant>();

		for (Plant p: garden){
			if(p.isWeed() || !p.isAlive()){
				p.uproot();
				toRemove.add(p);
			}
		}

		for (Plant p: toRemove){
			if(garden.contains(p)){
				garden.remove(p);
			}
		}
	return;
	}

	public void uprootWeeds(List<Plant> garden){
		for (Plant p: garden){
			if(p.isWeed()){
				p.uproot();
			}
		}
		return;
	}

	
	public static void main(String[] args) {
		// Use this for your own tests
		List<Plant> plantList = new ArrayList<Plant>();
		Plant p1 = new Plant(11.2,"cactus");
		Plant p2 = new Weed(12,"grass");

		plantList.add(p1);
		plantList.add(p2);

		System.out.println(p2.isWeed());
		System.out.println(plantList);

		Gardener gardener = new Gardener();
		gardener.removeUndesirables(plantList);
		System.out.println(plantList);
		
	}
}
