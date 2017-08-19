package other_interfaces_examples;

// Implement MyInterface. 

class MyInterfaceImplemented implements MyInterface { 
  // Only getUserID() defined by MyInterface needs to be implemented. 
  // getAdminID() can be allowed to default. 

  public int getUserID() { 
    return 100; 
  } 

}
