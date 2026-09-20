package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzcha;
import com.google.android.gms.internal.ads.zzebr;
import com.google.android.gms.internal.ads.zzfyy;
import com.google.android.gms.internal.ads.zzgur;
import com.google.android.gms.internal.ads.zzguz;
import com.google.android.gms.internal.ads.zzgve;

/* JADX INFO: loaded from: classes.dex */
public final class zzal implements zzgur {
    public final zzgve a;
    public final zzgve b;

    public zzal(zzgve zzgveVar, zzgve zzgveVar2) {
        this.a = zzgveVar;
        this.b = zzgveVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgve
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzak zzb() {
        zzfyy zzfyyVar = zzcha.zza;
        zzguz.zzb(zzfyyVar);
        return new zzak(zzfyyVar, ((zzebr) this.b).zzb());
    }
}
