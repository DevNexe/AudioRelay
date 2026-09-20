package com.google.android.gms.internal.ads;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzblj extends zzblr {
    public static final int E;
    public static final int F;
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final String w;
    public final ArrayList x = new ArrayList();
    public final ArrayList y = new ArrayList();
    public final int z;

    static {
        int iRgb = Color.rgb(12, 174, 206);
        E = Color.rgb(204, 204, 204);
        F = iRgb;
    }

    public zzblj(String str, List list, Integer num, Integer num2, Integer num3, int i, int i2, boolean z) {
        this.w = str;
        for (int i3 = 0; i3 < list.size(); i3++) {
            zzblm zzblmVar = (zzblm) list.get(i3);
            this.x.add(zzblmVar);
            this.y.add(zzblmVar);
        }
        this.z = num != null ? num.intValue() : E;
        this.A = num2 != null ? num2.intValue() : F;
        this.B = num3 != null ? num3.intValue() : 12;
        this.C = i;
        this.D = i2;
    }

    public final int zzb() {
        return this.C;
    }

    public final int zzc() {
        return this.D;
    }

    public final int zzd() {
        return this.z;
    }

    public final int zze() {
        return this.A;
    }

    public final int zzf() {
        return this.B;
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final String zzg() {
        return this.w;
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final List zzh() {
        return this.y;
    }

    public final List zzi() {
        return this.x;
    }
}
