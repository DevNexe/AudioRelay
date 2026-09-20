package defpackage;

import android.util.Log;
import com.google.android.gms.internal.ads.zzact;
import com.google.android.gms.internal.ads.zzada;
import com.google.android.gms.internal.ads.zzadi;
import com.google.android.gms.internal.ads.zzed;

/* JADX INFO: loaded from: classes3.dex */
public final class kv5 {
    public static final String[] a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    public static int a(zzed zzedVar) {
        zzedVar.zzG(4);
        if (zzedVar.zze() == 1684108385) {
            zzedVar.zzG(8);
            return zzedVar.zzk();
        }
        Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    public static zzada b(int i, String str, zzed zzedVar, boolean z, boolean z2) {
        int iA = a(zzedVar);
        if (z2) {
            iA = Math.min(1, iA);
        }
        if (iA >= 0) {
            return z ? new zzadi(str, null, Integer.toString(iA)) : new zzact("und", str, Integer.toString(iA));
        }
        Log.w("MetadataUtil", "Failed to parse uint8 attribute: ".concat(uu5.a(i)));
        return null;
    }

    public static zzadi c(int i, String str, zzed zzedVar) {
        int iZze = zzedVar.zze();
        if (zzedVar.zze() == 1684108385 && iZze >= 22) {
            zzedVar.zzG(10);
            int iZzo = zzedVar.zzo();
            if (iZzo > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(iZzo);
                String string = sb.toString();
                int iZzo2 = zzedVar.zzo();
                if (iZzo2 > 0) {
                    string = string + "/" + iZzo2;
                }
                return new zzadi(str, null, string);
            }
        }
        Log.w("MetadataUtil", "Failed to parse index/count attribute: ".concat(uu5.a(i)));
        return null;
    }

    public static zzadi d(int i, String str, zzed zzedVar) {
        int iZze = zzedVar.zze();
        if (zzedVar.zze() == 1684108385) {
            zzedVar.zzG(8);
            return new zzadi(str, null, zzedVar.zzw(iZze - 16));
        }
        Log.w("MetadataUtil", "Failed to parse text attribute: ".concat(uu5.a(i)));
        return null;
    }
}
