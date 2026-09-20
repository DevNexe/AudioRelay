package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class zzetv implements zzeum {
    public final String a;

    public zzetv(String str) {
        this.a = str;
    }

    @Override // com.google.android.gms.internal.ads.zzeum
    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        Bundle bundle = (Bundle) obj;
        String str = this.a;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        bundle.putString("query_info", str);
    }
}
