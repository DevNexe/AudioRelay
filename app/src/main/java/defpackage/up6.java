package defpackage;

import com.google.android.gms.internal.ads.zzfsf;
import com.google.android.gms.internal.ads.zzfxv;
import com.google.android.gms.internal.ads.zzfyx;

/* JADX INFO: loaded from: classes3.dex */
public final class up6 extends wp6 {
    public up6(zzfyx zzfyxVar, zzfxv zzfxvVar) {
        super(zzfxvVar, zzfyxVar);
    }

    @Override // defpackage.wp6
    public final /* bridge */ /* synthetic */ Object n(Object obj, Object obj2) {
        zzfxv zzfxvVar = (zzfxv) obj;
        zzfyx zzfyxVarZza = zzfxvVar.zza(obj2);
        zzfsf.zzd(zzfyxVarZza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzfxvVar);
        return zzfyxVarZza;
    }

    @Override // defpackage.wp6
    public final /* synthetic */ void o(Object obj) {
        j((zzfyx) obj);
    }
}
