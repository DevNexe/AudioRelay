package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class zzesc implements zzeum {
    public final String a;
    public final boolean b;
    public final boolean c;

    public zzesc(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    @Override // com.google.android.gms.internal.ads.zzeum
    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        Bundle bundle = (Bundle) obj;
        String str = this.a;
        if (!str.isEmpty()) {
            bundle.putString("inspector_extras", str);
        }
        bundle.putInt("test_mode", this.b ? 1 : 0);
        bundle.putInt("linked_device", this.c ? 1 : 0);
    }
}
