package com.azefsw.audioconnect.ui.startup.internals;

import defpackage.C0240Tp;
import defpackage.a62;
import defpackage.d32;
import defpackage.gk1;
import defpackage.h81;
import defpackage.qs0;
import defpackage.rg3;
import defpackage.sd5;
import defpackage.vl0;
import defpackage.w61;
import defpackage.yt0;
import defpackage.z0;
import defpackage.zl;
import defpackage.zr2;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class Android8FixCallbacks implements w61 {
    public final LinkedHashMap w = new LinkedHashMap();
    public final LinkedHashMap x = new LinkedHashMap();

    public final void a(qs0 qs0Var) {
        yt0 yt0Var;
        h81<sd5> h81Var;
        LinkedHashMap linkedHashMap = this.x;
        gk1 gk1Var = qs0Var.a;
        vl0 vl0Var = (vl0) linkedHashMap.get(gk1Var);
        if (vl0Var != null) {
            vl0Var.a();
        }
        if (!C0240Tp.c.a || (yt0Var = (yt0) this.w.get(gk1Var)) == null || (h81Var = yt0Var.b) == null) {
            return;
        }
        h81Var.invoke();
    }

    public final void b(gk1 gk1Var) {
        h81<sd5> h81Var;
        C0240Tp c0240Tp = C0240Tp.c;
        if (c0240Tp.a) {
            yt0 yt0Var = (yt0) this.w.get(gk1Var);
            if (yt0Var == null || (h81Var = yt0Var.a) == null) {
                return;
            }
            h81Var.invoke();
            return;
        }
        a62.a.l("Application not ready yet, postponing " + gk1Var.a);
        LinkedHashMap linkedHashMap = this.x;
        rg3<sd5> rg3Var = c0240Tp.b;
        rg3Var.getClass();
        zr2 zr2Var = new zr2(rg3Var);
        zl zlVar = new zl(new z0(3, gk1Var, this));
        zr2Var.b(zlVar);
        linkedHashMap.put(gk1Var, zlVar);
    }

    @Override // defpackage.w61
    public final void onCreate(d32 d32Var) {
        b(gk1.QnHx.b);
    }

    @Override // defpackage.w61
    public final void onDestroy(d32 d32Var) {
        a(qs0.QnHx.b);
    }

    @Override // defpackage.w61
    public final void onPause(d32 d32Var) {
        a(qs0.CQf.b);
    }

    @Override // defpackage.w61
    public final void onResume(d32 d32Var) {
        b(gk1.CQf.b);
    }

    @Override // defpackage.w61
    public final void onStart(d32 d32Var) {
        b(gk1.F1.b);
    }

    @Override // defpackage.w61
    public final void onStop(d32 d32Var) {
        a(qs0.F1.b);
    }
}
