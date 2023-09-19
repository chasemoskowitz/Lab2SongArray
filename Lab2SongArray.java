//Chase Moskowitz

package lab2.song.array;

import java.util.Scanner;

public class Lab2SongArray 
{

   
    public static void main(String[] args) 
    {
        
        String songTitleEntered=null;
        int count =0;
        int lengthInSeconds=0;
        String artistEntered= null;
        int i=0;
        Song[] mySongList=new Song[5];
        
        Scanner keyboard = new Scanner(System.in);
        

          
          System.out.print("Enter a song name (xxx to exit): ");
        songTitleEntered=keyboard.nextLine();
      
        
        while (!songTitleEntered.equalsIgnoreCase("xxx") && 
                (count<mySongList.length))
        {
   
           if (count<mySongList.length)
           {
               System.out.print("Enter artist for song " + count + ": ");
               artistEntered=keyboard.nextLine();
           }
            
            if (count<mySongList.length)
           {
               System.out.print("Enter length in second for song"
                       + " " + count + ": ");
               lengthInSeconds=keyboard.nextInt();
               
               while (lengthInSeconds<1)
               {
                   System.out.printf("\n");
                   System.out.print("Length must be at least 1 second. "
                           +"Enter length in second for song"
                       + " " + count + ": ");
               lengthInSeconds=keyboard.nextInt();
               
               }
               
               mySongList[count]=new Song(songTitleEntered,
                       artistEntered, lengthInSeconds);
               
               count ++;
           }
                       
            
             if (count<mySongList.length)
           {
               keyboard.nextLine();
               System.out.print("\nEnter a song name (xxx to exit): ");
               songTitleEntered=keyboard.nextLine();
          }
           if (count==5)
           {
                System.out.print("\nArray is full \n");
           }
           
        }
        
      
          if (count>0)
          {
              System.out.printf("\n%-30s %-30s %3s\n", "Song Title", 
                      "Artist", "Len");
              
              for (i=0; i<count; i++)   
             {
                 System.out.printf("%-30s %-30s %3s\n", 
                        mySongList[i].getSongTitle(),
                         mySongList[i].getArtist(),
                         mySongList[i].getLengthInSeconds());
                         
             }
       
    
          }   
}

}