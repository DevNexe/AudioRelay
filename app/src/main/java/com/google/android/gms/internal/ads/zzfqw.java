package com.google.android.gms.internal.ads;

import defpackage.z05;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzfqw implements Runnable {
    public final z05 w;

    public zzfqw() {
        this.w = null;
    }

    public zzfqw(z05 z05Var) {
        this.w = z05Var;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e) {
            zzc(e);
        }
    }

    public final void zzc(Exception exc) {
        z05 z05Var = this.w;
        if (z05Var != null) {
            z05Var.b(exc);
        }
    }
}
