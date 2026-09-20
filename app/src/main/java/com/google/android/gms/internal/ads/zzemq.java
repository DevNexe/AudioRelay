package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzbr;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.oa3;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public final class zzemq extends zzbr {
    public final FrameLayout A;
    public final Context w;
    public final com.google.android.gms.ads.internal.client.zzbf x;
    public final zzfdn y;
    public final zzcxa z;

    public zzemq(Context context, com.google.android.gms.ads.internal.client.zzbf zzbfVar, zzfdn zzfdnVar, zzcxa zzcxaVar) {
        this.w = context;
        this.x = zzbfVar;
        this.y = zzfdnVar;
        this.z = zzcxaVar;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.removeAllViews();
        View viewZzc = zzcxaVar.zzc();
        com.google.android.gms.ads.internal.zzt.zzq();
        frameLayout.addView(viewZzc, com.google.android.gms.ads.internal.util.zzs.zzn());
        frameLayout.setMinimumHeight(zzg().zzc);
        frameLayout.setMinimumWidth(zzg().zzf);
        this.A = frameLayout;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzA() {
        this.z.zzg();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzB() {
        oa3.d("destroy must be called on the main UI thread.");
        this.z.zzm().zzc(null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzC(com.google.android.gms.ads.internal.client.zzbc zzbcVar) {
        zzcgn.zzi("setAdClickListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzD(com.google.android.gms.ads.internal.client.zzbf zzbfVar) {
        zzcgn.zzi("setAdListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzE(com.google.android.gms.ads.internal.client.zzbw zzbwVar) {
        zzcgn.zzi("setAdMetadataListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzF(com.google.android.gms.ads.internal.client.zzq zzqVar) {
        oa3.d("setAdSize must be called on the main UI thread.");
        zzcxa zzcxaVar = this.z;
        if (zzcxaVar != null) {
            zzcxaVar.zzh(this.A, zzqVar);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzG(com.google.android.gms.ads.internal.client.zzbz zzbzVar) {
        zzeno zzenoVar = this.y.zzc;
        if (zzenoVar != null) {
            zzenoVar.zzi(zzbzVar);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzH(zzbdi zzbdiVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzI(com.google.android.gms.ads.internal.client.zzw zzwVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzJ(com.google.android.gms.ads.internal.client.zzcg zzcgVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzK(com.google.android.gms.ads.internal.client.zzdo zzdoVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzL(boolean z) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzM(zzbzj zzbzjVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzN(boolean z) {
        zzcgn.zzi("setManualImpressionsEnabled is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzO(zzbjt zzbjtVar) {
        zzcgn.zzi("setOnCustomRenderedAdLoadedListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzP(com.google.android.gms.ads.internal.client.zzde zzdeVar) {
        zzcgn.zzi("setOnPaidEventListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzQ(zzbzm zzbzmVar, String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzR(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzS(zzcbw zzcbwVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzT(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzU(com.google.android.gms.ads.internal.client.zzff zzffVar) {
        zzcgn.zzi("setVideoOptions is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzW(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzX() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final boolean zzY() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final boolean zzZ() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final boolean zzaa(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        zzcgn.zzi("loadAd is not supported for an Ad Manager AdView returned from AdLoader.");
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzab(com.google.android.gms.ads.internal.client.zzcd zzcdVar) {
        zzcgn.zzi("setCorrelationIdProvider is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final Bundle zzd() {
        zzcgn.zzi("getAdMetadata is not supported in Ad Manager AdView returned by AdLoader.");
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final com.google.android.gms.ads.internal.client.zzq zzg() {
        oa3.d("getAdSize must be called on the main UI thread.");
        return zzfdr.zza(this.w, Collections.singletonList(this.z.zze()));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final com.google.android.gms.ads.internal.client.zzbf zzi() {
        return this.x;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final com.google.android.gms.ads.internal.client.zzbz zzj() {
        return this.y.zzn;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final com.google.android.gms.ads.internal.client.zzdh zzk() {
        return this.z.zzl();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final com.google.android.gms.ads.internal.client.zzdk zzl() {
        return this.z.zzd();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final IObjectWrapper zzn() {
        return new ObjectWrapper(this.A);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final String zzr() {
        return this.y.zzf;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final String zzs() {
        zzcxa zzcxaVar = this.z;
        if (zzcxaVar.zzl() != null) {
            return zzcxaVar.zzl().zzg();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final String zzt() {
        zzcxa zzcxaVar = this.z;
        if (zzcxaVar.zzl() != null) {
            return zzcxaVar.zzl().zzg();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzx() {
        oa3.d("destroy must be called on the main UI thread.");
        this.z.zzV();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzy(com.google.android.gms.ads.internal.client.zzl zzlVar, com.google.android.gms.ads.internal.client.zzbi zzbiVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzz() {
        oa3.d("destroy must be called on the main UI thread.");
        this.z.zzm().zzb(null);
    }
}
