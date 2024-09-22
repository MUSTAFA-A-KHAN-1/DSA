package mustafakhan.uk.to.extractor;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class AnimeExtractor {

    private static final String BASE_URL = "https://gogoanime3.co"; // Base URL

    public static String extractWatchLink(String episodeId) {
        String watchLink = null;
        try {
            // Construct the URL for the specific episode
            String episodeUrl = BASE_URL  + "/"+ episodeId; 
            Document doc = Jsoup.connect(episodeUrl).get();
            System.out.println(doc);
            // Select the video source element (adjust the selector as per the site's HTML structure)
            Elements videoElements = doc.select("source");
            for (Element video : videoElements) {
                String src = video.attr("src");
                if (src.endsWith(".mp4") || src.endsWith(".m3u8")) {
                    watchLink = src; // Found a valid video source
                    break;
                }
            }

        } catch (IOException e) {
            e.printStackTrace(); // Handle exceptions as needed
        }

        return watchLink;
    }

    
}



