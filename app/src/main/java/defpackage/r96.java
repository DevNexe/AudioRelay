package defpackage;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbiy;
import com.google.android.gms.internal.ads.zzckz;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class r96 implements Runnable {
    public final /* synthetic */ long A;
    public final /* synthetic */ long B;
    public final /* synthetic */ long C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ int E;
    public final /* synthetic */ int F;
    public final /* synthetic */ zzckz G;
    public final /* synthetic */ String w;
    public final /* synthetic */ String x;
    public final /* synthetic */ long y;
    public final /* synthetic */ long z;

    public r96(zzckz zzckzVar, String str, String str2, long j, long j2, long j3, long j4, long j5, boolean z, int i, int i2) {
        this.G = zzckzVar;
        this.w = str;
        this.x = str2;
        this.y = j;
        this.z = j2;
        this.A = j3;
        this.B = j4;
        this.C = j5;
        this.D = z;
        this.E = i;
        this.F = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put("event", "precacheProgress");
        map.put("src", this.w);
        map.put("cachedSrc", this.x);
        map.put("bufferedDuration", Long.toString(this.y));
        map.put("totalDuration", Long.toString(this.z));
        if (((Boolean) zzay.zzc().zzb(zzbiy.zzbB)).booleanValue()) {
            map.put("qoeLoadedBytes", Long.toString(this.A));
            map.put("qoeCachedBytes", Long.toString(this.B));
            map.put("totalBytes", Long.toString(this.C));
            map.put("reportTime", Long.toString(zzt.zzB().b()));
        }
        map.put("cacheReady", true != this.D ? "0" : "1");
        map.put("playerCount", Integer.toString(this.E));
        map.put("playerPreparedCount", Integer.toString(this.F));
        zzckz.a(this.G, map);
    }
}
