package defpackage;

import com.google.android.gms.ads.AdRequest;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class p02 implements o02 {
    public final is4<t02> a;
    public final tz1 b = new tz1();

    public static final class QnHx extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ int x;
        public final /* synthetic */ int y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(int i, int i2) {
            super(2);
            this.x = i;
            this.y = i2;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.y | 1;
            p02.this.d(this.x, g30Var, i);
            return sd5.a;
        }
    }

    public p02(uj0 uj0Var) {
        this.a = uj0Var;
    }

    @Override // defpackage.zz1
    public final Object a(int i) {
        yq1.QnHx<j02> qnHx = this.a.getValue().a.get(i);
        int i2 = i - qnHx.a;
        j81<Integer, Object> j81Var = qnHx.c.a;
        Object objInvoke = j81Var != null ? j81Var.invoke(Integer.valueOf(i2)) : null;
        return objInvoke == null ? new gh0(i) : objInvoke;
    }

    @Override // defpackage.zz1
    public final Object b(int i) {
        yq1.QnHx<j02> qnHx = this.a.getValue().a.get(i);
        return qnHx.c.b.invoke(Integer.valueOf(i - qnHx.a));
    }

    @Override // defpackage.o02
    public final tz1 c() {
        return this.b;
    }

    @Override // defpackage.zz1
    public final void d(int i, g30 g30Var, int i2) {
        int i3;
        j30 j30VarQ = g30Var.q(1704733014);
        if ((i2 & 14) == 0) {
            i3 = (j30VarQ.i(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= j30VarQ.I(this) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            this.a.getValue().a(this.b, i, j30VarQ, ((i3 << 3) & 112) | AdRequest.MAX_CONTENT_URL_LENGTH);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new QnHx(i, i2);
    }

    @Override // defpackage.o02
    public final List<Integer> e() {
        return this.a.getValue().b;
    }

    @Override // defpackage.zz1
    public final Map<Object, Integer> f() {
        return this.a.getValue().c;
    }

    @Override // defpackage.zz1
    public final int g() {
        return this.a.getValue().a.a();
    }
}
