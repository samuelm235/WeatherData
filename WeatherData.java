import java.util.ArrayList;
public class WeatherData
{

    private ArrayList<Double> temperatures;
    public WeatherData(ArrayList<Double> temps)
    {
        temperatures = temps;
    }
    public void cleanData(double lower, double upper)
    { 
        for(int i = temperatures.size()-1; i > 0; i--)
        {
            if(temperatures.get(i) < lower || temperatures.get(i) > upper)
            {
                temperatures.remove(i);
            } 
        }
    }


    public int longestHeatWave(double threshold)
    { 
        int count = 0;
        int max_count = 0;
        for(int i = 0; i < temperatures.size(); i++)
        {
            if(temperatures.get(i) >= threshold)
            {
                count += 1;
            }
            else
            {
                if(count >= max_count) {max_count = count;}
                count = 0;
            } 
        }
        return max_count;
    }
    
    public String toString()
    {
        return temperatures.toString();
    }
}