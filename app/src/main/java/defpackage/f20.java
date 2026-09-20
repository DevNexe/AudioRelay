package defpackage;

import android.content.Context;
import com.azefsw.audioconnect.R;

/* JADX INFO: loaded from: classes.dex */
public final class f20 {
    public static final sz a = X.n(1097093747, QnHx.w, false);

    public static final class QnHx extends cx1 implements y81<wv, g30, Integer, sd5> {
        public static final QnHx w = new QnHx();

        public QnHx() {
            super(3);
        }

        @Override // defpackage.y81
        public final sd5 invoke(wv wvVar, g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            if ((num.intValue() & 81) == 16 && g30Var2.t()) {
                g30Var2.x();
            } else {
                e40.CQf cQf = e40.a;
                float f = 16;
                wo1.QnHx qnHx = wo1.a;
                zx2 zx2Var = new zx2(f, f, f, f);
                qu4.QnHx qnHx2 = qu4.a;
                Context context = kd.w;
                if (context == null) {
                    ur1.e("context");
                    throw null;
                }
                qu4.a.getClass();
                j55.b(iZUl.b(qu4.QnHx.b, context, R.string.player_server_not_found), zx2Var, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, ((rc5) g30Var2.E(sc5.a)).j, g30Var2, 48, 0, 32764);
            }
            return sd5.a;
        }
    }
}
