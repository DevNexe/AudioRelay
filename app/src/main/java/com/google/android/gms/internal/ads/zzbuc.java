package com.google.android.gms.internal.ads;

import defpackage.mw5;
import java.io.ByteArrayInputStream;
import java.nio.charset.Charset;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbuc {
    public static final Charset a = Charset.forName("UTF-8");
    public static final zzbtz zza = new mw5(8);
    public static final zzbtx zzb = new zzbtx() { // from class: com.google.android.gms.internal.ads.zzbua
        @Override // com.google.android.gms.internal.ads.zzbtx
        public final Object zza(JSONObject jSONObject) {
            Charset charset = zzbuc.a;
            return new ByteArrayInputStream(jSONObject.toString().getBytes(zzbuc.a));
        }
    };
}
