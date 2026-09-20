package defpackage;

import com.google.android.gms.internal.ads.zzgac;
import com.google.android.gms.internal.ads.zzgem;
import com.google.android.gms.internal.ads.zzgeo;
import java.security.GeneralSecurityException;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class ar6 implements br6 {
    public final /* synthetic */ zzgeo a;
    public final /* synthetic */ zzgem b;

    public ar6(zzgeo zzgeoVar, zzgem zzgemVar) {
        this.a = zzgeoVar;
        this.b = zzgemVar;
    }

    @Override // defpackage.br6
    public final zzgac a(Class cls) throws GeneralSecurityException {
        try {
            return new gr6(this.a, cls);
        } catch (IllegalArgumentException e) {
            throw new GeneralSecurityException("Primitive type not supported", e);
        }
    }

    @Override // defpackage.br6
    public final zzgac zzb() {
        zzgeo zzgeoVar = this.a;
        return new gr6(zzgeoVar, zzgeoVar.zzi());
    }

    @Override // defpackage.br6
    public final Class zzc() {
        return this.a.getClass();
    }

    @Override // defpackage.br6
    public final Class zzd() {
        return this.b.getClass();
    }

    @Override // defpackage.br6
    public final Set zze() {
        return this.a.zzl();
    }
}
