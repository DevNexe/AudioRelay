package defpackage;

import com.google.android.gms.internal.ads.zzckz;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class t96 implements Runnable {
    public final /* synthetic */ String w;
    public final /* synthetic */ String x;
    public final /* synthetic */ int y;
    public final /* synthetic */ zzckz z;

    public t96(zzckz zzckzVar, String str, String str2, int i) {
        this.z = zzckzVar;
        this.w = str;
        this.x = str2;
        this.y = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put("event", "precacheComplete");
        map.put("src", this.w);
        map.put("cachedSrc", this.x);
        map.put("totalBytes", Integer.toString(this.y));
        zzckz.a(this.z, map);
    }
}
