package bunchbycycles;

public class Main {
  static class CountsByUsage {
    public int lowCount = 0;
    public int mediumCount = 0;
    public int highCount = 0;
  };

  static CountsByUsage countBatteriesByUsage(int[] cycles) {
    CountsByUsage counts = new CountsByUsage();
    //count the number of batteries in each classification
     for(int i=0;i<cycles.length;i++){
      if(cycles[i]<310){
        counts.lowCount++;
      }
      else if(cycles[i]>310 & cycles[i]<929){
        counts.mediumCount++;
      }
      else{
        counts.highCount++;
      }
    return counts;
  }

  static void testBucketingByNumberOfCycles() {
    System.out.println("Counting batteries by usage cycles...\n");
    CountsByUsage counts = countBatteriesByUsage(new int[] {100, 300, 500, 600, 900, 1000});
    assert(counts.lowCount == 2);
    assert(counts.mediumCount == 3);
    assert(counts.highCount == 1);
    //printing count
    System.out.println(counts.lowCount+" \n"+""+counts.mediumCount+"\n"+counts.highCount);
    System.out.println("Done counting :)\n");
  }

  public static void main(String[] args) {
    testBucketingByNumberOfCycles();
  }
}
