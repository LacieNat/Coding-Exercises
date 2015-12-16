public interface ISet {
  public boolean add(String name) throws IndexOutOfBoundsException;
  public ISet intersection(ISet otherSet);
  public int size();
  public String[] getNames();
}
