package defpackage;

import android.view.View;
import android.widget.Magnifier;

/* JADX INFO: loaded from: classes.dex */
public final class l53 implements h53 {
    public static final l53 a = new l53();

    public static class QnHx implements g53 {
        public final Magnifier a;

        public QnHx(Magnifier magnifier) {
            this.a = magnifier;
        }

        @Override // defpackage.g53
        public final long a() {
            Magnifier magnifier = this.a;
            return C0239D.e(magnifier.getWidth(), magnifier.getHeight());
        }

        @Override // defpackage.g53
        public void b(long j, long j2, float f) {
            this.a.show(kt2.c(j), kt2.d(j));
        }

        @Override // defpackage.g53
        public final void c() {
            this.a.update();
        }

        @Override // defpackage.g53
        public final void dismiss() {
            this.a.dismiss();
        }
    }

    @Override // defpackage.h53
    public final boolean a() {
        return false;
    }

    @Override // defpackage.h53
    public final g53 b(e72 e72Var, View view, ij0 ij0Var, float f) {
        return new QnHx(new Magnifier(view));
    }
}
