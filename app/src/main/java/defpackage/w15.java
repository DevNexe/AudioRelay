package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class w15 implements yl3 {
    public final pg2 A;
    public pg2 B;
    public pg2 C;
    public final v55 w;
    public q84 x;
    public g25 y;
    public final CQf z = new CQf();

    public static final class CQf implements rb2 {

        public static final class QnHx extends cx1 implements j81<b43.QnHx, sd5> {
            public final /* synthetic */ List<uy2<b43, mp1>> w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public QnHx(ArrayList arrayList) {
                super(1);
                this.w = arrayList;
            }

            @Override // defpackage.j81
            public final sd5 invoke(b43.QnHx qnHx) {
                b43.QnHx qnHx2 = qnHx;
                List<uy2<b43, mp1>> list = this.w;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    uy2<b43, mp1> uy2Var = list.get(i);
                    b43.QnHx.e(qnHx2, uy2Var.w, uy2Var.x.a);
                }
                return sd5.a;
            }
        }

        public CQf() {
        }

        @Override // defpackage.rb2
        public final sb2 a(vb2 vb2Var, List<? extends ob2> list, long j) {
            uy2 uy2Var;
            q84 q84Var;
            w15 w15Var = w15.this;
            v55 v55Var = w15Var.w;
            o55 o55Var = v55Var.f;
            o55 o55VarA = v55Var.a.a(j, vb2Var.getLayoutDirection(), o55Var);
            boolean zA = ur1.a(o55Var, o55VarA);
            v55 v55Var2 = w15Var.w;
            if (!zA) {
                v55Var2.c.invoke(o55VarA);
                if (o55Var != null && !ur1.a(o55Var.a.a, o55VarA.a.a) && (q84Var = w15Var.x) != null) {
                    q84Var.c(v55Var2.b);
                }
            }
            v55Var2.getClass();
            v55Var2.i.setValue(sd5.a);
            v55Var2.f = o55VarA;
            int size = list.size();
            ArrayList arrayList = o55VarA.f;
            if (!(size >= arrayList.size())) {
                throw new IllegalStateException("Check failed.".toString());
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i = 0; i < size2; i++) {
                dl3 dl3Var = (dl3) arrayList.get(i);
                if (dl3Var != null) {
                    ob2 ob2Var = list.get(i);
                    float f = dl3Var.c;
                    float f2 = dl3Var.a;
                    int iFloor = (int) Math.floor(f - f2);
                    float f3 = dl3Var.d;
                    float f4 = dl3Var.b;
                    uy2Var = new uy2(ob2Var.y(FWT.n(iFloor, (int) Math.floor(f3 - f4), 5)), new mp1(C0239D.d(sy4.c(f2), sy4.c(f4))));
                } else {
                    uy2Var = null;
                }
                if (uy2Var != null) {
                    arrayList2.add(uy2Var);
                }
            }
            long j2 = o55VarA.c;
            return vb2Var.K((int) (j2 >> 32), sp1.b(j2), t92.Q(new uy2(hnK.a, Integer.valueOf(sy4.c(o55VarA.d))), new uy2(hnK.b, Integer.valueOf(sy4.c(o55VarA.e)))), new QnHx(arrayList2));
        }

        @Override // defpackage.rb2
        public final int b(yy1.byN byn, List list, int i) {
            return sp1.b(w15.this.w.a.a(FWT.m(0, i, 0, Integer.MAX_VALUE), yy1.this.N, null).c);
        }

        @Override // defpackage.rb2
        public final int c(yy1.byN byn, List list, int i) {
            w15 w15Var = w15.this;
            w15Var.w.a.b(yy1.this.N);
            lh2 lh2Var = w15Var.w.a.i;
            if (lh2Var != null) {
                return (int) Math.ceil(lh2Var.b());
            }
            throw new IllegalStateException("layoutIntrinsics must be called first");
        }

        @Override // defpackage.rb2
        public final int d(yy1.byN byn, List list, int i) {
            w15 w15Var = w15.this;
            w15Var.w.a.b(yy1.this.N);
            lh2 lh2Var = w15Var.w.a.i;
            if (lh2Var != null) {
                return (int) Math.ceil(lh2Var.c());
            }
            throw new IllegalStateException("layoutIntrinsics must be called first");
        }

        @Override // defpackage.rb2
        public final int e(yy1.byN byn, List list, int i) {
            return sp1.b(w15.this.w.a.a(FWT.m(0, i, 0, Integer.MAX_VALUE), yy1.this.N, null).c);
        }
    }

    public static final class F1 extends cx1 implements h81<iy1> {
        public F1() {
            super(0);
        }

        @Override // defpackage.h81
        public final iy1 invoke() {
            return w15.this.w.e;
        }
    }

    public static final class LPt8Fixed extends cx1 implements h81<o55> {
        public LPt8Fixed() {
            super(0);
        }

        @Override // defpackage.h81
        public final o55 invoke() {
            return w15.this.w.f;
        }
    }

    public static final class NUlFixed implements g25 {
        public long a;
        public long b;
        public final /* synthetic */ q84 d;

        public NUlFixed(q84 q84Var) {
            this.d = q84Var;
            int i = kt2.e;
            long j = kt2.b;
            this.a = j;
            this.b = j;
        }

        @Override // defpackage.g25
        public final void a(long j) {
            w15 w15Var = w15.this;
            iy1 iy1Var = w15Var.w.e;
            v55 v55Var = w15Var.w;
            q84 q84Var = this.d;
            if (iy1Var != null) {
                if (!iy1Var.q()) {
                    return;
                }
                if (w15.b(w15Var, j, j)) {
                    q84Var.g(v55Var.b);
                } else {
                    q84Var.f(iy1Var, j);
                }
                this.a = j;
            }
            if (u84.a(q84Var, v55Var.b)) {
                this.b = kt2.b;
            }
        }

        @Override // defpackage.g25
        public final void b() {
        }

        @Override // defpackage.g25
        public final void c() {
        }

        @Override // defpackage.g25
        public final void d(long j) {
            w15 w15Var = w15.this;
            iy1 iy1Var = w15Var.w.e;
            if (iy1Var != null) {
                q84 q84Var = this.d;
                if (iy1Var.q() && u84.a(q84Var, w15Var.w.b)) {
                    long jG = kt2.g(this.b, j);
                    this.b = jG;
                    long jG2 = kt2.g(this.a, jG);
                    if (w15.b(w15Var, this.a, jG2) || !q84Var.b(iy1Var, jG2, this.a)) {
                        return;
                    }
                    this.a = jG2;
                    this.b = kt2.b;
                }
            }
        }

        @Override // defpackage.g25
        public final void onCancel() {
            long j = w15.this.w.b;
            q84 q84Var = this.d;
            if (u84.a(q84Var, j)) {
                q84Var.h();
            }
        }

        @Override // defpackage.g25
        public final void onStop() {
            long j = w15.this.w.b;
            q84 q84Var = this.d;
            if (u84.a(q84Var, j)) {
                q84Var.h();
            }
        }
    }

    public static final class QnHx extends cx1 implements j81<iy1, sd5> {
        public QnHx() {
            super(1);
        }

        @Override // defpackage.j81
        public final sd5 invoke(iy1 iy1Var) {
            q84 q84Var;
            iy1 iy1Var2 = iy1Var;
            w15 w15Var = w15.this;
            v55 v55Var = w15Var.w;
            v55Var.e = iy1Var2;
            if (u84.a(w15Var.x, v55Var.b)) {
                long jL = iy1Var2.l(kt2.b);
                v55 v55Var2 = w15Var.w;
                if (!kt2.a(jL, v55Var2.g) && (q84Var = w15Var.x) != null) {
                    q84Var.j(v55Var2.b);
                }
                v55Var2.g = jL;
            }
            return sd5.a;
        }
    }

    @if0(c = "androidx.compose.foundation.text.TextController$update$2", f = "CoreText.kt", l = {191}, m = "invokeSuspend")
    public static final class YKK extends px4 implements x81<l93, z80<? super sd5>, Object> {
        public int A;
        public /* synthetic */ Object B;

        public YKK(z80<? super YKK> z80Var) {
            super(2, z80Var);
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            YKK ykk = w15.this.new YKK(z80Var);
            ykk.B = obj;
            return ykk;
        }

        @Override // defpackage.m8
        public final Object i(Object obj) throws Throwable {
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i = this.A;
            if (i == 0) {
                C0239D.H(obj);
                l93 l93Var = (l93) this.B;
                g25 g25Var = w15.this.y;
                if (g25Var == null) {
                    ur1.e("longPressDragObserver");
                    throw null;
                }
                this.A = 1;
                if (g62.b(l93Var, g25Var, this) == va0Var) {
                    return va0Var;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C0239D.H(obj);
            }
            return sd5.a;
        }

        @Override // defpackage.x81
        public final Object invoke(l93 l93Var, z80<? super sd5> z80Var) {
            return ((YKK) a(l93Var, z80Var)).i(sd5.a);
        }
    }

    public w15(v55 v55Var) {
        this.w = v55Var;
        pg2.QnHx qnHx = pg2.QnHx.w;
        this.A = fp1.p0(fp1.V(fp1.b0(qnHx, 0.0f, 0.0f, 0.0f, null, false, 65535), new z15(this)), new QnHx());
        this.B = c94.a(qnHx, false, new y15(v55Var.a.a, this));
        this.C = qnHx;
    }

    public static final boolean b(w15 w15Var, long j, long j2) {
        o55 o55Var = w15Var.w.f;
        if (o55Var != null) {
            int length = o55Var.a.a.w.length();
            int iL = o55Var.l(j);
            int iL2 = o55Var.l(j2);
            int i = length - 1;
            if (iL >= i && iL2 >= i) {
                return true;
            }
            if (iL < 0 && iL2 < 0) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.yl3
    public final void a() {
        q84 q84Var;
        k74 k74Var = this.w.d;
        if (k74Var == null || (q84Var = this.x) == null) {
            return;
        }
        q84Var.a(k74Var);
    }

    @Override // defpackage.yl3
    public final void c() {
        q84 q84Var;
        k74 k74Var = this.w.d;
        if (k74Var == null || (q84Var = this.x) == null) {
            return;
        }
        q84Var.a(k74Var);
    }

    @Override // defpackage.yl3
    public final void d() {
        q84 q84Var = this.x;
        if (q84Var != null) {
            v55 v55Var = this.w;
            v55Var.d = q84Var.e(new wh2(v55Var.b, new F1(), new LPt8Fixed()));
        }
    }

    public final void e(q84 q84Var) {
        this.x = q84Var;
        pg2 pg2VarA = pg2.QnHx.w;
        if (q84Var != null) {
            NUlFixed nUl = new NUlFixed(q84Var);
            this.y = nUl;
            pg2VarA = tx4.a(pg2VarA, nUl, new YKK(null));
        }
        this.C = pg2VarA;
    }
}
