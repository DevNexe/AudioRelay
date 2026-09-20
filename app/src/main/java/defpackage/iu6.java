package defpackage;

import com.google.android.gms.internal.ads.zzgpr;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class iu6 {
    public static final void a(Object obj, Object obj2) {
        zzgpr zzgprVar = (zzgpr) obj;
        if (zzgprVar.isEmpty()) {
            return;
        }
        Iterator it = zzgprVar.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw null;
        }
    }

    public static final boolean b(Object obj) {
        return !((zzgpr) obj).zze();
    }

    public static final zzgpr c(Object obj, Object obj2) {
        zzgpr zzgprVarZzb = (zzgpr) obj;
        zzgpr zzgprVar = (zzgpr) obj2;
        if (!zzgprVar.isEmpty()) {
            if (!zzgprVarZzb.zze()) {
                zzgprVarZzb = zzgprVarZzb.zzb();
            }
            zzgprVarZzb.zzd(zzgprVar);
        }
        return zzgprVarZzb;
    }
}
