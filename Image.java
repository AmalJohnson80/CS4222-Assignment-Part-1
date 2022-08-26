//Name: AMAL JOHNSON
//ID: 21263175

import java.util.Arrays;
public class Image
{
    private int[][]pixels;
    private int width;
    private int height;

    public Image (int[][]pixels){
        this.pixels = pixels;
        this.height = pixels.length;
        this.width = pixels[0].length;

    }

    public String toString(){
        //String inString = pixels.toString();
        //return inString;
        return Arrays.deepToString(pixels);
        
    }

    public void flip (boolean horizontal){
        int i;
        int j;
        if(horizontal){
            for (i=0; i<height; i++){
                for (j=0; j<width/2; j++){
                    int k = j+1;
                    int l = width - k;
                    int row = i;
                    int column = j;
                    int m = pixels[row][column];
                    pixels [row][column] = pixels [row][l];
                    pixels [row][l]=m;

                }

            }
        }else for( int row=0; row<height/2; row++){
                int n = row+1;
                int o = height-n;
                //int row=i;
                int [] p = pixels[row];
                pixels [row] = pixels[o]; 
                pixels[o]=p;

            }
    }

    public void rotate (boolean clockwise){
        int [][]rotatedClockwise = new int[width][height];
        int q = height-1;
        int r = width-1;
        int row;
        int column;
        if(clockwise){
            for(row=0; row<height; row++){
                for(column = 0; column<width; column++){
                    int s = q - row;
                    rotatedClockwise [column][s] = pixels[row][column];
                }
            }
        }else for(row=0; row<height; row++){
            for(column=0; column<width; column++){
                int t = r - column;
                rotatedClockwise [t][row] = pixels [row][column];
            }
        }
        int u = width;
        int v = height;
        this.pixels = rotatedClockwise;
        this.width = v;
        this.height = u;
        
    }
    
    
    
}
