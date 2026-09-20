package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class zo0 extends sy2 implements yl3 {
    public final Drawable B;
    public final kz2 D;
    public final kz2 C = ps0.R(0);
    public final ry4 E = new ry4(new QnHx());

    public static final class QnHx extends cx1 implements h81<yo0> {
        public QnHx() {
            super(0);
        }

        @Override // defpackage.h81
        public final yo0 invoke() {
            return new yo0(zo0.this);
        }
    }

    public zo0(Drawable drawable) {
        this.B = drawable;
        this.D = ps0.R(new cm4(ap0.a(drawable)));
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            return;
        }
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    @Override // defpackage.yl3
    public final void a() {
        c();
    }

    @Override // defpackage.sy2
    public final boolean b(float f) {
        this.B.setAlpha(AY.o(sy4.c(f * 255), 0, 255));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.yl3
    public final void c() {
        Drawable drawable = this.B;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        drawable.setVisible(false, false);
        drawable.setCallback(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.yl3
    public final void d() {
        Drawable.Callback callback = (Drawable.Callback) this.E.getValue();
        Drawable drawable = this.B;
        drawable.setCallback(callback);
        drawable.setVisible(true, true);
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }

    @Override // defpackage.sy2
    public final boolean e(av avVar) {
        this.B.setColorFilter(avVar != null ? avVar.a : null);
        return true;
    }

    @Override // defpackage.sy2
    public final void f(jy1 jy1Var) {
        int i;
        if (Build.VERSION.SDK_INT >= 23) {
            int iOrdinal = jy1Var.ordinal();
            if (iOrdinal != 0) {
                i = 1;
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                i = 0;
            }
            this.B.setLayoutDirection(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.sy2
    public final long g() {
        return ((cm4) this.D.getValue()).a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.sy2
    public final void h(ro0 ro0Var) {
        dn dnVarB = ro0Var.e0().b();
        ((Number) this.C.getValue()).intValue();
        int iC = sy4.c(cm4.e(ro0Var.d()));
        int iC2 = sy4.c(cm4.c(ro0Var.d()));
        Drawable drawable = this.B;
        drawable.setBounds(0, 0, iC, iC2);
        try {
            dnVarB.e();
            Canvas canvas = F6mt.a;
            drawable.draw(((ZCR) dnVarB).a);
        } finally {
            dnVarB.r();
        }
    }
}
