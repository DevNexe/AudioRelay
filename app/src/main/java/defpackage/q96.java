package defpackage;

import com.google.android.gms.internal.ads.zzckz;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class q96 implements Runnable {
    public final /* synthetic */ zzckz A;
    public final /* synthetic */ String w;
    public final /* synthetic */ String x;
    public final /* synthetic */ int y;
    public final /* synthetic */ int z;

    public q96(zzckz zzckzVar, String str, String str2, int i, int i2) {
        this.A = zzckzVar;
        this.w = str;
        this.x = str2;
        this.y = i;
        this.z = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put("event", "precacheProgress");
        map.put("src", this.w);
        map.put("cachedSrc", this.x);
        map.put("bytesLoaded", Integer.toString(this.y));
        map.put("totalBytes", Integer.toString(this.z));
        map.put("cacheReady", "0");
        zzckz.a(this.A, map);
    }
}
