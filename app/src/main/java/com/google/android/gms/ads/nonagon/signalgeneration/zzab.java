package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import com.google.android.gms.internal.ads.zzapb;
import com.google.android.gms.internal.ads.zzcha;
import com.google.android.gms.internal.ads.zzcok;
import com.google.android.gms.internal.ads.zzcoq;
import com.google.android.gms.internal.ads.zzcpa;
import com.google.android.gms.internal.ads.zzdxt;
import com.google.android.gms.internal.ads.zzfej;
import com.google.android.gms.internal.ads.zzfju;
import com.google.android.gms.internal.ads.zzfyy;
import com.google.android.gms.internal.ads.zzgur;
import com.google.android.gms.internal.ads.zzguz;
import com.google.android.gms.internal.ads.zzgve;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class zzab implements zzgur {
    public final zzgve a;
    public final zzgve b;
    public final zzgve c;
    public final zzgve d;
    public final zzgve e;
    public final zzgve f;
    public final zzgve g;
    public final zzgve h;
    public final zzgve i;

    public zzab(zzgve zzgveVar, zzgve zzgveVar2, zzgve zzgveVar3, zzgve zzgveVar4, zzgve zzgveVar5, zzgve zzgveVar6, zzgve zzgveVar7, zzgve zzgveVar8, zzgve zzgveVar9) {
        this.a = zzgveVar;
        this.b = zzgveVar2;
        this.c = zzgveVar3;
        this.d = zzgveVar4;
        this.e = zzgveVar5;
        this.f = zzgveVar6;
        this.g = zzgveVar7;
        this.h = zzgveVar8;
        this.i = zzgveVar9;
    }

    @Override // com.google.android.gms.internal.ads.zzgve
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzcok zzcokVar = (zzcok) this.a.zzb();
        Context contextZza = ((zzcoq) this.b).zza();
        zzapb zzapbVar = (zzapb) this.c.zzb();
        zzfej zzfejVar = (zzfej) this.d.zzb();
        zzfyy zzfyyVar = zzcha.zza;
        zzguz.zzb(zzfyyVar);
        return new zzaa(zzcokVar, contextZza, zzapbVar, zzfejVar, zzfyyVar, (ScheduledExecutorService) this.f.zzb(), (zzdxt) this.g.zzb(), (zzfju) this.h.zzb(), ((zzcpa) this.i).zza());
    }
}
