
public record EntityStats(
        String name,
        EntityTypes type
){
    public String getName(){
        return this.name;
    }
    public EntityTypes getType(){
        return this.type;
    }
}
