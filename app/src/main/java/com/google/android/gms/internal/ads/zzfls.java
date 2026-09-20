package com.google.android.gms.internal.ads;

import android.os.AsyncTask;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzfls extends AsyncTask {
    public zzflt a;
    public final zzflk b;

    public zzfls(zzflk zzflkVar, byte[] bArr) {
        this.b = zzflkVar;
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        zzflt zzfltVar = this.a;
        if (zzfltVar != null) {
            zzfltVar.zza(this);
        }
    }

    public final void zzb(zzflt zzfltVar) {
        this.a = zzfltVar;
    }
}
