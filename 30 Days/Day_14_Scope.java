	Difference(int[] numbers){
        this.elements = numbers;
    }
    int computeDifference(){
        Arrays.sort(elements);
        maximumDifference = elements[elements.length-1]-elements[0];
        return maximumDifference;
    }
