package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import defpackage.ge0;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgvg extends ge0 {
    public final WeakReference b;

    public zzgvg(zzbjw zzbjwVar, byte[] bArr) {
        this.b = new WeakReference(zzbjwVar);
    }

    @Override // defpackage.ge0
    public final void onCustomTabsServiceConnected(ComponentName componentName, androidx.browser.customtabs.QnHx qnHx) {
        zzbjw zzbjwVar = (zzbjw) this.b.get();
        if (zzbjwVar != null) {
            zzbjwVar.zzc(qnHx);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzbjw zzbjwVar = (zzbjw) this.b.get();
        if (zzbjwVar != null) {
            zzbjwVar.zzd();
        }
    }
}
