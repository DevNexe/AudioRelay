package com.azefsw.audioconnect.root.ui;

import android.os.Build;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.T23;
import com.azefsw.audioconnect.ui.startup.internals.Android8FixCallbacks;
import com.azefsw.audioconnect.ui.startup.internals.DefaultCallbacks;
import defpackage.a62;
import defpackage.ar8;
import defpackage.cx1;
import defpackage.df5;
import defpackage.gk1;
import defpackage.gp2;
import defpackage.h40;
import defpackage.h81;
import defpackage.mq4;
import defpackage.q72;
import defpackage.ql3;
import defpackage.rl3;
import defpackage.sd5;
import defpackage.ur1;
import defpackage.w10;
import defpackage.wc3;
import defpackage.xy;
import defpackage.yt0;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class RootActivity extends ComponentActivity {
    public static final /* synthetic */ int M = 0;
    public final QnHx K;
    public final h40 L;

    public static final class CQf extends cx1 implements h81<sd5> {
        public CQf() {
            super(0);
        }

        @Override // defpackage.h81
        public final sd5 invoke() {
            int i = RootActivity.M;
            RootActivity rootActivity = RootActivity.this;
            rootActivity.getClass();
            xy.a(rootActivity, w10.a);
            rootActivity.K.a.a.setValue(new mq4(rootActivity));
            return sd5.a;
        }
    }

    public static final class F1 extends cx1 implements h81<sd5> {
        public F1() {
            super(0);
        }

        @Override // defpackage.h81
        public final sd5 invoke() {
            RootActivity.this.K.b.b();
            return sd5.a;
        }
    }

    public static final class LPt8Fixed extends cx1 implements h81<sd5> {
        public static final LPt8Fixed w = new LPt8Fixed();

        public LPt8Fixed() {
            super(0);
        }

        @Override // defpackage.h81
        public final /* bridge */ /* synthetic */ sd5 invoke() {
            return sd5.a;
        }
    }

    public static final class NUlFixed extends cx1 implements h81<sd5> {
        public NUlFixed() {
            super(0);
        }

        @Override // defpackage.h81
        public final sd5 invoke() {
            RootActivity rootActivity = RootActivity.this;
            rootActivity.K.a.a.b(new mq4(rootActivity), gp2.a);
            rootActivity.L.f();
            return sd5.a;
        }
    }

    public static final class QnHx {
        public final ar8 a;
        public final wc3 b;
        public final df5 c;

        public QnHx(ar8 ar8Var, wc3 wc3Var, df5 df5Var) {
            this.a = ar8Var;
            this.b = wc3Var;
            this.c = df5Var;
        }
    }

    public RootActivity() {
        q72 q72Var = q72.c;
        if (q72Var == null) {
            ur1.e("INSTANCE");
            throw null;
        }
        this.K = q72Var.a.a();
        this.L = new h40();
    }

    @Override // androidx.activity.ComponentActivity, defpackage.wy, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        CQf cQf = new CQf();
        F1 f1 = new F1();
        LPt8Fixed lPt8 = LPt8Fixed.w;
        NUlFixed nUl = new NUlFixed();
        ql3 ql3Var = ql3.w;
        rl3 rl3Var = rl3.w;
        int i = Build.VERSION.SDK_INT;
        boolean z = i >= 26 && i <= 27;
        T23 t23 = this.z;
        if (!z) {
            a62 a62Var = a62.a;
            t23.a(new DefaultCallbacks(cQf, ql3Var, f1, lPt8, rl3Var, nUl));
            return;
        }
        a62 a62Var2 = a62.a;
        Android8FixCallbacks android8FixCallbacks = new Android8FixCallbacks();
        gk1.QnHx qnHx = gk1.QnHx.b;
        LinkedHashMap linkedHashMap = android8FixCallbacks.w;
        linkedHashMap.put(qnHx, new yt0(cQf, nUl));
        linkedHashMap.put(gk1.F1.b, new yt0(ql3Var, rl3Var));
        linkedHashMap.put(gk1.CQf.b, new yt0(f1, lPt8));
        t23.a(android8FixCallbacks);
    }

    @Override // android.app.Activity
    public final void onUserInteraction() {
        this.K.c.a.e(sd5.a);
    }
}
