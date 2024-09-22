package mustafakhan.uk.to;

import java.util.Scanner;

import mustafakhan.uk.to.dsa.dataStructures.ArrayList.ArrayListUtilities;
import mustafakhan.uk.to.dsa.dataStructures.arrays.ArraysUtilities;
import mustafakhan.uk.to.extractor.AnimeExtractor;

public class App {
    public static void main(String[] args) {

        // Replace with a valid episode ID from the Gogoanime site
        String episodeId = "jujutsu-kaisen-tv-episode-24"; // Example: "my-hero-academia-episode-1"
        String watchLink = AnimeExtractor.extractWatchLink(episodeId);

        if (watchLink != null) {
            System.out.println("Watch link: " + watchLink);
        } else {
            System.out.println("No watch link found for episode ID: " + episodeId);
        }
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        switch (choice) {
            case 1:
                new ArraysUtilities().ArraysUtils();
                break;
            
            case 2:
                new ArrayListUtilities().ArrayListUtils();
                break;
        
            default:
                break;
        }
        
       
       
        
}
}
