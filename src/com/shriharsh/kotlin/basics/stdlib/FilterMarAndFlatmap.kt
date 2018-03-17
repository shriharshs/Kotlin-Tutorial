package com.shriharsh.kotlin.basics.stdlib

data class Album(val title: String, val year: Int, val chartUK: Int, val chartUS: Int, val tracks: List<Track> = listOf())

data class Track(val titles: String, val durationInSeconds: Int)

val albums = listOf<Album>(
        Album("Lucky Ali", 1997, 2, 1,
                listOf(Track("Gori teri aakhen kahein", 360),
                        Track("Song 2", 60),
                        Track("Song 3", 300),
                        Track("Song 4", 300)
                )
        ),
        Album("Album 2", 2001, 1, 3),
        Album("Album 3", 2002, 2, 3),
        Album("Album 4", 2005, 2, 3)
)


fun main(args: Array<String>) {

    //traditional way of doing
    println("===========Traditional way===============")
    for (album in albums) {
        if (album.chartUK == 1) {
            println("Found - ${album.title}")
        }
    }

    //Using stdlib operations using FOREACH
    println("===========STDLIB Operations using FOREACH on list===============")
    albums.forEach { album ->
        if (album.chartUK == 1) println("Found it - ${album.title}")
    }

    //Using stdlib operations using FILTER, using method pipelining
    println("===========STDLIB Operations using FILTER on list===============")
    albums.filter { it.chartUK == 1 }
            .forEach { println("Found it with filter - ${it.title}") }

    println("===========STDLIB Operations using MAP===============")
    val titles = albums.filter { it.chartUK == 2 }
            .map { it.title }

    titles.forEach { println(it) }

    println("===========STDLIB Operations using FLAT MAP===============")
    albumAndTrackLowerThanXSeconds(500, albums).forEach {
        it.first
    }


}

fun albumAndTrackLowerThanXSeconds(durationinSecs: Int, albums: List<Album>): List<Pair<String, String>> {
    return albums.flatMap {
        val albumTitle = it.title

        it.tracks.filter {
            it.durationInSeconds < durationinSecs
        }.map {
                    Pair(albumTitle, it.titles)
                }
    }
}
