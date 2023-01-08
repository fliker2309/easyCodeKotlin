import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.*;

public class Main {
    private static final String URL = "https://file-examples-com.github.io/uploads/2017/04/file_example_MP4_1920_18G.mp4";

    public static void main(String[] args) {

        Logger logger = new Logger( new ArrayList<>());
        List <Thread> threads = new ArrayList<>();

        for(int i = 0; i< 5; i++){
            int finalI = i;
            threads.add(new Thread(()->
            logger.addLog("Header " + finalI, "body " + finalI)));
        }

        for (Thread thread : threads){
            thread.start();
        }

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                logger.print();
            }
        };

        Timer timer = new Timer();
        timer.schedule(task, 5000);




/*
        List<String> list = new ArrayList<>();
        System.out.println(list.isEmpty());
        list.add("First");
        list.add("Second");
        for (String string : list){
            System.out.println(string);
        }

        list.remove("First");
    *//*    for(int i =0; i < list.size(); i++){
            System.out.println("i " + i + "item "+ list.get(i));
        }*//*
        list.add(0, "zero");

        for (String string : list){
            System.out.println(string);
        }
        System.out.println(list.contains("zero"));

        List<String> big = new ArrayList<>(list);
        big.add("big");
     *//*   big.addAll(list);*//*
        for( String string : big){
            System.out.println(string + " ");
        }
        if(list.size() -1 >= 4){
            System.out.println(list.get(4));
        }
        list.add(2, "zero");
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });

        for ( String string : list){
            System.out.println(string);
        }*/

     /*   DataSource<MyData> myDataDataSource = new Repository<>(
                new CloudDataSource(),
                new CachedDataSource()
        );

        DataSource<GeoData> geoDataDataSource = new GeoRepository(
                new GeoDataCloudDataSource(),
                new CachedDataSource<>()
        );

        MyData data = myDataDataSource.getData();
        GeoData geoData = geoDataDataSource.getData();
        print(data.toString());
        print(geoData.toString());*/
/*
        DataSource repository = new Repository(
                new CloudDataSource(),
                new CachedDataSource()
        );
        MyData myData = (MyData) repository.getData();
        print(myData.toString());
        myData = repository.getData();
        print(myData.toString());*/
    }

    private static void downloadFile() {
        System.out.println("Starting downloading file");
        try
                (
                        BufferedInputStream in = new BufferedInputStream(new URL(URL).openStream());
                        FileOutputStream fileOutputStream = new FileOutputStream("someVideo.mp4")) {
            byte dataBuffer[] = new byte[1024];
            int bytesRead;
            while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
                fileOutputStream.write(dataBuffer, 0, bytesRead);
            }
        } catch (IOException e) {
            System.out.println("Something went wrong, try again? y/n");
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("y")) {
                downloadFile();
            }
        }

    }

    private static void print(String text) {
        System.out.println(text);
    }
}
