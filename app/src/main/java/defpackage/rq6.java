package defpackage;

import com.google.android.gms.internal.ads.zzfsf;
import com.google.android.gms.internal.ads.zzfxu;
import com.google.android.gms.internal.ads.zzfyx;

/* JADX INFO: loaded from: classes3.dex */
public final class rq6 extends jq6 {
    public final zzfxu y;
    public final /* synthetic */ tq6 z;

    public rq6(tq6 tq6Var, zzfxu zzfxuVar) {
        this.z = tq6Var;
        zzfxuVar.getClass();
        this.y = zzfxuVar;
    }

    @Override // defpackage.jq6
    public final /* bridge */ /* synthetic */ Object a() {
        zzfxu zzfxuVar = this.y;
        zzfyx zzfyxVarZza = zzfxuVar.zza();
        zzfsf.zzd(zzfyxVarZza, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzfxuVar);
        return zzfyxVarZza;
    }

    @Override // defpackage.jq6
    public final String b() {
        return this.y.toString();
    }

    @Override // defpackage.jq6
    public final void d(Throwable th) {
        this.z.zze(th);
    }

    @Override // defpackage.jq6
    public final /* synthetic */ void e(Object obj) {
        this.z.j((zzfyx) obj);
    }

    @Override // defpackage.jq6
    public final boolean f() {
        return this.z.isDone();
    }
}
