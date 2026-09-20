package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzbev;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class zzae {
    public final String a;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:17:0x0035  */
    public final zzbev zza() {
        byte b;
        switch (this.a) {
            case "NATIVE":
                b = 2;
                break;
            case "INTERSTITIAL":
                b = 1;
                break;
            case "REWARDED":
                b = 3;
                break;
            case "BANNER":
                b = 0;
                break;
            default:
                b = -1;
                break;
        }
        if (b == 0) {
            return zzbev.BANNER;
        }
        if (b == 1) {
            return zzbev.INTERSTITIAL;
        }
        if (b != 2) {
            return b != 3 ? zzbev.AD_INITIATER_UNSPECIFIED : zzbev.REWARD_BASED_VIDEO_AD;
        }
        return zzbev.AD_LOADER;
    }

    public final String zzb() {
        return this.a.toLowerCase(Locale.ROOT);
    }

    public final Set zzc() {
        HashSet hashSet = new HashSet();
        hashSet.add(this.a.toLowerCase(Locale.ROOT));
        return hashSet;
    }
}
