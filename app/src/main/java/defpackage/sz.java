package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class sz implements x81, y81, a91, c91, e91, f91, g91, h91, i81, k81, m81, n81, o81, p81, q81, r81, s81, u81, v81 {
    public ArrayList A;
    public final int w;
    public final boolean x;
    public Object y;
    public rk3 z;

    public static final class CQf extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ Object x;
        public final /* synthetic */ Object y;
        public final /* synthetic */ int z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CQf(Object obj, Object obj2, int i) {
            super(2);
            this.x = obj;
            this.y = obj2;
            this.z = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.z | 1;
            Object obj = this.x;
            Object obj2 = this.y;
            sz.this.b(obj, obj2, g30Var, i);
            return sd5.a;
        }
    }

    public static final class F1 extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ int A;
        public final /* synthetic */ Object x;
        public final /* synthetic */ Object y;
        public final /* synthetic */ Object z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public F1(Object obj, Object obj2, Object obj3, int i) {
            super(2);
            this.x = obj;
            this.y = obj2;
            this.z = obj3;
            this.A = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            sz.this.c(this.x, this.y, this.z, g30Var, this.A | 1);
            return sd5.a;
        }
    }

    public static final class LPt8Fixed extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ Object A;
        public final /* synthetic */ int B;
        public final /* synthetic */ Object x;
        public final /* synthetic */ Object y;
        public final /* synthetic */ Object z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LPt8Fixed(Object obj, Object obj2, Object obj3, Object obj4, int i) {
            super(2);
            this.x = obj;
            this.y = obj2;
            this.z = obj3;
            this.A = obj4;
            this.B = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            sz.this.d(this.x, this.y, this.z, this.A, g30Var, this.B | 1);
            return sd5.a;
        }
    }

    public static final class QnHx extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ Object x;
        public final /* synthetic */ int y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(Object obj, int i) {
            super(2);
            this.x = obj;
            this.y = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.y | 1;
            sz.this.a(this.x, g30Var, i);
            return sd5.a;
        }
    }

    public sz(int i, boolean z) {
        this.w = i;
        this.x = z;
    }

    @Override // defpackage.a91
    public final /* bridge */ /* synthetic */ Object I(Object obj, Object obj2, Object obj3, Object obj4) {
        return b(obj, obj2, (g30) obj3, ((Number) obj4).intValue());
    }

    @Override // defpackage.e91
    public final /* bridge */ /* synthetic */ Object Z(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return d(obj, obj2, obj3, obj4, (g30) obj5, ((Number) obj6).intValue());
    }

    public final Object a(Object obj, g30 g30Var, int i) {
        j30 j30VarQ = g30Var.q(this.w);
        e(j30VarQ);
        int iJ = (j30VarQ.I(this) ? X.j(2, 1) : X.j(1, 1)) | i;
        Object obj2 = this.y;
        if (obj2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        }
        sb5.d(3, obj2);
        Object objInvoke = ((y81) obj2).invoke(obj, j30VarQ, Integer.valueOf(iJ));
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU != null) {
            tk3VarU.d = new QnHx(obj, i);
        }
        return objInvoke;
    }

    public final Object b(Object obj, Object obj2, g30 g30Var, int i) {
        j30 j30VarQ = g30Var.q(this.w);
        e(j30VarQ);
        int iJ = (j30VarQ.I(this) ? X.j(2, 2) : X.j(1, 2)) | i;
        Object obj3 = this.y;
        if (obj3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        }
        sb5.d(4, obj3);
        Object objI = ((a91) obj3).I(obj, obj2, j30VarQ, Integer.valueOf(iJ));
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU != null) {
            tk3VarU.d = new CQf(obj, obj2, i);
        }
        return objI;
    }

    public final Object c(Object obj, Object obj2, Object obj3, g30 g30Var, int i) {
        j30 j30VarQ = g30Var.q(this.w);
        e(j30VarQ);
        int iJ = (j30VarQ.I(this) ? X.j(2, 3) : X.j(1, 3)) | i;
        Object obj4 = this.y;
        if (obj4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Function5<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        }
        sb5.d(5, obj4);
        Object objJ0 = ((c91) obj4).j0(obj, obj2, obj3, j30VarQ, Integer.valueOf(iJ));
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU != null) {
            tk3VarU.d = new F1(obj, obj2, obj3, i);
        }
        return objJ0;
    }

    public final Object d(Object obj, Object obj2, Object obj3, Object obj4, g30 g30Var, int i) {
        j30 j30VarQ = g30Var.q(this.w);
        e(j30VarQ);
        int iJ = (j30VarQ.I(this) ? X.j(2, 4) : X.j(1, 4)) | i;
        Object obj5 = this.y;
        if (obj5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Function6<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        }
        sb5.d(6, obj5);
        Object objZ = ((e91) obj5).Z(obj, obj2, obj3, obj4, j30VarQ, Integer.valueOf(iJ));
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU != null) {
            tk3VarU.d = new LPt8Fixed(obj, obj2, obj3, obj4, i);
        }
        return objZ;
    }

    public final void e(g30 g30Var) {
        tk3 tk3VarB;
        if (!this.x || (tk3VarB = g30Var.b()) == null) {
            return;
        }
        g30Var.w(tk3VarB);
        if (X.B(this.z, tk3VarB)) {
            this.z = tk3VarB;
            return;
        }
        ArrayList arrayList = this.A;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            this.A = arrayList2;
            arrayList2.add(tk3VarB);
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (X.B((rk3) arrayList.get(i), tk3VarB)) {
                arrayList.set(i, tk3VarB);
                return;
            }
        }
        arrayList.add(tk3VarB);
    }

    public final void f(cx1 cx1Var) {
        if (ur1.a(this.y, cx1Var)) {
            return;
        }
        boolean z = this.y == null;
        this.y = cx1Var;
        if (z || !this.x) {
            return;
        }
        rk3 rk3Var = this.z;
        if (rk3Var != null) {
            rk3Var.invalidate();
            this.z = null;
        }
        ArrayList arrayList = this.A;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((rk3) arrayList.get(i)).invalidate();
            }
            arrayList.clear();
        }
    }

    @Override // defpackage.x81
    public final Object invoke(Object obj, Object obj2) {
        int iIntValue = ((Number) obj2).intValue();
        j30 j30VarQ = ((g30) obj).q(this.w);
        e(j30VarQ);
        int iJ = iIntValue | (j30VarQ.I(this) ? X.j(2, 0) : X.j(1, 0));
        Object obj3 = this.y;
        if (obj3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        }
        sb5.d(2, obj3);
        Object objInvoke = ((x81) obj3).invoke(j30VarQ, Integer.valueOf(iJ));
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU != null) {
            sb5.d(2, this);
            tk3VarU.d = this;
        }
        return objInvoke;
    }

    @Override // defpackage.c91
    public final /* bridge */ /* synthetic */ Object j0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return c(obj, obj2, obj3, (g30) obj4, ((Number) obj5).intValue());
    }

    @Override // defpackage.y81
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return a(obj, (g30) obj2, ((Number) obj3).intValue());
    }
}
