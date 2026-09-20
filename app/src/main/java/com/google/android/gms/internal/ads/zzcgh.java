package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import defpackage.o86;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zzcgh implements o86 {
    public final /* synthetic */ int zza;
    public final /* synthetic */ Map zzb;

    public /* synthetic */ zzcgh(int i, Map map) {
        this.zza = i;
        this.zzb = map;
    }

    @Override // defpackage.o86
    public final void zza(JsonWriter jsonWriter) throws IOException {
        int i = this.zza;
        Map map = this.zzb;
        Object obj = zzcgm.b;
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value(i);
        jsonWriter.endObject();
        zzcgm.b(jsonWriter, map);
        jsonWriter.endObject();
    }
}
