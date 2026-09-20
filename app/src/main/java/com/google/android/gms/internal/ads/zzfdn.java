package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfdn {
    public final com.google.android.gms.ads.internal.client.zzff zza;
    public final zzbrx zzb;
    public final zzeno zzc;
    public final com.google.android.gms.ads.internal.client.zzl zzd;
    public final com.google.android.gms.ads.internal.client.zzq zze;
    public final String zzf;
    public final ArrayList zzg;
    public final ArrayList zzh;
    public final zzblo zzi;
    public final com.google.android.gms.ads.internal.client.zzw zzj;
    public final int zzk;
    public final AdManagerAdViewOptions zzl;
    public final PublisherAdViewOptions zzm;
    public final com.google.android.gms.ads.internal.client.zzbz zzn;
    public final zzfda zzo;
    public final boolean zzp;
    public final boolean zzq;
    public final com.google.android.gms.ads.internal.client.zzcd zzr;

    public /* synthetic */ zzfdn(zzfdl zzfdlVar) {
        this.zze = zzfdlVar.b;
        this.zzf = zzfdlVar.c;
        this.zzr = zzfdlVar.s;
        com.google.android.gms.ads.internal.client.zzl zzlVar = zzfdlVar.a;
        this.zzd = new com.google.android.gms.ads.internal.client.zzl(zzlVar.zza, zzlVar.zzb, zzlVar.zzc, zzlVar.zzd, zzlVar.zze, zzlVar.zzf, zzlVar.zzg, zzlVar.zzh || zzfdlVar.e, zzlVar.zzi, zzlVar.zzj, zzlVar.zzk, zzlVar.zzl, zzlVar.zzm, zzlVar.zzn, zzlVar.zzo, zzlVar.zzp, zzlVar.zzq, zzlVar.zzr, zzlVar.zzs, zzlVar.zzt, zzlVar.zzu, zzlVar.zzv, com.google.android.gms.ads.internal.util.zzs.zza(zzlVar.zzw), zzfdlVar.a.zzx);
        com.google.android.gms.ads.internal.client.zzff zzffVar = zzfdlVar.d;
        zzblo zzbloVar = null;
        if (zzffVar == null) {
            zzblo zzbloVar2 = zzfdlVar.h;
            zzffVar = zzbloVar2 != null ? zzbloVar2.zzf : null;
        }
        this.zza = zzffVar;
        ArrayList arrayList = zzfdlVar.f;
        this.zzg = arrayList;
        this.zzh = zzfdlVar.g;
        if (arrayList != null && (zzbloVar = zzfdlVar.h) == null) {
            zzbloVar = new zzblo(new NativeAdOptions.Builder().build());
        }
        this.zzi = zzbloVar;
        this.zzj = zzfdlVar.i;
        this.zzk = zzfdlVar.m;
        this.zzl = zzfdlVar.j;
        this.zzm = zzfdlVar.k;
        this.zzn = zzfdlVar.l;
        this.zzb = zzfdlVar.n;
        this.zzo = new zzfda(zzfdlVar.o);
        this.zzp = zzfdlVar.p;
        this.zzc = zzfdlVar.q;
        this.zzq = zzfdlVar.r;
    }

    public final zzbnr zza() {
        PublisherAdViewOptions publisherAdViewOptions = this.zzm;
        if (publisherAdViewOptions == null && this.zzl == null) {
            return null;
        }
        return publisherAdViewOptions != null ? publisherAdViewOptions.zzb() : this.zzl.zza();
    }
}
