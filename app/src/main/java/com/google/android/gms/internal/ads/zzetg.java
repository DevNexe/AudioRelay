package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class zzetg implements zzeum {
    public final String a;
    public final String b;

    public zzetg(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzeum
    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzfW)).booleanValue()) {
            bundle.putString("request_id", this.b);
        } else {
            bundle.putString("request_id", this.a);
        }
    }
}
