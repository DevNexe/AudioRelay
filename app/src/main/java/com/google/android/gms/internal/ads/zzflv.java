package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzflv extends zzflr {
    public zzflv(zzflk zzflkVar, HashSet hashSet, JSONObject jSONObject, long j, byte[] bArr) {
        super(zzflkVar, hashSet, jSONObject, j, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfls
    /* JADX INFO: renamed from: a */
    public final void onPostExecute(String str) {
        b(str);
        super.onPostExecute(str);
    }

    public final void b(String str) {
        zzfko zzfkoVarZza = zzfko.zza();
        if (zzfkoVarZza != null) {
            for (zzfkd zzfkdVar : zzfkoVarZza.zzc()) {
                if (this.c.contains(zzfkdVar.zzh())) {
                    zzfkdVar.zzg().zzd(str, this.e);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.d.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzflr, com.google.android.gms.internal.ads.zzfls, android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        b(str);
        super.onPostExecute(str);
    }
}
