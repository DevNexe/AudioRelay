package defpackage;

import android.view.View;
import android.widget.Magnifier;

/* JADX INFO: loaded from: classes.dex */
public final class m53 implements h53 {
    public static final m53 a = new m53();

    public static final class QnHx extends l53.QnHx {
        public QnHx(Magnifier magnifier) {
            super(magnifier);
        }

        @Override // l53.QnHx, defpackage.g53
        public final void b(long j, long j2, float f) {
            boolean zIsNaN = Float.isNaN(f);
            Magnifier magnifier = this.a;
            if (!zIsNaN) {
                magnifier.setZoom(f);
            }
            if (X.w(j2)) {
                magnifier.show(kt2.c(j), kt2.d(j), kt2.c(j2), kt2.d(j2));
            } else {
                magnifier.show(kt2.c(j), kt2.d(j));
            }
        }
    }

    @Override // defpackage.h53
    public final boolean a() {
        return true;
    }

    @Override // defpackage.h53
    public final g53 b(e72 e72Var, View view, ij0 ij0Var, float f) {
        if (ur1.a(e72Var, e72.h)) {
            return new QnHx(new Magnifier(view));
        }
        long jV0 = ij0Var.v0(e72Var.b);
        float fB0 = ij0Var.b0(e72Var.c);
        float fB1 = ij0Var.b0(e72Var.d);
        Magnifier.Builder builder = new Magnifier.Builder(view);
        if (jV0 != cm4.c) {
            builder.setSize(sy4.c(cm4.e(jV0)), sy4.c(cm4.c(jV0)));
        }
        if (!Float.isNaN(fB0)) {
            builder.setCornerRadius(fB0);
        }
        if (!Float.isNaN(fB1)) {
            builder.setElevation(fB1);
        }
        if (!Float.isNaN(f)) {
            builder.setInitialZoom(f);
        }
        builder.setClippingEnabled(e72Var.e);
        return new QnHx(builder.build());
    }
}
