package defpackage;

import com.google.android.gms.internal.ads.zzckz;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class s96 implements Runnable {
    public final /* synthetic */ long A;
    public final /* synthetic */ long B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ int D;
    public final /* synthetic */ int E;
    public final /* synthetic */ zzckz F;
    public final /* synthetic */ String w;
    public final /* synthetic */ String x;
    public final /* synthetic */ int y;
    public final /* synthetic */ int z;

    public s96(zzckz zzckzVar, String str, String str2, int i, int i2, long j, long j2, boolean z, int i3, int i4) {
        this.F = zzckzVar;
        this.w = str;
        this.x = str2;
        this.y = i;
        this.z = i2;
        this.A = j;
        this.B = j2;
        this.C = z;
        this.D = i3;
        this.E = i4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put("event", "precacheProgress");
        map.put("src", this.w);
        map.put("cachedSrc", this.x);
        map.put("bytesLoaded", Integer.toString(this.y));
        map.put("totalBytes", Integer.toString(this.z));
        map.put("bufferedDuration", Long.toString(this.A));
        map.put("totalDuration", Long.toString(this.B));
        map.put("cacheReady", true != this.C ? "0" : "1");
        map.put("playerCount", Integer.toString(this.D));
        map.put("playerPreparedCount", Integer.toString(this.E));
        zzckz.a(this.F, map);
    }
}
