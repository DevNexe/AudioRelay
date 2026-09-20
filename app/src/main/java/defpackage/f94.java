package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class f94 {
    public final z84 a;
    public final boolean b;
    public boolean c;
    public f94 d;
    public final x84 e;
    public final int f;
    public final yy1 g;

    public static final class CQf extends cx1 implements j81<yy1, Boolean> {
        public static final CQf w = new CQf();

        public CQf() {
            super(1);
        }

        @Override // defpackage.j81
        public final Boolean invoke(yy1 yy1Var) {
            return Boolean.valueOf(fp1.Z(yy1Var) != null);
        }
    }

    public static final class QnHx extends cx1 implements j81<yy1, Boolean> {
        public static final QnHx w = new QnHx();

        public QnHx() {
            super(1);
        }

        /* JADX WARN: Code duplicated, block: B:9:0x0014  */
        @Override // defpackage.j81
        public final Boolean invoke(yy1 yy1Var) {
            boolean z;
            x84 x84VarC;
            z84 z84VarZ = fp1.Z(yy1Var);
            if (z84VarZ != null && (x84VarC = z84VarZ.c()) != null) {
                z = x84VarC.x;
            }
            return Boolean.valueOf(z);
        }
    }

    public f94(z84 z84Var, boolean z) {
        this.a = z84Var;
        this.b = z;
        this.e = z84Var.c();
        this.f = ((a94) z84Var.x).getId();
        this.g = z84Var.w.A;
    }

    public static List b(f94 f94Var, List list, boolean z, int i) {
        if ((i & 1) != 0) {
            list = new ArrayList();
        }
        if ((i & 2) != 0) {
            z = false;
        }
        f94Var.getClass();
        List<f94> listJ = f94Var.j(z, false);
        int size = listJ.size();
        for (int i2 = 0; i2 < size; i2++) {
            f94 f94Var2 = listJ.get(i2);
            if (f94Var2.h()) {
                list.add(f94Var2);
            } else if (!f94Var2.e.y) {
                b(f94Var2, list, false, 2);
            }
        }
        return list;
    }

    public final f94 a(zs3 zs3Var, j81<? super o94, sd5> j81Var) {
        f94 f94Var = new f94(new z84(new yy1(true).Y, new b94(this.f + (zs3Var != null ? 1000000000 : 2000000000), false, j81Var)), false);
        f94Var.c = true;
        f94Var.d = this;
        return f94Var;
    }

    public final kz1 c() {
        boolean z = this.e.x;
        z84 z84Var = this.a;
        if (!z) {
            return z84Var.w;
        }
        z84 z84VarY = fp1.Y(this.g);
        if (z84VarY != null) {
            z84Var = z84VarY;
        }
        return z84Var.w;
    }

    public final dl3 d() {
        return !this.g.E() ? dl3.e : ps0.o(c());
    }

    public final List e(boolean z) {
        if (this.e.y) {
            return cs0.w;
        }
        return h() ? b(this, null, z, 1) : j(z, true);
    }

    public final x84 f() {
        boolean zH = h();
        x84 x84Var = this.e;
        if (!zH) {
            return x84Var;
        }
        x84Var.getClass();
        x84 x84Var2 = new x84();
        x84Var2.x = x84Var.x;
        x84Var2.y = x84Var.y;
        x84Var2.w.putAll(x84Var.w);
        i(x84Var2);
        return x84Var2;
    }

    public final f94 g() {
        f94 f94Var = this.d;
        if (f94Var != null) {
            return f94Var;
        }
        yy1 yy1Var = this.g;
        boolean z = this.b;
        yy1 yy1VarR = z ? fp1.r(yy1Var, QnHx.w) : null;
        if (yy1VarR == null) {
            yy1VarR = fp1.r(yy1Var, CQf.w);
        }
        z84 z84VarZ = yy1VarR != null ? fp1.Z(yy1VarR) : null;
        if (z84VarZ == null) {
            return null;
        }
        return new f94(z84VarZ, z);
    }

    public final boolean h() {
        return this.b && this.e.x;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void i(x84 x84Var) {
        if (this.e.y) {
            return;
        }
        List<f94> listJ = j(false, false);
        int size = listJ.size();
        for (int i = 0; i < size; i++) {
            f94 f94Var = listJ.get(i);
            if (!f94Var.h()) {
                for (Map.Entry entry : f94Var.e.w.entrySet()) {
                    n94 n94Var = (n94) entry.getKey();
                    Object value = entry.getValue();
                    LinkedHashMap linkedHashMap = x84Var.w;
                    Object objInvoke = n94Var.b.invoke((T) linkedHashMap.get(n94Var), (T) value);
                    if (objInvoke != null) {
                        linkedHashMap.put(n94Var, objInvoke);
                    }
                }
                f94Var.i(x84Var);
            }
        }
    }

    public final List<f94> j(boolean z, boolean z2) {
        ArrayList arrayList;
        if (this.c) {
            return cs0.w;
        }
        ArrayList arrayList2 = new ArrayList();
        yy1 yy1Var = this.g;
        if (z) {
            arrayList = new ArrayList();
            ps0.E(yy1Var, arrayList);
        } else {
            arrayList = new ArrayList();
            fp1.W(yy1Var, arrayList);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(new f94((z84) arrayList.get(i), this.b));
        }
        if (z2) {
            n94<zs3> n94Var = i94.q;
            x84 x84Var = this.e;
            zs3 zs3Var = (zs3) y84.a(x84Var, n94Var);
            if (zs3Var != null && x84Var.x && (!arrayList2.isEmpty())) {
                arrayList2.add(a(zs3Var, new d94(zs3Var)));
            }
            n94<List<String>> n94Var2 = i94.a;
            if (x84Var.b(n94Var2) && (!arrayList2.isEmpty()) && x84Var.x) {
                List list = (List) y84.a(x84Var, n94Var2);
                String str = list != null ? (String) wu.J0(list) : null;
                if (str != null) {
                    arrayList2.add(0, a(null, new e94(str)));
                }
            }
        }
        return arrayList2;
    }
}
