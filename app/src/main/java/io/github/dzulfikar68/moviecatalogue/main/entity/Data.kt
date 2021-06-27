package io.github.dzulfikar68.moviecatalogue.main.entity

object Data {
    fun getMovies(): List<MovieResult> {
        return listOf(
            MovieResult(
                id = 1,
                original_title = "Memento",
                overview = "Memento is a 2000 American neo-noir psychological thriller film written and directed by Christopher Nolan, and produced by Suzanne and Jennifer Todd. The film's script was based on a pitch by Jonathan Nolan, who later wrote the story \"Memento Mori\" from the concept. Guy Pearce stars as a man who, as a result of an injury, has anterograde amnesia (the inability to form new memories) and has short-term memory loss approximately every fifteen minutes. He is searching for the persons who attacked him and killed his wife, using an intricate system of Polaroid photographs and tattoos to track information he cannot remember.",
                poster_path = "https://images-na.ssl-images-amazon.com/images/I/71DJIt8Q3OL._SY445_.jpg",
                release_date = "11 Nov 2000",
                vote_average = "8.2"
            ),
            MovieResult(
                id = 2,
                original_title = "Taxi Driver",
                overview = "Taxi Driver is a 1976 American neo-noir psychological thriller film[4] directed by Martin Scorsese, written by Paul Schrader, and starring Robert De Niro, Jodie Foster, Cybill Shepherd, Harvey Keitel, Peter Boyle, Leonard Harris and Albert Brooks. Set in a decaying and morally bankrupt New York City following the Vietnam War, the film tells the story of a lonely taxi driver, who descends into insanity as he plots to assassinate both the presidential candidate (Harris) for whom the woman he is infatuated with (Shepherd) works, and the pimp (Keitel) of an underage prostitute (Foster) he befriends.",
                poster_path = "https://upload.wikimedia.org/wikipedia/en/thumb/3/33/Taxi_Driver_%281976_film_poster%29.jpg/220px-Taxi_Driver_%281976_film_poster%29.jpg",
                release_date = "8 Feb 2008",
                vote_average = "8.2"
            ),
            MovieResult(
                id = 3,
                original_title = "Scream",
                overview = "Scream is a 1996 American slasher film directed by Wes Craven and written by Kevin Williamson. The film stars David Arquette, Neve Campbell, Courteney Cox, Matthew Lillard, Rose McGowan, Skeet Ulrich, and Drew Barrymore. Released on December 20, 1996, Scream follows the character of Sidney Prescott (Campbell), a high school student in the fictional town of Woodsboro, California, who becomes the target of a mysterious killer in a Halloween costume known as Ghostface. The film combines black comedy and \"whodunit\" mystery with the violence of the slasher genre to satirize the clichés of the horror movie genre popularized in films such as Halloween (1978), Friday the 13th (1980) and Craven's own A Nightmare on Elm Street (1984). The film was considered unique at the time of its release for featuring characters who were aware of real-world horror films and openly discussed the clichés that Scream attempted to subvert.",
                poster_path = "https://m.media-amazon.com/images/M/MV5BMjA2NjU5MTg5OF5BMl5BanBnXkFtZTgwOTkyMzQxMDE@._V1_UX182_CR0,0,182,268_AL_.jpg",
                release_date = "20 Dec 1996",
                vote_average = "7.2"
            ),
            MovieResult(
                id = 4,
                original_title = "The Machinist",
                overview = "The Machinist is a 2004 psychological thriller film directed by Brad Anderson and written by Scott Kosar. The film stars Christian Bale and features Jennifer Jason Leigh, Aitana Sánchez-Gijón, John Sharian, and Michael Ironside in supporting roles. The film is about Trevor Reznik (Bale), a machinist whose insomnia and psychological problems lead to a serious workplace accident involving a co-worker (Ironside). After Reznik is fired, he goes into a downward spiral of paranoia and delusion. The film was well-received by critics, particularly for Bale's performance. It is an international co-production of Spain, the United Kingdom, France and the United States.",
                poster_path = "https://upload.wikimedia.org/wikipedia/en/thumb/b/b9/The_Machinist_poster.JPG/220px-The_Machinist_poster.JPG",
                release_date = "22 Oct 2004",
                vote_average = "7.5"
            ),
            MovieResult(
                id = 5,
                original_title = "Misery",
                overview = "Misery is a 1990 American psychological horror film directed by Rob Reiner based on Stephen King's 1987 novel of the same name, starring James Caan, Kathy Bates, Lauren Bacall, Richard Farnsworth, and Frances Sternhagen about a psychotic fan who holds an author captive and forces him to write her stories.  The film was released on November 30, 1990 in the United States to positive reviews and was a box office success. Bates won the Academy Award for Best Actress at the 63rd Academy Awards. Misery is the only film based on a Stephen King novel to win an Oscar.[4] The \"hobbling\" scene in the film was ranked #12 on Bravo's 100 Scariest Movie Moments.",
                poster_path = "https://miro.medium.com/max/1040/1*cRviY7mV46ZtATGG_oIBTw.jpeg",
                release_date = "30 Nov 1990",
                vote_average = "7.7"
            ),
            MovieResult(
                id = 6,
                original_title = "The Silence of the Lambs",
                overview = "The Silence of the Lambs is a 1991 American psychological thriller film[3] directed by Jonathan Demme from a screenplay written by Ted Tally, adapted from Thomas Harris's 1988 novel of the same name. The film stars Jodie Foster, Anthony Hopkins, Scott Glenn, Ted Levine, and Anthony Heald.[4] In the film, Clarice Starling, a young FBI trainee, seeks the advice of the imprisoned Dr. Hannibal Lecter, a brilliant psychiatrist and cannibalistic serial killer to apprehend another serial killer, known only as \"Buffalo Bill\", who skins his female victims' corpses. The novel was Harris's first and second respectively to feature the characters of Starling and Lecter, and was the second adaptation of a Harris novel to feature Lecter, preceded by the Michael Mann-directed Manhunter (1986).",
                poster_path = "https://upload.wikimedia.org/wikipedia/id/thumb/8/86/The_Silence_of_the_Lambs_poster.jpg/220px-The_Silence_of_the_Lambs_poster.jpg",
                release_date = "1 Feb 1991",
                vote_average = "8.3"
            ),
            MovieResult(
                id = 7,
                original_title = "Dog Day Afternoon",
                overview = "Dog Day Afternoon is a 1975 American neo-noir[2] crime drama film directed by Sidney Lumet, written by Frank Pierson, and produced by Martin Bregman and Martin Elfand. The film stars Al Pacino, John Cazale, Charles Durning, Chris Sarandon, Penelope Allen, James Broderick, Lance Henriksen, and Carol Kane. The title refers to the sultry \"dog days\" of summer.  The film was inspired by P. F. Kluge's article \"The Boys in the Bank\" in LIFE magazine,[3] about a similar robbery of a Brooklyn bank by John Wojtowicz and Salvatore Naturale on August 22, 1972.",
                poster_path = "https://m.media-amazon.com/images/M/MV5BMzljMjBhODItYTYyYi00NzMwLTkyZDQtNjQ4MWU0MzhmNDU4XkEyXkFqcGdeQXVyMTA0MjU0Ng@@._V1_UX182_CR0,0,182,268_AL_.jpg",
                release_date = "21 Sep 2021",
                vote_average = "7.8"
            ),
            MovieResult(
                id = 8,
                original_title = "Mr. Brooks",
                overview = "Mr. Brooks is a 2007 American psychological thriller film directed by Bruce A. Evans starring Kevin Costner, Demi Moore, Dane Cook, and William Hurt. It was released on June 1, 2007. The film follows the eponymous character, a celebrated Portland businessman and serial killer (Costner) who is forced to take on a protégé (Cook) after being blackmailed, and has to contend with his bloodthirsty alter ego (Hurt) who convinces him to indulge his \"habit\". His life grows even more complicated when a driven police officer (Moore) reopens the investigation into his murders. The film received mixed reviews and grossed \$48.1 million against a \$20 million budget.",
                poster_path = "https://m.media-amazon.com/images/M/MV5BMTQyNTk5MTMxN15BMl5BanBnXkFtZTcwNTc0ODI1NA@@._V1_UX182_CR0,0,182,268_AL_.jpg",
                release_date = "1 Jun 2007",
                vote_average = "6.9"
            ),
            MovieResult(
                id = 9,
                original_title = "Chinatown",
                overview = "Chinatown is a 1974 American neo-noir mystery film directed by Roman Polanski from a screenplay by Robert Towne, starring Jack Nicholson and Faye Dunaway. The film was inspired by the California Water Wars, a series of disputes over southern California water at the beginning of the 20th century, by which Los Angeles interests secured water rights in the Owens Valley. The Robert Evans production, released by Paramount Pictures, was the director's last film in the United States and features many elements of film noir, particularly a multi-layered story that is part mystery and part psychological drama. ",
                poster_path = "https://upload.wikimedia.org/wikipedia/en/thumb/3/38/Chinatownposter1.jpg/220px-Chinatownposter1.jpg",
                release_date = "20 Jun 1974",
                vote_average = "7.9"
            ),
            MovieResult(
                id = 10,
                original_title = "Se7en",
                overview = "Seven (stylized as SE7EN) is a 1995 American crime thriller film directed by David Fincher and written by Andrew Kevin Walker. It stars Brad Pitt, Morgan Freeman, Gwyneth Paltrow, Kevin Spacey and John C. McGinley. The film tells the story of David Mills, a detective who partners with the retiring William Somerset to track down a serial killer who uses the seven deadly sins as a motif in his murders.  The screenplay was influenced by the time Walker spent in New York City trying to make it as a writer. Principal photography took place in Los Angeles, with the last scene filmed near Lancaster, California. The film's budget was \$33 million.  Released on September 22, 1995 by New Line Cinema, Seven was the seventh-highest-grossing film of the year, grossing over \$327 million worldwide.[2] It was well received by critics, who praised the film's dark style, brutality and themes. The film was nominated for Best Film Editing at the 68th Academy Awards, losing to Apollo 13.",
                poster_path = "https://catatanpunyatia.files.wordpress.com/2014/07/seven-poster.jpg",
                release_date = "22 Sep 1995",
                vote_average = "8.8"
            )
        )
    }

    fun getTvs(): List<MovieResult> {
        return listOf(
            MovieResult(
                id = 11,
                original_title = "Gotham",
                overview = "Gotham is an American crime drama television series developed by Bruno Heller, produced by Warner Bros. Television and based on characters published by DC Comics and appearing in the Batman franchise, primarily those of James Gordon and Bruce Wayne. The series premiered on Fox on September 22, 2014, and concluded on April 25, 2019. The series stars Ben McKenzie as Jim Gordon and David Mazouz as Bruce Wayne. The series was originally intended to focus only on Gordon's early days with the Gotham City Police Department, but they subsequently included the Bruce Wayne character and the origin stories of several Batman villains, including Penguin,[4] Riddler,[4] Catwoman,[4] Poison Ivy,[5] Scarecrow,[6] Mr. Freeze,[7] Hugo Strange,[8] Solomon Grundy,[9] Ra's al Ghul,[10] Nyssa al Ghul,[11] Bane[12] and The Joker.[13]",
                poster_path = "https://upload.wikimedia.org/wikipedia/en/thumb/9/9e/Gotham_%28season_5%29.jpg/220px-Gotham_%28season_5%29.jpg",
                release_date = "22 Sep 2014",
                vote_average = "6.9"
            ),
            MovieResult(
                id = 12,
                original_title = "The Simpsons",
                overview = "The Simpsons is an American animated sitcom created by Matt Groening for the Fox Broadcasting Company.[1][2][3] The series is a satirical depiction of working-class life, epitomized by the Simpson family, which consists of Homer, Marge, Bart, Lisa, and Maggie. The show is set in the fictional town of Springfield and parodies American culture and society, television, and the human condition.The family was conceived by Groening shortly before a solicitation for a series of animated shorts with producer James L. Brooks. Groening created a dysfunctional family and named the characters after his own family members, substituting Bart for his own name. The shorts became a part of The Tracey Ullman Show on April 19, 1987. After three seasons, the sketch was developed into a half-hour prime time show and became Fox's first series to land in the Top 30 ratings in a season (1989–90). ",
                poster_path = "https://upload.wikimedia.org/wikipedia/en/thumb/b/bd/The_Simpsons_-_The_Complete_1st_Season.jpg/220px-The_Simpsons_-_The_Complete_1st_Season.jpg",
                release_date = "17 Dec 1989",
                vote_average = "7.2"
            ),
            MovieResult(
                id = 13,
                original_title = "Game of Thrones",
                overview = "Game of Thrones is an American fantasy drama television series created by David Benioff and D. B. Weiss for HBO. It is an adaptation of A Song of Ice and Fire, George R. R. Martin's series of fantasy novels, the first of which is A Game of Thrones. The show was both produced and filmed in Belfast and elsewhere in the United Kingdom. Filming locations also included Canada, Croatia, Iceland, Malta, Morocco, and Spain.[1] The series premiered on HBO in the United States on April 17, 2011, and concluded on May 19, 2019, with 73 episodes broadcast over eight seasons.",
                poster_path = "https://upload.wikimedia.org/wikipedia/en/thumb/d/d1/Game_of_Thrones_Season_6.jpeg/220px-Game_of_Thrones_Season_6.jpeg",
                release_date = "17 Apr 2011",
                vote_average = "8.2"
            ),
            MovieResult(
                id = 14,
                original_title = "Doctor Who",
                overview = "Doctor Who is a British science fiction television programme produced by the BBC since 1963. The programme depicts the adventures of a Time Lord called \"the Doctor\", an extraterrestrial being, to all appearances human, from the planet Gallifrey. The Doctor explores the universe in a time-travelling space ship called the TARDIS. Its exterior appears as a blue British police box, which was a common sight in Britain in 1963 when the series first aired. Accompanied by a number of companions, the Doctor combats a variety of foes while working to save civilisations and help people in need.",
                poster_path = "https://images-na.ssl-images-amazon.com/images/I/51mj5BO5LfL.jpg",
                release_date = "26 Mar 2005",
                vote_average = "7"
            ),
            MovieResult(
                id = 15,
                original_title = "The Witcher",
                overview = "The Witcher is an American fantasy drama series produced by Lauren Schmidt Hissrich. It is based on the book series of the same name by Polish writer Andrzej Sapkowski. The first season, consisting of eight episodes, was released on Netflix in its entirety on December 20, 2019. Before airing of Season 1 had started, a second season of eight episodes was announced for release in 2021; production was scheduled to commence in London in early 2020.",
                poster_path = "https://66.media.tumblr.com/4e730216079fe15303aef00f639ad881/ccf1ef5d9ee3a9ea-b0/s640x960/6dca7e1661a789bdc9155305a68b9301ef37eb49.jpg",
                release_date = "20 Dec 2019",
                vote_average = "8"
            ),
            MovieResult(
                id = 16,
                original_title = "Vikings",
                overview = "Vikings is a historical drama television series created and written by Michael Hirst for the History channel. Filmed in Ireland, it premiered on March 3, 2013, in Canada. In January 2019, it was announced that the upcoming 20-episode sixth season, which was ordered on September 12, 2017, ahead of its fifth-season premiere, would be the final season of the series. The sixth season premiered on December 4, 2019. A sequel series, titled Vikings: Valhalla, is currently in development for Netflix.",
                poster_path = "https://upload.wikimedia.org/wikipedia/en/thumb/c/c3/Vikings_Season_6.jpg/220px-Vikings_Season_6.jpg",
                release_date = "3 Mar 2013",
                vote_average = "7.5"
            ),
            MovieResult(
                id = 17,
                original_title = "The Flash",
                overview = "The Flash is an American superhero television series developed by Greg Berlanti, Andrew Kreisberg, and Geoff Johns, airing on The CW. It is based on the DC Comics character Barry Allen / Flash, a costumed superhero crime-fighter with the power to move at superhuman speeds. It is a spin-off from Arrow, existing in the same fictional universe. The series follows Barry Allen, portrayed by Grant Gustin, a crime scene investigator who gains super-human speed, which he uses to fight criminals, including others who have also gained superhuman abilities.",
                poster_path = "https://upload.wikimedia.org/wikipedia/en/thumb/2/2e/The_Flash_season_6.jpg/220px-The_Flash_season_6.jpg",
                release_date = "7 Oct 2014",
                vote_average = "6.6"
            ),
            MovieResult(
                id = 18,
                original_title = "Family Guy",
                overview = "Family Guy is an American animated sitcom television series created by Seth MacFarlane for the Fox Broadcasting Company. The series centers on the Griffins, a family consisting of parents Peter and Lois; their children, Meg, Chris, and Stewie; and their anthropomorphic pet dog, Brian. The show is set in the fictional city of Quahog, Rhode Island, and exhibits much of its surreal & dark humor[2] in the form of metafictional cutaway gags that often lampoon American culture.",
                poster_path = "https://upload.wikimedia.org/wikipedia/en/thumb/5/58/Family_Guy_%28season_16%29_cover.jpg/220px-Family_Guy_%28season_16%29_cover.jpg",
                release_date = "31 Jan 1999",
                vote_average = "6.5"
            ),
            MovieResult(
                id = 19,
                original_title = "Grey’s Anatomy",
                overview = "Grey's Anatomy is a medical drama television series that premiered on March 27, 2005, on the American Broadcasting Company (ABC) as a mid-season replacement. The fictional series focuses on the lives of surgical interns, residents, and attending doctors, as they develop into seasoned doctors while trying to maintain personal lives and relationships. The title is an allusion to Gray's Anatomy, a classic human anatomy textbook first published in 1858 in London and written by Henry Gray. Shonda Rhimes developed the pilot and continues to write for the series; she is also one of the executive producers, along with Betsy Beers, Mark Gordon, Krista Vernoff, Rob Corn, Mark Wilding, and Allan Heinberg. Although the series is set in Seattle (at the fictional Seattle Grace Hospital, later renamed), it is filmed primarily in Los Angeles, California.",
                poster_path = "https://upload.wikimedia.org/wikipedia/en/thumb/e/e8/Grey%27s_Anatomy_Season_10.jpg/240px-Grey%27s_Anatomy_Season_10.jpg",
                release_date = "27 Mar 2005",
                vote_average = "6.5"
            ),
            MovieResult(
                id = 20,
                original_title = "Rick and Morty",
                overview = "Rick and Morty is an American adult animated science fiction sitcom created by Justin Roiland and Dan Harmon for Cartoon Network's late-night programming block Adult Swim. The series follows the misadventures of cynical mad scientist Rick Sanchez and his good-hearted but fretful grandson Morty Smith, who split their time between domestic life and interdimensional adventures.",
                poster_path = "https://images-na.ssl-images-amazon.com/images/I/61NWgO5keQL._AC_SY445_.jpg",
                release_date = "2 Dec 2013",
                vote_average = "8.6"
            )
        )
    }
}