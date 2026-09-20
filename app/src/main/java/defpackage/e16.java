package defpackage;

import com.google.android.gms.internal.ads.zzatd;
import com.google.android.gms.internal.ads.zzauu;
import com.google.android.gms.internal.ads.zzaxz;
import com.google.android.gms.internal.ads.zzayd;
import com.google.android.gms.internal.ads.zzaye;
import com.google.android.gms.internal.ads.zzbag;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class e16 implements zzaxz {
    public int w;
    public final Object x;

    public /* synthetic */ e16(zzaye zzayeVar, int i) {
        this.x = zzayeVar;
        this.w = i;
    }

    public final long a(zzauu zzauuVar) {
        Object obj = this.x;
        int i = 0;
        zzauuVar.zzg(((zzbag) obj).zza, 0, 1, false);
        int i2 = ((zzbag) obj).zza[0] & 255;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = 128;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        int i5 = i2 & (~i3);
        zzauuVar.zzg(((zzbag) obj).zza, 1, i4, false);
        while (i < i4) {
            i++;
            i5 = (((zzbag) obj).zza[i] & 255) + (i5 << 8);
        }
        this.w = i4 + 1 + this.w;
        return i5;
    }

    @Override // com.google.android.gms.internal.ads.zzaxz
    public final void zzg(zzatd zzatdVar, Object obj) {
        zzaye zzayeVar = (zzaye) this.x;
        int i = this.w;
        if (zzayeVar.C == null) {
            for (int i2 = 0; i2 <= 0; i2++) {
                zzatdVar.zzg(i2, zzayeVar.y, false);
            }
            int i3 = zzayeVar.B;
            if (i3 == -1) {
                zzayeVar.B = 1;
            } else {
                zzayd zzaydVar = i3 != 1 ? new zzayd(1) : null;
                zzayeVar.C = zzaydVar;
            }
            zzayeVar.C = zzaydVar;
        }
        if (zzayeVar.C != null) {
            return;
        }
        ArrayList arrayList = zzayeVar.x;
        arrayList.remove(zzayeVar.w[i]);
        if (i == 0) {
            zzayeVar.A = zzatdVar;
        }
        if (arrayList.isEmpty()) {
            zzayeVar.z.zzg(zzayeVar.A, null);
        }
    }
}
