package defpackage;

import android.util.Log;
import com.google.android.gms.internal.ads.zzaxh;
import com.google.android.gms.internal.ads.zzaxj;
import com.google.android.gms.internal.ads.zzaxl;
import com.google.android.gms.internal.ads.zzbag;
import com.google.android.gms.internal.ads.zzban;

/* JADX INFO: loaded from: classes3.dex */
public final class r16 {
    public static final int a = zzban.zzg("nam");
    public static final int b = zzban.zzg("trk");
    public static final int c = zzban.zzg("cmt");
    public static final int d = zzban.zzg("day");
    public static final int e = zzban.zzg("ART");
    public static final int f = zzban.zzg("too");
    public static final int g = zzban.zzg("alb");
    public static final int h = zzban.zzg("com");
    public static final int i = zzban.zzg("wrt");
    public static final int j = zzban.zzg("lyr");
    public static final int k = zzban.zzg("gen");
    public static final int l = zzban.zzg("covr");
    public static final int m = zzban.zzg("gnre");
    public static final int n = zzban.zzg("grp");
    public static final int o = zzban.zzg("disk");
    public static final int p = zzban.zzg("trkn");
    public static final int q = zzban.zzg("tmpo");
    public static final int r = zzban.zzg("cpil");
    public static final int s = zzban.zzg("aART");
    public static final int t = zzban.zzg("sonm");
    public static final int u = zzban.zzg("soal");
    public static final int v = zzban.zzg("soar");
    public static final int w = zzban.zzg("soaa");
    public static final int x = zzban.zzg("soco");
    public static final int y = zzban.zzg("rtng");
    public static final int z = zzban.zzg("pgap");
    public static final int A = zzban.zzg("sosn");
    public static final int B = zzban.zzg("tvsh");
    public static final int C = zzban.zzg("----");
    public static final String[] D = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop"};

    public static int a(zzbag zzbagVar) {
        zzbagVar.zzw(4);
        if (zzbagVar.zze() == i16.F0) {
            zzbagVar.zzw(8);
            return zzbagVar.zzg();
        }
        Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    public static zzaxj b(int i2, String str, zzbag zzbagVar, boolean z2, boolean z3) {
        int iA = a(zzbagVar);
        if (z3) {
            iA = Math.min(1, iA);
        }
        if (iA >= 0) {
            return z2 ? new zzaxl(str, null, Integer.toString(iA)) : new zzaxh("und", str, Integer.toString(iA));
        }
        Log.w("MetadataUtil", "Failed to parse uint8 attribute: ".concat(i16.a(i2)));
        return null;
    }

    public static zzaxl c(int i2, String str, zzbag zzbagVar) {
        int iZze = zzbagVar.zze();
        if (zzbagVar.zze() == i16.F0 && iZze >= 22) {
            zzbagVar.zzw(10);
            int iZzj = zzbagVar.zzj();
            if (iZzj > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(iZzj);
                String string = sb.toString();
                int iZzj2 = zzbagVar.zzj();
                if (iZzj2 > 0) {
                    string = string + "/" + iZzj2;
                }
                return new zzaxl(str, null, string);
            }
        }
        Log.w("MetadataUtil", "Failed to parse index/count attribute: ".concat(i16.a(i2)));
        return null;
    }

    public static zzaxl d(int i2, String str, zzbag zzbagVar) {
        int iZze = zzbagVar.zze();
        if (zzbagVar.zze() == i16.F0) {
            zzbagVar.zzw(8);
            return new zzaxl(str, null, zzbagVar.zzo(iZze - 16));
        }
        Log.w("MetadataUtil", "Failed to parse text attribute: ".concat(i16.a(i2)));
        return null;
    }
}
