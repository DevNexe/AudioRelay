package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.google.android.gms.ads.internal.util.zzg;
import defpackage.yg6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzefh extends zzefi {
    public static final SparseArray h;
    public final Context c;
    public final zzdce d;
    public final TelephonyManager e;
    public final zzeez f;
    public int g;

    static {
        SparseArray sparseArray = new SparseArray();
        h = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), zzbgy.CONNECTED);
        int iOrdinal = NetworkInfo.DetailedState.AUTHENTICATING.ordinal();
        zzbgy zzbgyVar = zzbgy.CONNECTING;
        sparseArray.put(iOrdinal, zzbgyVar);
        sparseArray.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), zzbgyVar);
        sparseArray.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), zzbgyVar);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), zzbgy.DISCONNECTING);
        int iOrdinal2 = NetworkInfo.DetailedState.BLOCKED.ordinal();
        zzbgy zzbgyVar2 = zzbgy.DISCONNECTED;
        sparseArray.put(iOrdinal2, zzbgyVar2);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), zzbgyVar2);
        sparseArray.put(NetworkInfo.DetailedState.FAILED.ordinal(), zzbgyVar2);
        sparseArray.put(NetworkInfo.DetailedState.IDLE.ordinal(), zzbgyVar2);
        sparseArray.put(NetworkInfo.DetailedState.SCANNING.ordinal(), zzbgyVar2);
        sparseArray.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), zzbgy.SUSPENDED);
        sparseArray.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), zzbgyVar);
        sparseArray.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), zzbgyVar);
    }

    public zzefh(Context context, zzdce zzdceVar, zzeez zzeezVar, zzeev zzeevVar, zzg zzgVar) {
        super(zzeevVar, zzgVar);
        this.c = context;
        this.d = zzdceVar;
        this.f = zzeezVar;
        this.e = (TelephonyManager) context.getSystemService("phone");
    }

    public final void zzd(boolean z) {
        zzfyo.zzr(this.d.zzb(), new yg6(this, z), zzcha.zzf);
    }
}
