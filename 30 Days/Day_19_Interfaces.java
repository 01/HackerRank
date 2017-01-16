class Calculator implements AdvancedArithmetic{
    public int divisorSum(int n){
        int divSum = 0;
        for(int i=1; i<=n; i++){
            if(n%i==0)divSum+=i;
        }
        return divSum;
    }
}