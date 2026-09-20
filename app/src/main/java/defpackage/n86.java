package defpackage;

import com.google.android.gms.internal.ads.zzcgs;

/* JADX INFO: loaded from: classes3.dex */
public final class n86 extends Thread {
    public final /* synthetic */ String w;

    public n86(String str) {
        this.w = str;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        new zzcgs(null).zza(this.w);
    }
}
