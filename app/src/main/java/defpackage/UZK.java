package defpackage;

import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class UZK {
    public static final /* synthetic */ int a = 0;

    public static final class QnHx extends cx1 implements h81<yg2> {
        public static final QnHx w = new QnHx();

        public QnHx() {
            super(0);
        }

        @Override // defpackage.h81
        public final yg2 invoke() {
            return Looper.getMainLooper() != null ? hg0.w : a74.w;
        }
    }

    static {
        new ry4(QnHx.w);
    }
}
