package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import defpackage.oa3;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbqt {
    public final Context a;
    public final OnH5AdsEventListener b;
    public zzbqp c;

    public zzbqt(Context context, OnH5AdsEventListener onH5AdsEventListener) {
        oa3.h(context);
        oa3.h(onH5AdsEventListener);
        this.a = context;
        this.b = onH5AdsEventListener;
        zzbiy.zzc(context);
    }

    public static final boolean zzc(String str) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzhZ)).booleanValue()) {
            return false;
        }
        oa3.h(str);
        if (str.length() > ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzib)).intValue()) {
            zzcgn.zze("H5 GMSG exceeds max length");
            return false;
        }
        Uri uri = Uri.parse(str);
        return "gmsg".equals(uri.getScheme()) && "mobileads.google.com".equals(uri.getHost()) && "/h5ads".equals(uri.getPath());
    }

    public final void zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzhZ)).booleanValue()) {
            if (this.c == null) {
                this.c = com.google.android.gms.ads.internal.client.zzaw.zza().zzk(this.a, new zzbvc(), this.b);
            }
            zzbqp zzbqpVar = this.c;
            if (zzbqpVar != null) {
                try {
                    zzbqpVar.zze();
                } catch (RemoteException e) {
                    zzcgn.zzl("#007 Could not call remote method.", e);
                }
            }
        }
    }

    public final boolean zzb(String str) {
        if (!zzc(str)) {
            return false;
        }
        if (this.c == null) {
            this.c = com.google.android.gms.ads.internal.client.zzaw.zza().zzk(this.a, new zzbvc(), this.b);
        }
        zzbqp zzbqpVar = this.c;
        if (zzbqpVar == null) {
            return false;
        }
        try {
            zzbqpVar.zzf(str);
            return true;
        } catch (RemoteException e) {
            zzcgn.zzl("#007 Could not call remote method.", e);
            return true;
        }
    }
}
