package defpackage;

import com.google.android.gms.internal.ads.zzcba;
import com.google.android.gms.internal.ads.zzfac;
import com.google.android.gms.internal.ads.zzffk;
import com.google.android.gms.internal.ads.zzfru;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
public final class oj6 implements zzfru {
    public final /* synthetic */ pj6 a;

    public oj6(pj6 pj6Var) {
        this.a = pj6Var;
    }

    @Override // com.google.android.gms.internal.ads.zzfru
    @NullableDecl
    public final /* bridge */ /* synthetic */ Object apply(@NullableDecl Object obj) {
        zzcba zzcbaVar = (zzcba) obj;
        zzfac zzfacVar = new zzfac(zzcbaVar, new zzffk(zzcbaVar.zzj));
        this.a.d = zzfacVar;
        return zzfacVar;
    }
}
