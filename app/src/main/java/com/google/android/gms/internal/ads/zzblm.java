package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
public final class zzblm extends zzblz {
    public final int A;
    public final Drawable w;
    public final Uri x;
    public final double y;
    public final int z;

    public zzblm(Drawable drawable, Uri uri, double d, int i, int i2) {
        this.w = drawable;
        this.x = uri;
        this.y = d;
        this.z = i;
        this.A = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzbma
    public final double zzb() {
        return this.y;
    }

    @Override // com.google.android.gms.internal.ads.zzbma
    public final int zzc() {
        return this.A;
    }

    @Override // com.google.android.gms.internal.ads.zzbma
    public final int zzd() {
        return this.z;
    }

    @Override // com.google.android.gms.internal.ads.zzbma
    public final Uri zze() {
        return this.x;
    }

    @Override // com.google.android.gms.internal.ads.zzbma
    public final IObjectWrapper zzf() {
        return new ObjectWrapper(this.w);
    }
}
