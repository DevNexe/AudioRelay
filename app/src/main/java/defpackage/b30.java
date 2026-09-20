package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class b30 extends byN {
    public final kz2 D;
    public boolean E;

    public static final class QnHx extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ int x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(int i) {
            super(2);
            this.x = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.x | 1;
            b30.this.a(g30Var, i);
            return sd5.a;
        }
    }

    public b30(Context context) {
        super(context, null, 0);
        this.D = ps0.R(null);
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }

    @Override // defpackage.byN
    public final void a(g30 g30Var, int i) {
        j30 j30VarQ = g30Var.q(420213850);
        x81 x81Var = (x81) this.D.getValue();
        if (x81Var != null) {
            x81Var.invoke(j30VarQ, 0);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new QnHx(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return b30.class.getName();
    }

    @Override // defpackage.byN
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.E;
    }

    public final void setContent(x81<? super g30, ? super Integer, sd5> x81Var) {
        this.E = true;
        this.D.setValue(x81Var);
        if (isAttachedToWindow()) {
            c();
        }
    }
}
