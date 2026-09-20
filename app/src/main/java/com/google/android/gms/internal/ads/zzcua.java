package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcua implements zzctu {
    public final zzeai a;

    public zzcua(zzeai zzeaiVar) {
        this.a = zzeaiVar;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0033  */
    @Override // com.google.android.gms.internal.ads.zzctu
    public final void zza(Map map) {
        byte b;
        String str = (String) map.get("gesture");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int iHashCode = str.hashCode();
        if (iHashCode != 97520651) {
            if (iHashCode == 109399814 && str.equals("shake")) {
                b = 0;
            } else {
                b = -1;
            }
        } else if (str.equals("flick")) {
            b = 1;
        } else {
            b = -1;
        }
        zzeai zzeaiVar = this.a;
        if (b == 0) {
            zzeaiVar.zzj(zzeae.SHAKE);
        } else if (b != 1) {
            zzeaiVar.zzj(zzeae.NONE);
        } else {
            zzeaiVar.zzj(zzeae.FLICK);
        }
    }
}
