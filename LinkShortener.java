import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class LinkShortener {
    private Map<String, String> shortToLongUrlMap;
    private Map<String, String> longToShortUrlMap;
    private static final String CHARACTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static final int SHORT_URL_LENGTH = 7;

    public LinkShortener() {
        this.shortToLongUrlMap = new HashMap<>();
        this.longToShortUrlMap = new HashMap<>();
    }

    public String shortenUrl(String longUrl) {
        if (longToShortUrlMap.containsKey(longUrl)) {
            return longToShortUrlMap.get(longUrl);
        }
        String shortUrl=generateShortUrl();
        shortToLongUrlMap.put(shortUrl,longUrl);
        longToShortUrlMap.put(longUrl,shortUrl);
        return shortUrl;
    }
    public String getLongUrl(String shortUrl){
        return shortToLongUrlMap.get(shortUrl);
    }
    private String generateShortUrl(){
        StringBuilder shortUrl=new StringBuilder();
        Random random=new Random();
        for(int i=0;i< SHORT_URL_LENGTH;i++){
            int index=random.nextInt(CHARACTERS.length());
            shortUrl.append(CHARACTERS.charAt(index));
        }
        return shortUrl.toString();
    }
    public static void main(String[] args){
        LinkShortener linkShortener=new LinkShortener();
        String longUrl="https://www.example.com/very_long_and_descriptive_url";
        String shortUrl=linkShortener.shortenUrl(longUrl);
        System.out.println("Shortened URL:"+shortUrl);
        System.out.println("Original URL:"+linkShortener.getLongUrl(shortUrl));
    }
}

       