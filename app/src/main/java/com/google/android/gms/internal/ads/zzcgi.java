package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import defpackage.o86;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zzcgi implements o86 {
    public final /* synthetic */ String zza;

    @Override // defpackage.o86
    public final void zza(JsonWriter jsonWriter) throws IOException {
        String str = this.zza;
        Object obj = zzcgm.b;
        jsonWriter.name("params").beginObject();
        if (str != null) {
            jsonWriter.name("error_description").value(str);
        }
        jsonWriter.endObject();
    }
}
