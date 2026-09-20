package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaqu extends zzarm {
    public final Map D;
    public final View E;

    public zzaqu(zzaqb zzaqbVar, String str, String str2, zzamh zzamhVar, int i, int i2, Map map, View view) {
        super(zzaqbVar, "nPgtvuonjnkWdghv0SijHg6/i9Y34D7EpYJU2u9rcQe20YVAO3kNDyZXdnFoabyE", "8k8YzM5wR7o+JxVSif6W3gUExnUXRa+1SaNfeXoc/KI=", zzamhVar, i, 85);
        this.D = map;
        this.E = view;
    }

    @Override // com.google.android.gms.internal.ads.zzarm
    public final void a() {
        long[] jArr = new long[2];
        Map map = this.D;
        jArr[0] = map.containsKey(1) ? ((Long) map.get(1)).longValue() : Long.MIN_VALUE;
        Map map2 = this.D;
        jArr[1] = map2.containsKey(2) ? ((Long) map2.get(2)).longValue() : Long.MIN_VALUE;
        long[] jArr2 = (long[]) this.A.invoke(null, jArr, this.w.zzb(), this.E);
        long j = jArr2[0];
        this.D.put(1, Long.valueOf(jArr2[1]));
        long j2 = jArr2[2];
        this.D.put(2, Long.valueOf(jArr2[3]));
        synchronized (this.z) {
            this.z.zzu(j);
            this.z.zzt(j2);
        }
    }
}
