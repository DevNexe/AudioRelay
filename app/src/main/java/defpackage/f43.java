package defpackage;

import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;

/* JADX INFO: loaded from: classes.dex */
public final class f43 {
    public static final ry4 a;

    public static final class CQf extends cx1 implements h81<ak1<Float>> {
        public static final CQf w = new CQf();

        public CQf() {
            super(0);
        }

        @Override // defpackage.h81
        public final ak1<Float> invoke() {
            return hH.q(hH.E(1700, RCHTTPStatusCodes.SUCCESS, null, 4), 1, 4);
        }
    }

    public static final class QnHx extends cx1 implements h81<ak1<Float>> {
        public static final QnHx w = new QnHx();

        public QnHx() {
            super(0);
        }

        @Override // defpackage.h81
        public final ak1<Float> invoke() {
            return hH.q(hH.E(600, RCHTTPStatusCodes.SUCCESS, null, 4), 2, 4);
        }
    }

    static {
        new ry4(QnHx.w);
        a = new ry4(CQf.w);
    }
}
