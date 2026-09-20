package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbiz {
    public static void a(ArrayList arrayList, zzbka zzbkaVar) {
        String str = (String) zzbkaVar.zze();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        arrayList.add(str);
    }
}
