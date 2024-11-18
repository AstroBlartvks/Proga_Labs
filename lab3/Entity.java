
public abstract class Entity {
    protected EntityStats stats;

    public abstract void voice();
    public abstract int hashCode();
    public EntityStats getStats(){
        return this.stats;
    }
}
