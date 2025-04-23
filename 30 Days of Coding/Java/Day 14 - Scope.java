class Difference {
    private int[] elements;
    public int maximumDifference;
  
  // Add your code here
  Difference (int[] elements){
      this.elements = elements;
  }
  
  public void computeDifference(){
      this.maximumDifference = 0;
      for (int i = 0; i < this.elements.length-1; i++){
          for (int j = i; j < this.elements.length; j++){
              if (i==j){
                  continue;
              }
              if (Math.abs(elements[i] - elements[j])>this.maximumDifference){
                  this.maximumDifference = Math.abs(elements[i] - elements[j]);
              }
          }
      }
  }

}