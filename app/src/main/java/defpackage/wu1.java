package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class wu1 extends lPt3Fixed {
    public final pu1 A;
    public final String B;
    public final pa4 C;
    public int D;
    public boolean E;

    public wu1(ws1 ws1Var, pu1 pu1Var, String str, pa4 pa4Var) {
        super(ws1Var);
        this.A = pu1Var;
        this.B = str;
        this.C = pa4Var;
    }

    @Override // defpackage.lPt3Fixed
    public String B(pa4 pa4Var, int i) {
        String strG = pa4Var.g(i);
        if (!this.z.l || F().keySet().contains(strG)) {
            return strG;
        }
        xj0 xj0Var = this.y.c;
        xj0.QnHx qnHx = S12N.z;
        ConcurrentHashMap concurrentHashMap = xj0Var.a;
        Map map = (Map) concurrentHashMap.get(pa4Var);
        Object obj = null;
        Object objD = map != null ? map.get(qnHx) : null;
        if (objD == null) {
            objD = null;
        }
        if (objD == null) {
            objD = S12N.d(pa4Var);
            Object concurrentHashMap2 = concurrentHashMap.get(pa4Var);
            if (concurrentHashMap2 == null) {
                concurrentHashMap2 = new ConcurrentHashMap(1);
                concurrentHashMap.put(pa4Var, concurrentHashMap2);
            }
            ((Map) concurrentHashMap2).put(qnHx, objD);
        }
        Map map2 = (Map) objD;
        for (Object obj2 : F().keySet()) {
            Integer num = (Integer) map2.get((String) obj2);
            if (num != null && num.intValue() == i) {
                obj = obj2;
                break;
            }
        }
        String str = (String) obj;
        return str == null ? strG : str;
    }

    @Override // defpackage.lPt3Fixed, defpackage.g40
    public void G(pa4 pa4Var) {
        Set setC0;
        mt1 mt1Var = this.z;
        if (mt1Var.b || (pa4Var.e() instanceof q93)) {
            return;
        }
        if (mt1Var.l) {
            Set setD = bx0.d(pa4Var);
            xj0 xj0Var = this.y.c;
            xj0.QnHx qnHx = S12N.z;
            Map map = (Map) xj0Var.a.get(pa4Var);
            Object obj = map != null ? map.get(qnHx) : null;
            if (obj == null) {
                obj = null;
            }
            Map map2 = (Map) obj;
            Set setKeySet = map2 != null ? map2.keySet() : null;
            if (setKeySet == null) {
                setKeySet = hs0.w;
            }
            setC0 = og4.c0(setD, setKeySet);
        } else {
            setC0 = bx0.d(pa4Var);
        }
        for (String str : F().keySet()) {
            if (!setC0.contains(str) && !ur1.a(str, this.B)) {
                String string = F().toString();
                StringBuilder sbA = N.a("Encountered unknown key '", str, "'.\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.\nCurrent input: ");
                sbA.append((Object) AY.H(-1, string));
                throw AY.g(-1, sbA.toString());
            }
        }
    }

    @Override // defpackage.lPt3Fixed
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public pu1 F() {
        return this.A;
    }

    @Override // defpackage.lPt3Fixed, defpackage.m05, defpackage.pf0
    public final boolean X() {
        return !this.E && super.X();
    }

    @Override // defpackage.lPt3Fixed, defpackage.pf0
    public final g40 b(pa4 pa4Var) {
        return pa4Var == this.C ? this : super.b(pa4Var);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0092  */
    @Override // defpackage.g40
    public int p(pa4 pa4Var) {
        while (this.D < pa4Var.f()) {
            int i = this.D;
            this.D = i + 1;
            String strB = B(pa4Var, i);
            boolean z = true;
            int i2 = this.D - 1;
            this.E = false;
            boolean zContainsKey = F().containsKey(strB);
            ws1 ws1Var = this.y;
            if (!zContainsKey) {
                boolean z2 = (ws1Var.a.f || pa4Var.k(i2) || !pa4Var.j(i2).c()) ? false : true;
                this.E = z2;
                if (!z2) {
                    continue;
                }
            }
            if (this.z.h) {
                pa4 pa4VarJ = pa4Var.j(i2);
                if (pa4VarJ.c() || !(w(strB) instanceof nu1)) {
                    if (ur1.a(pa4VarJ.e(), xa4.CQf.a)) {
                        vt1 vt1VarW = w(strB);
                        String strA = null;
                        su1 su1Var = vt1VarW instanceof su1 ? (su1) vt1VarW : null;
                        if (su1Var != null && !(su1Var instanceof nu1)) {
                            strA = su1Var.a();
                        }
                        if (strA == null || S12N.h(pa4VarJ, ws1Var, strA) != -3) {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                }
                if (!z) {
                }
            }
            return i2;
        }
        return -1;
    }

    @Override // defpackage.lPt3Fixed
    public vt1 w(String str) {
        return (vt1) t92.P(str, F());
    }
}
