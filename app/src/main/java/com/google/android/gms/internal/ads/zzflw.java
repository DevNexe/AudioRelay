package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzflw extends zzflr {
    public zzflw(zzflk zzflkVar, HashSet hashSet, JSONObject jSONObject, long j, byte[] bArr) {
        super(zzflkVar, hashSet, jSONObject, j, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfls
    /* JADX INFO: renamed from: a */
    public final void onPostExecute(String str) {
        zzfko zzfkoVarZza;
        if (!TextUtils.isEmpty(str) && (zzfkoVarZza = zzfko.zza()) != null) {
            for (zzfkd zzfkdVar : zzfkoVarZza.zzc()) {
                if (this.c.contains(zzfkdVar.zzh())) {
                    zzfkdVar.zzg().zze(str, this.e);
                }
            }
        }
        super.onPostExecute(str);
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        zzflk zzflkVar = this.b;
        JSONObject jSONObjectZza = zzflkVar.zza();
        JSONObject jSONObject = this.d;
        if (zzfle.zzj(jSONObject, jSONObjectZza)) {
            return null;
        }
        zzflkVar.zze(jSONObject);
        return jSONObject.toString();
    }
}
