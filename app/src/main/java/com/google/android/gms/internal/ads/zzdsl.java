package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.oa3;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdsl extends zzbrz implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzbll {
    public View w;
    public com.google.android.gms.ads.internal.client.zzdk x;
    public zzdoj y;
    public boolean z = false;
    public boolean A = false;

    public zzdsl(zzdoj zzdojVar, zzdoo zzdooVar) {
        this.w = zzdooVar.zzf();
        this.x = zzdooVar.zzj();
        this.y = zzdojVar;
        if (zzdooVar.zzr() != null) {
            zzdooVar.zzr().zzao(this);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        zzg();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzbsa
    public final com.google.android.gms.ads.internal.client.zzdk zzb() {
        oa3.d("#008 Must be called on the main UI thread.");
        if (!this.z) {
            return this.x;
        }
        zzcgn.zzg("getVideoController: Instream ad should not be used after destroyed");
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbsa
    public final zzblx zzc() {
        oa3.d("#008 Must be called on the main UI thread.");
        if (this.z) {
            zzcgn.zzg("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        zzdoj zzdojVar = this.y;
        if (zzdojVar == null || zzdojVar.zza() == null) {
            return null;
        }
        return zzdojVar.zza().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbsa
    public final void zzd() {
        oa3.d("#008 Must be called on the main UI thread.");
        View view = this.w;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.w);
            }
        }
        zzdoj zzdojVar = this.y;
        if (zzdojVar != null) {
            zzdojVar.zzV();
        }
        this.y = null;
        this.w = null;
        this.x = null;
        this.z = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbsa
    public final void zze(IObjectWrapper iObjectWrapper) {
        oa3.d("#008 Must be called on the main UI thread.");
        zzf(iObjectWrapper, new zzdsk());
    }

    @Override // com.google.android.gms.internal.ads.zzbsa
    public final void zzf(IObjectWrapper iObjectWrapper, zzbsd zzbsdVar) {
        oa3.d("#008 Must be called on the main UI thread.");
        if (this.z) {
            zzcgn.zzg("Instream ad can not be shown after destroy().");
            try {
                zzbsdVar.zze(2);
                return;
            } catch (RemoteException e) {
                zzcgn.zzl("#007 Could not call remote method.", e);
                return;
            }
        }
        View view = this.w;
        if (view == null || this.x == null) {
            zzcgn.zzg("Instream internal error: ".concat(view == null ? "can not get video view." : "can not get video controller."));
            try {
                zzbsdVar.zze(0);
                return;
            } catch (RemoteException e2) {
                zzcgn.zzl("#007 Could not call remote method.", e2);
                return;
            }
        }
        if (this.A) {
            zzcgn.zzg("Instream ad should not be used again.");
            try {
                zzbsdVar.zze(1);
                return;
            } catch (RemoteException e3) {
                zzcgn.zzl("#007 Could not call remote method.", e3);
                return;
            }
        }
        this.A = true;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.w);
            }
        }
        ((ViewGroup) ObjectWrapper.M0(iObjectWrapper)).addView(this.w, new ViewGroup.LayoutParams(-1, -1));
        com.google.android.gms.ads.internal.zzt.zzy();
        zzchn.zza(this.w, this);
        com.google.android.gms.ads.internal.zzt.zzy();
        zzchn.zzb(this.w, this);
        zzg();
        try {
            zzbsdVar.zzf();
        } catch (RemoteException e4) {
            zzcgn.zzl("#007 Could not call remote method.", e4);
        }
    }

    public final void zzg() {
        View view;
        zzdoj zzdojVar = this.y;
        if (zzdojVar == null || (view = this.w) == null) {
            return;
        }
        zzdojVar.zzv(view, Collections.emptyMap(), Collections.emptyMap(), zzdoj.zzP(this.w));
    }
}
