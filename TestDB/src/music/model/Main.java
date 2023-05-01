package music.model;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        DataSource dataSource = new DataSource();

        if (!dataSource.open()) {
            System.out.println("Can't open datasource");
            return;
        }

        List<Artist> artists = dataSource.queryArtists(DataSource.ORDER_BY_ASC);
        if (artists == null) {
            System.out.println("No Artists!");
            return;
        }

        for (Artist artist : artists) {
            System.out.println("ID = "+artist.getId()+", Name = "+ artist.getName());
        }

        List<String> albumsForArtist = dataSource.queryAlbumForArtists("Iron Maiden", DataSource.ORDER_BY_ASC);

        for (String album : albumsForArtist) {
            System.out.println(album);
        }
        dataSource.close();
    }
}
