package com.azefsw.audioconnect.ui.startup.internals;

import defpackage.d32;
import defpackage.h81;
import defpackage.sd5;
import defpackage.w61;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultCallbacks implements w61 {
    public final h81<sd5> A;
    public final h81<sd5> B;
    public final h81<sd5> w;
    public final h81<sd5> x;
    public final h81<sd5> y;
    public final h81<sd5> z;

    public DefaultCallbacks(h81<sd5> h81Var, h81<sd5> h81Var2, h81<sd5> h81Var3, h81<sd5> h81Var4, h81<sd5> h81Var5, h81<sd5> h81Var6) {
        this.w = h81Var;
        this.x = h81Var2;
        this.y = h81Var3;
        this.z = h81Var4;
        this.A = h81Var5;
        this.B = h81Var6;
    }

    @Override // defpackage.w61
    public final void onCreate(d32 d32Var) {
        this.w.invoke();
    }

    @Override // defpackage.w61
    public final void onDestroy(d32 d32Var) {
        this.B.invoke();
    }

    @Override // defpackage.w61
    public final void onPause(d32 d32Var) {
        this.z.invoke();
    }

    @Override // defpackage.w61
    public final void onResume(d32 d32Var) {
        this.y.invoke();
    }

    @Override // defpackage.w61
    public final void onStart(d32 d32Var) {
        this.x.invoke();
    }

    @Override // defpackage.w61
    public final void onStop(d32 d32Var) {
        this.A.invoke();
    }
}
