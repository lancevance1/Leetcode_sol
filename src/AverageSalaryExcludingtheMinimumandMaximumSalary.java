public class AverageSalaryExcludingtheMinimumandMaximumSalary {
    // tc:o(n),sc:o(1)
    public double average(int[] salary) {
        int max = 1000;
        int min = (int)10e6;
        int sum = 0;
        for(int i=0; i<salary.length;i++){
            sum+=salary[i];
            max=Math.max(max,salary[i]);
            min=Math.min(min,salary[i]);
        }
        return (sum-max-min)*1.0/(salary.length-2);
    }

}
