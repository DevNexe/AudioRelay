package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import defpackage.ft;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdxz {
    public final ft a;

    public zzdxz(ft ftVar) {
        this.a = ftVar;
    }

    public final void zza(List list, String str, String str2, Object... objArr) {
        if (((Boolean) zzbkr.zza.zze()).booleanValue()) {
            long jB = this.a.b();
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            try {
                jsonWriter.beginObject();
                jsonWriter.name("timestamp").value(jB);
                jsonWriter.name("source").value(str);
                jsonWriter.name("event").value(str2);
                jsonWriter.name("components").beginArray();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    jsonWriter.value(it.next().toString());
                }
                jsonWriter.endArray();
                jsonWriter.name("params").beginArray();
                int length = objArr.length;
                for (int i = 0; i < length; i++) {
                    Object obj = objArr[i];
                    jsonWriter.value(obj != null ? obj.toString() : null);
                }
                jsonWriter.endArray();
                jsonWriter.endObject();
                jsonWriter.flush();
                jsonWriter.close();
            } catch (IOException e) {
                zzcgn.zzh("unable to log", e);
            }
            zzcgn.zzi("AD-DBG ".concat(String.valueOf(stringWriter.toString())));
        }
    }
}
