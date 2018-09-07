
MovieAPI Paths:

Note: Forvariable at the end of paths, use the same number to get relevant info for a single film. For the final path for search functiopn use a movie title. This does
need to be adjusted so that when spaces are entered it replaces white with "+". So for now just use one word titles for testing. 

1. localhost:8182/getMoviesNowPlayingImagePaths/{imageNumber}

Description: Gets specific movie image source url, for movies now playing (Homepage).

2. localhost:8182/getMoviesNowPlayingDetails/{movieNumber}

Description: Gets specific movie information, small amount of detail. (Homepage)

3. localhost:8182/getMoviesNowPlayingFullDetails/{movieNumber}

Description: Gets all relevant information tied to a movie. (Movie Page)

4. localhost:8182/getUpAndComingImagePaths/{imageNumber}

Description: Same as (1), but for Up and Coming movies, use this for coming soon page or new releases.

5. localhost:8182/getUpAndComingDetails/{movieNumber}

Description: Same as (2), less details than (3), assuming t he extra knowledge is not necessary, but these details cannot be accessed through up and coming request. 

6. localhost:8182/movie/search/{movieTitle}

Description: Returns movie details for most relative movie to the search input. Tie searchbar input to this variable. 

Final Note: Where there is "xxxx", that is where the api key should go. Replace all instances of "xxxx" with key. 

If you need it, message me. 

Cheers, 

Jarad  

