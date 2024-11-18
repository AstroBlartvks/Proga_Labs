public class Raft extends Transport{
    public Raft(String title) {
        super(title);
    }

    @Override
    public void sail() {
        System.out.println("На плоту плывут: ");
        for (Entity entity: this.entities){
            System.out.println("\t* "+entity.stats.getName());
        }
    }
}
