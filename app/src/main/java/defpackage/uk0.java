package defpackage;

import android.content.Context;
import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public final class uk0 extends byN implements xk0 {
    public final Window D;
    public final kz2 E;
    public boolean F;
    public boolean G;

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
            uk0.this.a(g30Var, i);
            return sd5.a;
        }
    }

    public uk0(Context context, Window window) {
        super(context);
        this.D = window;
        this.E = ps0.R(b00.a);
    }

    @Override // defpackage.byN
    public final void a(g30 g30Var, int i) {
        j30 j30VarQ = g30Var.q(1735448596);
        ((x81) this.E.getValue()).invoke(j30VarQ, 0);
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new QnHx(i);
    }

    @Override // defpackage.byN
    public final void e(boolean z, int i, int i2, int i3, int i4) {
        super.e(z, i, i2, i3, i4);
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        this.D.setLayout(childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
    }

    @Override // defpackage.byN
    public final void f(int i, int i2) {
        if (this.F) {
            super.f(i, i2);
            return;
        }
        super.f(View.MeasureSpec.makeMeasureSpec(sy4.c(getContext().getResources().getConfiguration().screenWidthDp * getContext().getResources().getDisplayMetrics().density), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(sy4.c(getContext().getResources().getConfiguration().screenHeightDp * getContext().getResources().getDisplayMetrics().density), Integer.MIN_VALUE));
    }

    @Override // defpackage.byN
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.G;
    }

    @Override // defpackage.xk0
    public final Window getWindow() {
        return this.D;
    }
}
