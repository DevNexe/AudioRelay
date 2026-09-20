package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.internal.ads.zzcmn;
import defpackage.nj6;

/* JADX INFO: loaded from: classes.dex */
public final class zzh {
    public final int zza;
    public final ViewGroup.LayoutParams zzb;
    public final ViewGroup zzc;
    public final Context zzd;

    public zzh(zzcmn zzcmnVar) throws nj6 {
        this.zzb = zzcmnVar.getLayoutParams();
        ViewParent parent = zzcmnVar.getParent();
        this.zzd = zzcmnVar.zzG();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new nj6("Could not get the parent of the WebView for an overlay.");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        this.zzc = viewGroup;
        this.zza = viewGroup.indexOfChild(zzcmnVar.zzH());
        viewGroup.removeView(zzcmnVar.zzH());
        zzcmnVar.zzap(true);
    }
}
