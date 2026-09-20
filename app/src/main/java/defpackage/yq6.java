package defpackage;

import com.google.android.gms.internal.ads.zzgac;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class yq6 implements br6 {
    public final /* synthetic */ zzgac a;

    public yq6(zzgac zzgacVar) {
        this.a = zzgacVar;
    }

    @Override // defpackage.br6
    public final zzgac a(Class cls) {
        zzgac zzgacVar = this.a;
        if (zzgacVar.zzc().equals(cls)) {
            return zzgacVar;
        }
        throw new InternalError("This should never be called, as we always first check supportedPrimitives.");
    }

    @Override // defpackage.br6
    public final zzgac zzb() {
        return this.a;
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
        return Collections.singleton(this.a.zzc());
    }
}
