import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Album> copiedAlbums = SampleData.albums.toList();
        AlbumProcessor albumProcessor = new AlbumProcessor();
        System.out.println(albumProcessor.findLongTracks(copiedAlbums));
        System.out.println(albumProcessor.findLongTracks(copiedAlbums.stream()));
    }
}

class AlbumProcessor {
    public Set<String> findLongTracks(List<Album> albums) {
        Set<String> trackNames = new HashSet<>();
        for (Album album : albums) {
            for (Track track : album.getTrackList()) {
                if (track.getLength() > 60) {
                    String name = track.getName();
                    trackNames.add(name);
                }
            }
        }
        return trackNames;
    }

    public Set<String> findLongTracks(Stream<Album> albums) {
        return albums.map(Album::getTrackList)
                .flatMap(Collection::stream)
                .filter(track -> track.getLength() > 60)
                .map(Track::getName)
                .collect(Collectors.toSet());
    }
}
