package com.google.android.gms.internal.ads;

import android.util.Base64;
import android.util.JsonWriter;
import defpackage.o86;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zzcgj implements o86 {
    public final /* synthetic */ String zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ Map zzc;
    public final /* synthetic */ byte[] zzd;

    public /* synthetic */ zzcgj(String str, String str2, Map map, byte[] bArr) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = map;
        this.zzd = bArr;
    }

    @Override // defpackage.o86
    public final void zza(JsonWriter jsonWriter) throws IOException {
        String str = this.zza;
        String str2 = this.zzb;
        Map map = this.zzc;
        byte[] bArr = this.zzd;
        Object obj = zzcgm.b;
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("uri").value(str);
        jsonWriter.name("verb").value(str2);
        jsonWriter.endObject();
        zzcgm.b(jsonWriter, map);
        if (bArr != null) {
            jsonWriter.name("body").value(Base64.encodeToString(bArr, 0));
        }
        jsonWriter.endObject();
    }
}
