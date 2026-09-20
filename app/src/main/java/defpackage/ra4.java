package defpackage;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class ra4 implements pa4, al {
    public final String a;
    public final xa4 b;
    public final int c;
    public final List<Annotation> d;
    public final HashSet e;
    public final String[] f;
    public final pa4[] g;
    public final List<Annotation>[] h;
    public final boolean[] i;
    public final Map<String, Integer> j;
    public final pa4[] k;
    public final ry4 l;

    public static final class CQf extends cx1 implements j81<Integer, CharSequence> {
        public CQf() {
            super(1);
        }

        @Override // defpackage.j81
        public final CharSequence invoke(Integer num) {
            int iIntValue = num.intValue();
            StringBuilder sb = new StringBuilder();
            ra4 ra4Var = ra4.this;
            sb.append(ra4Var.f[iIntValue]);
            sb.append(": ");
            sb.append(ra4Var.g[iIntValue].a());
            return sb.toString();
        }
    }

    public static final class QnHx extends cx1 implements h81<Integer> {
        public QnHx() {
            super(0);
        }

        @Override // defpackage.h81
        public final Integer invoke() {
            ra4 ra4Var = ra4.this;
            return Integer.valueOf(AY.E(ra4Var, ra4Var.k));
        }
    }

    public ra4(String str, xa4 xa4Var, int i, List<? extends pa4> list, br brVar) {
        this.a = str;
        this.b = xa4Var;
        this.c = i;
        this.d = brVar.a;
        ArrayList arrayList = brVar.b;
        this.e = wu.c1(arrayList);
        int i2 = 0;
        this.f = (String[]) arrayList.toArray(new String[0]);
        this.g = bx0.e(brVar.d);
        this.h = (List[]) brVar.e.toArray(new List[0]);
        ArrayList arrayList2 = brVar.f;
        boolean[] zArr = new boolean[arrayList2.size()];
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            zArr[i2] = ((Boolean) it.next()).booleanValue();
            i2++;
        }
        this.i = zArr;
        sj1 sj1Var = new sj1(new w2(this.f));
        ArrayList arrayList3 = new ArrayList(mu.w0(sj1Var, 10));
        Iterator it2 = sj1Var.iterator();
        while (true) {
            tj1 tj1Var = (tj1) it2;
            if (!tj1Var.hasNext()) {
                this.j = t92.V(arrayList3);
                this.k = bx0.e(list);
                this.l = new ry4(new QnHx());
                return;
            }
            rj1 rj1Var = (rj1) tj1Var.next();
            arrayList3.add(new uy2(rj1Var.b, Integer.valueOf(rj1Var.a)));
        }
    }

    @Override // defpackage.pa4
    public final String a() {
        return this.a;
    }

    @Override // defpackage.al
    public final Set<String> b() {
        return this.e;
    }

    @Override // defpackage.pa4
    public final boolean c() {
        return false;
    }

    @Override // defpackage.pa4
    public final int d(String str) {
        Integer num = this.j.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // defpackage.pa4
    public final xa4 e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ra4) {
            pa4 pa4Var = (pa4) obj;
            if (ur1.a(a(), pa4Var.a()) && Arrays.equals(this.k, ((ra4) obj).k) && f() == pa4Var.f()) {
                int iF = f();
                for (int i = 0; i < iF; i++) {
                    if (ur1.a(j(i).a(), pa4Var.j(i).a()) && ur1.a(j(i).e(), pa4Var.j(i).e())) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.pa4
    public final int f() {
        return this.c;
    }

    @Override // defpackage.pa4
    public final String g(int i) {
        return this.f[i];
    }

    @Override // defpackage.pa4
    public final List<Annotation> getAnnotations() {
        return this.d;
    }

    @Override // defpackage.pa4
    public final boolean h() {
        return false;
    }

    public final int hashCode() {
        return ((Number) this.l.getValue()).intValue();
    }

    @Override // defpackage.pa4
    public final List<Annotation> i(int i) {
        return this.h[i];
    }

    @Override // defpackage.pa4
    public final pa4 j(int i) {
        return this.g[i];
    }

    @Override // defpackage.pa4
    public final boolean k(int i) {
        return this.i[i];
    }

    public final String toString() {
        return wu.M0(AY.V(0, this.c), ", ", bl2.c(new StringBuilder(), this.a, '('), ")", new CQf(), 24);
    }
}
