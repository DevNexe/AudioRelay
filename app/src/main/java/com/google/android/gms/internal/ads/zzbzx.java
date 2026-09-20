package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.query.UpdateClickUrlCallback;
import com.google.android.gms.ads.query.UpdateImpressionUrlsCallback;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import javax.annotation.Nonnull;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbzx {

    @Nonnull
    public final View a;
    public final zzcfe b;

    public zzbzx(zzbzw zzbzwVar) {
        View view = zzbzwVar.a;
        this.a = view;
        HashMap map = zzbzwVar.b;
        zzcfe zzcfeVarZza = zzbzr.zza(view.getContext());
        this.b = zzcfeVarZza;
        if (zzcfeVarZza == null || map.isEmpty()) {
            return;
        }
        try {
            zzcfeVarZza.zzf(new zzbzy(new ObjectWrapper(view), new ObjectWrapper(map)));
        } catch (RemoteException unused) {
            zzcgn.zzg("Failed to call remote method.");
        }
    }

    public final void zza(List list) {
        if (list == null || list.isEmpty()) {
            zzcgn.zzj("No click urls were passed to recordClick");
            return;
        }
        zzcfe zzcfeVar = this.b;
        if (zzcfeVar == null) {
            zzcgn.zzj("Failed to get internal reporting info generator in recordClick.");
        }
        try {
            zzcfeVar.zzg(list, new ObjectWrapper(this.a), new zzbzv(list));
        } catch (RemoteException e) {
            zzcgn.zzg("RemoteException recording click: ".concat(e.toString()));
        }
    }

    public final void zzb(List list) {
        if (list == null || list.isEmpty()) {
            zzcgn.zzj("No impression urls were passed to recordImpression");
            return;
        }
        zzcfe zzcfeVar = this.b;
        if (zzcfeVar == null) {
            zzcgn.zzj("Failed to get internal reporting info generator from recordImpression.");
            return;
        }
        try {
            zzcfeVar.zzh(list, new ObjectWrapper(this.a), new zzbzu(list));
        } catch (RemoteException e) {
            zzcgn.zzg("RemoteException recording impression urls: ".concat(e.toString()));
        }
    }

    public final void zzc(MotionEvent motionEvent) {
        zzcfe zzcfeVar = this.b;
        if (zzcfeVar == null) {
            zzcgn.zze("Failed to get internal reporting info generator.");
            return;
        }
        try {
            zzcfeVar.zzj(new ObjectWrapper(motionEvent));
        } catch (RemoteException unused) {
            zzcgn.zzg("Failed to call remote method.");
        }
    }

    public final void zzd(Uri uri, UpdateClickUrlCallback updateClickUrlCallback) {
        zzcfe zzcfeVar = this.b;
        if (zzcfeVar == null) {
            updateClickUrlCallback.onFailure("Failed to get internal reporting info generator.");
        }
        try {
            zzcfeVar.zzk(new ArrayList(Arrays.asList(uri)), new ObjectWrapper(this.a), new zzbzt(updateClickUrlCallback));
        } catch (RemoteException e) {
            updateClickUrlCallback.onFailure("Internal error: ".concat(e.toString()));
        }
    }

    public final void zze(List list, UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        zzcfe zzcfeVar = this.b;
        if (zzcfeVar == null) {
            updateImpressionUrlsCallback.onFailure("Failed to get internal reporting info generator.");
        }
        try {
            zzcfeVar.zzl(list, new ObjectWrapper(this.a), new zzbzs(updateImpressionUrlsCallback));
        } catch (RemoteException e) {
            updateImpressionUrlsCallback.onFailure("Internal error: ".concat(e.toString()));
        }
    }
}
