package defpackage;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class u83 implements pa4, al {
    public final String a;
    public final y91<?> b;
    public final int c;
    public int d = -1;
    public final String[] e;
    public final List<Annotation>[] f;
    public final boolean[] g;
    public Map<String, Integer> h;
    public final oz1 i;
    public final oz1 j;
    public final oz1 k;

    public static final class CQf extends cx1 implements h81<rv1<?>[]> {
        public CQf() {
            super(0);
        }

        @Override // defpackage.h81
        public final rv1<?>[] invoke() {
            rv1<?>[] rv1VarArrD;
            y91<?> y91Var = u83.this.b;
            return (y91Var == null || (rv1VarArrD = y91Var.d()) == null) ? S12N.A : rv1VarArrD;
        }
    }

    public static final class F1 extends cx1 implements j81<Integer, CharSequence> {
        public F1() {
            super(1);
        }

        @Override // defpackage.j81
        public final CharSequence invoke(Integer num) {
            int iIntValue = num.intValue();
            StringBuilder sb = new StringBuilder();
            u83 u83Var = u83.this;
            sb.append(u83Var.e[iIntValue]);
            sb.append(": ");
            sb.append(u83Var.j(iIntValue).a());
            return sb.toString();
        }
    }

    public static final class LPt8Fixed extends cx1 implements h81<pa4[]> {
        public LPt8Fixed() {
            super(0);
        }

        @Override // defpackage.h81
        public final pa4[] invoke() {
            ArrayList arrayList;
            y91<?> y91Var = u83.this.b;
            if (y91Var != null) {
                y91Var.b();
                arrayList = new ArrayList(0);
            } else {
                arrayList = null;
            }
            return bx0.e(arrayList);
        }
    }

    public static final class QnHx extends cx1 implements h81<Integer> {
        public QnHx() {
            super(0);
        }

        @Override // defpackage.h81
        public final Integer invoke() {
            u83 u83Var = u83.this;
            return Integer.valueOf(AY.E(u83Var, (pa4[]) u83Var.j.getValue()));
        }
    }

    public u83(String str, y91<?> y91Var, int i) {
        this.a = str;
        this.b = y91Var;
        this.c = i;
        String[] strArr = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            strArr[i2] = "[UNINITIALIZED]";
        }
        this.e = strArr;
        int i3 = this.c;
        this.f = new List[i3];
        this.g = new boolean[i3];
        this.h = ds0.w;
        this.i = qLd.h(2, new CQf());
        this.j = qLd.h(2, new LPt8Fixed());
        this.k = qLd.h(2, new QnHx());
    }

    @Override // defpackage.pa4
    public final String a() {
        return this.a;
    }

    @Override // defpackage.al
    public final Set<String> b() {
        return this.h.keySet();
    }

    @Override // defpackage.pa4
    public final boolean c() {
        return false;
    }

    @Override // defpackage.pa4
    public final int d(String str) {
        Integer num = this.h.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // defpackage.pa4
    public xa4 e() {
        return uv4.QnHx.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof u83)) {
                return false;
            }
            pa4 pa4Var = (pa4) obj;
            if (!ur1.a(this.a, pa4Var.a()) || !Arrays.equals((pa4[]) this.j.getValue(), (pa4[]) ((u83) obj).j.getValue())) {
                return false;
            }
            int iF = pa4Var.f();
            int i = this.c;
            if (i != iF) {
                return false;
            }
            for (int i2 = 0; i2 < i; i2++) {
                if (!ur1.a(j(i2).a(), pa4Var.j(i2).a()) || !ur1.a(j(i2).e(), pa4Var.j(i2).e())) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // defpackage.pa4
    public final int f() {
        return this.c;
    }

    @Override // defpackage.pa4
    public final String g(int i) {
        return this.e[i];
    }

    @Override // defpackage.pa4
    public final List<Annotation> getAnnotations() {
        return cs0.w;
    }

    @Override // defpackage.pa4
    public boolean h() {
        return false;
    }

    public int hashCode() {
        return ((Number) this.k.getValue()).intValue();
    }

    @Override // defpackage.pa4
    public final List<Annotation> i(int i) {
        List<Annotation> list = this.f[i];
        return list == null ? cs0.w : list;
    }

    @Override // defpackage.pa4
    public pa4 j(int i) {
        return ((rv1[]) this.i.getValue())[i].a();
    }

    @Override // defpackage.pa4
    public final boolean k(int i) {
        return this.g[i];
    }

    public final void l(String str, boolean z) {
        int i = this.d + 1;
        this.d = i;
        String[] strArr = this.e;
        strArr[i] = str;
        this.g[i] = z;
        this.f[i] = null;
        if (i == this.c - 1) {
            HashMap map = new HashMap();
            int length = strArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                map.put(strArr[i2], Integer.valueOf(i2));
            }
            this.h = map;
        }
    }

    public String toString() {
        return wu.M0(AY.V(0, this.c), ", ", bl2.c(new StringBuilder(), this.a, '('), ")", new F1(), 24);
    }
}
