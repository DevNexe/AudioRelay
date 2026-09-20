package defpackage;

import com.google.android.gms.internal.ads.zzgac;
import com.google.android.gms.internal.ads.zzgem;
import java.security.GeneralSecurityException;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class zq6 implements br6 {
    public final /* synthetic */ zzgem a;

    public zq6(zzgem zzgemVar) {
        this.a = zzgemVar;
    }

    @Override // defpackage.br6
    public final zzgac a(Class cls) throws GeneralSecurityException {
        try {
            return new xq6(this.a, cls);
        } catch (IllegalArgumentException e) {
            throw new GeneralSecurityException("Primitive type not supported", e);
        }
    }

    @Override // defpackage.br6
    public final zzgac zzb() {
        zzgem zzgemVar = this.a;
        return new xq6(zzgemVar, zzgemVar.zzi());
    }

    @Override // defpackage.br6
    public final Class zzc() {
        return this.a.getClass();
    }

    @Override // defpackage.br6
    public final Class zzd() {
        return null;
    }

    @Override // defpackage.br6
    public final Set zze() {
        return this.a.zzl();
    }
}
