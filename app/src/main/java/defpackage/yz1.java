package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class yz1 {
    public final i24 a;
    public final h81<zz1> b;
    public final LinkedHashMap c = new LinkedHashMap();
    public ij0 d = new jj0(0.0f, 0.0f);
    public long e = FWT.n(0, 0, 15);

    public final class QnHx {
        public final Object a;
        public final Object b;
        public final kz2 c;
        public x81<? super g30, ? super Integer, sd5> d;

        public QnHx(int i, Object obj, Object obj2) {
            this.a = obj;
            this.b = obj2;
            this.c = ps0.R(Integer.valueOf(i));
        }
    }

    public yz1(j24 j24Var, b02.F1 f1) {
        this.a = j24Var;
        this.b = f1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final x81<g30, Integer, sd5> a(int i, Object obj) {
        LinkedHashMap linkedHashMap = this.c;
        QnHx qnHx = (QnHx) linkedHashMap.get(obj);
        Object objB = this.b.invoke().b(i);
        if (qnHx != null && ((Number) qnHx.c.getValue()).intValue() == i && ur1.a(qnHx.b, objB)) {
            x81 x81Var = qnHx.d;
            if (x81Var != null) {
                return x81Var;
            }
            sz szVarN = X.n(1403994769, new xz1(yz1.this, qnHx), true);
            qnHx.d = szVarN;
            return szVarN;
        }
        QnHx qnHx2 = new QnHx(i, obj, objB);
        linkedHashMap.put(obj, qnHx2);
        x81 x81Var2 = qnHx2.d;
        if (x81Var2 != null) {
            return x81Var2;
        }
        sz szVarN2 = X.n(1403994769, new xz1(this, qnHx2), true);
        qnHx2.d = szVarN2;
        return szVarN2;
    }

    public final Object b(Object obj) {
        QnHx qnHx = (QnHx) this.c.get(obj);
        if (qnHx != null) {
            return qnHx.b;
        }
        zz1 zz1VarInvoke = this.b.invoke();
        Integer num = zz1VarInvoke.f().get(obj);
        if (num != null) {
            return zz1VarInvoke.b(num.intValue());
        }
        return null;
    }
}
