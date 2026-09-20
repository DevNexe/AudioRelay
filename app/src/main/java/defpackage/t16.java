package defpackage;

import com.google.android.gms.internal.ads.zzauu;
import com.google.android.gms.internal.ads.zzbag;
import com.google.android.gms.internal.ads.zzban;
import java.io.EOFException;

/* JADX INFO: loaded from: classes3.dex */
public final class t16 {
    public static final int[] a = {zzban.zzg("isom"), zzban.zzg("iso2"), zzban.zzg("iso3"), zzban.zzg("iso4"), zzban.zzg("iso5"), zzban.zzg("iso6"), zzban.zzg("avc1"), zzban.zzg("hvc1"), zzban.zzg("hev1"), zzban.zzg("mp41"), zzban.zzg("mp42"), zzban.zzg("3g2a"), zzban.zzg("3g2b"), zzban.zzg("3gr6"), zzban.zzg("3gs6"), zzban.zzg("3ge6"), zzban.zzg("3gg6"), zzban.zzg("M4V "), zzban.zzg("M4A "), zzban.zzg("f4v "), zzban.zzg("kddi"), zzban.zzg("M4VP"), zzban.zzg("qt  "), zzban.zzg("MSNV")};

    public static boolean a(zzauu zzauuVar, boolean z) throws InterruptedException, EOFException {
        boolean z2;
        long jZzn;
        int i;
        long jZzc = zzauuVar.zzc();
        if (jZzc == -1 || jZzc > 4096) {
            jZzc = 4096;
        }
        int i2 = (int) jZzc;
        zzbag zzbagVar = new zzbag(64);
        int i3 = 0;
        boolean z3 = false;
        while (true) {
            if (i3 < i2) {
                zzbagVar.zzs(8);
                zzauuVar.zzg(zzbagVar.zza, 0, 8, false);
                long jZzm = zzbagVar.zzm();
                int iZze = zzbagVar.zze();
                if (jZzm == 1) {
                    zzauuVar.zzg(zzbagVar.zza, 8, 8, false);
                    i = 16;
                    zzbagVar.zzu(16);
                    jZzn = zzbagVar.zzn();
                } else {
                    jZzn = jZzm;
                    i = 8;
                }
                long j = i;
                if (jZzn < j) {
                    return false;
                }
                i3 += i;
                if (iZze != i16.C) {
                    if (iZze == i16.L || iZze == i16.N) {
                        z2 = true;
                        return !z3 && z == z2;
                    }
                    if ((((long) i3) + jZzn) - j < i2) {
                        int i4 = (int) (jZzn - j);
                        i3 += i4;
                        if (iZze == i16.b) {
                            if (i4 < 8) {
                                return false;
                            }
                            zzbagVar.zzs(i4);
                            zzauuVar.zzg(zzbagVar.zza, 0, i4, false);
                            int i5 = i4 >> 2;
                            for (int i6 = 0; i6 < i5; i6++) {
                                if (i6 != 1) {
                                    int iZze2 = zzbagVar.zze();
                                    if ((iZze2 >>> 8) != zzban.zzg("3gp")) {
                                        int[] iArr = a;
                                        int length = iArr.length;
                                        int i7 = 0;
                                        while (true) {
                                            if (i7 >= 24) {
                                                continue;
                                            } else if (iArr[i7] != iZze2) {
                                                i7++;
                                            }
                                        }
                                    }
                                    z3 = true;
                                    break;
                                }
                                zzbagVar.zzw(4);
                            }
                            if (!z3) {
                                return false;
                            }
                        } else if (i4 != 0) {
                            zzauuVar.zzf(i4, false);
                        }
                    }
                }
            }
            z2 = false;
            if (z3) {
            }
        }
    }
}
