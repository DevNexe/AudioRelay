package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;
import com.azefsw.audioconnect.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class Ll {
    public static final lq0 a = new lq0(eo2.a, QnHx.w);
    public static final jt4 b = new jt4(CQf.w);
    public static final jt4 c = new jt4(F1.w);
    public static final jt4 d = new jt4(LPt8Fixed.w);
    public static final jt4 e = new jt4(NUlFixed.w);
    public static final jt4 f = new jt4(YKK.w);

    public static final class CQf extends cx1 implements h81<Context> {
        public static final CQf w = new CQf();

        public CQf() {
            super(0);
        }

        @Override // defpackage.h81
        public final Context invoke() {
            Ll.b("LocalContext");
            throw null;
        }
    }

    public static final class EQ extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ AndroidComposeView w;
        public final /* synthetic */ x81<g30, Integer, sd5> x;
        public final /* synthetic */ int y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public EQ(AndroidComposeView androidComposeView, x81<? super g30, ? super Integer, sd5> x81Var, int i) {
            super(2);
            this.w = androidComposeView;
            this.x = x81Var;
            this.y = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.y | 1;
            Ll.a(this.w, this.x, g30Var, i);
            return sd5.a;
        }
    }

    public static final class F1 extends cx1 implements h81<fj1> {
        public static final F1 w = new F1();

        public F1() {
            super(0);
        }

        @Override // defpackage.h81
        public final fj1 invoke() {
            Ll.b("LocalImageVectorCache");
            throw null;
        }
    }

    public static final class LPt8Fixed extends cx1 implements h81<d32> {
        public static final LPt8Fixed w = new LPt8Fixed();

        public LPt8Fixed() {
            super(0);
        }

        @Override // defpackage.h81
        public final d32 invoke() {
            Ll.b("LocalLifecycleOwner");
            throw null;
        }
    }

    public static final class NUlFixed extends cx1 implements h81<b34> {
        public static final NUlFixed w = new NUlFixed();

        public NUlFixed() {
            super(0);
        }

        @Override // defpackage.h81
        public final b34 invoke() {
            Ll.b("LocalSavedStateRegistryOwner");
            throw null;
        }
    }

    public static final class QnHx extends cx1 implements h81<Configuration> {
        public static final QnHx w = new QnHx();

        public QnHx() {
            super(0);
        }

        @Override // defpackage.h81
        public final Configuration invoke() {
            Ll.b("LocalConfiguration");
            throw null;
        }
    }

    public static final class T23 extends cx1 implements j81<zl0, yl0> {
        public final /* synthetic */ em0 w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public T23(em0 em0Var) {
            super(1);
            this.w = em0Var;
        }

        @Override // defpackage.j81
        public final yl0 invoke(zl0 zl0Var) {
            return new Zf(this.w);
        }
    }

    public static final class YKK extends cx1 implements h81<View> {
        public static final YKK w = new YKK();

        public YKK() {
            super(0);
        }

        @Override // defpackage.h81
        public final View invoke() {
            Ll.b("LocalView");
            throw null;
        }
    }

    public static final class auxFixed extends cx1 implements j81<Configuration, sd5> {
        public final /* synthetic */ ri2<Configuration> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public auxFixed(ri2<Configuration> ri2Var) {
            super(1);
            this.w = ri2Var;
        }

        @Override // defpackage.j81
        public final sd5 invoke(Configuration configuration) {
            this.w.setValue(configuration);
            return sd5.a;
        }
    }

    public static final class byN extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ AndroidComposeView w;
        public final /* synthetic */ yYZL x;
        public final /* synthetic */ x81<g30, Integer, sd5> y;
        public final /* synthetic */ int z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public byN(AndroidComposeView androidComposeView, yYZL yyzl, x81<? super g30, ? super Integer, sd5> x81Var, int i) {
            super(2);
            this.w = androidComposeView;
            this.x = yyzl;
            this.y = x81Var;
            this.z = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            if ((num.intValue() & 11) == 2 && g30Var2.t()) {
                g30Var2.x();
            } else {
                int i = ((this.z << 3) & 896) | 72;
                r40.a(this.w, this.x, this.y, g30Var2, i);
            }
            return sd5.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(AndroidComposeView androidComposeView, x81<? super g30, ? super Integer, sd5> x81Var, g30 g30Var, int i) {
        T t;
        LinkedHashMap linkedHashMap;
        boolean z;
        j30 j30VarQ = g30Var.q(1396852028);
        Context context = androidComposeView.getContext();
        j30VarQ.e(-492369756);
        Object objB0 = j30VarQ.b0();
        g30.QnHx.C0132QnHx c0132QnHx = g30.QnHx.a;
        if (objB0 == c0132QnHx) {
            objB0 = ps0.Q(context.getResources().getConfiguration(), eo2.a);
            j30VarQ.F0(objB0);
        }
        j30VarQ.R(false);
        ri2 ri2Var = (ri2) objB0;
        j30VarQ.e(1157296644);
        boolean zI = j30VarQ.I(ri2Var);
        Object objB1 = j30VarQ.b0();
        if (zI || objB1 == c0132QnHx) {
            objB1 = new auxFixed(ri2Var);
            j30VarQ.F0(objB1);
        }
        j30VarQ.R(false);
        androidComposeView.setConfigurationChangeObserver((j81) objB1);
        j30VarQ.e(-492369756);
        Object objB2 = j30VarQ.b0();
        if (objB2 == c0132QnHx) {
            objB2 = new yYZL(context);
            j30VarQ.F0(objB2);
        }
        j30VarQ.R(false);
        yYZL yyzl = (yYZL) objB2;
        AndroidComposeView.CQf viewTreeOwners = androidComposeView.getViewTreeOwners();
        if (viewTreeOwners == null) {
            throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
        }
        j30VarQ.e(-492369756);
        Object objB3 = j30VarQ.b0();
        b34 b34Var = viewTreeOwners.b;
        if (objB3 == c0132QnHx) {
            Object parent = androidComposeView.getParent();
            if (parent == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.View");
            }
            View view = (View) parent;
            Object tag = view.getTag(R.id.compose_view_saveable_id_tag);
            String strValueOf = tag instanceof String ? (String) tag : null;
            if (strValueOf == null) {
                strValueOf = String.valueOf(view.getId());
            }
            String str = m24.class.getSimpleName() + ':' + strValueOf;
            z24 z24VarU = b34Var.U();
            Bundle bundleA = z24VarU.a(str);
            if (bundleA != null) {
                linkedHashMap = new LinkedHashMap();
                for (String str2 : bundleA.keySet()) {
                    ArrayList parcelableArrayList = bundleA.getParcelableArrayList(str2);
                    if (parcelableArrayList == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Any?> }");
                    }
                    linkedHashMap.put(str2, parcelableArrayList);
                }
            } else {
                linkedHashMap = null;
            }
            jt4 jt4Var = o24.a;
            n24 n24Var = new n24(linkedHashMap, hm0.w);
            try {
                z24VarU.c(str, new gm0(n24Var));
                z = true;
            } catch (IllegalArgumentException unused) {
                z = false;
            }
            em0 em0Var = new em0(n24Var, new fm0(z, z24VarU, str));
            j30VarQ.F0(em0Var);
            objB3 = em0Var;
        }
        j30VarQ.R(false);
        em0 em0Var2 = (em0) objB3;
        wq0.a(sd5.a, new T23(em0Var2), j30VarQ);
        Configuration configuration = (Configuration) ri2Var.getValue();
        j30VarQ.e(-485908294);
        j30VarQ.e(-492369756);
        Object objB4 = j30VarQ.b0();
        if (objB4 == c0132QnHx) {
            objB4 = new fj1();
            j30VarQ.F0(objB4);
        }
        j30VarQ.R(false);
        fj1 fj1Var = (fj1) objB4;
        jl3 jl3Var = new jl3();
        j30VarQ.e(-492369756);
        Object objB5 = j30VarQ.b0();
        if (objB5 == c0132QnHx) {
            j30VarQ.F0(configuration);
            t = configuration;
        } else {
            t = objB5;
        }
        j30VarQ.R(false);
        jl3Var.w = t;
        j30VarQ.e(-492369756);
        Object objB6 = j30VarQ.b0();
        if (objB6 == c0132QnHx) {
            objB6 = new ORW(jl3Var, fj1Var);
            j30VarQ.F0(objB6);
        }
        j30VarQ.R(false);
        wq0.a(fj1Var, new u3t(context, (ORW) objB6), j30VarQ);
        j30VarQ.R(false);
        q40.a(new ng3[]{a.b((Configuration) ri2Var.getValue()), b.b(context), d.b(viewTreeOwners.a), e.b(b34Var), o24.a.b(em0Var2), f.b(androidComposeView.getView()), c.b(fj1Var)}, X.m(j30VarQ, 1471621628, new byN(androidComposeView, yyzl, x81Var, i)), j30VarQ, 56);
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new EQ(androidComposeView, x81Var, i);
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
