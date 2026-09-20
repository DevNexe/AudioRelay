package com.google.android.gms.internal.ads;

import defpackage.a66;
import defpackage.fj6;
import defpackage.pd6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbtl extends zzchm {
    public final Object c = new Object();
    public final zzbtq d;
    public boolean e;

    public zzbtl(zzbtq zzbtqVar) {
        this.d = zzbtqVar;
    }

    public final void zzb() {
        synchronized (this.c) {
            if (this.e) {
                return;
            }
            this.e = true;
            zzi(new fj6(4), new zzchi());
            zzi(new a66(this), new pd6(this, 2));
        }
    }
}
