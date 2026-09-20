package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class z84 extends fz1<z84, a94> {
    public z84(kz1 kz1Var, a94 a94Var) {
        super(kz1Var, a94Var);
    }

    @Override // defpackage.fz1
    public final void a() {
        this.z = true;
        ww2 ww2Var = this.w.A.C;
        if (ww2Var != null) {
            ww2Var.n();
        }
    }

    @Override // defpackage.fz1
    public final void b() {
        this.z = false;
        ww2 ww2Var = this.w.A.C;
        if (ww2Var != null) {
            ww2Var.n();
        }
    }

    public final x84 c() {
        z84 z84Var = (z84) this.y;
        z84 z84Var2 = null;
        if (z84Var == null) {
            kz1 kz1VarN0 = this.w.N0();
            if (kz1VarN0 != null) {
                while (kz1VarN0 != null && !ym.d(kz1VarN0.O, 2)) {
                    kz1VarN0 = kz1VarN0.N0();
                }
                if (kz1VarN0 != null && (z84Var = (z84) kz1VarN0.O[2]) != null) {
                    kz1 kz1VarN1 = z84Var.w;
                    while (kz1VarN1 != null) {
                        if (z84Var != null) {
                            z84Var2 = z84Var;
                            break;
                        }
                        kz1VarN1 = kz1VarN1.N0();
                        z84Var = kz1VarN1 != null ? (z84) kz1VarN1.O[2] : null;
                    }
                }
            }
        } else {
            kz1 kz1VarN2 = z84Var.w;
            while (kz1VarN2 != null) {
                if (z84Var != null) {
                    z84Var2 = z84Var;
                    break;
                }
                kz1VarN2 = kz1VarN2.N0();
                z84Var = kz1VarN2 != null ? (z84) kz1VarN2.O[2] : null;
            }
        }
        Object obj = this.x;
        if (z84Var2 != null) {
            a94 a94Var = (a94) obj;
            if (!a94Var.z0().y) {
                x84 x84VarZ0 = a94Var.z0();
                x84VarZ0.getClass();
                x84 x84Var = new x84();
                x84Var.x = x84VarZ0.x;
                x84Var.y = x84VarZ0.y;
                x84Var.w.putAll(x84VarZ0.w);
                x84 x84VarC = z84Var2.c();
                if (x84VarC.x) {
                    x84Var.x = true;
                }
                if (x84VarC.y) {
                    x84Var.y = true;
                }
                for (Map.Entry entry : x84VarC.w.entrySet()) {
                    n94 n94Var = (n94) entry.getKey();
                    Object value = entry.getValue();
                    LinkedHashMap linkedHashMap = x84Var.w;
                    if (!linkedHashMap.containsKey(n94Var)) {
                        linkedHashMap.put(n94Var, value);
                    } else if (value instanceof FA4) {
                        Object obj2 = linkedHashMap.get(n94Var);
                        if (obj2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                        }
                        FA4 fa4 = (FA4) obj2;
                        String str = fa4.a;
                        if (str == null) {
                            str = ((FA4) value).a;
                        }
                        t81 t81Var = fa4.b;
                        if (t81Var == null) {
                            t81Var = ((FA4) value).b;
                        }
                        linkedHashMap.put(n94Var, new FA4(str, t81Var));
                    } else {
                        continue;
                    }
                }
                return x84Var;
            }
        }
        return ((a94) obj).z0();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" id: ");
        Object obj = this.x;
        sb.append(((a94) obj).getId());
        sb.append(" config: ");
        sb.append(((a94) obj).z0());
        return sb.toString();
    }
}
