package codewars.urlShortener;

import java.util.ArrayList;
import java.util.HashMap;

public class UrlShortener {

    public static void main(String[] args) {

//        urlShortener();
    }

    public static boolean checkUrlInDatabase(HashMap<String,String> urlShortenerDataBase, String longUrl){

        return urlShortenerDataBase.containsKey(longUrl);
    }

    public static String urlRedirector(HashMap<String,String> urlShortenerDataBase, String shortUrl){

        return urlShortenerDataBase.get(shortUrl);
    }

    public static String urlShortener(HashMap<String,String> urlShortenerDataBase, String longUrl){


        StringBuilder shortUrl = new StringBuilder();

        if (checkUrlInDatabase(urlShortenerDataBase,longUrl)){

            return urlShortenerDataBase.get(longUrl);

        }else {
//            Length must be between 1 and 4 both included
            int urlSlugLength = getRandomSlugLength();
            String urlDomain = "short.ly/";
            String urlSlug = createUrlSlug(urlSlugLength);
            shortUrl.append(urlDomain);
            shortUrl.append(urlSlug);
            urlShortenerDataBase.put(longUrl,shortUrl.toString());
            System.out.println("This is your Short Url: " + shortUrl);
            System.out.println(longUrl + " no está en la base de datos");
            return shortUrl.toString();
        }


    }

    public static String createUrlSlug(int slugLength){

        StringBuilder urlSlug = new StringBuilder();

        for (int i = 0; i < slugLength; i++) {

            urlSlug.append(getRandomCase());

        }

        return urlSlug.toString();
    }

    public static String getRandomCase(){

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int randomIndex = (int) Math.floor(Math.random()*(alphabet.length())) ;
        String randomCase = String.valueOf(alphabet.charAt(randomIndex));

        return randomCase;
    }


    public static int getRandomSlugLength(){
        // avoid random value 0
        int randomValue = (int) Math.ceil(Math.random()*5);

        if (randomValue == 5){

            randomValue--;
        }
        return randomValue;
    }
}
