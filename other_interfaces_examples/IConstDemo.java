package other_interfaces_examples;

class IConstDemo implements IConst { 

  public static void main(String args[]) { 
    int nums[] = new int[MAX]; 

    for(int i=MIN; i < 11; i++) { 
      if(i >= MAX) {
        System.out.print("\n"); 
        System.out.println(ERRORMSG); 
      }
      else { 
        nums[i] = i; 
        System.out.print(nums[i] + " "); 
      } 
    } 
  } 

}
