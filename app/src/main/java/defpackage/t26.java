package defpackage;

import android.util.Pair;
import com.google.android.gms.ads.nonagon.signalgeneration.zzc;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class t26 extends LinkedHashMap {
    public final /* synthetic */ zzc w;

    public t26(zzc zzcVar) {
        this.w = zzcVar;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        synchronized (this.w) {
            int size = size();
            zzc zzcVar = this.w;
            if (size <= zzcVar.a) {
                return false;
            }
            zzcVar.f.add(new Pair((String) entry.getKey(), (String) ((Pair) entry.getValue()).second));
            return size() > this.w.a;
        }
    }
}
