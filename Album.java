//Ruben Pulido 
// 9/9/25
// Album class 

    public class Album {
        private String album;
        Boolean explicit;
        private int songs;
        private String artists; 
        private double rating;


        // default constructor 
            public Album() {
                this.album = "Donda";
                this.explicit = true;
                this.songs = 10;
                this.artists = "Kanye West";
                this.rating = 4.5;
            }
        
       // parameterized constructor 
           public Album(String album, Boolean explicit, int songs, String artists, double rating) {
                this.album = album;
                this.explicit = explicit;
                this.songs = songs;
                this.artists = artists;
                this.rating = rating;
           }

        // setters
            public void setAlbum(String album) {
                this.album = album;

            }

            public void setExplicit(Boolean explicit) {
                this.explicit = explicit;

            }

            public void setSongs(int songs) {
                this.songs = songs;

            }

            public void setArtists(String artists) {
                this.artists = artists;
            }

            public void setRating (double rating) {
                this.rating = rating;

            }

            // getters 
            public String getAlbum() {
                return album;

            }
            public Boolean getExplicit() {
                return explicit;
            }
            public int getSongs() {
                return songs;

            }

            public String getArtists() {
                return artists; 

            }

            public double getRating() {
                return rating;

            }
            @Override
                public String toString() {
                    return album + "." + explicit + "," + songs + "," + artists + "," + rating;

                }
         } // end Album class


        
    