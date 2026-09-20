package defpackage;

import com.google.android.gms.internal.ads.zzfsg;
import com.google.android.gms.internal.ads.zzful;
import com.google.android.gms.internal.ads.zzfwq;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class mk6 extends zzful {
    public final Map w;

    public mk6(Map map) {
        this.w = map;
    }

    @Override // com.google.android.gms.internal.ads.zzful, com.google.android.gms.internal.ads.zzfum
    public final /* synthetic */ Object a() {
        return this.w;
    }

    @Override // com.google.android.gms.internal.ads.zzful
    public final Map c() {
        return this.w;
    }

    @Override // com.google.android.gms.internal.ads.zzful, java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && super.containsKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzful, java.util.Map
    public final boolean containsValue(Object obj) {
        Iterator it = entrySet().iterator();
        it.getClass();
        if (obj == null) {
            while (it.hasNext()) {
                if (((Map.Entry) it.next()).getValue() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(((Map.Entry) it.next()).getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzful, java.util.Map
    public final Set entrySet() {
        return zzfwq.zzb(this.w.entrySet(), new zzfsg() { // from class: com.google.android.gms.internal.ads.zzfe
            @Override // com.google.android.gms.internal.ads.zzfsg
            public final boolean zza(Object obj) {
                return ((Map.Entry) obj).getKey() != null;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzful, java.util.Map
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (obj != null) {
            if (this == obj) {
                zEquals = true;
            } else {
                zEquals = obj instanceof Map ? entrySet().equals(((Map) obj).entrySet()) : false;
            }
            if (zEquals) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzful, java.util.Map
    public final /* synthetic */ Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.w.get(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzful, java.util.Map
    public final int hashCode() {
        return zzfwq.a(entrySet());
    }

    @Override // com.google.android.gms.internal.ads.zzful, java.util.Map
    public final boolean isEmpty() {
        if (this.w.isEmpty()) {
            return true;
        }
        return super.size() == 1 && super.containsKey(null);
    }

    @Override // com.google.android.gms.internal.ads.zzful, java.util.Map
    public final Set keySet() {
        return zzfwq.zzb(this.w.keySet(), new zzfsg() { // from class: com.google.android.gms.internal.ads.zzff
            @Override // com.google.android.gms.internal.ads.zzfsg
            public final boolean zza(Object obj) {
                return ((String) obj) != null;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzful, java.util.Map
    public final int size() {
        return super.size() - (super.containsKey(null) ? 1 : 0);
    }
}
