package garnetcrow.mathilda.love.watson.garnetcrow.model

import com.squareup.otto.Bus

/**
 * Created by watson on 16/10/24.
 */

data class Album(val name: String, val time: String, val type: Int)

data class Song(val name: String, val indexOf: Int, val album: Album, val note: String)

data class GCEvent(val type: Int, val value: String)


const val ALBUM_TYPE_ALBUM = 1 // 专辑
const val ALBUM_TYPE_SINGLE = 2 // 单曲
const val ALBUM_TYPE_DVD = 3 // dvd

object EventType {
    const val YEAR_CHANGE = 1

}

object BusHelper {
    val bus = Bus()
}


object repository {

    val albumTimes = arrayOf(
            "~君の家に着くまでずっと走ってゆく~", "first soundscope~水のない晴れた海へ~", "SPARKLE~筋书き通りのスカイブルー~",
            "Crystallize~君という光~", "I'm waiting 4 you", "THE TWILIGHT VALLEY", "LOCKS",
            "STAY~夜明けのSoul~", "All Lovers", "Parallel Universe", "メモリーズ", "Terminus")

    val singleNames = arrayOf(
            "Mysterious Eyes", "君の家に着くまでずっと走ってゆく", "二人のロケット",
            "千以上の言葉を並べても...", "夏の幻", "flying",
            "Last love song", "call my name", "Timeless Sleep",
            "夢みたあとで", "スパイラル", "クリスタル.ゲージ", "泣けない夜も 泣かない朝も",
            "君という光", "僕らだけの未来", "君を飾る花を咲かそう",
            "忘れ咲き", "君の思い描いた夢 集メル HEAVEN", "晴れ時計",
            "籟・来・也", "夢・花火", "今宵エデンの片隅で",
            "まぼろし", "風とRAINBOW／この手を伸ばせば", "涙のイエスタデー",
            "世界はまわると言うけれど", "夢のひとつ", "百年の孤独",
            "Doing all right", "花は咲いて ただ摇れて",
            "Over Drive", "Smiley Nation", "Misty Mystery", "Nostalgia"
    )

    val single2000_3_29 = Album("Mysterious Eyes", "3/29/2000", ALBUM_TYPE_SINGLE)
    val single2000_3_29_2 = Album("君の家に着くまでずっと走ってゆく", "3/29/2000", ALBUM_TYPE_SINGLE)
    val single2000_5_17 = Album("二人のロケット", "5/17/2000", ALBUM_TYPE_SINGLE)
    val single2000_9_27 = Album("千以上の言葉を並べても...", "9/27/2000", ALBUM_TYPE_SINGLE)
    val single2000_10_25 = Album("夏の幻", "10/25/2000", ALBUM_TYPE_SINGLE)
    val single2000_11_29 = Album("flying", "11/29/2000", ALBUM_TYPE_SINGLE)
    val single2001_5_9 = Album("Last love song", "5/9/2001", ALBUM_TYPE_SINGLE)
    val single2001_8_8 = Album("call my name", "8/8/2001", ALBUM_TYPE_SINGLE)
    val single2001_11_21 = Album("Timeless Sleep", "11/21/2001", ALBUM_TYPE_SINGLE)
    val single2002_3_13 = Album("夢みたあとで", "3/13/2002", ALBUM_TYPE_SINGLE)
    val single2002_8_14 = Album("スパイラル", "8/14/2002", ALBUM_TYPE_SINGLE)
    val single2002_12_11 = Album("クリスタル.ゲージ", "12/11/2002", ALBUM_TYPE_SINGLE)
    val single2003_7_23 = Album("泣けない夜も 泣かない朝も", "7/23/2003", ALBUM_TYPE_SINGLE)
    val single2003_9_10 = Album("君という光", "9/10/2003", ALBUM_TYPE_SINGLE)
    val single2004_1_14 = Album("僕らだけの未来", "1/14/2004", ALBUM_TYPE_SINGLE)
    val single2004_6_16 = Album("君を飾る花を咲かそう", "6/16/2004", ALBUM_TYPE_SINGLE)
    val single2004_11_17 = Album("忘れ咲き", "11/17/2004", ALBUM_TYPE_SINGLE)
    val single2005_5_18 = Album("君の思い描いた夢 集メル HEAVEN", "5/18/2005", ALBUM_TYPE_SINGLE)
    val single2005_11_23 = Album("晴れ時計", "11/23/2005", ALBUM_TYPE_SINGLE)
    val single2006_3_1 = Album("籟・来・也", "3/1/2006", ALBUM_TYPE_SINGLE)
    val single2006_7_5 = Album("夢・花火", "7/5/2006", ALBUM_TYPE_SINGLE)
    val single2006_8_16 = Album("今宵エデンの片隅で", "8/16/2006", ALBUM_TYPE_SINGLE)
    val single2006_9_13 = Album("まぼろし", "9/13/2006", ALBUM_TYPE_SINGLE)
    val single2007_2_21 = Album("風とRAINBOW／この手を伸ばせば", "2/21/2007", ALBUM_TYPE_SINGLE)
    val single2007_7_4 = Album("涙のイエスタデー", "7/4/2007", ALBUM_TYPE_SINGLE)
    val single2007_11_14 = Album("世界はまわると言うけれど", "11/14/2007", ALBUM_TYPE_SINGLE)
    val single2008_8_13 = Album("夢のひとつ", "8/13/2008", ALBUM_TYPE_SINGLE)
    val single2008_10_22 = Album("百年の孤独", "10/22/2008", ALBUM_TYPE_SINGLE)
    val single2008_5_20 = Album("Doing all right", "5/20/2009", ALBUM_TYPE_SINGLE)
    val single2009_8_19 = Album("花は咲いて ただ摇れて", "8/19/2009", ALBUM_TYPE_SINGLE)
    val single2010_4_14 = Album("Over Drive", "4/14/2010", ALBUM_TYPE_SINGLE)
    val single2011_6_29 = Album("Smiley Nation", "6/29/2011", ALBUM_TYPE_SINGLE)
    val single2011_8_31 = Album("Misty Mystery", "8/31/2011", ALBUM_TYPE_SINGLE)
    val single2012_9_26 = Album("Nostalgia", "9/26/2012", ALBUM_TYPE_SINGLE)

    val song2000_3_29_1 = Song("Mysterious Eyes", 1, single2000_3_29, "")
    val song2000_3_29_2 = Song("Timing", 2, single2000_3_29, "")
    val songsOf2000_3_29 = arrayOf(song2000_3_29_1, song2000_3_29_2)

    val song2000_3_29_2_1 = Song("君の家に着くまでずっと走ってゆく", 1, single2000_3_29_2, "")
    val song2000_3_29_2_2 = Song("in little time", 2, single2000_3_29_2, "")
    val songsOf2000_3_29_2 = arrayOf(song2000_3_29_2_1, song2000_3_29_2_2)

    val song2000_5_17_1 = Song("二人のロケット", 1, single2000_5_17, "")
    val song2000_5_17_2 = Song("未完成な音色", 2, single2000_5_17, "")
    val songsOf2000_5_17 = arrayOf(song2000_5_17_1, song2000_5_17_2)

    val song2000_9_27_1 = Song("千以上の言葉を並べても...", 1, single2000_9_27, "")
    val song2000_9_27_2 = Song("blue bird", 2, single2000_9_27, "")
    val songsOf2000_9_27 = arrayOf(song2000_9_27_1, song2000_9_27_2)

    val song2000_10_25_1 = Song("夏の幻", 1, single2000_10_25, "")
    val song2000_10_25_2 = Song("hi-speed スペシャル oneday", 2, single2000_10_25, "")
    val songsOf2000_10_25 = arrayOf(song2000_10_25_1, song2000_10_25_2)

    val song2000_11_29_1 = Song("flying", 1, single2000_11_29, "")
    val song2000_11_29_2 = Song("Cried a little", 2, single2000_11_29, "")
    val songsOf2000_11_29 = arrayOf(song2000_11_29_1, song2000_11_29_2)

    val song2001_5_9_1 = Song("Last love song", 1, single2001_5_9, "")
    val song2001_5_9_2 = Song("Jewel Fish", 2, single2001_5_9, "")
    val songsOf2001_5_9 = arrayOf(song2001_5_9_1, song2001_5_9_2)

    val song2001_8_8_1 = Song("call my name", 1, single2001_8_8, "")
    val song2001_8_8_2 = Song("トランス・トラップ", 2, single2001_8_8, "")
    val songsOf2001_8_8 = arrayOf(song2001_8_8_1, song2001_8_8_2)

    val song2001_11_21_1 = Song("Timeless Sleep", 1, single2001_11_21, "")
    val song2001_11_21_2 = Song("whiteout", 2, single2001_11_21, "")
    val songsOf2001_11_21 = arrayOf(song2001_11_21_1, song2001_11_21_2)

    val song2002_3_13_1 = Song("夢みたあとで", 1, single2002_3_13, "")
    val song2002_3_13_2 = Song("幸福なペット", 2, single2002_3_13, "")
    val songsOf2002_3_13 = arrayOf(song2002_3_13_1, song2002_3_13_2)


    val song2002_8_14_1 = Song("スパイラル", 1, single2002_8_14, "")
    val song2002_8_14_2 = Song("夕立の庭", 2, single2002_8_14, "")
    val songsOf2002_8_14 = arrayOf(song2002_8_14_1, song2002_8_14_2)

    val song2002_12_11_1 = Song("クリスタル.ゲージ", 1, single2002_12_11, "")
    val song2002_12_11_2 = Song("Crier Girl&Crier Boy ～ice cold sky～", 2, single2002_12_11, "")
    val songsOf2002_12_11 = arrayOf(song2002_12_11_1, song2002_12_11_2)

    val song2003_7_23_1 = Song("泣けない夜も 泣かない朝も", 1, single2003_7_23, "")
    val song2003_7_23_2 = Song("For South", 2, single2003_7_23, "")
    val songsOf2003_7_23 = arrayOf(song2003_7_23_1, song2003_7_23_2)

    val song2003_9_10_1 = Song("君という光", 1, single2003_9_10, "")
    val song2003_9_10_2 = Song("夏の終わりの長い雨", 2, single2003_9_10, "")
    val songsOf2003_9_10 = arrayOf(song2003_9_10_1, song2003_9_10_2)

    val song2004_1_14_1 = Song("僕らだけの未来", 1, single2004_1_14, "")
    val song2004_1_14_2 = Song("Float World", 2, single2004_1_14, "")
    val song2004_1_14_3 = Song("lose feeling", 3, single2004_1_14, "")
    val songsOf2004_1_14 = arrayOf(song2004_1_14_1, song2004_1_14_2, song2004_1_14_3)

    val song2004_6_16_1 = Song("君を飾る花を咲かそう", 1, single2004_6_16, "")
    val song2004_6_16_2 = Song("やさしい雨", 2, single2004_6_16, "")
    val song2004_6_16_3 = Song("夜深けの流星達", 3, single2004_6_16, "")
    val songsOf2004_6_16 = arrayOf(song2004_6_16_1, song2004_6_16_2, song2004_6_16_3)

    val song2004_11_17_1 = Song("忘れ咲き", 1, single2004_11_17, "")
    val song2004_11_17_2 = Song("Flower", 2, single2004_11_17, "")
    val song2004_11_17_3 = Song("祭りのじかん", 3, single2004_11_17, "")
    val songsOf2004_11_17 = arrayOf(song2004_11_17_1, song2004_11_17_2, song2004_11_17_3)

    val song2005_5_18_1 = Song("君の思い描いた夢 集メル HEAVEN", 1, single2005_5_18, "")
    val song2005_5_18_2 = Song("Circle Days", 2, single2005_5_18, "")
    val song2005_5_18_3 = Song("いつかまた会いましょう", 3, single2005_5_18, "")
    val songsOf2005_5_18 = arrayOf(song2005_5_18_1, song2005_5_18_2, song2005_5_18_3)

    val song2005_11_23_1 = Song("晴れ時計", 1, single2005_11_23, "")
    val song2005_11_23_2 = Song("たとえば12月の夜に", 2, single2005_11_23, "")
    val song2005_11_23_3 = Song("CANDY POP", 3, single2005_11_23, "")
    val songsOf2005_11_23 = arrayOf(song2005_11_23_1, song2005_11_23_2, song2005_11_23_3)


    val song2006_3_1_1 = Song("籟・来・也", 1, single2006_3_1, "")
    val song2006_3_1_2 = Song("over blow", 2, single2006_3_1, "")
    val song2006_3_1_3 = Song("風の音だけをきいて", 3, single2006_3_1, "")
    val songsOf2006_3_1 = arrayOf(song2006_3_1_1, song2006_3_1_2, song2006_3_1_3)

    val song2006_7_5_1 = Song("夢・花火", 1, single2006_7_5, "")
    val song2006_7_5_2 = Song("His Voyage", 2, single2006_7_5, "")
    val song2006_7_5_3 = Song("Ring Ring a ding", 3, single2006_7_5, "")
    val song2006_7_5_4 = Song("rai rai ya 〜eternal blessing〜", 4, single2006_7_5, "")
    val songsOf2006_7_5 = arrayOf(song2006_7_5_1, song2006_7_5_2, song2006_7_5_3, song2006_7_5_4)

    val song2006_8_16_1 = Song("今宵エデンの片隅で", 1, single2006_8_16, "")
    val song2006_8_16_2 = Song("失われた物语", 2, single2006_8_16, "")
    val song2006_8_16_3 = Song("nonsense", 3, single2006_8_16, "")
    val songsOf2006_8_16 = arrayOf(song2006_8_16_1, song2006_8_16_2, song2006_8_16_3)

    val song2006_9_13_1 = Song("まぼろし", 1, single2006_9_13, "")
    val song2006_9_13_2 = Song("Holy ground 〜just like a \"dejavu\" arr.〜", 2, single2006_9_13, "")
    val songsOf2006_9_13 = arrayOf(song2006_9_13_1, song2006_9_13_2)

    val song2007_2_21_1 = Song("風とRAINBOW", 1, single2007_2_21, "")
    val song2007_2_21_2 = Song("この手を伸ばせば", 2, single2007_2_21, "")
    val song2007_2_21_3 = Song("廻り道", 3, single2007_2_21, "")
    val songsOf2007_2_21 = arrayOf(song2007_2_21_1, song2007_2_21_2, song2007_2_21_3)

    val song2007_7_4_1 = Song("涙のイエスタデー", 1, single2007_7_4, "")
    val song2007_7_4_2 = Song("Go For It", 2, single2007_7_4, "")
    val song2007_7_4_3 = Song("一番素敵だった日", 3, single2007_7_4, "")
    val songsOf2007_7_4 = arrayOf(song2007_7_4_1, song2007_7_4_2, song2007_7_4_3)

    val song2007_11_14_1 = Song("世界はまわると言うけれど", 1, single2007_11_14, "")
    val song2007_11_14_2 = Song("彼方まで光を", 2, single2007_11_14, "")
    val song2007_11_14_3 = Song("Argentina", 3, single2007_11_14, "")
    val songsOf2007_11_14 = arrayOf(song2007_11_14_1, song2007_11_14_2, song2007_11_14_3)

    val song2008_8_13_1 = Song("夢のひとつ", 1, single2008_8_13, "")
    val song2008_8_13_2 = Song("Love Lone Star", 2, single2008_8_13, "")
    val song2008_8_13_3 = Song("短い夏", 3, single2008_8_13, "")
    val songsOf2008_8_13 = arrayOf(song2008_8_13_1, song2008_8_13_2, song2008_8_13_3)

    val song2008_10_22_1 = Song("百年の孤独", 1, single2008_10_22, "")
    val song2008_10_22_2 = Song("Clockwork", 2, single2008_10_22, "")
    val song2008_10_22_3 = Song("Secret Path", 3, single2008_10_22, "")
    val songsOf2008_10_22 = arrayOf(song2008_10_22_1, song2008_10_22_2, song2008_10_22_3)

    val song2008_5_20_1 = Song("Doing all right", 1, single2008_5_20, "")
    val song2008_5_20_2 = Song("Nora", 2, single2008_5_20, "")
    val songsOf2008_5_20 = arrayOf(song2008_5_20_1, song2008_5_20_2)

    val song2009_8_19_1 = Song("花は咲いて ただ摇れて", 1, single2009_8_19, "")
    val song2009_8_19_2 = Song("愛に似てる", 2, single2009_8_19, "")
    val song2009_8_19_3 = Song("恋のあいまに/Elysium", 3, single2009_8_19, "")
    val songsOf2009_8_19 = arrayOf(song2009_8_19_1, song2009_8_19_2, song2009_8_19_3)

    val song2010_4_14_1 = Song("Over Drive", 1, single2010_4_14, "")
    val song2010_4_14_2 = Song("la-la-la それから 1.2.3", 2, single2010_4_14, "")
    val songsOf2010_4_14 = arrayOf(song2010_4_14_1, song2010_4_14_2)

    val song2011_6_29_1 = Song("Smiley Nation", 1, single2011_6_29, "")
    val song2011_6_29_2 = Song("八月の夜", 2, single2011_6_29, "")
    val songsOf2011_6_29 = arrayOf(song2011_6_29_1, song2011_6_29_2)

    val song2011_8_31_1 = Song("Misty Mystery", 1, single2011_8_31, "")
    val song2011_8_31_2 = Song("live", 2, single2011_8_31, "")
    val song2011_8_31_3 = Song("I can't take...", 3, single2011_8_31, "")
    val songsOf2011_8_31 = arrayOf(song2011_8_31_1, song2011_8_31_2)

    val song2012_9_26_1 = Song("Nostalgia", 1, single2012_9_26, "")
    val song2012_9_26_2 = Song("风の中のオルゴール", 2, single2012_9_26, "")
    val song2012_9_26_3 = Song("Happy swallow", 3, single2012_9_26, "")
    val songsOf2012_9_26 = arrayOf(song2012_9_26_1, song2012_9_26_2, song2012_9_26_3)

    val songsListSingle = arrayOf(songsOf2000_3_29, songsOf2000_3_29_2, songsOf2000_5_17, songsOf2000_9_27, songsOf2000_10_25, songsOf2000_11_29,
            songsOf2001_5_9, songsOf2001_8_8, songsOf2001_11_21, songsOf2002_3_13, songsOf2002_8_14, songsOf2002_12_11, songsOf2003_7_23, songsOf2003_9_10, songsOf2004_1_14, songsOf2004_6_16,
            songsOf2004_11_17, songsOf2005_5_18, songsOf2005_11_23, songsOf2006_3_1, songsOf2006_7_5, songsOf2006_8_16, songsOf2006_9_13, songsOf2007_2_21, songsOf2007_7_4,
            songsOf2007_11_14, songsOf2008_8_13, songsOf2008_10_22, songsOf2008_5_20, songsOf2009_8_19, songsOf2010_4_14, songsOf2011_6_29, songsOf2011_8_31, songsOf2012_9_26)


    val album1999 = Album("~君の家に着くまでずっと走ってゆく~", "12/4/1999", ALBUM_TYPE_ALBUM)
    val album2001 = Album("first soundscope~水のない晴れた海へ~", "1/31/2001", ALBUM_TYPE_ALBUM)
    val album2002 = Album("SPARKLE~筋书き通りのスカイブルー~", "4/1/2002", ALBUM_TYPE_ALBUM)
    val album2003 = Album("Crystallize~君という光~", "11/12/2003", ALBUM_TYPE_ALBUM)
    val album2004 = Album("I'm waiting 4 you", "12/8/2004", ALBUM_TYPE_ALBUM)
    val album2006 = Album("THE TWILIGHT VALLEY", "10/1/2006", ALBUM_TYPE_ALBUM)
    val album2008 = Album("LOCKS", "3/1/2008", ALBUM_TYPE_ALBUM)
    val album2009 = Album("STAY~夜明けのSoul~", "9/30/2009", ALBUM_TYPE_ALBUM)
    val album2010_8 = Album("All Lovers", "8/5/2010", ALBUM_TYPE_ALBUM)
    val album2010_12 = Album("Parallel Universe", "12/8/2010", ALBUM_TYPE_ALBUM)
    val album2011 = Album("メモリーズ", "12/7/2011", ALBUM_TYPE_ALBUM)
    val album2013 = Album("Terminus", "3/20/2013", ALBUM_TYPE_ALBUM)


    val song1999_1 = Song("君の家に着くまでずっと走ってゆく", 1, album1999, "")
    val song1999_2 = Song("二人のロケット", 2, album1999, "")
    val song1999_3 = Song("Sky", 3, album1999, "")
    val song1999_4 = Song("dreaming of love", 4, album1999, "")
    val song1999_5 = Song("永遠に葬れ	", 5, album1999, "")
    val song1999_6 = Song("A crown", 6, album1999, "")

    val song2001_1 = Song("水のない晴れた海へ", 1, album2001, "")
    val song2001_2 = Song("君の家に着くまでずっと走ってゆく", 2, album2001, "")
    val song2001_3 = Song("夏の幻", 3, album2001, "")
    val song2001_4 = Song("二人のロケット", 4, album2001, "")
    val song2001_5 = Song("巡り来る春に", 5, album2001, "")
    val song2001_6 = Song("HAPPY DAYS?", 6, album2001, "")
    val song2001_7 = Song("Mysterious Eyes", 7, album2001, "")
    val song2001_8 = Song("Rhythm", 8, album2001, "")
    val song2001_9 = Song("Holding you,and swinging", 9, album2001, "")
    val song2001_10 = Song("flying", 10, album2001, "")
    val song2001_11 = Song("千以上の言叶を并べても…", 11, album2001, "")
    val song2001_12 = Song("wonder land", 12, album2001, "")
    val song2001_13 = Song("夏の幻 ~secret arrange ver.~", 13, album2001, "")

    val song2002_1 = Song("夢みたあとで", 1, album2002, "")
    val song2002_2 = Song("call my name", 2, album2002, "")
    val song2002_3 = Song("Timeless Sleep", 3, album2002, "")
    val song2002_4 = Song("pray", 4, album2002, "")
    val song2002_5 = Song("Naked Story", 5, album2002, "")
    val song2002_6 = Song("Last love song", 6, album2002, "")
    val song2002_7 = Song("スカイ・ブルー", 7, album2002, "")
    val song2002_8 = Song("wish★", 8, album2002, "")
    val song2002_9 = Song("Please, forgive me", 9, album2002, "")
    val song2002_10 = Song("Holy ground", 10, album2002, "")

    val song2003_1 = Song("今日の君と明日を待つ", 1, album2003, "")
    val song2003_2 = Song("君という光", 2, album2003, "")
    val song2003_3 = Song("スパイラル", 3, album2003, "")
    val song2003_4 = Song("泣けない夜も 泣かない朝も", 4, album2003, "")
    val song2003_5 = Song("クリスタル·ゲージ", 5, album2003, "")
    val song2003_6 = Song("Marionette Fantasia", 6, album2003, "")
    val song2003_7 = Song("永遠を駆け抜ける一瞬の僕ら", 7, album2003, "")
    val song2003_8 = Song("Endless Desire", 8, album2003, "")
    val song2003_9 = Song("逃れの町", 9, album2003, "")
    val song2003_10 = Song("Only Stay", 10, album2003, "")
    val song2003_11 = Song("恋することしか出来ないみたいに", 11, album2003, "")
    val song2003_12 = Song("夢みたあとで-lightin' Grooves True meaning of love mix-", 12, album2003, "")

    val song2004_1 = Song("夕月夜", 1, album2004, "")
    val song2004_2 = Song("冷たい影", 2, album2004, "")
    val song2004_3 = Song("忘れ咲き", 3, album2004, "")
    val song2004_4 = Song("君を飾る花を咲かそう", 4, album2004, "")
    val song2004_5 = Song("U", 5, album2004, "")
    val song2004_6 = Song("fill away", 6, album2004, "")
    val song2004_7 = Song("僕らだけの未来", 7, album2004, "")
    val song2004_8 = Song("この冬の白さに", 8, album2004, "")
    val song2004_9 = Song("ブルーの森で", 9, album2004, "")
    val song2004_10 = Song("雨上がりのBlue", 10, album2004, "")
    val song2004_11 = Song("picture of world", 11, album2004, "")
    val song2004_12 = Song("Sky 〜new arranged track〜", 12, album2004, "")
    val song2004_13 = Song("君 連れ去る時の訪れを", 13, album2004, "")


    val song2006_1 = Song("Anywhere", 1, album2006, "")
    val song2006_2 = Song("まぼろし~Album arr.~", 2, album2006, "")
    val song2006_3 = Song("今宵エデンの片隅で", 3, album2006, "")
    val song2006_4 = Song("Rusty Rail", 4, album2006, "")
    val song2006_5 = Song("夢・花火", 5, album2006, "")
    val song2006_6 = Song("かくれんぼ", 6, album2006, "")
    val song2006_7 = Song("向日葵の色", 7, album2006, "")
    val song2006_8 = Song("晴れ時計", 8, album2006, "")
    val song2006_9 = Song("マージナルマン", 9, album2006, "")
    val song2006_10 = Song("籟・来・也", 10, album2006, "")
    val song2006_11 = Song("Yellow Moon", 11, album2006, "")
    val song2006_12 = Song("もうちょっとサガシテみましょう", 12, album2006, "")
    val song2006_13 = Song("春待つ花のように", 13, album2006, "")
    val song2006_14 = Song("WEEKEND", 14, album2006, "")


    val song2008_1 = Song("最後の離島", 1, album2008, "")
    val song2008_2 = Song("涙のイエスタデー(album ver.)", 2, album2008, "")
    val song2008_3 = Song("世界はまわると言うけれど", 3, album2008, "")
    val song2008_4 = Song("もう一度笑って", 4, album2008, "")
    val song2008_5 = Song("この手を伸ばせば", 5, album2008, "")
    val song2008_6 = Song("doubt", 6, album2008, "")
    val song2008_7 = Song("風とRAINBOW", 7, album2008, "")
    val song2008_8 = Song("ふたり", 8, album2008, "")
    val song2008_9 = Song("Mr.Holiday", 9, album2008, "")
    val song2008_10 = Song("The first cry", 10, album2008, "")
    val song2008_11 = Song("Love is a Bird", 11, album2008, "")

    val song2009_1 = Song("Hello Sadness", 1, album2009, "")
    val song2009_2 = Song("百年の孤独", 2, album2009, "")
    val song2009_3 = Song("花は咲いて ただ摇れて(Album ver.)", 3, album2009, "")
    val song2009_4 = Song("Elysium", 4, album2009, "")
    val song2009_5 = Song("Doing all right", 5, album2009, "")
    val song2009_6 = Song("ON THE WAY", 6, album2009, "")
    val song2009_7 = Song("Stay", 7, album2009, "")
    val song2009_8 = Song("日々のほとり", 8, album2009, "")
    val song2009_9 = Song("夢のひとつ", 9, album2009, "")
    val song2009_10 = Song("Fall in Life~Hallelujah~", 10, album2009, "")
    val song2009_11 = Song("Rainy Soul", 11, album2009, "")
    val song2009_12 = Song("恋のあいまに", 12, album2009, "")


    val song2010_8_1 = Song("Mr.Holiday", 1, album2010_8, "")
    val song2010_8_2 = Song("Love Lone Star", 2, album2010_8, "")
    val song2010_8_3 = Song("やさしい雨", 3, album2010_8, "")
    val song2010_8_4 = Song("今日の君と明日を待つ", 4, album2010_8, "")
    val song2010_8_5 = Song("CANDY POP", 5, album2010_8, "")
    val song2010_8_6 = Song("over blow", 6, album2010_8, "")
    val song2010_8_7 = Song("幸福なペット", 7, album2010_8, "")
    val song2010_8_8 = Song("Cried a little", 8, album2010_8, "")
    val song2010_8_9 = Song("U", 9, album2010_8, "")
    val song2010_8_10 = Song("春待つ花のように", 10, album2010_8, "")
    val song2010_8_11 = Song("WEEKEND", 11, album2010_8, "")
    val song2010_8_12 = Song("wonder land", 12, album2010_8, "")
    val song2010_8_13 = Song("もう一度 笑って", 13, album2010_8, "")
    val song2010_8_14 = Song("The first cry", 14, album2010_8, "")
    val song2010_8_15 = Song("恋することしか出来ないみたいに", 15, album2010_8, "")
    val song2010_8_16 = Song("空に花火", 16, album2010_8, "")

    val song2010_12_1 = Song("アオゾラ カナタ", 1, album2010_12, "")
    val song2010_12_2 = Song("As the Dew~album version~", 1, album2010_12, "")
    val song2010_12_3 = Song("Over Drive", 1, album2010_12, "")
    val song2010_12_4 = Song("tell me something", 1, album2010_12, "")
    val song2010_12_5 = Song("迷いの森", 1, album2010_12, "")
    val song2010_12_6 = Song("空に花火~orchestra session~", 1, album2010_12, "")
    val song2010_12_7 = Song("渚とシークレットデイズ", 1, album2010_12, "")
    val song2010_12_8 = Song("The crack-up", 1, album2010_12, "")
    val song2010_12_9 = Song("strangers", 1, album2010_12, "")
    val song2010_12_10 = Song("今日と明日と", 1, album2010_12, "")
    val song2010_12_11 = Song("Over Drive 〜theater version〜", 1, album2010_12, "")


    val song2011_1 = Song("Smiley Nation", 1, album2011, "")
    val song2011_2 = Song("live~When You Are Near!~", 1, album2011, "")
    val song2011_3 = Song("JUDY", 1, album2011, "")
    val song2011_4 = Song("Misty Mystery", 1, album2011, "")
    val song2011_5 = Song("一緒に暮らそう", 1, album2011, "")
    val song2011_6 = Song("メモリーズ", 1, album2011, "")
    val song2011_7 = Song("静寂のconcerto", 1, album2011, "")
    val song2011_8 = Song("創世記Ⅰ", 1, album2011, "")
    val song2011_9 = Song("ロンリーナイト", 1, album2011, "")
    val song2011_10 = Song("英雄", 1, album2011, "")
    val song2011_11 = Song("Blue Regret", 1, album2011, "")

    val song2013_1 = Song("Nostalgia", 1, album2013, "")
    val song2013_2 = Song("trade", 1, album2013, "")
    val song2013_3 = Song("Maizy", 1, album2013, "")
    val song2013_4 = Song("白い空", 1, album2013, "")
    val song2013_5 = Song("Life goes on!", 1, album2013, "")
    val song2013_6 = Song("P.S GIRL", 1, album2013, "")
    val song2013_7 = Song("海をゆく狮子", 1, album2013, "")
    val song2013_8 = Song("镜にみた梦", 1, album2013, "")
    val song2013_9 = Song("The Someone's Tale", 1, album2013, "")
    val song2013_10 = Song("closer", 1, album2013, "")


    val songsOf1999 = arrayOf(song1999_1, song1999_2, song1999_3, song1999_4, song1999_5, song1999_6)
    val songsOf2001 = arrayOf(song2001_1, song2001_2, song2001_3, song2001_4, song2001_5, song2001_6, song2001_7,
            song2001_8, song2001_9, song2001_10, song2001_11, song2001_12, song2001_13)
    val songsOf2002 = arrayOf(song2002_1, song2002_2, song2002_3, song2002_4, song2002_5, song2002_6, song2002_7, song2002_8,
            song2002_9, song2002_10)
    val songsOf2003 = arrayOf(song2003_1, song2003_2, song2003_3, song2003_4, song2003_5, song2003_6, song2003_7, song2003_8, song2003_9,
            song2003_10, song2003_11, song2003_12)
    val songsOf2004 = arrayOf(song2004_1, song2004_2, song2004_3, song2004_4, song2004_5, song2004_6, song2004_7,
            song2004_8, song2004_9, song2004_10, song2004_11, song2004_12, song2004_13)
    val songsOf2006 = arrayOf(song2006_1, song2006_2, song2006_3, song2006_4, song2006_5, song2006_6, song2006_7, song2006_8, song2006_9,
            song2006_10, song2006_11, song2006_12, song2006_13, song2006_14)
    val songsOf2008 = arrayOf(song2008_1, song2008_2, song2008_3, song2008_4, song2008_5, song2008_6, song2008_7, song2008_8, song2008_9,
            song2008_10, song2008_11)
    val songsOf2009 = arrayOf(song2009_1, song2009_2, song2009_3, song2009_4, song2009_5, song2009_6, song2009_7, song2009_8, song2009_9,
            song2009_10, song2009_11, song2009_12)
    val songsOf2010_8 = arrayOf(song2010_8_1, song2010_8_2, song2010_8_3, song2010_8_4, song2010_8_5, song2010_8_6,
            song2010_8_7, song2010_8_8, song2010_8_9, song2010_8_10, song2010_8_11, song2010_8_12,
            song2010_8_13, song2010_8_14, song2010_8_15, song2010_8_16)
    val songsOf2010_12 = arrayOf(song2010_12_1, song2010_12_2, song2010_12_3, song2010_12_4, song2010_12_5, song2010_12_6,
            song2010_12_7, song2010_12_8, song2010_12_9, song2010_12_10, song2010_12_11)
    val songsOf2011 = arrayOf(song2011_1, song2011_2, song2011_3, song2011_4, song2011_5, song2011_6, song2011_7, song2011_8,
            song2011_9, song2011_10, song2011_11)
    val songsOf2013 = arrayOf(song2013_1, song2013_2, song2013_3, song2013_4, song2013_5, song2013_6, song2013_7,
            song2013_8, song2013_9, song2013_10)

    val songsList = arrayOf(songsOf1999, songsOf2001, songsOf2002, songsOf2003, songsOf2004, songsOf2006,
            songsOf2008, songsOf2009, songsOf2010_8, songsOf2010_12, songsOf2011, songsOf2013)
}