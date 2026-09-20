package defpackage;

import defpackage.z_Mm;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class gh5<V extends z_Mm> implements bh5 {
    public final cAe a;
    public V b;
    public V c;
    public V d;

    public static final class QnHx implements cAe {
        public final /* synthetic */ vy0 a;

        public QnHx(vy0 vy0Var) {
            this.a = vy0Var;
        }

        @Override // defpackage.cAe
        public final vy0 get(int i) {
            return this.a;
        }
    }

    public gh5(cAe cae) {
        this.a = cae;
    }

    @Override // defpackage.bh5
    public final /* synthetic */ boolean a() {
        return false;
    }

    @Override // defpackage.bh5
    public final V b(long j, V v, V v2, V v3) {
        if (this.c == null) {
            this.c = (V) v3.c();
        }
        V v4 = this.c;
        if (v4 == null) {
            ur1.e("velocityVector");
            throw null;
        }
        int iB = v4.b();
        for (int i = 0; i < iB; i++) {
            V v5 = this.c;
            if (v5 == null) {
                ur1.e("velocityVector");
                throw null;
            }
            v5.e(this.a.get(i).b(j, v.a(i), v2.a(i), v3.a(i)), i);
        }
        V v6 = this.c;
        if (v6 != null) {
            return v6;
        }
        ur1.e("velocityVector");
        throw null;
    }

    @Override // defpackage.bh5
    public final V e(long j, V v, V v2, V v3) {
        if (this.b == null) {
            this.b = (V) v.c();
        }
        V v4 = this.b;
        if (v4 == null) {
            ur1.e("valueVector");
            throw null;
        }
        int iB = v4.b();
        for (int i = 0; i < iB; i++) {
            V v5 = this.b;
            if (v5 == null) {
                ur1.e("valueVector");
                throw null;
            }
            v5.e(this.a.get(i).e(j, v.a(i), v2.a(i), v3.a(i)), i);
        }
        V v6 = this.b;
        if (v6 != null) {
            return v6;
        }
        ur1.e("valueVector");
        throw null;
    }

    @Override // defpackage.bh5
    public final V f(V v, V v2, V v3) {
        if (this.d == null) {
            this.d = (V) v3.c();
        }
        V v4 = this.d;
        if (v4 == null) {
            ur1.e("endVelocityVector");
            throw null;
        }
        int iB = v4.b();
        for (int i = 0; i < iB; i++) {
            V v5 = this.d;
            if (v5 == null) {
                ur1.e("endVelocityVector");
                throw null;
            }
            v5.e(this.a.get(i).d(v.a(i), v2.a(i), v3.a(i)), i);
        }
        V v6 = this.d;
        if (v6 != null) {
            return v6;
        }
        ur1.e("endVelocityVector");
        throw null;
    }

    @Override // defpackage.bh5
    public final long g(V v, V v2, V v3) {
        Iterator<Integer> it = AY.V(0, v.b()).iterator();
        long jMax = 0;
        while (it.hasNext()) {
            int iNextInt = ((lp1) it).nextInt();
            jMax = Math.max(jMax, this.a.get(iNextInt).c(v.a(iNextInt), v2.a(iNextInt), v3.a(iNextInt)));
        }
        return jMax;
    }

    public gh5(vy0 vy0Var) {
        this(new QnHx(vy0Var));
    }
}
