package androidx.compose.ui.platform;

import androidx.lifecycle.auxFixed;
import com.azefsw.audioconnect.R;
import defpackage.X;
import defpackage.cx1;
import defpackage.d32;
import defpackage.g30;
import defpackage.j81;
import defpackage.k40;
import defpackage.n40;
import defpackage.sd5;
import defpackage.v20;
import defpackage.x81;

/* JADX INFO: loaded from: classes.dex */
final class WrappedComposition implements k40, auxFixed {
    public x81<? super g30, ? super Integer, sd5> A = v20.a;
    public final AndroidComposeView w;
    public final k40 x;
    public boolean y;
    public androidx.lifecycle.YKK z;

    public static final class QnHx extends cx1 implements j81<AndroidComposeView.CQf, sd5> {
        public final /* synthetic */ x81<g30, Integer, sd5> x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public QnHx(x81<? super g30, ? super Integer, sd5> x81Var) {
            super(1);
            this.x = x81Var;
        }

        @Override // defpackage.j81
        public final sd5 invoke(AndroidComposeView.CQf cQf) {
            AndroidComposeView.CQf cQf2 = cQf;
            WrappedComposition wrappedComposition = WrappedComposition.this;
            if (!wrappedComposition.y) {
                androidx.lifecycle.YKK ykkC = cQf2.a.c();
                x81<g30, Integer, sd5> x81Var = this.x;
                wrappedComposition.A = x81Var;
                if (wrappedComposition.z == null) {
                    wrappedComposition.z = ykkC;
                    ykkC.a(wrappedComposition);
                } else if (ykkC.b().a(androidx.lifecycle.YKK.F1.CREATED)) {
                    wrappedComposition.x.p(X.n(-2000640158, new NUlFixed(wrappedComposition, x81Var), true));
                }
            }
            return sd5.a;
        }
    }

    public WrappedComposition(AndroidComposeView androidComposeView, n40 n40Var) {
        this.w = androidComposeView;
        this.x = n40Var;
    }

    @Override // defpackage.k40
    public final void a() {
        if (!this.y) {
            this.y = true;
            this.w.getView().setTag(R.id.wrapped_composition_tag, null);
            androidx.lifecycle.YKK ykk = this.z;
            if (ykk != null) {
                ykk.c(this);
            }
        }
        this.x.a();
    }

    @Override // defpackage.k40
    public final boolean e() {
        return this.x.e();
    }

    @Override // androidx.lifecycle.auxFixed
    public final void h(d32 d32Var, androidx.lifecycle.YKK.CQf cQf) {
        if (cQf == androidx.lifecycle.YKK.CQf.ON_DESTROY) {
            a();
        } else {
            if (cQf != androidx.lifecycle.YKK.CQf.ON_CREATE || this.y) {
                return;
            }
            p(this.A);
        }
    }

    @Override // defpackage.k40
    public final boolean o() {
        return this.x.o();
    }

    @Override // defpackage.k40
    public final void p(x81<? super g30, ? super Integer, sd5> x81Var) {
        this.w.setOnViewTreeOwnersAvailable(new QnHx(x81Var));
    }
}
