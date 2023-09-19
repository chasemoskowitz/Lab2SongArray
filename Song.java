//Chase Moskowitz

package lab2.song.array;



public class Song 
{
    //class fields
    private String songTitle;
    private String artist;
    private int lengthInSeconds;
    
    
    /**
     * Constructor
     * @param initialSongtitle-holds the name of the song title
     * @param initialArtist -holds the name of the artist
     * @param initialLengthInSeconds -holds the length of the song in seconds
     */
    public Song (String initialSongtitle, String initialArtist,
            int initialLengthInSeconds)
    {
        
        songTitle=initialSongtitle;
        artist=initialArtist;
        lengthInSeconds=initialLengthInSeconds;
        
    }
    
    /**
     * This Method gets the name of the song
     * @return the name of the song 
     */
    public String getSongTitle ()
    {
        return songTitle;
    }
     
    /**
     * This method gets the artist's name
     * @return the name of the artist
     */
    public String getArtist()
    {
        return artist;
    }
    
    /**
     * This method gets the length of the song in seconds
     * @return the length of the song in seconds
     */
    public int getLengthInSeconds()
    {
        return lengthInSeconds;
    }
    
    /**
     * This method sets the name of the song
     * @param initialSongtitle-the name of the song
     */
    public void setSongTitle(String initialSongtitle)
    {
        songTitle=initialSongtitle;
    }
    
    /**
     * This method sets the name of the artist
     * @param initialArtist -the name of the artist
     */
    public void setArtist(String initialArtist)
    {
        artist=initialArtist;
    }
    /**
     * This method sets the length of the song in seconds
     * @param initialLengthInSeconds -length of the song in seconds
     */
    public void setLengthInSeconds (int initialLengthInSeconds)    
    {
        lengthInSeconds=initialLengthInSeconds;

    }
        
    
    
    
}
