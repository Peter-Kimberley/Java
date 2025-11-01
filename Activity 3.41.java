/// This question covers material suggested by Exercise 3.40, 
/// but you will not produce a drawing in this online activity.

// Assume the existence of the classes Triangle and Square, both of 
// which have zero-argument constructors. That is, the constructors 
// do not take any parameters.

// Complete the class Tree with the following features:

// 1. The class requires a field leaves of type Triangle, and a field 
// trunk of type Square.

// 2. The body of the Tree constructor initializes the field leaves 
// using the zero-argument constructor of the class Triangle, and 
// initializes the field trunk using the zero-argument constructor 
//of the class Square.

// 3. Add getter methods for the fields leaves and trunk, called 
// getLeaves and getTrunk The methods take no arguments and return the 
//values of the fields leaves and trunk respectively.







//Complete the class Tree here according to the requirements
public class Tree
{
   private Triangle leaves;
   private  Square trunk;
    
    
   // A constructor for the public class of Tree, 
   //***I missed ther parenthases here, and it caused me so much 
   //trouble :D
    public Tree()
    {
        
    leaves = new Triangle();
    trunk = new Square();
    }
    // A method to retrun the values of leaves.
    public Triangle getLeaves()
    {
        return leaves;
    }
    // A method to return the values of trunk.
    public Square getTrunk()
    {
        return trunk;
    }
    

}