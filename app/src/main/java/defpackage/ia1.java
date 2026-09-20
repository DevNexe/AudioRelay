package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ia1 extends qi2 {

    public static final class CQf extends cx1 implements j81<gp4, qi2> {
        public final /* synthetic */ j81<Object, sd5> w;
        public final /* synthetic */ j81<Object, sd5> x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CQf(j81<Object, sd5> j81Var, j81<Object, sd5> j81Var2) {
            super(1);
            this.w = j81Var;
            this.x = j81Var2;
        }

        @Override // defpackage.j81
        public final qi2 invoke(gp4 gp4Var) {
            int i;
            gp4 gp4Var2 = gp4Var;
            synchronized (ip4.c) {
                i = ip4.e;
                ip4.e = i + 1;
            }
            return new qi2(i, gp4Var2, this.w, this.x);
        }
    }

    public static final class F1 extends cx1 implements j81<gp4, hi3> {
        public final /* synthetic */ j81<Object, sd5> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public F1(j81<Object, sd5> j81Var) {
            super(1);
            this.w = j81Var;
        }

        @Override // defpackage.j81
        public final hi3 invoke(gp4 gp4Var) {
            int i;
            gp4 gp4Var2 = gp4Var;
            synchronized (ip4.c) {
                i = ip4.e;
                ip4.e = i + 1;
            }
            return new hi3(i, gp4Var2, this.w);
        }
    }

    public static final class QnHx extends cx1 implements j81<Object, sd5> {
        public final /* synthetic */ List<j81<Object, sd5>> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(ArrayList arrayList) {
            super(1);
            this.w = arrayList;
        }

        @Override // defpackage.j81
        public final sd5 invoke(Object obj) {
            List<j81<Object, sd5>> list = this.w;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                list.get(i).invoke(obj);
            }
            return sd5.a;
        }
    }

    public ia1(int i, gp4 gp4Var) {
        j81 qnHx;
        synchronized (ip4.c) {
            ArrayList arrayList = ip4.h;
            ArrayList arrayList2 = arrayList.isEmpty() ^ true ? new ArrayList(arrayList) : null;
            if (arrayList2 != null) {
                qnHx = (j81) wu.X0(arrayList2);
                if (qnHx == null) {
                    qnHx = new QnHx(arrayList2);
                }
            } else {
                qnHx = null;
            }
        }
        super(i, gp4Var, null, qnHx);
    }

    @Override // defpackage.qi2, defpackage.cp4
    public final void c() {
        synchronized (ip4.c) {
            int i = this.d;
            if (i >= 0) {
                ip4.o(i);
                this.d = -1;
            }
            sd5 sd5Var = sd5.a;
        }
    }

    @Override // defpackage.qi2, defpackage.cp4
    public final void j() {
        zp4.a();
        throw null;
    }

    @Override // defpackage.qi2, defpackage.cp4
    public final void k() {
        zp4.a();
        throw null;
    }

    @Override // defpackage.qi2, defpackage.cp4
    public final void l() {
        ip4.a();
    }

    @Override // defpackage.qi2, defpackage.cp4
    public final cp4 r(j81<Object, sd5> j81Var) {
        F1 f1 = new F1(j81Var);
        ip4.QnHx qnHx = ip4.a;
        return (cp4) ip4.e(new kp4(f1));
    }

    @Override // defpackage.qi2
    public final ep4 t() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot".toString());
    }

    @Override // defpackage.qi2
    public final qi2 y(j81<Object, sd5> j81Var, j81<Object, sd5> j81Var2) {
        CQf cQf = new CQf(j81Var, j81Var2);
        ip4.QnHx qnHx = ip4.a;
        return (qi2) ((cp4) ip4.e(new kp4(cQf)));
    }
}
