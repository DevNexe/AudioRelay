package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class Com1Fixed extends SjP implements Runnable {
    public final Runnable D;

    public Com1Fixed(Runnable runnable) {
        runnable.getClass();
        this.D = runnable;
    }

    @Override // com.google.android.gms.internal.ads.zzfxf
    public final String d() {
        return "task=[" + this.D + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.D.run();
        } catch (Error | RuntimeException e) {
            zze(e);
            throw e;
        }
    }
}
