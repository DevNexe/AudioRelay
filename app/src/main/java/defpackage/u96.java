package defpackage;

import com.google.android.gms.internal.ads.zzckz;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class u96 implements Runnable {
    public final /* synthetic */ String w;
    public final /* synthetic */ String x;
    public final /* synthetic */ long y;
    public final /* synthetic */ zzckz z;

    public u96(zzckz zzckzVar, String str, String str2, long j) {
        this.z = zzckzVar;
        this.w = str;
        this.x = str2;
        this.y = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put("event", "precacheComplete");
        map.put("src", this.w);
        map.put("cachedSrc", this.x);
        map.put("totalDuration", Long.toString(this.y));
        zzckz.a(this.z, map);
    }
}
