package defpackage;

import com.google.android.gms.internal.measurement.LPt6Fixed;
import com.google.android.gms.internal.measurement.MZ;
import com.google.android.gms.internal.measurement.WE;
import com.google.android.gms.internal.measurement.ct;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class rb7 {
    public final String a;
    public final boolean b;
    public final WE c;
    public final BitSet d;
    public final BitSet e;
    public final Map f;
    public final Bt7j g;
    public final /* synthetic */ fs5 h;

    public /* synthetic */ rb7(fs5 fs5Var, String str) {
        this.h = fs5Var;
        this.a = str;
        this.b = true;
        this.d = new BitSet();
        this.e = new BitSet();
        this.f = new Bt7j();
        this.g = new Bt7j();
    }

    public final MZ a(int i) {
        ArrayList arrayList;
        List listEmptyList;
        tl6 tl6VarS = MZ.s();
        if (tl6VarS.y) {
            tl6VarS.p();
            tl6VarS.y = false;
        }
        MZ.w((MZ) tl6VarS.x, i);
        if (tl6VarS.y) {
            tl6VarS.p();
            tl6VarS.y = false;
        }
        MZ.z((MZ) tl6VarS.x, this.b);
        WE we = this.c;
        if (we != null) {
            if (tl6VarS.y) {
                tl6VarS.p();
                tl6VarS.y = false;
            }
            MZ.y((MZ) tl6VarS.x, we);
        }
        ps6 ps6VarW = WE.w();
        ArrayList arrayListA = b37.A(this.d);
        if (ps6VarW.y) {
            ps6VarW.p();
            ps6VarW.y = false;
        }
        WE.G((WE) ps6VarW.x, arrayListA);
        ArrayList arrayListA2 = b37.A(this.e);
        if (ps6VarW.y) {
            ps6VarW.p();
            ps6VarW.y = false;
        }
        WE.E((WE) ps6VarW.x, arrayListA2);
        Map map = this.f;
        if (map == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(map.size());
            Iterator it = map.keySet().iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                Long l = (Long) map.get(Integer.valueOf(iIntValue));
                if (l != null) {
                    xl6 xl6VarT = LPt6Fixed.t();
                    if (xl6VarT.y) {
                        xl6VarT.p();
                        xl6VarT.y = false;
                    }
                    LPt6Fixed.v((LPt6Fixed) xl6VarT.x, iIntValue);
                    long jLongValue = l.longValue();
                    if (xl6VarT.y) {
                        xl6VarT.p();
                        xl6VarT.y = false;
                    }
                    LPt6Fixed.w((LPt6Fixed) xl6VarT.x, jLongValue);
                    arrayList.add((LPt6Fixed) xl6VarT.n());
                }
            }
        }
        if (arrayList != null) {
            if (ps6VarW.y) {
                ps6VarW.p();
                ps6VarW.y = false;
            }
            WE.I((WE) ps6VarW.x, arrayList);
        }
        Bt7j bt7j = this.g;
        if (bt7j == null) {
            listEmptyList = Collections.emptyList();
        } else {
            ArrayList arrayList2 = new ArrayList(bt7j.y);
            for (Integer num : (g92.F1) bt7j.keySet()) {
                qs6 qs6VarU = ct.u();
                int iIntValue2 = num.intValue();
                if (qs6VarU.y) {
                    qs6VarU.p();
                    qs6VarU.y = false;
                }
                ct.x((ct) qs6VarU.x, iIntValue2);
                List list = (List) bt7j.getOrDefault(num, null);
                if (list != null) {
                    Collections.sort(list);
                    if (qs6VarU.y) {
                        qs6VarU.p();
                        qs6VarU.y = false;
                    }
                    ct.y((ct) qs6VarU.x, list);
                }
                arrayList2.add((ct) qs6VarU.n());
            }
            listEmptyList = arrayList2;
        }
        List list2 = listEmptyList;
        if (ps6VarW.y) {
            ps6VarW.p();
            ps6VarW.y = false;
        }
        WE.L((WE) ps6VarW.x, list2);
        if (tl6VarS.y) {
            tl6VarS.p();
            tl6VarS.y = false;
        }
        MZ.x((MZ) tl6VarS.x, (WE) ps6VarW.n());
        return (MZ) tl6VarS.n();
    }

    public final void b(fd7 fd7Var) {
        int iA = fd7Var.a();
        Boolean bool = fd7Var.c;
        if (bool != null) {
            this.e.set(iA, bool.booleanValue());
        }
        Boolean bool2 = fd7Var.d;
        if (bool2 != null) {
            this.d.set(iA, bool2.booleanValue());
        }
        if (fd7Var.e != null) {
            Integer numValueOf = Integer.valueOf(iA);
            Map map = this.f;
            Long l = (Long) map.get(numValueOf);
            long jLongValue = fd7Var.e.longValue() / 1000;
            if (l == null || jLongValue > l.longValue()) {
                map.put(numValueOf, Long.valueOf(jLongValue));
            }
        }
        if (fd7Var.f != null) {
            Integer numValueOf2 = Integer.valueOf(iA);
            Bt7j bt7j = this.g;
            List arrayList = (List) bt7j.getOrDefault(numValueOf2, null);
            if (arrayList == null) {
                arrayList = new ArrayList();
                bt7j.put(numValueOf2, arrayList);
            }
            if (fd7Var.c()) {
                arrayList.clear();
            }
            o67.a();
            fs5 fs5Var = this.h;
            vv5 vv5Var = fs5Var.a.g;
            jg6 jg6Var = lg6.X;
            String str = this.a;
            if (vv5Var.n(str, jg6Var) && fd7Var.b()) {
                arrayList.clear();
            }
            o67.a();
            if (!fs5Var.a.g.n(str, jg6Var)) {
                arrayList.add(Long.valueOf(fd7Var.f.longValue() / 1000));
                return;
            }
            Long lValueOf = Long.valueOf(fd7Var.f.longValue() / 1000);
            if (arrayList.contains(lValueOf)) {
                return;
            }
            arrayList.add(lValueOf);
        }
    }

    public rb7(fs5 fs5Var, String str, WE we, BitSet bitSet, BitSet bitSet2, Bt7j bt7j, Bt7j bt7j2) {
        this.h = fs5Var;
        this.a = str;
        this.d = bitSet;
        this.e = bitSet2;
        this.f = bt7j;
        this.g = new Bt7j();
        for (Integer num : (g92.F1) bt7j2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) bt7j2.getOrDefault(num, null));
            this.g.put(num, arrayList);
        }
        this.b = false;
        this.c = we;
    }
}
