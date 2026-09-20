package defpackage;

import com.google.android.gms.internal.ads.zzfuk;
import com.google.android.gms.internal.ads.zzfwz;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final class mo6 extends zzfuk {
    public static final zzfuk a(int i) {
        if (i < 0) {
            return zzfuk.b;
        }
        return i > 0 ? zzfuk.c : zzfuk.a;
    }

    @Override // com.google.android.gms.internal.ads.zzfuk
    public final int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfuk
    public final zzfuk zzb(int i, int i2) {
        int i3;
        if (i < i2) {
            i3 = -1;
        } else {
            i3 = i > i2 ? 1 : 0;
        }
        return a(i3);
    }

    @Override // com.google.android.gms.internal.ads.zzfuk
    public final zzfuk zzc(Object obj, Object obj2, Comparator comparator) {
        return a(comparator.compare(obj, obj2));
    }

    @Override // com.google.android.gms.internal.ads.zzfuk
    public final zzfuk zzd(boolean z, boolean z2) {
        return a(zzfwz.zza(z, z2));
    }

    @Override // com.google.android.gms.internal.ads.zzfuk
    public final zzfuk zze(boolean z, boolean z2) {
        return a(zzfwz.zza(false, false));
    }
}
