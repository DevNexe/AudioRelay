package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class u84 {
    public static final lq0 a = q40.b(QnHx.w);

    public static final class QnHx extends cx1 implements h81<q84> {
        public static final QnHx w = new QnHx();

        public QnHx() {
            super(0);
        }

        @Override // defpackage.h81
        public final /* bridge */ /* synthetic */ q84 invoke() {
            return null;
        }
    }

    public static final boolean a(q84 q84Var, long j) {
        Map<Long, n74> mapI;
        if (q84Var == null || (mapI = q84Var.i()) == null) {
            return false;
        }
        return mapI.containsKey(Long.valueOf(j));
    }
}
