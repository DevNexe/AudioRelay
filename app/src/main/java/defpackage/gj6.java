package defpackage;

import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.internal.ads.zzcgn;
import com.google.android.gms.internal.ads.zzecu;
import com.google.android.gms.internal.ads.zzfac;
import com.google.android.gms.internal.ads.zzfdn;
import com.google.android.gms.internal.ads.zzfru;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
public final class gj6 implements zzfru {
    public final /* synthetic */ pj6 a;

    public gj6(pj6 pj6Var) {
        this.a = pj6Var;
    }

    @Override // com.google.android.gms.internal.ads.zzfru
    @NullableDecl
    public final Object apply(@NullableDecl Object obj) {
        zzcgn.zzh("", (zzecu) obj);
        zze.zza("Failed to get a cache key, reverting to legacy flow.");
        pj6 pj6Var = this.a;
        zzfdn zzfdnVarZzg = pj6Var.b.zzg();
        zzfac zzfacVar = new zzfac(null, pj6Var.a.zzc(zzfdnVarZzg.zzd, zzfdnVarZzg.zzf, zzfdnVarZzg.zzj));
        pj6Var.d = zzfacVar;
        return zzfacVar;
    }
}
