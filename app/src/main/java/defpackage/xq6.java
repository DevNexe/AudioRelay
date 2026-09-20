package defpackage;

import com.google.android.gms.internal.ads.zzgac;
import com.google.android.gms.internal.ads.zzgel;
import com.google.android.gms.internal.ads.zzgem;
import com.google.android.gms.internal.ads.zzgjf;
import com.google.android.gms.internal.ads.zzgjg;
import com.google.android.gms.internal.ads.zzgnf;
import com.google.android.gms.internal.ads.zzgoz;
import com.google.android.gms.internal.ads.zzgpx;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public class xq6 implements zzgac {
    public final zzgem a;
    public final Class b;

    public xq6(zzgem zzgemVar, Class cls) {
        if (!zzgemVar.zzl().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", zzgemVar.toString(), cls.getName()));
        }
        this.a = zzgemVar;
        this.b = cls;
    }

    @Override // com.google.android.gms.internal.ads.zzgac
    public final zzgjg zza(zzgnf zzgnfVar) throws GeneralSecurityException {
        zzgem zzgemVar = this.a;
        try {
            zzgel zzgelVarZza = zzgemVar.zza();
            zzgpx zzgpxVarZzb = zzgelVarZza.zzb(zzgnfVar);
            zzgelVarZza.zzd(zzgpxVarZzb);
            zzgpx zzgpxVarZza = zzgelVarZza.zza(zzgpxVarZzb);
            zzgjf zzgjfVarZza = zzgjg.zza();
            zzgjfVarZza.zza(zzgemVar.zzc());
            zzgjfVarZza.zzb(zzgpxVarZza.zzas());
            zzgjfVarZza.zzc(zzgemVar.zzf());
            return (zzgjg) zzgjfVarZza.zzal();
        } catch (zzgoz e) {
            throw new GeneralSecurityException("Unexpected proto", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgac
    public final zzgpx zzb(zzgnf zzgnfVar) throws GeneralSecurityException {
        zzgem zzgemVar = this.a;
        try {
            zzgel zzgelVarZza = zzgemVar.zza();
            zzgpx zzgpxVarZzb = zzgelVarZza.zzb(zzgnfVar);
            zzgelVarZza.zzd(zzgpxVarZzb);
            return zzgelVarZza.zza(zzgpxVarZzb);
        } catch (zzgoz e) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(zzgemVar.zza().zzg().getName()), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgac
    public final Class zzc() {
        return this.b;
    }

    @Override // com.google.android.gms.internal.ads.zzgac
    public final Object zzd(zzgnf zzgnfVar) throws GeneralSecurityException {
        zzgem zzgemVar = this.a;
        try {
            zzgpx zzgpxVarZzb = zzgemVar.zzb(zzgnfVar);
            Class cls = this.b;
            if (Void.class.equals(cls)) {
                throw new GeneralSecurityException("Cannot create a primitive for Void");
            }
            zzgemVar.zzd(zzgpxVarZzb);
            return zzgemVar.zzk(zzgpxVarZzb, cls);
        } catch (zzgoz e) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(zzgemVar.zzj().getName()), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgac
    public final Object zze(zzgpx zzgpxVar) throws GeneralSecurityException {
        zzgem zzgemVar = this.a;
        String strConcat = "Expected proto of type ".concat(zzgemVar.zzj().getName());
        if (!zzgemVar.zzj().isInstance(zzgpxVar)) {
            throw new GeneralSecurityException(strConcat);
        }
        Class cls = this.b;
        if (Void.class.equals(cls)) {
            throw new GeneralSecurityException("Cannot create a primitive for Void");
        }
        zzgemVar.zzd(zzgpxVar);
        return zzgemVar.zzk(zzgpxVar, cls);
    }

    @Override // com.google.android.gms.internal.ads.zzgac
    public final String zzf() {
        return this.a.zzc();
    }
}
