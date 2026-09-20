package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class zzems extends com.google.android.gms.ads.internal.client.zzbn {
    public com.google.android.gms.ads.internal.client.zzbf A;
    public final Context w;
    public final zzcok x;
    public final zzfdl y;
    public final zzdox z;

    public zzems(zzcok zzcokVar, Context context, String str) {
        zzfdl zzfdlVar = new zzfdl();
        this.y = zzfdlVar;
        this.z = new zzdox();
        this.x = zzcokVar;
        zzfdlVar.zzs(str);
        this.w = context;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final com.google.android.gms.ads.internal.client.zzbl zze() {
        zzdoz zzdozVarZzg = this.z.zzg();
        ArrayList arrayListZzi = zzdozVarZzg.zzi();
        zzfdl zzfdlVar = this.y;
        zzfdlVar.zzB(arrayListZzi);
        zzfdlVar.zzC(zzdozVarZzg.zzh());
        if (zzfdlVar.zzg() == null) {
            zzfdlVar.zzr(com.google.android.gms.ads.internal.client.zzq.zzc());
        }
        return new zzemt(this.w, this.x, this.y, zzdozVarZzg, this.A);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzf(zzbmy zzbmyVar) {
        this.z.zza(zzbmyVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzg(zzbnb zzbnbVar) {
        this.z.zzb(zzbnbVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzh(String str, zzbnh zzbnhVar, zzbne zzbneVar) {
        this.z.zzc(str, zzbnhVar, zzbneVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzi(zzbsg zzbsgVar) {
        this.z.zzd(zzbsgVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzj(zzbnl zzbnlVar, com.google.android.gms.ads.internal.client.zzq zzqVar) {
        this.z.zze(zzbnlVar);
        this.y.zzr(zzqVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzk(zzbno zzbnoVar) {
        this.z.zzf(zzbnoVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzl(com.google.android.gms.ads.internal.client.zzbf zzbfVar) {
        this.A = zzbfVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzm(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.y.zzq(adManagerAdViewOptions);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzn(zzbrx zzbrxVar) {
        this.y.zzv(zzbrxVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzo(zzblo zzbloVar) {
        this.y.zzA(zzbloVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzp(PublisherAdViewOptions publisherAdViewOptions) {
        this.y.zzD(publisherAdViewOptions);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzq(com.google.android.gms.ads.internal.client.zzcd zzcdVar) {
        this.y.zzQ(zzcdVar);
    }
}
