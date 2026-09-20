package defpackage;

import com.google.android.gms.internal.ads.zzfsf;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class xn6 extends ao6 implements Serializable {
    public transient int A;
    public final transient Map z;

    public xn6(Map map) {
        zzfsf.zze(map.isEmpty());
        this.z = map;
    }

    @Override // com.google.android.gms.internal.ads.zzfvr
    public final int zzh() {
        return this.A;
    }

    @Override // com.google.android.gms.internal.ads.zzfvr
    public final void zzr() {
        Map map = this.z;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        map.clear();
        this.A = 0;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.util.Collection] */
    @Override // com.google.android.gms.internal.ads.zzfvr
    public final boolean zzs(Object obj, Object obj2) {
        Map map = this.z;
        Collection collection = (Collection) map.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.A++;
            return true;
        }
        ?? Zza = ((hp6) this).B.zza();
        if (!Zza.add(obj2)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.A++;
        map.put(obj, Zza);
        return true;
    }
}
