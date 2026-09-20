package com.google.android.gms.internal.ads;

import defpackage.jr6;
import defpackage.kr6;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgev extends zzgem {
    public zzgev() {
        super(zzgij.class, new jr6(zzgaq.class, 7));
    }

    public static /* bridge */ /* synthetic */ zzgek a(int i, int i2, int i3, int i4) {
        zzgil zzgilVarZzc = zzgim.zzc();
        zzgio zzgioVarZzc = zzgip.zzc();
        zzgioVarZzc.zzb(i3);
        zzgioVarZzc.zza(i2);
        zzgilVarZzc.zzb((zzgip) zzgioVarZzc.zzal());
        zzgilVarZzc.zza(i);
        return new zzgek((zzgim) zzgilVarZzc.zzal(), i4);
    }

    public static void b(zzgip zzgipVar) throws GeneralSecurityException {
        if (zzgipVar.zza() < 10) {
            throw new GeneralSecurityException("tag size too small");
        }
        int iZzg = zzgipVar.zzg() - 2;
        if (iZzg == 1) {
            if (zzgipVar.zza() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
            return;
        }
        if (iZzg == 2) {
            if (zzgipVar.zza() > 48) {
                throw new GeneralSecurityException("tag size too big");
            }
            return;
        }
        if (iZzg == 3) {
            if (zzgipVar.zza() > 32) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (iZzg == 4) {
            if (zzgipVar.zza() > 64) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            if (iZzg != 5) {
                throw new GeneralSecurityException("unknown hash type");
            }
            if (zzgipVar.zza() > 28) {
                throw new GeneralSecurityException("tag size too big");
            }
        }
    }

    public static final void zzh(zzgij zzgijVar) throws GeneralSecurityException {
        zzgmi.zzb(zzgijVar.zza(), 0);
        if (zzgijVar.zzh().zzd() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        b(zzgijVar.zzg());
    }

    @Override // com.google.android.gms.internal.ads.zzgem
    public final zzgel zza() {
        return new kr6(zzgim.class, 4);
    }

    @Override // com.google.android.gms.internal.ads.zzgem
    public final /* synthetic */ zzgpx zzb(zzgnf zzgnfVar) {
        return zzgij.zzf(zzgnfVar, zzgnz.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgem
    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgem
    public final /* bridge */ /* synthetic */ void zzd(zzgpx zzgpxVar) throws GeneralSecurityException {
        zzh((zzgij) zzgpxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgem
    public final int zze() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzgem
    public final int zzf() {
        return 3;
    }
}
