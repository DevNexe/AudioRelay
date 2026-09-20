package defpackage;

import com.google.android.gms.internal.ads.zzgow;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class cu6 extends du6 {
    @Override // defpackage.du6
    public final List a(long j, Object obj) {
        zzgow zzgowVar = (zzgow) nv6.l(j, obj);
        if (zzgowVar.zzc()) {
            return zzgowVar;
        }
        int size = zzgowVar.size();
        zzgow zzgowVarZzd = zzgowVar.zzd(size == 0 ? 10 : size + size);
        nv6.u(j, obj, zzgowVarZzd);
        return zzgowVarZzd;
    }

    @Override // defpackage.du6
    public final void b(long j, Object obj) {
        ((zzgow) nv6.l(j, obj)).zzb();
    }

    @Override // defpackage.du6
    public final void c(long j, Object obj, Object obj2) {
        zzgow zzgowVarZzd = (zzgow) nv6.l(j, obj);
        zzgow zzgowVar = (zzgow) nv6.l(j, obj2);
        int size = zzgowVarZzd.size();
        int size2 = zzgowVar.size();
        if (size > 0 && size2 > 0) {
            if (!zzgowVarZzd.zzc()) {
                zzgowVarZzd = zzgowVarZzd.zzd(size2 + size);
            }
            zzgowVarZzd.addAll(zzgowVar);
        }
        if (size > 0) {
            zzgowVar = zzgowVarZzd;
        }
        nv6.u(j, obj, zzgowVar);
    }
}
