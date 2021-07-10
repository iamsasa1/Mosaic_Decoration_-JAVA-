
import java.util.*;
import java.lang.*;
import java.io.*;

class Modec {

    public static void main(String[] args)throws java.lang.Exception  {
    Scanner in = new Scanner(System.in);

        long W = in.nextLong();

        long H = in.nextLong();

        long A = in.nextLong();

        long B = in.nextLong();

        long M = in.nextLong();

        long C = in.nextLong();

        long cuttingCost = 0;
        
        long wTiles = (long)Math.ceil((double)W/A);
        long hTiles = (long)Math.ceil((double)H/B);
        
        long totalTiles = wTiles*hTiles;
        long totalTilePiles = (long)Math.ceil((double)totalTiles/10);
        long totalTilePilesCost = totalTilePiles * M;
        
        //System.out.println("Total Tile Cost: "+ totalTilePilesCost);
        
        long wRest = (A * wTiles) - W; 
        long hRest = (B * hTiles) - H;
        
        if(hRest > 0){
            cuttingCost += W * C;
        }
        if(wRest > 0){
            cuttingCost += H * C;
        }
        
        System.out.println(totalTilePilesCost + cuttingCost);

        

        in.close();
        
        
    }
    
}
